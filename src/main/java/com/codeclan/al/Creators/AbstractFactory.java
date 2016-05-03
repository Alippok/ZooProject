package com.codeclan.al.Creators;

import java.util.ArrayList;
import com.codeclan.al.BirdClasses.Bird;
import com.codeclan.al.FishClasses.Fish;
import com.codeclan.al.ReptileClasses.Reptile;

public abstract class AbstractFactory {
	protected ArrayList<String> exoticStatusList;
	protected int idNumber;
	
	public AbstractFactory(){
		idNumber = 1;
		exoticStatusList = new ArrayList<String>();
		exoticStatusList.add("common");
		exoticStatusList.add("uncommon");
		exoticStatusList.add("rare");
		exoticStatusList.add("extremely rare");
		exoticStatusList.add("endangered");
	}
	
	public int getCurrentIdNumber(){
		int currentNumber = idNumber;
		return currentNumber;
	}
	
	public ArrayList<String> getExoticStatusList(){
		ArrayList<String> result = exoticStatusList;
		return result;
		
	}
	
	abstract public Fish getFish(String type);
	abstract public Bird getBird(String type);
	abstract public Reptile getReptile(String type);
	


}
