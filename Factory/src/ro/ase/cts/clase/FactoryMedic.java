package ro.ase.cts.clase;

public class FactoryMedic implements IFactory {

	@Override
	public PersonalSpital getPersonal(String nume) {
		// TODO Auto-generated method stub
		return new Medic(nume);
	}

}
