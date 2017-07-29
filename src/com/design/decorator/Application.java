package com.design.decorator;

public class Application {

	public static void main(String[] args) {

		IEmail email = new IEmailImpl();
		
		DecoratorConcrete decoratorConcrete=new DecoratorConcrete(email);
		System.out.println(decoratorConcrete.sendEmail());

	}

}
