package com.stackroute.samplejavameta;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.stackroute.samplejavameta.config.ItemConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         ApplicationContext appcontext=new AnnotationConfigApplicationContext(ItemConfig.class);
         
         Hotel hotelobj=appcontext.getBean("hotelbean",Hotel.class);
         System.out.println(hotelobj);
         
         
    }
}
