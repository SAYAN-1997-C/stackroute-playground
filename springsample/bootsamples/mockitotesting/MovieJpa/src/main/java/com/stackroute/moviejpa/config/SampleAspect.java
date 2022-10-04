package com.stackroute.moviejpa.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;

import com.stackroute.moviejpa.model.Actor;

@Aspect
public class SampleAspect {
	
	Logger mylog=LoggerFactory.getLogger(SampleAspect.class);
	
	
	@Before("accessPointcut()")
	public void beforeViewmovie(JoinPoint jp)
	{
	
	  mylog.info("someone is going to retrivie movie details");	
	}
	

	@After("accessPointcut()")
	public void afterView(JoinPoint jp)
	{
	  mylog.info("Some user viewed movie details");	
	}

	
	@Around("addpointcut()")
	public Object aroundAdd(ProceedingJoinPoint jp) throws Throwable
	{
		   Object obj=jp.proceed();
		
		   
		   try
		   {
			   	ResponseEntity res=(ResponseEntity)obj;
			   	Actor actorobj=(Actor) res.getBody();
			   	mylog.info("New Actor named " + actorobj.getActorName() + " got added ");
			   	
			   	
		   }
		   catch(Exception e)
		   {
			   
		   }
		   
		   return obj;
	}
	
	@AfterThrowing(pointcut="addpointcut()",throwing="excepobj")
	public void handleExcep(Exception excepobj)
	{
		mylog.warn("Some exception raised " + excepobj);
	}
	
	@Pointcut("execution (* com.stackroute.moviejpa.controller.ActorController.getallmovie(..))")
	public void accessPointcut()
	{
		
	}
	
	
	@Pointcut("execution (* com.stackroute.moviejpa.controller.ActorController.addactor(..))")
	public void addpointcut()
	{
		
	}
	
	
	
}
