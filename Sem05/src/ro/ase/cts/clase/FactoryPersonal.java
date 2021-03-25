package ro.ase.cts.clase;

public class FactoryPersonal {
	public PersonalSpital createPersonal(TipPersonal tip, String nume) {
		switch(tip){
		case Asistent: return new Asistent(nume);
		case Medic: return new Medic(nume);
		case Brancardier: return new Brancardier(nume);
		default: 
			throw new IllegalArgumentException();
		}
	}
}
