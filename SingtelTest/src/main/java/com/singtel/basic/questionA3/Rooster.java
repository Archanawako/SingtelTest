package com.singtel.basic.questionA3;

import com.singtel.basic.questionA2.Chicken;
import com.singtel.basic.questionA2.Soundable;

public class Rooster extends Chicken implements Soundable {

	public void sound() {
		System.out.println("Cock-a-doodle-doo");
	}
}
