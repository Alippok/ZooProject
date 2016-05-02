package com.codeclan.al;

public class BigCatFactory {
	
	public BigCat getBigCat(String type) {
		if(type.equals("lion")){
			return new Lion();
		}
		return null;
		
	}

}
