package ro.ase.cts.clase;

public class FactoryAsistent implements IFactory {

	@Override
	public PersonalSpital getPersonal(String nume) {
		// TODO Auto-generated method stub
		return new Asistent(nume);
	}

}
