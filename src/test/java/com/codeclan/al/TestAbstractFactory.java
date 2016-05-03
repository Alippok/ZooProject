package com.codeclan.al;

import org.junit.*;

import com.codeclan.al.BirdClasses.Bird;
import com.codeclan.al.Creators.AbstractFactory;
import com.codeclan.al.Creators.FactoryGenerator;
import com.codeclan.al.ReptileClasses.Reptile;

import static org.junit.Assert.*;

public class TestAbstractFactory {

//	@Test
//	public void testBirdFactoryInheritesListOfExoticStatuses(){
//		AbstractFactory birdFactory = FactoryGenerator.getFactory("bird");
//		ArrayList<String> exoticStatuses = new ArrayList<String>();
//		exoticStatuses.add("common");
//		exoticStatuses.add("uncommon");
//		exoticStatuses.add("rare");
//		exoticStatuses.add("extremely rare");
//		exoticStatuses.add("endangered");
//		
//		assertEquals(exoticStatuses, birdFactory.getExoticStatusList());
//	}
//	
//	@Test
//	public void testReptileFactoryInheritsFullListOfExoticStatuses(){
//		AbstractFactory reptileFactory = FactoryGenerator.getFactory("reptile");
//		ArrayList<String> exoticStatuses = new ArrayList<String>();
//		exoticStatuses.add("common");
//		exoticStatuses.add("uncommon");
//		exoticStatuses.add("rare");
//		exoticStatuses.add("extremely rare");
//		exoticStatuses.add("endangered");
//		
//		assertEquals(exoticStatuses, reptileFactory.getExoticStatusList());
//	}
	
	@Test
	public void testAbstractFactorySetsStatusOfAnimalForGivenExoticRating(){
		AbstractFactory reptileFactory = FactoryGenerator.getFactory("reptile");
		Reptile crocodile = reptileFactory.getReptile("crocodilian");
//		assertTrue(crocodile.getExoticRating() == 71);
		assertTrue(crocodile.getExoticStatus() == "rare");
	}
	
	@Test
	public void testBirdFactorySetsExoticStatusOfEagle(){
		AbstractFactory birdFactory = FactoryGenerator.getFactory("bird");
		Bird eagle = birdFactory.getBird("eagle");
		assertTrue(eagle.getExoticStatus() == "rare");
	}
	
	
	
	
	
	
}
