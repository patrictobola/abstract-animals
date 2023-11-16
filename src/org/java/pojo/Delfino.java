package org.java.pojo;

import org.java.pojo.abs.Animale;

public class Delfino extends Animale{

	@Override
	public void verso() {
		System.out.println("Frigge");
		
	}

	@Override
	public void mangia() {
		System.out.println("Sardine e altri pesci");
		
	}

}
