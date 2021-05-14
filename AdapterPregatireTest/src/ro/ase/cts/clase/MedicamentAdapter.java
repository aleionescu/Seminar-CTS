package ro.ase.cts.clase;

public class MedicamentAdapter implements IMedicament{
	private Medicament medicament;

	
	public MedicamentAdapter(Medicament medicament) {
		super();
		this.medicament = medicament;
	}

	@Override
	public void vindeMedicament() {
		this.medicament.achizitioneazaMedicament();
	}
}
