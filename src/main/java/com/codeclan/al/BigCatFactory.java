package com.codeclan.al;

public class BigCatFactory {
	protected int idNumber;
	
	public BigCatFactory(){
		idNumber = 1;
	}
	
	public int getIdNumber(){
		return idNumber;
	}
	
	public BigCat getBigCat(String species) {
		if(species.equals("lion")){
			return new Lion();
		}
		if(species.equals("tiger")) {
			BigCat tiger =  new Tiger();
			tiger.setId(getIdNumber());
			idNumber += 1;
			return tiger;
		}
		return null;
		
	}

}
