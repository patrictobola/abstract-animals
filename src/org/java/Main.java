package org.java;

import org.java.pojo.Aquila;
import org.java.pojo.Cane;
import org.java.pojo.Delfino;
import org.java.pojo.Passerotto;
import org.java.pojo.abs.Animale;
import org.java.pojo.inter.INuotante;
import org.java.pojo.inter.IVolante;

public class Main {

	public static void main(String[] args) {
		Cane cane = new Cane();
		Passerotto passerotto = new Passerotto();
		Aquila aquila = new Aquila();
		Delfino delfino = new Delfino();
		
		Animale[] animali = new Animale[4];
		animali[0] = cane;
		animali[1] = passerotto;
		animali[2] = aquila;
		animali[3] = delfino;
		
		for(int x = 0; x < animali.length;x++) {
			System.out.print("Cosa fa l'animale? --> ");
			animali[x].dormi();
			System.out.print("Che verso fa? --> ");
			animali[x].verso();
			System.out.print("E che si mangia? --> ");
			animali[x].mangia();
			if(animali[x] instanceof IVolante) {
				System.out.println(((IVolante) animali[x]).vola());
			}else if(animali[x] instanceof INuotante) {
				System.out.println(((INuotante) animali[x]).nuota());
			}
			System.out.println("--------------------------");
			
			
		}
		
//		System.out.print("Il cane sta dormendo: ");
//		System.out.print("Emette questo verso: ");
//        cane.verso();
//        System.out.print("E mangia: ");
//        cane.mangia();
//        System.out.println("--------------------------");
//
//		System.out.print("Il passerotto sta dormendo: ");
//        passerotto.dormi();
//		System.out.print("Emette questo verso: ");
//        passerotto.verso();
//        System.out.print("E mangia: ");
//        passerotto.mangia();
//        System.out.println(passerotto.vola());
//        System.out.println("--------------------------");
//
//		System.out.print("L'aquila sta dormendo: ");
//        aquila.dormi();
//		System.out.print("Emette questo verso: ");
//        aquila.verso();
//        System.out.print("E mangia: ");
//        aquila.mangia();
//        System.out.println(aquila.vola());
//        System.out.println("--------------------------");
//
//        System.out.print("Il delfino sta dormendo: ");
//        delfino.dormi();
//		System.out.print("Emette questo verso: ");
//        delfino.verso();
//        System.out.print("E mangia: ");
//        delfino.mangia();
//        System.out.println(delfino.nuota());
	}

}
