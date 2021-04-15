package ro.ase.cts.decorator.clase;

public class DecoratorConcretCuLMA extends DecoratorAbstract {

	public DecoratorConcretCuLMA(INota nota) {
		super(nota);
	}
	
	public void printeazaFelicitare() {
		System.out.println("FELICITARE: La multi ani!");
	}

	@Override
	public void printeaza() {
		super.printeaza();
		System.out.println("La multi ani!");
	}
	
	
}
