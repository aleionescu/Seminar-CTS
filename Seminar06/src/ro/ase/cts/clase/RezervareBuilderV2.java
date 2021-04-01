package ro.ase.cts.clase;

public class RezervareBuilderV2 implements AbstractBuilder {

	private int codRezervare;
	private boolean areMancare;
	private boolean areScaunErgonomic;
	private boolean areMuzicaAmbientala;
	private String genMuzica;
	
	public RezervareBuilderV2() {
		this.codRezervare = 1000;
		this.areMuzicaAmbientala=false;
		this.areScaunErgonomic=false;
		this.genMuzica="no music";
		this.areMancare=false;
	}

	public int getCodRezervare() {
		return codRezervare;
	}

	public boolean isAreMancare() {
		return areMancare;
	}

	public boolean isAreScaunErgonomic() {
		return areScaunErgonomic;
	}

	public boolean isAreMuzicaAmbientala() {
		return areMuzicaAmbientala;
	}

	public String getGenMuzica() {
		return genMuzica;
	}

	public RezervareBuilderV2 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}

	public RezervareBuilderV2 setAreMancare(boolean areMancare) {
		this.areMancare = areMancare;
		return this;
	}

	public RezervareBuilderV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
		return this;
	}

	public RezervareBuilderV2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		return this;
	}

	public RezervareBuilderV2 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}

	@Override
	public Rezervare build() {
		return new Rezervare(codRezervare, areMancare, areScaunErgonomic, areMuzicaAmbientala, genMuzica);
	}

}
