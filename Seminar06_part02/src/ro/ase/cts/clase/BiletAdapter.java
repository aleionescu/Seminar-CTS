package ro.ase.cts.clase;

public class BiletAdapter implements IBiletOnline{

	private Bilet bilet;
	
	public BiletAdapter(Bilet bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	public void rezervaBiletOnline() {
		this.bilet.rezervare();
		
	}

	@Override
	public void vindeBiletOnline() {
		this.bilet.vanzare();
	}

}
