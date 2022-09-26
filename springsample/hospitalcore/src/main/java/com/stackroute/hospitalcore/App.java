package com.stackroute.hospitalcore;

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
        ApplicationContext appcontext=new ClassPathXmlApplicationContext("mybean.xml");
        
        Patient patobj=appcontext.getBean("patientbean2",Patient.class);
        patobj.getHospital().setHname("ABC Hospital");
        
        
        System.out.println(patobj);

        
        
        
        Patient patobj1=appcontext.getBean("patientbean1",Patient.class);
        patobj1.getHospital().setHname("Maruti hospital");
        System.out.println(patobj1);
        
        
        Doctor docobj=appcontext.getBean("doctorbean",Doctor.class);
        
        System.out.println(docobj);
        
    }
}
