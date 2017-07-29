package com.design.factory;

public class Application {

	public static void main(String[] args) {

		Bank bank = Factory.getBankInstance("HDFC");
		bank.bankIntro();

	}

}
