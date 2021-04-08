package ro.ase.cts.clase;

public class Politie {
	public static boolean esteUrmarit(Persoana persoana) {
		
		if(Integer.parseInt("" + persoana.getCnp().charAt(12))%2==0) {
			return true;
		}
		return false;
	}
}
