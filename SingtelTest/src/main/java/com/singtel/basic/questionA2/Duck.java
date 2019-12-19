package com.singtel.basic.questionA2;

import com.singtel.basic.questionA1.Bird;

public class Duck extends Bird implements Soundable {

	public void sound() {
		System.out.println("Quack,quack");
	}
	
	public void swim() {
		System.out.println("I am swimming");
	}

}
