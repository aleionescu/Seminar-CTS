package ro.ase.cts.clase;

public class Asistent extends PersonalSpital {

	public Asistent(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Asistent ").append(super.getNume());
		return builder.toString();
	}

}
