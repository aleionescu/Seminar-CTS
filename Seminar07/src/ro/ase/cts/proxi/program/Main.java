package ro.ase.cts.proxi.program;

import ro.ase.cts.proxi.clase.Moneda;
import ro.ase.cts.proxi.clase.OperatorCredite;
import ro.ase.cts.proxi.clase.OperatorCrediteProxy;

public class Main {

	public static void main(String[] args) {
		OperatorCredite operatorCredite = new OperatorCredite();
		operatorCredite.creareCredit(Moneda.EUR, 40000);
		
		OperatorCrediteProxy proxy = new OperatorCrediteProxy(operatorCredite);
		proxy.creareCredit(Moneda.EUR, 100000);
		proxy.creareCredit(Moneda.RON, 3000000);
	}

}
