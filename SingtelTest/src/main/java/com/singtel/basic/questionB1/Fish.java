package com.singtel.basic.questionB1;

public class Fish implements Swimmable {

	private String size;
	
	private String color;
	
	private boolean isMakeJokes;
	
	private boolean isEatFish;
	
	public void swim() {
		System.out.println("I am swimming");
	}
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isMakeJokes() {
		return isMakeJokes;
	}

	public void setMakeJokes(boolean isMakeJokes) {
		this.isMakeJokes = isMakeJokes;
	}

	public boolean isEatFish() {
		return isEatFish;
	}

	public void setEatFish(boolean isEatFish) {
		this.isEatFish = isEatFish;
	}

}
