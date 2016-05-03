package com.codeclan.al;

import org.junit.*;
import static org.junit.Assert.*;

import com.codeclan.al.BirdClasses.Bird;
import com.codeclan.al.FishClasses.Fish;

public class TestAnimalClasses {

	@Test
	public void testEagleSetsTypeWhenInstantiated(){
		AbstractFactory birdFactory = FactoryGenerator.getFactory("bird");
		Bird eagle = birdFactory.getBird("eagle");
		assertTrue(eagle.getType() == "eagle");
	}
	
	@Test 
	public void testRaySetsTypeWhenInstantiated(){
		AbstractFactory fishFactory = FactoryGenerator.getFactory("fish");
		Fish ray = fishFactory.getFish("ray");
		assertTrue(ray.getType() == "ray");
	}
	
	@Test
	public void testChildOfBirdAbstractClassCanSetSpecies(){
		AbstractFactory birdFactory = FactoryGenerator.getFactory("bird");
		Bird eagle = birdFactory.getBird("eagle");
		eagle.setSpecies("Golden Eagle");
		assertTrue(eagle.getSpecies() == "Golden Eagle");
	}
	
	@Test
	public void testEagleInheritsFromAnimalAbstractClass(){
		AbstractFactory birdFactory = FactoryGenerator.getFactory("bird");
		Bird eagle = birdFactory.getBird("eagle");
		eagle.setSpecies("Golden Eagle");
		assertTrue(eagle.getSpecies() == "Golden Eagle");
	}
	
	@Test
	public void testSharkInheritsSetTypeMethodFromAnimalSuperClass(){
		AbstractFactory fishFactory = FactoryGenerator.getFactory("fish");
		Fish shark = fishFactory.getFish("shark");
		shark.setType("fish");
		assertTrue(shark.getType() == "fish");
	}
	
//	@Test
//	public void testSharkInheritsIdMethodsFromAnimalAbstractClass(){
//		AbstractFactory fishFactory = FactoryGenerator.getFactory("fish");
//		Fish shark = fishFactory.getFish("shark");
//		shark.setSpecies("Great White");
//		shark.setId(1);
//		assertTrue(shark.getId() == "Fish_1");
//	}
	

}
