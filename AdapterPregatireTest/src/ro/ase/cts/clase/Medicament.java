package ro.ase.cts.clase;

public class Medicament {
	private String denumireMedicament;

	public Medicament(String denumireMedicament) {
		super();
		this.denumireMedicament = denumireMedicament;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medicament [denumireMedicament=");
		builder.append(denumireMedicament);
		builder.append("]");
		return builder.toString();
	}
	
	public void achizitioneazaMedicament() {
		prezintaReteta();
		System.out.println("A fost achizitionat medicamentul "+denumireMedicament+".");
	}
	
	public void prezintaReteta() {
		System.out.println("A fost verificata reteta pentru medicamentul "+denumireMedicament+".");
	}
}
