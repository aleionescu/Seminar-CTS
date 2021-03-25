package ro.ase.cts.clase;

public class FactoryBrancardier implements IFactory {

	@Override
	public PersonalSpital getPersonal(String nume) {
		// TODO Auto-generated method stub
		return new Brancardier(nume);
	}

}
