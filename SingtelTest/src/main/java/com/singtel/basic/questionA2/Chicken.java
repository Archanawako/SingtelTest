package com.singtel.basic.questionA2;

import com.singtel.basic.questionA1.Animal;
import com.singtel.basic.questionA1.Walkable;

public class Chicken extends Animal implements Soundable, Walkable{

	public void sound() {
		System.out.println("Cluck,cluck");
	}

	public void walk() {
		System.out.println("I am walking");
	}

}
