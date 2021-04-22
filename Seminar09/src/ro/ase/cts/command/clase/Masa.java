package ro.ase.cts.command.clase;

public class Masa {
	private int numarMasa;
	private Boolean esteOcupata;
	private Boolean esteRezervata;
	
	public void ocupaMasa() {
		if(this.esteOcupata==false) {
			this.esteOcupata = true;
			System.out.println("Ocupam masa "+numarMasa);
		}
		else{
			System.out.println("Nu ocupam masa "+numarMasa);
		}
	}
	
	public void rezervaMasa() {
		if(this.esteRezervata==false) {
			this.esteRezervata = true;
			System.out.println("Rezervam masa "+numarMasa);
		}
		else{
			System.out.println("Nu rezervam masa "+numarMasa);
		}
	}

	public Masa(int numarMasa) {
		super();
		this.numarMasa = numarMasa;
		this.esteOcupata = false;
		this.esteRezervata = false;
	}
	
	
	
}
