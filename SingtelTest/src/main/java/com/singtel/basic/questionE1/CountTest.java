package com.singtel.basic.questionE1;

import com.singtel.basic.questionA1.Animal;
import com.singtel.basic.questionA1.Bird;
import com.singtel.basic.questionA1.Flyable;
import com.singtel.basic.questionA1.Walkable;
import com.singtel.basic.questionA2.Chicken;
import com.singtel.basic.questionA2.Duck;
import com.singtel.basic.questionA3.Rooster;
import com.singtel.basic.questionA4.Cat;
import com.singtel.basic.questionA4.Dog;
import com.singtel.basic.questionB1.Swimmable;

public class CountTest {

	Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Dog(), new Cat() };
	
	public int getWalkableCount() {
		return walkableCount;
	}

	public void setWalkableCount(int walkableCount) {
		this.walkableCount = walkableCount;
	}

	public int getSwimmableCount() {
		return swimmableCount;
	}

	public void setSwimmableCount(int swimmableCount) {
		this.swimmableCount = swimmableCount;
	}

	public int getSingableCount() {
		return singableCount;
	}

	public void setSingableCount(int singableCount) {
		this.singableCount = singableCount;
	}

	int flyableCount =0;
	int walkableCount=0;
	int swimmableCount=0;
	int singableCount=0;
	
	public int getFlyableCount() {
		return flyableCount;
	}

	public void setFlyableCount(int flyableCount) {
		this.flyableCount = flyableCount;
	}

	public void count( ) {
		
		for (Animal animal : animals) {
			if(animal instanceof Flyable) {
				flyableCount++;
			}
			if(animal instanceof Walkable) {
				walkableCount++;
			}
			if(animal instanceof Swimmable) {
				swimmableCount++;
			}
			if(animal instanceof Singable) {
				singableCount++;
			}
		}
	}
	
	public static void main(String[] args) {
		
		CountTest countTest = new CountTest();
		countTest.count();
		System.out.println(countTest.getFlyableCount()+" animals can fly");
		System.out.println(countTest.getWalkableCount()+" animals can walk");
		System.out.println(countTest.getSingableCount()+" animals can sing");
		System.out.println(countTest.getSwimmableCount()+" animals can swim");
	}
}
