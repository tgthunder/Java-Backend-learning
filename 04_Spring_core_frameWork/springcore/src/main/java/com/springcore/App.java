package com.springcore;

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
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new  ClassPathXmlApplicationContext("config.xml");
        
        Student student1 = (Student) context.getBean("bean1");
        
        System.out.println(student1); // this is because of toString method
        System.out.println("Code Run Successfully");
        
//         This is how we performed DI operation using ApplicationContext IOC container
//       We dont have to make changes manually just change the meta data inside xml file.
         
        // Now we are going to use bean2 means Car class we can set the value as an attribute inside 
        // property element not using value element 
        
        Car car = (Car) context.getBean("bean2");
        System.out.println(car.getBrand());
        System.out.println("Great!");
        
        // Setting values with the help of p schema
        Student student2 = (Student) context.getBean("bean3");
        
        System.out.println(student2);
        
    }
}
