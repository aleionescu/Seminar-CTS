package ro.ase.cts.program;

import ro.ase.cts.clase.FactoryPersonal;
import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.clase.TipPersonal;

public class Main {
	public static void main(String[] args) {
		FactoryPersonal factoryPersonal = new FactoryPersonal();
		
		PersonalSpital asistent = factoryPersonal.createPersonal(TipPersonal.Asistent, "Asistent01");
		PersonalSpital medic = factoryPersonal.createPersonal(TipPersonal.Medic, "Medic01");
		
		System.out.println(asistent.toString());
		System.out.println(medic.toString());
	}
}
