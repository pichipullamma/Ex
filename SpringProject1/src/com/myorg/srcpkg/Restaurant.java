package com.myorg.srcpkg;

public class Restaurant {

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
	
}
