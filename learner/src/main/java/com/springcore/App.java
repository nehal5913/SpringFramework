package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Customer c = (Customer) context.getBean("cust1");
        System.out.println(c);
        Customer c1 = (Customer) context.getBean("cust2");
        System.out.println(c1);
        Customer c2 = (Customer) context.getBean("cust3");
        System.out.println(c2);

    }
    
}
