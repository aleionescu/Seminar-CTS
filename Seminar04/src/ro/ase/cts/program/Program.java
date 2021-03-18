package ro.ase.cts.program;

import ro.ase.cts.clase.Emir;
import ro.ase.cts.clase.Presedinte;
import ro.ase.cts.clase.PresedinteLazy;

public class Program {

	public static void main(String[] args) {
		Presedinte presedinte1 = Presedinte.getInstance();
		Presedinte presedinte2 = Presedinte.getInstance();
		
		System.out.println(presedinte1.toString());
		System.out.println(presedinte2.toString());
		
		presedinte1.setNume("Basescu");
		presedinte2.setMandat(2);
		
		System.out.println(presedinte1.toString());
		System.out.println(presedinte2.toString());
		
		
		PresedinteLazy presedinteLazy1 = PresedinteLazy.getInstance("Iohannis",40,5);
		PresedinteLazy presedinteLazy2 = PresedinteLazy.getInstance("Popescu",50,1);
		
		System.out.println(presedinteLazy1.toString());
		System.out.println(presedinteLazy2.toString());
		
		Emir emir0 = Emir.getInstance();
		Emir emir1 = Emir.getInstance("Emir01", 30, "Tara01");
		Emir emir2 = Emir.getInstance("Emir02",50,"Tara02");
		
		System.out.println(emir0.toString());
		System.out.println(emir1.toString());
		System.out.println(emir2.toString());
		
		emir1.setNume("NUME");
		System.out.println(emir0.toString());
		System.out.println(emir1.toString());
		System.out.println(emir2.toString());
	}
}
