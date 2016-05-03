package com.codeclan.al.Creators;

import com.codeclan.al.BirdClasses.Bird;
import com.codeclan.al.FishClasses.Fish;
import com.codeclan.al.ReptileClasses.Crocodilian;
import com.codeclan.al.ReptileClasses.Reptile;

public class ReptileFactory extends AbstractFactory {
//redundant methods inherited from AbstractFactory
	@Override
	public Fish getFish(String type) {
		return null;
	}

	@Override
	public Bird getBird(String type) {
		return null;
	}
//

	public Reptile getReptile(String type) {
		if(type.equals("crocodilian")){
			return new Crocodilian();
		}
		return null;
		
	}
	

}
