package ro.ase.cts.clase;

public class Emir {

	private String taraProvenienta;
	private int varsta;
	private String nume;
	
	private static Emir instance = null;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Emirul tarii [taraProvenienta=");
		builder.append(taraProvenienta);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", nume=");
		builder.append(nume);
		builder.append("]");
		return builder.toString();
	}
	private Emir(String taraProvenienta, int varsta, String nume) {
		//super();
		this.taraProvenienta = taraProvenienta;
		this.varsta = varsta;
		this.nume = nume;
	}
	public static synchronized Emir getInstance(String nume, int varsta, String taraProvenienta) {
		if(instance == null) {
			instance = new Emir(nume, varsta, taraProvenienta);
		}
		return instance;
	}
	
	public static synchronized Emir getInstance() {
		return getInstance("Emir00",20,"Tara00");
		//return instance;
	}
	public String getTaraProvenienta() {
		return taraProvenienta;
	}
	public void setTaraProvenienta(String taraProvenienta) {
		this.taraProvenienta = taraProvenienta;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	
}

