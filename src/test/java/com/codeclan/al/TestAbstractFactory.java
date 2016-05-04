package com.codeclan.al;

import org.junit.*;

import com.codeclan.al.BirdClasses.Bird;
import com.codeclan.al.Creators.AbstractFactory;
import com.codeclan.al.Creators.FactoryGenerator;
import com.codeclan.al.ReptileClasses.Crocodilian;
import com.codeclan.al.ReptileClasses.Reptile;
import com.codeclan.al.ReptileClasses.Turtle;

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
	
	@Test
	public void testAbstractFactoryCanIncrementIdNumber(){
		AbstractFactory birdFactory = FactoryGenerator.getFactory("bird");
		birdFactory.incrementIdNumber();
		assertTrue(birdFactory.getCurrentIdNumber() == 2);
	}
	
	@Test
	public void testBirdFactorySetsTypeOfNewBirds(){
		AbstractFactory birdFactory = FactoryGenerator.getFactory("bird");
		Bird eagle = birdFactory.getBird("eagle");
		assertTrue(eagle.getType() == "bird");
	}
	
	//still need to test other animal factories
	
	@Test
	public void testAbstractFactoryAssignsIdForGivenAnimal(){
		AbstractFactory reptileFactory = FactoryGenerator.getFactory("reptile");
		Reptile crocodile = reptileFactory.getReptile("crocodilian");
		assertEquals(crocodile.getId(), "reptile_1");
	}
	
	@Test
	public void testAbstractFactoryIncrementsIdNumberAfterAssigningId(){
		AbstractFactory reptileFactory = FactoryGenerator.getFactory("reptile");
		Reptile crocodile = reptileFactory.getReptile("crocodilian");
		assertTrue(reptileFactory.getCurrentIdNumber() == 2);
	}
	
	@Test
	public void testNextInstanceOfInstatiatedAnimalGetsDifferentIdNumber(){
		AbstractFactory reptileFactory = FactoryGenerator.getFactory("reptile");
		Reptile crocodile = reptileFactory.getReptile("crocodilian");
		Reptile crocodileTwo = reptileFactory.getReptile("crocodilian");
		assertEquals("reptile_2", crocodileTwo.getId());
	}
	
	@Test
	public void testAnimalOfDifferentSpeciesFromSameFactoryIsAssignedCorrectId(){
		AbstractFactory reptileFactory = FactoryGenerator.getFactory("reptile");
		Reptile crocodile = reptileFactory.getReptile("crocodilian");
		Reptile lizard = reptileFactory.getReptile("squamate");
		assertEquals("reptile_2", lizard.getId());
	}
	
	@Test
	public void testAssignIdMethodOfOneFactoryDoesNotAffectIdNumberOfAnotherFactory(){
		AbstractFactory reptileFactory = FactoryGenerator.getFactory("reptile");
		AbstractFactory birdFactory = FactoryGenerator.getFactory("bird");
		
		Reptile crocodile = reptileFactory.getReptile("crocodilian");
		assertTrue(birdFactory.getCurrentIdNumber() == 1);
	}
	
	@Test
	public void testAbstractFactorySetupAnimalMethod(){
		AbstractFactory reptileFactory = FactoryGenerator.getFactory("reptile");
		Reptile crocodile = reptileFactory.getReptile("crocodilian");
		assertTrue(crocodile.getExoticStatus().equals("rare"));
		
	}
	
	@Test
	public void testAbstractFactorySetupAnimalMethodOnDifferentReptile(){
		AbstractFactory reptileFactory = FactoryGenerator.getFactory("reptile");
		Reptile lizard = reptileFactory.getReptile("squamate");
		assertEquals("uncommon", lizard.getExoticStatus());
	}
	
	@Test
	public void testFactoryisInstantiatedWithValueCalculator(){
		AbstractFactory reptileFactory = FactoryGenerator.getFactory("reptile");
		ValueCalculator testCalculator = new ValueCalculator();
		assertEquals(testCalculator.getClass(), reptileFactory.getValueCalculator());
	}
	
	@Test
	public void testFactorySetupAnimalMethodCanSetMarketPriceOfAnimal(){
		AbstractFactory reptileFactory = FactoryGenerator.getFactory("reptile");
		Reptile crocodile = reptileFactory.getReptile("crocodilian");
		assertTrue(crocodile.getMarketPrice() == 1000.00);
	}
	
	@Test(expected = NullPointerException.class)
	public void testFactorySetExoticLevelThrowsNullPointerExceptionIfAnimalNotFound(){
		AbstractFactory reptileFactory = FactoryGenerator.getFactory("reptile");
		Reptile turtle = new Turtle();
		try{
			reptileFactory.calculateExoticLevel(turtle);
			fail("Exception was not thrown");
		}catch (NullPointerException e){
			System.err.println(e.getMessage());
			throw new NullPointerException();
		}
				
	}
	
//	@Test
//	public void testFactorySetupAnimalMethodCanStillSetupAnimalIfExoticRatingIsNotSet(){
//		AbstractFactory reptileFactory = FactoryGenerator.getFactory("reptile");
//		Reptile turtle = reptileFactory.getReptile("turtle");
//		assertTrue(turtle.getId().equals("reptile_1"));
//	}
	
	
	
	
	
}
