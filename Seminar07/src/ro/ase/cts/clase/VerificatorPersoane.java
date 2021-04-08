package ro.ase.cts.clase;

public class VerificatorPersoane {
	public static boolean isEligibile(Persoana persoana) {
		if(persoana.getVarsta()>=18) {
			if(!Politie.esteUrmarit(persoana)) {
				if(!BirouCredite.areCredite(persoana)) {
					return true;
				}
			}
		}
		return false;
	}
}
