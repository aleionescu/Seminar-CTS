package ro.ase.cts.command.clase;

public class ComandaOcupare extends Comanda{

	@Override
	public void executa() {
		super.masa.ocupaMasa();
	}

	public ComandaOcupare(Masa masa) {
		super(masa);
		// TODO Auto-generated constructor stub
	}
	
	
}
