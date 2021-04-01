package ro.ase.cts.clase;

public class BiletAdaptorClase extends Bilet implements IBiletOnline {

	public BiletAdaptorClase(float pret) {
		super(pret);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void rezervaBiletOnline() {
		this.rezervare();
		
	}

	@Override
	public void vindeBiletOnline() {
		this.vanzare();
		
	}

}
