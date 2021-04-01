package ro.ase.cts.clase;

public class Bilet {
	private float pret;

	public Bilet(float pret) {
		//super();
		this.pret = pret;
	}
	
	public void vanzare() {
		System.out.println("S-a vandut biletul: "+this.pret);
	}
	
	public void rezervare() {
		System.out.println("S-a rezervat biletul: "+this.pret);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bilet [pret=");
		builder.append(pret);
		builder.append("]");
		return builder.toString();
	}
}
