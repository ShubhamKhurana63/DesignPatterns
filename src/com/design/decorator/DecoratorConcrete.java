package com.design.decorator;

public class DecoratorConcrete extends Decorator {

	public DecoratorConcrete(IEmail email) {
		// TODO Auto-generated constructor stub
		this.email = email;
	}

	@Override
	public String sendEmail() {
		return email.sendEmail() + "the changed behaviour";
	}

	
	
	
	
}
