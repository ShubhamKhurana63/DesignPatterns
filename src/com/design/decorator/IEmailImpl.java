package com.design.decorator;

public class IEmailImpl implements IEmail {

	@Override
	public String sendEmail() {

		return "email has been sent locally";
	}

}
