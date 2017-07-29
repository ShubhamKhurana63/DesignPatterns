package com.design.factory;

public class Factory {

	public static Bank getBankInstance(String key) {

		if (key.equals("HDFC")) {
			return new HDFC();
		} else if (key.equals("SBI")) {
			return new SBI();
		}
		return null;
	}

}
