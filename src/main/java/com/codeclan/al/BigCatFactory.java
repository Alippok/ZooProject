package com.codeclan.al;

public class BigCatFactory {
	
	public BigCat getBigCat(String type) {
		if(type.equals("lion")){
			return new Lion();
		}
		if(type.equals("tiger")) {
			return new Tiger();
		}
		return null;
		
	}

}
