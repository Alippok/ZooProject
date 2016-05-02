package com.codeclan.al;

import org.junit.*;
import static org.junit.Assert.*;


public class TestBigCatFactory {
	
	@Test
	public void testFactoryCreatesInstanceOfLion(){
		BigCatFactory bigCatFactory = new BigCatFactory();
		BigCat lion = bigCatFactory.getBigCat("lion");
		assertTrue(lion instanceof Lion);
	}
	
	@Test
	public void testFactoryCreatesInstanceOfBigCat(){
		BigCatFactory bigCatFactory = new BigCatFactory();
		BigCat lion = bigCatFactory.getBigCat("lion");
		assertTrue(lion instanceof BigCat);
	}
	
	@Test
	public void testFactoryReturnsNullIfTypeIsNotFound(){
		BigCatFactory bigCatFactory = new BigCatFactory();
		BigCat lion = bigCatFactory.getBigCat("gerbil");
		assertTrue(lion == null);
	}
	
	@Test
	public void testFactoryReturnsInstanceOfTiger(){
		BigCatFactory bigCatFactory = new BigCatFactory();
		BigCat tiger = bigCatFactory.getBigCat("tiger");
		assertTrue(tiger instanceof Tiger);
	}
	
	@Test 
	public void testBigCatAssignsSpeciesOnCreation(){
		BigCatFactory bigCatFactory = new BigCatFactory();
		BigCat tiger = bigCatFactory.getBigCat("tiger");
		assertTrue(tiger.getSpecies() == "tiger");
	}
	
	@Test
	public void testLionAssignsSpeciesOnCreation(){
		BigCatFactory bigCatFactory = new BigCatFactory();
		BigCat lion = bigCatFactory.getBigCat("lion");
		assertTrue(lion.getSpecies() == "lion");
	}
	
	@Test
	public void testFactoryIsInstatiatedWithIdNumber1(){
		BigCatFactory bigCatFactory = new BigCatFactory();
		assertTrue(bigCatFactory.getIdNumber() == 1);
	}
	
	 
	
	
	
	
	
	
	
	

}
