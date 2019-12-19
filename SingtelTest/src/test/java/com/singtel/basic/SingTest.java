package com.singtel.basic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import com.singtel.basic.questionA1.Bird;
import com.singtel.basic.questionA2.Chicken;
import com.singtel.basic.questionA2.Duck;
import com.singtel.basic.questionA3.Rooster;
import com.singtel.basic.questionA4.Cat;
import com.singtel.basic.questionA4.Dog;
import com.singtel.basic.questionA4.Parrot;
import com.singtel.basic.questionB1.Fish;
import com.singtel.basic.questionB2.Clownfish;
import com.singtel.basic.questionB2.Shark;
import com.singtel.basic.questionB3.Dolphin;
import com.singtel.basic.questionE1.CountTest;

public class SingTest {

	ByteArrayOutputStream output = new ByteArrayOutputStream();

	@Before
	public void setUp() throws Exception {
		System.setOut(new PrintStream(output));
	}

	// Test question A.1
	@Test
	public void testQuestionA1() {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		assertEquals("I am walking\r\nI am flying\r\nI am singing\r\n", output.toString());
		output.reset();
	}

	// Test question A.2
	@Test
	public void testQuestionA2() {
		Duck duck = new Duck();
		duck.sound();
		duck.swim();
		Chicken chicken = new Chicken();
		chicken.sound();
		assertEquals("Quack,quack\r\nI am swimming\r\nCluck,cluck\r\n", output.toString());
		output.reset();
	}

	// Test question A.3
	@Test
	public void testQuestionA3() {
		Rooster rooster = new Rooster();
		rooster.sound();
		assertEquals("Cock-a-doodle-doo\r\n", output.toString());
		output.reset();
	}

	// Test question A.4
	@Test
	public void testQuestionA4() {
		Parrot parrotWithDog = new Parrot(new Dog());
		Parrot parrotWithCat = new Parrot(new Cat());
		Parrot parrotWithRooster = new Parrot(new Rooster());
		Parrot parrot = new Parrot();
		parrotWithDog.sound();
		parrotWithCat.sound();
		parrotWithRooster.sound();
		parrot.sound();

		assertEquals("Woof, woof\r\nMeow\r\nCock-a-doodle-doo\r\nI am Parrot\r\n", output.toString());
		output.reset();
	}

	// Test question B.1
	@Test
	public void testQuestionB1() {
		Fish fish = new Fish();
		fish.swim();
		assertEquals("I am swimming\r\n", output.toString());
		output.reset();
	}

	// Test question B.2
	@Test
	public void testQuestionB2() {
		Fish shark = new Shark();
		Fish Clownfish = new Clownfish();
		assertEquals("Large", shark.getSize());
		assertEquals("Grey", shark.getColor());
		assertTrue(shark.isEatFish());

		assertEquals("Small", Clownfish.getSize());
		assertEquals("Orange", Clownfish.getColor());
		assertTrue(Clownfish.isMakeJokes());
	}

	// Test question B.3
	@Test
	public void testQuestionB3() {
		Dolphin dolphin = new Dolphin();
		dolphin.swim();

		assertEquals("I am swimming\r\n", output.toString());
	}

	// Test question E.1
	@Test
	public void testQuestionE1() {
		CountTest countTest = new CountTest();
		countTest.count();
		assertEquals(countTest.getFlyableCount(), 2);
	}
}
