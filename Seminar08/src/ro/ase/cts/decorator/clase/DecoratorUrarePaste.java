package ro.ase.cts.decorator.clase;

public class DecoratorUrarePaste extends DecoratorAbstract{

	public DecoratorUrarePaste(INota nota) {
		super(nota);
	}

	@Override
	public void printeaza() {
		// TODO Auto-generated method stub
		super.printeaza();
		System.out.println("Paste fericit!");
	}

	@Override
	public void printeazaFelicitare() {
		System.out.println("FELICITARE: PasteFericit!");
	}

}
