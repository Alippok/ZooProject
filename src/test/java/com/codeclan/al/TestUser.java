package com.codeclan.al;

import org.junit.*;

import com.codeclan.al.Creators.AbstractFactory;
import com.codeclan.al.Creators.FactoryGenerator;
import com.codeclan.al.FishClasses.Fish;

import static org.junit.Assert.*;


public class TestUser {
	
	@Test
	public void testUserCanBuildDetailsOfAnAnimalWithGivenDetails(){
		AbstractFactory fishFactory = FactoryGenerator.getFactory("fish");
		Fish shark = fishFactory.getFish("shark");
		User zooManager = new User();
		assertEquals("Details{Id: fish_1, Type: fish, Species: shark, Exotic Status: rare, Market Price: 1000.0", 
				zooManager.buildAnimalDetails(shark.getId(), shark.getType(), shark.getSpecies(), shark.getExoticStatus(), shark.getMarketPrice()));
	}
	
	@Test
	public void testUserCanGetDetailsOfAnAnimal(){
		AbstractFactory fishFactory = FactoryGenerator.getFactory("fish");
		Fish shark = fishFactory.getFish("shark");
		User zooManager = new User();
		assertEquals("Details{Id: fish_1, Type: fish, Species: shark, Exotic Status: rare, Market Price: 1000.0", 
				zooManager.getAnimalDetails(shark));
	}
	

}
