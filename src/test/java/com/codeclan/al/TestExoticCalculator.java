package com.codeclan.al;

import org.junit.*;
import static org.junit.Assert.*;

import com.codeclan.al.BirdClasses.Bird;
import com.codeclan.al.Creators.AbstractFactory;
import com.codeclan.al.Creators.FactoryGenerator;

public class TestExoticCalculator {

	@Test
	public void testExoticCalculatorInterfaceSetsExoticLevelOfAnimal(){
		AbstractFactory birdFactory = FactoryGenerator.getFactory("bird");
		Bird eagle = birdFactory.getBird("eagle");
		assertEquals(68, eagle.getExoticRating());
	}
	
	
}
