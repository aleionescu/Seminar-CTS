package ro.ase.cts.decorator.clase;

public abstract class DecoratorAbstract implements INota {
	private INota nota;

	public DecoratorAbstract(INota nota) {
		super();
		this.nota = nota;
	}

	@Override
	public void printeaza() {
		nota.printeaza();
	}
	
	public abstract void printeazaFelicitare();
}
