package com.singtel.basic.questionA4;

import com.singtel.basic.questionA1.Animal;
import com.singtel.basic.questionA2.Duck;
import com.singtel.basic.questionA2.Soundable;
import com.singtel.basic.questionA3.Rooster;

public class Parrot implements Soundable {

	Animal animal;
	
	public Parrot(Animal animal){
		this.animal=animal;
	}
	public Parrot(){
	}
	
	public void sound() {
		
		if (animal instanceof Dog) {
			((Dog) animal).sound();
		} else if (animal instanceof Cat) {
			((Cat) animal).sound();
		}else if (animal instanceof Rooster) {
			((Rooster) animal).sound();
		}else if (animal instanceof Duck) {
			((Duck) animal).sound();
		}else {
			System.out.println("I am Parrot");
		}
	}
	
}
