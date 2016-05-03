package com.codeclan.al;

import com.codeclan.al.BirdClasses.Bird;
import com.codeclan.al.FishClasses.Fish;

public abstract class AbstractFactory {
	protected int idNumber;
	
	public AbstractFactory(){
		idNumber = 1;
	}
	
	public int getCurrentIdNumber(){
		int currentNumber = idNumber;
		return currentNumber;
	}
	
	abstract public Fish getFish(String type);
	abstract public Bird getBird(String type);
	
	


}
