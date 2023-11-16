package org.java.pojo;

import org.java.pojo.abs.Animale;
import org.java.pojo.inter.INuotante;

public class Delfino extends Animale implements INuotante{

	@Override
	public void verso() {
		System.out.println("Frigge");
		
	}

	@Override
	public void mangia() {
		System.out.println("Sardine e altri pesci");
		
	}
	
	@Override
	public String nuota() {
		
		return "Sto nuotando!!!";
	}

}
