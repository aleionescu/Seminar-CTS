package ro.ase.cts.program;

import ro.ase.cts.clase.*;

public class Main {

	public static void main(String[] args) {
		Medicament medSpital01 = new Medicament ("Paracetamol");
		//medSpital01.achizitioneazaMedicament();
		
		MedicamentAdapter medFarmacie01 = new MedicamentAdapter(medSpital01);
		medFarmacie01.vindeMedicament();
		
		IMedicament medAdaptorClase = new MedicamentAdapterClase("NoSpa");
		medAdaptorClase.vindeMedicament();
	}

}
