package ro.ase.cts.program;

import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.RezervareBuilder;
import ro.ase.cts.clase.RezervareBuilderV2;

public class Main {
	public static void main(String[] args) {
		Rezervare rezervare01;
		Rezervare rezervare02;
		Rezervare rezervare03=new Rezervare(200,true,true,true,"jazz");
		
		RezervareBuilder rezervareBuilder = new RezervareBuilder();
		rezervareBuilder.setCodRezervare(100).setAreMancare(true);
		rezervare01 = rezervareBuilder.build();
		
		rezervare02 = new RezervareBuilder().setCodRezervare(101).setAreMancare(true).build();
		System.out.println(rezervare01.toString());
		System.out.println(rezervare02.toString());
		System.out.println(rezervare03.toString());
		
		Rezervare rezervare04 = new RezervareBuilder().setGenMuzica("pop").build();
		Rezervare rezervare05 = new RezervareBuilder().setGenMuzica("rock").build();
		System.out.println(rezervare04.toString());
		System.out.println(rezervare05.toString());
		
		RezervareBuilderV2 rezervareBuilderV2 = new RezervareBuilderV2().setAreMancare(true).setAreScaunErgonomic(true);
		Rezervare rezervare100 = rezervareBuilderV2.setCodRezervare(100).build();
		Rezervare rezervare101 = rezervareBuilderV2.setCodRezervare(101).build();
		
		System.out.println(rezervare100.toString());
		System.out.println(rezervare101.toString());
	}	
}
