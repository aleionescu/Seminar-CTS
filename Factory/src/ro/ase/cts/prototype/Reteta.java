package ro.ase.cts.prototype;

public class Reteta implements PrototipAbstract{
	private String denumireSolutie;
	private int cantitateSolutie;
	
	public Reteta(String denumireSolutie, int cantitateSolutie) {
		//VALIDARI
		super();
		this.denumireSolutie = denumireSolutie;
		this.cantitateSolutie = cantitateSolutie;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reteta [denumireSolutie=");
		builder.append(denumireSolutie);
		builder.append(", cantitateSolutie=");
		builder.append(cantitateSolutie);
		builder.append("]");
		return builder.toString();
	}
	
	private Reteta() {
		//nu avem validari si aici intervine avantajul lui PROTOTYPE, ca nu mai stam dupa validari
	}

	@Override
	public PrototipAbstract copiaza() {
		// TODO Auto-generated method stub
		Reteta copie = new Reteta();
		copie.cantitateSolutie = this.cantitateSolutie;
		copie.denumireSolutie = this.denumireSolutie;
		return copie;
	}
}
