package com.codeclan.al;

import org.junit.*;

import com.codeclan.al.Creators.AbstractFactory;
import com.codeclan.al.Creators.FactoryGenerator;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class TestAbstractFactory {

	@Test
	public void testBirdFactoryInheritesListOfExoticStatuses(){
		AbstractFactory birdFactory = FactoryGenerator.getFactory("bird");
		ArrayList<String> exoticStatuses = new ArrayList<String>();
		exoticStatuses.add("common");
		exoticStatuses.add("uncommon");
		exoticStatuses.add("rare");
		exoticStatuses.add("extremely rare");
		exoticStatuses.add("endangered");
		
		assertEquals(exoticStatuses, birdFactory.getExoticStatusList());
	}
	
	@Test
	public void testReptileFactoryInheritsFullListOfExoticStatuses(){
		AbstractFactory reptileFactory = FactoryGenerator.getFactory("reptile");
		ArrayList<String> exoticStatuses = new ArrayList<String>();
		exoticStatuses.add("common");
		exoticStatuses.add("uncommon");
		exoticStatuses.add("rare");
		exoticStatuses.add("extremely rare");
		exoticStatuses.add("endangered");
		
		assertEquals(exoticStatuses, reptileFactory.getExoticStatusList());
		
	}
	
	
	
	
	
	
}
