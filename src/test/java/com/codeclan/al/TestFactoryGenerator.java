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

}
