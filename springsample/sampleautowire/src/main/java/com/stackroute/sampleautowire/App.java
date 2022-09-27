package com.stackroute.sampleautowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext appcontext=new ClassPathXmlApplicationContext("beans.xml");
     
     Hotel hotelobj=appcontext.getBean("hotelbean",Hotel.class);
     
      System.out.println(hotelobj);
     
     
    }
}
