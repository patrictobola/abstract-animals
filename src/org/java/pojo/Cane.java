package org.java.pojo;

import org.java.pojo.abs.Animale;

public class Cane extends Animale{

	@Override
	public void verso() {
		System.out.println("Abbaio");
		
	}

	@Override
	public void mangia() {
		System.out.println("Un po' di tutto");
		
	}

}
