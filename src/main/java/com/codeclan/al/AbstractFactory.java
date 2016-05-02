package com.codeclan.al;

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
	
	


}
