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
	public void testFactoryAssignsTypeOnCreation(){
		BigCatFactory bigCatFactory = new BigCatFactory();
		BigCat tiger = bigCatFactory.getBigCat("tiger");
		assertTrue(tiger.getType() == "BigCat");
	}
	
	@Test
	public void testTypeAssignmentWorksForOtherChildClass(){
		BigCatFactory bigCatFactory = new BigCatFactory();
		BigCat lion = bigCatFactory.getBigCat("lion");
		assertTrue(lion.getType() == "BigCat");
	}
	
	@Test
	public void testFactoryIsInstatiatedWithIdNumber1(){
		BigCatFactory bigCatFactory = new BigCatFactory();
		assertTrue(bigCatFactory.getIdNumber() == 1);
	}
	
	@Test
	public void testFactoryAssignsIdNumberToInstantiatedClass(){
		BigCatFactory bigCatFactory = new BigCatFactory();
		BigCat tiger = bigCatFactory.getBigCat("tiger");
		assertEquals(tiger.getId(), "BigCat_1");
	}
	
	@Test
	public void testFactoryIncreasesIdNumberBy1AfterINstantiatingABigCat(){
		BigCatFactory bigCatFactory = new BigCatFactory();
		BigCat tiger = bigCatFactory.getBigCat("tiger");
		assertTrue(bigCatFactory.getIdNumber() == 2);
	}
	
	@Test
	public void testFactorySetsIdOfNextInstantiatedBigCatNewIdNumber(){
		BigCatFactory bigCatFactory = new BigCatFactory();
		BigCat tiger = bigCatFactory.getBigCat("tiger");
		BigCat tigerTwo = bigCatFactory.getBigCat("tiger");
		assertEquals(tigerTwo.getId(), "BigCat_2");
	}
	
	@Test
	public void testFactorySetsIdOfADifferentChildClass(){
		BigCatFactory bigCatFactory = new BigCatFactory();
		BigCat lion = bigCatFactory.getBigCat("lion");
		assertEquals(lion.getId(), "BigCat_1");
	}
	
	@Test
	public void testFactorySetsIdsOfConsectutiveInstancesOfDifferentBigCatChildClasses(){
		BigCatFactory bigCatFactory = new BigCatFactory();
		BigCat lion = bigCatFactory.getBigCat("lion");
		BigCat lionTwo = bigCatFactory.getBigCat("lion");
		BigCat tiger = bigCatFactory.getBigCat("tiger");
		BigCat tigerTwo = bigCatFactory.getBigCat("tiger");
		
		assertEquals(tigerTwo.getId(), "BigCat_4");
	}
	
	 
	
	
	
	
	
	
	
	

}
