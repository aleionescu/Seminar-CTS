package ro.ase.cts.proxi.clase;

public class OperatorCredite implements IOperatorCredite{

	@Override
	public void creareCredit(Moneda moneda, int suma) {
		System.out.println("A fost creat creditul in valoare de "+suma+" "+moneda+".");
	}

}
