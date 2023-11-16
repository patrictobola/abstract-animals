package org.java;

import org.java.pojo.Aquila;
import org.java.pojo.Cane;
import org.java.pojo.Delfino;
import org.java.pojo.Passerotto;

public class Main {

	public static void main(String[] args) {
		Cane cane = new Cane();
		Passerotto passerotto = new Passerotto();
		Aquila aquila = new Aquila();
		Delfino delfino = new Delfino();
		
		
		
		System.out.print("Il cane sta dormendo: ");
		cane.dormi();
		System.out.print("Emette questo verso: ");
        cane.verso();
        System.out.print("E mangia: ");
        cane.mangia();

		System.out.print("Il passerotto sta dormendo: ");
        passerotto.dormi();
		System.out.print("Emette questo verso: ");
        passerotto.verso();
        System.out.print("E mangia: ");
        passerotto.mangia();

		System.out.print("L'aquila sta dormendo: ");
        aquila.dormi();
		System.out.print("Emette questo verso: ");
        aquila.verso();
        System.out.print("E mangia: ");
        aquila.mangia();

        System.out.print("Il delfino sta dormendo: ");
        delfino.dormi();
		System.out.print("Emette questo verso: ");
        delfino.verso();
        System.out.print("E mangia: ");
        delfino.mangia();
	}

}
