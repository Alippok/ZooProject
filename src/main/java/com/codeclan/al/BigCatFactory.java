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
			return new Tiger();
		}
		return null;
		
	}

}
