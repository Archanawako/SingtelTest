package com.singtel.basic.questionA1;

import com.singtel.basic.questionE1.Singable;

public class Bird extends Animal implements Flyable,Singable {

	public void walk() {
		System.out.println("I am walking");

	}

	public void fly() {
		System.out.println("I am flying");

	}

	public void sing() {
		System.out.println("I am singing");
	}
}
