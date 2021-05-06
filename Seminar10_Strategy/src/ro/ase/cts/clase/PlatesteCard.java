package ro.ase.cts.clase;

public class PlatesteCard implements IPlata{

	@Override
	public void plateste(float suma) {
		System.out.println("A fost realizata pata cu cardul pentru suma de "+suma+" lei.");
	}

}
