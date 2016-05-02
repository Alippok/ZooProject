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
			BigCat lion = new Lion();
			lion.setId(getIdNumber());
			idNumber += 1;
			return lion;
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
