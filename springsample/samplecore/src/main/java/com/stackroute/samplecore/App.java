package com.stackroute.samplecore;

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
//        Customer custobj=new Customer();
//        custobj.setName("Anoop");
//        custobj.setAddr("Blore");
//        custobj.setAge(15);

    // IOC Container
    ApplicationContext appcontext=new ClassPathXmlApplicationContext("mybean.xml");
    
    Customer custobj=appcontext.getBean("customerbean1",Customer.class); // dependency Injection 
    System.out.println(custobj);
    
    Customer custobj2=appcontext.getBean("customerbean2",Customer.class); // dependency Injection 
    System.out.println(custobj2);
    
    
    }
}
