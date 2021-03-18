package ro.ase.cts.clase;

public class PresedinteLazy {
	private String nume; 
	private int varsta;
	private int mandat;
	
	private static PresedinteLazy instance = null;

	private PresedinteLazy(String nume, int varsta, int mandat) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.mandat = mandat;
	}
	
	private PresedinteLazy() {
		//super();
		this.nume = "Putin";
		this.varsta = 68;
		this.mandat = 10;
	}
	
	public static synchronized PresedinteLazy getInstance(String nume, int varsta, int mandat) {
		if(instance == null) {
			instance = new PresedinteLazy(nume, varsta, mandat);
		}
		return instance;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int getMandat() {
		return mandat;
	}

	public void setMandat(int mandat) {
		this.mandat = mandat;
	}

	public static PresedinteLazy getInstance() {
		return instance;
	}

	public static void setInstance(PresedinteLazy instance) {
		PresedinteLazy.instance = instance;
	}

}
