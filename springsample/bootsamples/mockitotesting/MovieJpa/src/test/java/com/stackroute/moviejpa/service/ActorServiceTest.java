package com.stackroute.moviejpa.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.stackroute.moviejpa.exceptions.ActoridAlreadyExistException;
import com.stackroute.moviejpa.model.Actor;
import com.stackroute.moviejpa.repository.ActorRepo;

public class ActorServiceTest {

	
	@InjectMocks
	ActorServiceImpl actorservice;
	
	@Mock
	ActorRepo actorrepo;
	
   Actor actor;
   
   @BeforeEach
   public void setup()
   {
	   MockitoAnnotations.openMocks(this);
	   actor=new Actor();
	   actor.setActorid("A100");
	   actor.setActorName("Rose");
	   actor.setMovies("The Arabians");
	   actor.setAge(40);
	   
   }
   
   @Test
   public void addActorSuccess() throws Exception
   {
	   //stubbing
	   Mockito.when(actorrepo.save(actor)).thenReturn(actor);
	   
	   Actor resultactor=actorservice.addActor(actor);
	   
	   assertEquals("Rose",resultactor.getActorName());
	   
	   verify (actorrepo,times(1)).save(actor);
   }
   
   @Test
   public void addActorFailure()
   {
	   Optional<Actor> optactor=Optional.of(actor);
	   
	   
	   Mockito.when(actorrepo.findById("A100")).thenReturn(optactor);
	   
	   assertThrows(ActoridAlreadyExistException.class,()-> actorservice.addActor(actor));
	   
	   verify (actorrepo,times(0)).save(actor);
	   	   
   }
   
   @Test
   public void deleteActoreSuccess() throws Exception
   {
	   Optional<Actor> optactor=Optional.of(actor);

	   Mockito.when(actorrepo.findById("A100")).thenReturn(optactor);
	   
	boolean flag=actorservice.deleteActor("A100");
	assertTrue(flag);
	
	   
	   
   }
   
 	
}
