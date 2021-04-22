package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.Flyweight;
import ro.ase.cts.flyweight.clase.FlyweightFactory;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare01 = new Rezervare(100,4,15);
		Rezervare rezervare02 = new Rezervare(101,6,15);
		Rezervare rezervare03 = new Rezervare(102,4,12);
		Rezervare rezervare04 = new Rezervare(103,10,20);
		
		FlyweightFactory flyweightFactory = new FlyweightFactory();
		Flyweight client01 = flyweightFactory.getFlyweight("0729920400");
		client01.printeazaRezervare(rezervare01);
		
		flyweightFactory.getFlyweight("0729920400").printeazaRezervare(rezervare02);
		flyweightFactory.getFlyweight("0729920400").printeazaRezervare(rezervare02);
		flyweightFactory.getFlyweight("0729920400").printeazaRezervare(rezervare02);
		
	}

}
