package ro.ase.cts.proxi.clase;

public class OperatorCrediteProxy implements IOperatorCredite {

	private OperatorCredite operatorCredite;
	
	public OperatorCrediteProxy(OperatorCredite operatorCredite) {
		super();
		this.operatorCredite = operatorCredite;
	}

	@Override
	public void creareCredit(Moneda moneda, int suma) {
		if(moneda == Moneda.RON) {
			operatorCredite.creareCredit(moneda, suma);
		}
		else {
			System.out.println("In acest moment, banca ofera doar credite in lei.");
		}
	}
}
