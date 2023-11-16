package org.java.pojo;

import org.java.pojo.abs.Animale;

public class Passerotto extends Animale{

	@Override
	public void verso() {
		System.out.println("Cinguetto");
		
	}

	@Override
	public void mangia() {
		System.out.println("Semi e moscerini (credo)");
		
	}

}
