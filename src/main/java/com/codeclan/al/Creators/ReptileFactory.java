package com.codeclan.al.Creators;

import com.codeclan.al.Animal;
import com.codeclan.al.BirdClasses.Bird;
import com.codeclan.al.FishClasses.Fish;
import com.codeclan.al.ReptileClasses.Crocodilian;
import com.codeclan.al.ReptileClasses.Reptile;

public class ReptileFactory extends AbstractFactory implements ExoticCalculator {
//redundant methods inherited from AbstractFactory
	@Override
	public Fish getFish(String type) {
		return null;
	}

	@Override
	public Bird getBird(String type) {
		return null;
	}
//

	public Reptile getReptile(String type) {
		if(type.equals("crocodilian")){
			Reptile crocodilian = new Crocodilian();
			setType(crocodilian);
			assignIdToAnimal(crocodilian);
			calculateExoticLevel(crocodilian);
			setExoticStatus(crocodilian);
			return crocodilian;
		}
		return null;
		
	}

	public void calculateExoticLevel(Animal animal) {
		if(animal instanceof Crocodilian){
			animal.setExoticRating(71);
		}
	}
	
	public void setType(Animal animal) {
		animal.setType("reptile");
	}
	

}
