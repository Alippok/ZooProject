package com.codeclan.al.Creators;

import com.codeclan.al.Animal;
import com.codeclan.al.ValueCalculator;
import com.codeclan.al.BirdClasses.Bird;
import com.codeclan.al.FishClasses.Fish;
import com.codeclan.al.ReptileClasses.Reptile;

public abstract class AbstractFactory {
	
	protected int idNumber;
	protected ValueCalculator valueCalculator;
	
	public AbstractFactory(){
		idNumber = 1;
		valueCalculator = new ValueCalculator();
	}
	
	public int getCurrentIdNumber(){
		int currentNumber = idNumber;
		return currentNumber;
	}
	
	public void incrementIdNumber(){
		idNumber += 1;
	}
	
	public void assignIdToAnimal(Animal animal){
		animal.setId(idNumber);
		incrementIdNumber();
	}
	
	public Class<? extends ValueCalculator> getValueCalculator(){
		return valueCalculator.getClass();
	}
	
	
	//need to write methods in subclasses to set type to be the class before being able to set the id here
	
	public void setupAnimal(Animal animal){
		setType(animal);
		assignIdToAnimal(animal);
		calculateExoticLevel(animal);
		setExoticStatus(animal);
		valueCalculator.valueAnimal(animal);
	}
		
	public void setExoticStatus(Animal animal){
		int rating = animal.getExoticRating();
		if(rating<=101 && rating>=85){
			animal.setExoticStatus("endangered");
		} else if(rating<=84 && rating>=75){
			animal.setExoticStatus("extremely rare");
		} else if(rating<=74 && rating>=60){
			animal.setExoticStatus("rare");
		} else if(rating<=59 && rating>=40){
			animal.setExoticStatus("uncommon");
		} else if(rating<=39 && rating>=1){
			animal.setExoticStatus("common");
		}
	}
	
	
	abstract public boolean calculateExoticLevel(Animal animal);
	abstract public void setType(Animal animal);
	abstract public Fish getFish(String type);
	abstract public Bird getBird(String type);
	abstract public Reptile getReptile(String type);
	


}
