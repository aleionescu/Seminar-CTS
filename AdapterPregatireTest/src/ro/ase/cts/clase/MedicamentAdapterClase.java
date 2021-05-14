package ro.ase.cts.clase;

public class MedicamentAdapterClase extends Medicament implements IMedicament {

	public MedicamentAdapterClase(String denumireMedicament) {
		super(denumireMedicament);
	}

	@Override
	public void vindeMedicament() {
		this.achizitioneazaMedicament();
	}

}
