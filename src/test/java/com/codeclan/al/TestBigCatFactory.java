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
	public void testBigCatAssignsTypeOnCreation(){
		BigCatFactory bigCatFactory = new BigCatFactory();
		BigCat tiger = bigCatFactory.getBigCat("tiger");
		assertTrue(tiger.getType() == "tiger");
	}
	
	
	
	
	
	

}
