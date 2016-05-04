package com.codeclan.al.Creators;

import com.codeclan.al.Animal;
import com.codeclan.al.BirdClasses.Bird;
import com.codeclan.al.FishClasses.Fish;
import com.codeclan.al.ReptileClasses.Crocodilian;
import com.codeclan.al.ReptileClasses.Reptile;
import com.codeclan.al.ReptileClasses.Squamate;
import com.codeclan.al.ReptileClasses.Turtle;

public class ReptileFactory extends AbstractFactory {
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
			setupAnimal(crocodilian);
			return crocodilian;
		}
		if(type.equals("squamate")){
			Reptile squamate = new Squamate();
			setupAnimal(squamate);
			return squamate;
		}
		if(type.equals("turtle")){
			Reptile turtle = new Turtle();
			setupAnimal(turtle);
			return turtle;
		}
		return null;
		
	}

	
	public boolean calculateExoticLevel(Animal animal) throws NullPointerException {
		if(animal instanceof Crocodilian){
			animal.setExoticRating(71);
			return true;
		}
		if(animal instanceof Squamate){
			animal.setExoticRating(56);
			return true;
		}
		throw new NullPointerException();
		
	}
	
	public void setType(Animal animal) {
		animal.setType("reptile");
	}
	

}
