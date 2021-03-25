package ro.ase.cts.clase;

public class Brancardier extends PersonalSpital{

	public Brancardier(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Brancardier ").append(super.getNume());
		return builder.toString();
	}
	
	
}
