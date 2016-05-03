package com.codeclan.al;

import org.junit.*;
import static org.junit.Assert.*;

import com.codeclan.al.BirdClasses.Bird;
import com.codeclan.al.FishClasses.Fish;

public class TestAnimalClasses {

//	@Test
//	public void testEagleSetsTypeWhenInstantiated(){
//		AbstractFactory birdFactory = FactoryGenerator.getFactory("bird");
//		Bird eagle = birdFactory.getBird("eagle");
//		assertTrue(eagle.getType() == "eagle");
//	}
//	
//	@Test 
//	public void testRaySetsTypeWhenInstantiated(){
//		AbstractFactory fishFactory = FactoryGenerator.getFactory("fish");
//		Fish ray = fishFactory.getFish("ray");
//		assertTrue(ray.getType() == "ray");
//	}
	
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
	
	@Test
	public void testSharkInheritsIdMethodsFromAnimalAbstractClass(){
		AbstractFactory fishFactory = FactoryGenerator.getFactory("fish");
		Fish shark = fishFactory.getFish("shark");
		shark.setType("fish");
		shark.setSpecies("Great White");
		shark.setId(1);
		assertEquals("fish_1", shark.getId());
	}
	
	@Test
	public void testRayInheritsSetExoticLevelMethodFromAnimalAbstractClass(){
		AbstractFactory fishFactory = FactoryGenerator.getFactory("fish");
		Fish ray = fishFactory.getFish("ray");
		assertTrue(ray.setExoticRating(78));
	}
	
	@Test
	public void testSetExoticRatingMethodReturnsFalseIfNumberIsTooHigh(){
		AbstractFactory birdFactory = FactoryGenerator.getFactory("bird");
		Bird eagle = birdFactory.getBird("eagle");
		assertFalse(eagle.setExoticRating(101));
	}
	
	@Test
	public void testExoticRatingReturns0IfNotSetAsNumberIsTooHigh(){
		AbstractFactory birdFactory = FactoryGenerator.getFactory("bird");
		Bird eagle = birdFactory.getBird("eagle");
		eagle.setExoticRating(101);
		assertEquals(0, eagle.getExoticRating());
	}
	
	@Test
	public void testSetExoticRatingMethodReturnsFalseIfNumberIs0(){
		AbstractFactory birdFactory = FactoryGenerator.getFactory("bird");
		Bird eagle = birdFactory.getBird("eagle");
		assertFalse(eagle.setExoticRating(0));
	}
	
	@Test
	public void testGetExoticRatingMethod(){
		AbstractFactory fishFactory = FactoryGenerator.getFactory("fish");
		Fish ray = fishFactory.getFish("ray");
		ray.setExoticRating(67);
		assertEquals(67, ray.getExoticRating());
	}
	
	@Test
	public void testAnimalsAreInstatiatedWithDefaultHealth(){
		AbstractFactory birdFactory = FactoryGenerator.getFactory("bird");
		Bird eagle = birdFactory.getBird("eagle");
		assertEquals(100, eagle.getHealth());
	}
	
	@Test
	public void testAnimalsAreInstantiatedWithDefaultExoticStatus(){
		AbstractFactory birdFactory = FactoryGenerator.getFactory("bird");
		Bird eagle = birdFactory.getBird("eagle");
		assertTrue(eagle.getExoticStatus() == null);
	}
	
	@Test
	public void testAnimalsAreInstantiatedWithDefaultMarketPrice(){
		AbstractFactory fishFactory = FactoryGenerator.getFactory("fish");
		Fish shark = fishFactory.getFish("shark");
		assertTrue(shark.getMarketPrice() == 20.00);
	}
	
	@Test
	public void testOtherAnimalSubClassIsInstantiatedWithDefaultPrice(){
		AbstractFactory birdFactory = FactoryGenerator.getFactory("bird");
		Bird eagle = birdFactory.getBird("eagle");
		assertTrue(eagle.getMarketPrice() == 20.00);		
	}
	
	
	

}
