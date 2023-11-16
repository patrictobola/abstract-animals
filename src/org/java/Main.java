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
		
//		VERSIONE 1!!
//		Cane cane = new Cane();
//		Passerotto passerotto = new Passerotto();
//		Aquila aquila = new Aquila();
//		Delfino delfino = new Delfino();
//
//		Animale[] animali = new Animale[4];
//		animali[0] = cane;
//		animali[1] = passerotto;
//		animali[2] = aquila;
//		animali[3] = delfino;
//
//		for (int x = 0; x < animali.length; x++) {
//			System.out.print("Cosa fa l'animale? --> ");
//			animali[x].dormi();
//			System.out.print("Che verso fa? --> ");
//			animali[x].verso();
//			System.out.print("E che si mangia? --> ");
//			animali[x].mangia();
//			if (animali[x] instanceof IVolante) {
//				System.out.println(((IVolante) animali[x]).vola());
//			} else if (animali[x] instanceof INuotante) {
//				System.out.println(((INuotante) animali[x]).nuota());
//			}
//			System.out.println("--------------------------");
				
		
		//	Versione 2!!
		Cane cane = new Cane();
		Passerotto passerotto = new Passerotto();
		Aquila aquila = new Aquila();
		Delfino delfino = new Delfino();

		Animale[] animali = new Animale[4];
		animali[0] = cane;
		animali[1] = passerotto;
		animali[2] = aquila;
		animali[3] = delfino;

		for (int x = 0; x < animali.length; x++) {
			System.out.print("Cosa fa l'animale? --> ");
			animali[x].dormi();
			System.out.print("Che verso fa? --> ");
			animali[x].verso();
			System.out.print("E che si mangia? --> ");
			animali[x].mangia();
			if (animali[x] instanceof IVolante) {
                System.out.println(faiVolare((IVolante) animali[x])); 
            } else if (animali[x] instanceof INuotante) {
                System.out.println(faiNuotare((INuotante) animali[x])); 
            }
			System.out.println("--------------------------");
			
			
			System.out.println("Sono un uccellino e " + faiVolare((IVolante) animali[1]));
			
			
			
		}

	}
	public static String faiVolare (IVolante v) {
		return v.vola();
	}
	public static String faiNuotare (INuotante n) {
		return n.nuota();
	}
}