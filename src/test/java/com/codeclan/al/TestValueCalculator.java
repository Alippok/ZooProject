package com.codeclan.al;

import org.junit.*;
import static org.junit.Assert.*;

import com.codeclan.al.ReptileClasses.Crocodilian;
import com.codeclan.al.ReptileClasses.Reptile;

public class TestValueCalculator {

	@Test
	public void testValueCalculatorSetsValueForEndangeredAnimal(){
		ValueCalculator expert = new ValueCalculator();
		Reptile crocodile = new Crocodilian();
		crocodile.setExoticStatus("endangered");
		expert.valueAnimal(crocodile);
		assertTrue(crocodile.getMarketPrice() == 2500.00);
	}
	
	@Test
	public void testValueCalculatorSetsValueForDifferentExoticStatus(){
		ValueCalculator expert = new ValueCalculator();
		Reptile crocodile = new Crocodilian();
		crocodile.setExoticStatus("extremely rare");
		expert.valueAnimal(crocodile);
		assertTrue(crocodile.getMarketPrice() == 1500.00);
	}
		
}
