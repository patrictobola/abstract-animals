package org.java.pojo;

import org.java.pojo.abs.Animale;
import org.java.pojo.inter.IVolante;

public class Passerotto extends Animale implements IVolante{

	@Override
	public void verso() {
		System.out.println("Cinguetto");
		
	}

	@Override
	public void mangia() {
		System.out.println("Semi e moscerini (credo)");
		
	}

	@Override
	public String vola() {
		
		return "Sto volando!!!";
	}

}
