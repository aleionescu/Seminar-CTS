package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class IReader {
	protected String filePath;
		
	public IReader(String filePath) {
		this.filePath = filePath;
	}
	
	public void citireAplicant (Scanner scanner, Aplicant aplicant) {
		String nume = scanner.next();
		String prenume = scanner.next();
		int varsta = scanner.nextInt();
		int punctaj = scanner.nextInt();
		int nr = scanner.nextInt();
		String[] vect = new String[nr];
		for (int i = 0; i < nr; i++)
			vect[i] = scanner.next();
		
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setNr_proiecte(nr);
		aplicant.setVectorDenumiriProiect(nr, vect);
		
	}
	
	public abstract java.util.List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException;
}
