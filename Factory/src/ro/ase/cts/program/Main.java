package ro.ase.cts.program;

import ro.ase.cts.clase.FactoryAsistent;
import ro.ase.cts.clase.FactoryInfirmier;
import ro.ase.cts.clase.FactoryMedic;
import ro.ase.cts.clase.IFactory;
import ro.ase.cts.clase.PersonalSpital;

public class Main {
	
	public static void afisareInformatiiPersonalSpital(IFactory factory, String nume) {
		PersonalSpital personalSpital = factory.getPersonal(nume);
		
		System.out.println(personalSpital.toString());
	}
	
	public static void main(String[] args) {
		afisareInformatiiPersonalSpital(new FactoryAsistent(), "Asistent01");
		afisareInformatiiPersonalSpital(new FactoryMedic(), "Medic01");
		afisareInformatiiPersonalSpital(new FactoryInfirmier(), "Infirmier01");
	}
}
