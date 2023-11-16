package org.java.pojo;

import org.java.pojo.abs.Animale;

public class Aquila extends Animale {

	@Override
	public void verso() {
		System.out.println("Strido");
	}

	@Override
	public void mangia() {
		System.out.println("Serpi e altro");

	}

}
