package com.codeclan.al.Creators;

import com.codeclan.al.BigCat;
import com.codeclan.al.Lion;
import com.codeclan.al.Tiger;

public class BigCatFactory {
	protected int idNumber;
	
	public BigCatFactory(){
		idNumber = 1;
	}
	
	public int getIdNumber(){
		return idNumber;
	}
	
	public void incrementIdNumber(){
		idNumber += 1;
	}
	
	public void setBigCatId(BigCat animal){
		animal.setId(getIdNumber());
		incrementIdNumber();
	}
	
	public BigCat getBigCat(String species) {
		if(species.equals("lion")){
			BigCat lion = new Lion();
			setBigCatId(lion);
			return lion;
		}
		if(species.equals("tiger")) {
			BigCat tiger =  new Tiger();
			setBigCatId(tiger);
			return tiger;
		}
		return null;
		
	}

}
