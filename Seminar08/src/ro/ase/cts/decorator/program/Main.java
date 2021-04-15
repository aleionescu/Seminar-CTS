package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorConcretCuLMA;
import ro.ase.cts.decorator.clase.DecoratorUrarePaste;
import ro.ase.cts.decorator.clase.NotaDePlata;

public class Main {

	public static void main(String[] args) {
		NotaDePlata notaInitiala = new NotaDePlata(55); 
		notaInitiala.printeaza();
		
		DecoratorAbstract decoratorLMA = new DecoratorConcretCuLMA(notaInitiala);
		
		System.out.println();decoratorLMA.printeazaFelicitare();
		System.out.println();
		decoratorLMA.printeaza();
		
		DecoratorAbstract decoratorPaste = new DecoratorUrarePaste(notaInitiala);
		System.out.println();
		decoratorPaste.printeazaFelicitare();
		System.out.println();
		decoratorPaste.printeaza();
		
		NotaDePlata notaDePlata = new NotaDePlata(600);
		DecoratorAbstract decoratorLaMultiAni = new DecoratorConcretCuLMA(notaDePlata);
		DecoratorAbstract decoratorUrarePaste = new DecoratorUrarePaste(decoratorLaMultiAni);
		System.out.println();
		decoratorUrarePaste.printeaza();
	}

}
