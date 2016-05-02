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
	
	

}
