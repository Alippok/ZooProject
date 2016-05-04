package com.codeclan.al.Creators;

import com.codeclan.al.Animal;
import com.codeclan.al.BirdClasses.Bird;
import com.codeclan.al.FishClasses.Fish;
import com.codeclan.al.FishClasses.Ray;
import com.codeclan.al.FishClasses.Shark;
import com.codeclan.al.ReptileClasses.Reptile;

public class FishFactory extends AbstractFactory {
	//redundant inherited methods from AbstractFactory class. Set to null
	public Bird getBird(String type){
		return null;
	}
	
	public Reptile getReptile(String type){
		return null;
	}
//	
	
	public Fish getFish(String type){
		if(type.equals("shark")){
			Fish shark = new Shark();
			calculateExoticLevel(shark);
			return shark;
		}
		if(type.equals("ray")){
			Fish ray = new Ray();
			calculateExoticLevel(ray);
			return ray;
		}
		return null;
	}
	

	public boolean calculateExoticLevel(Animal animal) throws NullPointerException{
		if(animal instanceof Shark){
			animal.setExoticRating(74);
		}
		if(animal instanceof Ray){
			animal.setExoticRating(79);
		}
		throw new NullPointerException();
	}
	
	public void setType(Animal animal) {
		animal.setType("fish");
	}
	
	

}
