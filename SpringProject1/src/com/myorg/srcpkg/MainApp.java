package com.myorg.srcpkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String [] arg){
	
		ApplicationContext context = 
            new ClassPathXmlApplicationContext("SpringConfig.xml");

     Restaurant r = (Restaurant) context.getBean("restaurantBean");
     
    r.greetCustomer();
   
	}
}
