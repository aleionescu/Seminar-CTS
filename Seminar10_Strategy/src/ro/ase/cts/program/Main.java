package ro.ase.cts.program;

import ro.ase.cts.clase.*;

public class Main {

	public static void main(String[] args) {
		Client client= new Client("Alice");
		
		client.plateste(90);
		client.setTipPlata(new PlatesteCard());
		client.plateste(25);
	}

}
