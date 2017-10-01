package com.design.factory;

public class Application {

	public static void main(String[] args) {

	System.out.println("we are in the develop branch of the code");
	
	
		Bank bank = Factory.getBankInstance("HDFC");
		bank.bankIntro();

	}

}
