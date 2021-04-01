package ro.ase.cts.program;

import ro.ase.cts.clase.Bilet;
import ro.ase.cts.clase.BiletAdapter;
import ro.ase.cts.clase.BiletAdaptorClase;
import ro.ase.cts.clase.IBiletOnline;

public class Main {

	public static void rezervaSiAfiseazaBiletLaCasa(Bilet bilet) {
		bilet.rezervare();
		bilet.vanzare();
	}
	
	public static void rezervaSiAfiseazaBiletOnline(IBiletOnline bilet) {
		bilet.rezervaBiletOnline();
		bilet.vindeBiletOnline();
	}
	
	public static void main(String[] args) {
		Bilet bilet = new Bilet(300);
		rezervaSiAfiseazaBiletLaCasa(bilet);
		
		IBiletOnline adaptor = new BiletAdapter(bilet);
		rezervaSiAfiseazaBiletOnline(adaptor);
		
		IBiletOnline adaptorClase = new BiletAdaptorClase(500);
		rezervaSiAfiseazaBiletOnline(adaptorClase);
	}

}
