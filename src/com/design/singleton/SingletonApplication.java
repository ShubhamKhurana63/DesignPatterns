package com.design.singleton;

class singleton {

	// eager initialization
	// private static singleton singleRef = new singleton();

	/*
	 * volatile is for making sure that the thread of request
	   updates it always in the main memory
     */	
	private volatile static singleton singleRef;

	private singleton() {

	}

	public static singleton getSingleton() {
	
		
		//just to be good on performance and avoid the overhead time of 
		//wait for a thread(Double Lock Checking)
		if (singleRef == null) {
			synchronized ("cool") {
				if (singleRef == null) {
					singleRef = new singleton();
				}
			}
		}
		return singleRef;
	}

	public void display() {
		System.out.println("things are in your hands");
	}

}

public class SingletonApplication {

	public static void main(String[] args) {

		singleton s1 = singleton.getSingleton();

		s1.display();

	}
}
