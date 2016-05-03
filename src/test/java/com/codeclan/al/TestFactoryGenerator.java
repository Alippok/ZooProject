package com.codeclan.al;

import org.junit.*;
import static org.junit.Assert.*;

import com.codeclan.al.BirdClasses.Bird;
import com.codeclan.al.BirdClasses.Eagle;
import com.codeclan.al.Creators.AbstractFactory;
import com.codeclan.al.Creators.BirdFactory;
import com.codeclan.al.Creators.FactoryGenerator;
import com.codeclan.al.Creators.FishFactory;
import com.codeclan.al.Creators.ReptileFactory;
import com.codeclan.al.FishClasses.Fish;
import com.codeclan.al.FishClasses.Ray;



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
	
	@Test
	public void testAbstractFactoryPassesDifferentGetAnimalTypeMethodToChildFactory(){
		AbstractFactory fishFactory = FactoryGenerator.getFactory("fish");
		Fish ray = fishFactory.getFish("ray");
		assertTrue(ray instanceof Ray);
	}
	
	@Test
	public void testAbstractFactoryPassesGetBirdMethodToChildClass(){
		AbstractFactory birdFactory = FactoryGenerator.getFactory("bird");
		Bird eagle = birdFactory.getBird("eagle");
		assertTrue(eagle instanceof Bird);
	}
	
	@Test
	public void testEagleIsAlsoInstanceOfEagle(){
		AbstractFactory birdFactory = FactoryGenerator.getFactory("bird");
		Bird eagle = birdFactory.getBird("eagle");
		assertTrue(eagle instanceof Eagle);
	}
	
	@Test
	public void testFactoryGeneratorGeneratesNewFactory(){
		AbstractFactory reptileFactory = FactoryGenerator.getFactory("reptile");
		assertTrue(reptileFactory instanceof ReptileFactory);
	}

	
	
	
	
	
	
	
	
	
	
}
