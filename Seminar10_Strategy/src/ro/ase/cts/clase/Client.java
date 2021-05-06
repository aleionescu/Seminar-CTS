package ro.ase.cts.clase;

public class Client {
	private IPlata tipPlata;
	private String nume;
	
	public Client(String nume) {
		super();
		this.tipPlata = new PlatesteCash();
		this.nume = nume;
	}

	public void setTipPlata(IPlata tipPlata) {
		this.tipPlata = tipPlata;
	}
	
	public void plateste(float suma) {
		this.tipPlata.plateste(suma);
	}
}
