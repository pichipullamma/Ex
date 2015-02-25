package com.myorg.testpkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myorg.srcpkg.Restaurant;

public class TestSpringProject {

	public static void main(String [] arg){
	
		ApplicationContext context = 
            new ClassPathXmlApplicationContext("SpringConfig.xml");

     Restaurant r = (Restaurant) context.getBean("restaurantBean");
     
   // r.greetCustomer();
   r.prepareHotDrinkRest();
   
	}
}
