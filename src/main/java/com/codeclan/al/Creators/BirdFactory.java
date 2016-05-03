package com.codeclan.al.Creators;

import com.codeclan.al.Animal;
import com.codeclan.al.BirdClasses.Bird;
import com.codeclan.al.BirdClasses.Eagle;
import com.codeclan.al.FishClasses.Fish;
import com.codeclan.al.ReptileClasses.Reptile;

public class BirdFactory extends AbstractFactory implements ExoticCalculator{
	//redundant inherited methods from AbstractFactory class. Set to null
	public Fish getFish(String type) {
		return null;
	}
	public Reptile getReptile(String type){
		return null;
	}
//	
	
	public Bird getBird(String type) {
		if(type.equals("eagle")){
			Bird eagle = new Eagle();
			calculateExoticLevel(eagle);
			return eagle;
			
		}
		return null;
	}

	public void calculateExoticLevel(Animal animal) {
		if(animal instanceof Eagle){
			animal.setExoticRating(68);
		}
		
	}

	public void setExoticStatus(Animal animal) {
		// TODO Auto-generated method stub
		
	}
	
	

}
