package com.singtel.basic.questionA4;

import com.singtel.basic.questionA1.Animal;
import com.singtel.basic.questionA1.Walkable;
import com.singtel.basic.questionA2.Soundable;

public class Dog extends Animal implements Soundable, Walkable {

	public void sound() {
		System.out.println("Woof, woof");

	}

	public void walk() {
		System.out.println("I am walking");
	}

}
