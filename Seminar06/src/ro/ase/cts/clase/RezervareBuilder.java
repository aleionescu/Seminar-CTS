package ro.ase.cts.clase;

public class RezervareBuilder implements AbstractBuilder{

	private Rezervare rezervare;
	
	public RezervareBuilder() {
		this.rezervare = new Rezervare(0,false,false,false,"not found");
	}
	
	public RezervareBuilder(int codRezervare) {
		this.rezervare = new Rezervare(codRezervare,false,false,false,"not found");
	}
	
	public RezervareBuilder setCodRezervare(int codRezervare) {
		this.rezervare.setCodRezervare(codRezervare);
		return this;
	}
	
	public RezervareBuilder setAreMancare(boolean areMancare) {
		this.rezervare.setAreMancare(areMancare);
		return this;
	}
	
	public RezervareBuilder setAreScaun(boolean areScaun) {
		this.rezervare.setAreScaunErgonomic(areScaun);
		return this;
	}
	
	public RezervareBuilder setGenMuzica(String genMuzica) {
		this.rezervare.setGenMuzica(genMuzica);
		return this;
	}
	
	@Override
	public Rezervare build() {
		return rezervare;
	}
}
