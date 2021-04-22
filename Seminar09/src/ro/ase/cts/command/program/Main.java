package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.Comanda;
import ro.ase.cts.command.clase.ComandaOcupare;
import ro.ase.cts.command.clase.ComandaRezervare;
import ro.ase.cts.command.clase.Masa;
import ro.ase.cts.command.clase.Operator;

public class Main {

	public static void main(String[] args) {
		Masa masa1 = new Masa(1);
		Comanda comandaRezervare = new ComandaRezervare(masa1);
		Comanda comandaOcupare = new ComandaOcupare(masa1);
		Comanda comandaOcupare2 = new ComandaOcupare(masa1);
		
		Operator operator = new Operator();
		operator.invoca(comandaRezervare);
		operator.executaComanda();
		operator.invoca(comandaOcupare);
		operator.invoca(comandaOcupare2);
		
		operator.executaComanda();
		operator.executaComanda();
	}

}
