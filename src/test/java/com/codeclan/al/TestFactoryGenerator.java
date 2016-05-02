package com.codeclan.al;

import org.junit.*;
import static org.junit.Assert.*;

public class TestFactoryGenerator {
	
	@Test
	public void testFactoryGeneratorCreatesFishFactory(){
		AbstractFactory fishFactory = FactoryGenerator.getFactory("fish");
		assertTrue(fishFactory instanceof FishFactory);
	}
	
	@Test
	public void testFactoryGeneratorReturnsNullIfChoiceIsNotFound(){
		AbstractFactory bigCatFactory = FactoryGenerator.getFactory("big cat");
		assertTrue(bigCatFactory == null);
	}
	
	@Test
	public void testFactoryGeneratorReturnsADifferntFactoryTypeForDifferentChoice(){
		AbstractFactory birdFactory = FactoryGenerator.getFactory("bird");
		assertTrue(birdFactory instanceof BirdFactory);
	}
	
	@Test
	public void testChildOfAbstractFactoryIsInstantiatedWithIdNumber(){
		AbstractFactory birdFactory = FactoryGenerator.getFactory("bird");
		assertTrue(birdFactory.getCurrentIdNumber() == 1);
	}
	
	@Test
	public void testDifferentChildOfAbstractFactoryIsIsInstantiatedWithIdNumber(){
		AbstractFactory fishFactory = FactoryGenerator.getFactory("fish");
		assertTrue(fishFactory.getCurrentIdNumber() == 1); 
	}
	
	@Test
	public void testAbstractFactoryPassesGetAnimalTypeMethodToChildFactory(){
		AbstractFactory fishFactory = FactoryGenerator.getFactory("fish");
		Fish shark = fishFactory.getFish("shark");
		assertTrue(shark instanceof Fish);
	}

}
