package ro.ase.cts.clase;

public class BirouCredite {
	public static boolean areCredite(Persoana persoana) {
		if(Integer.parseInt("" + persoana.getCnp().charAt(11))%2==0) {
			return true;
		}
		return false;
	}
}
