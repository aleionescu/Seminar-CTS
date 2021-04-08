package ro.ase.cts.program;

import ro.ase.cts.clase.Persoana;
import ro.ase.cts.clase.VerificatorPersoane;

public class Main {

	public static void main(String[] args) {
		Persoana pers = new Persoana("Alexandra","2990503035365");
		if(VerificatorPersoane.isEligibile(pers)) {
			System.out.println("Persoana este eligibila.");
		}
		else {
			System.out.println("Persoana nu este eligibila.");
		}
	}

}
