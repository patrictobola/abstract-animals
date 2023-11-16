package org.java.pojo;

import org.java.pojo.abs.Animale;
import org.java.pojo.inter.IVolante;

public class Aquila extends Animale implements IVolante{

	@Override
	public void verso() {
		System.out.println("Strido");
	}

	@Override
	public void mangia() {
		System.out.println("Serpi e altro");

	}
	
	@Override
	public String vola() {
		
		return "Sto volando!!!";
	}

}
