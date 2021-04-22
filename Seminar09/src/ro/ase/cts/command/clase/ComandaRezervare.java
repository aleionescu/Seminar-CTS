package ro.ase.cts.command.clase;

public class ComandaRezervare extends Comanda{

	@Override
	public void executa() {
		super.masa.rezervaMasa();
	}

	public ComandaRezervare(Masa masa) {
		super(masa);
		// TODO Auto-generated constructor stub
	}

}
