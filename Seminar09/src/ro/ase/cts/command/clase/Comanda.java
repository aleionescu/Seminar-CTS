package ro.ase.cts.command.clase;

public abstract class Comanda {
	protected Masa masa;
	
	public Comanda(Masa masa) {
		super();
		this.masa = masa;
	}



	public abstract void executa();
}
