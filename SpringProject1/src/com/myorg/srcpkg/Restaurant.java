package com.myorg.srcpkg;

public class Restaurant {

	HotDrink hotDrink;
	
	
	Restaurant(HotDrink hotDrink){
		this.hotDrink=hotDrink;
	}
	
	public void prepareHotDrinkRest(){
		hotDrink.prepareHotDrink();
	}
	
	
	/*
	String welcomeNode;
	
	
	public String getWelcomeNode() {
		return welcomeNode;
	}


	public void setWelcomeNode(String welcomeNode) {
		this.welcomeNode = welcomeNode;
	}


	public void greetCustomer(){
		
	System.out.println(welcomeNode);	
	
	}
	*/
}
