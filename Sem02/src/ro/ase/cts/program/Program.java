package ro.ase.cts.program;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.clase.Student;
import ro.ase.cts.clase.readers.AngajatiReader;
import ro.ase.cts.clase.readers.IReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static List<Aplicant> citesteAplicanti(IReader readAplicant)
			throws NumberFormatException, FileNotFoundException {
		return readAplicant.readAplicants();
	}

	public static void main(String[] args) {
		System.out.println("Suma finantata pentru angajati: "+Angajat.getSumaFinantare());
		System.out.println("Suma finantata pentru student: "+Student.getSumaFinantare());
		List<Aplicant> listaAplicanti;

		try {
			Proiect proiect = new Proiect(81);
			listaAplicanti = citesteAplicanti(new AngajatiReader("angajati.txt"));
			for (Aplicant aplicant : listaAplicanti) {
				System.out.println(aplicant.toString());
				System.out.println(aplicant.getSumaFinantata());
				aplicant.afisareRaspunsProiect(proiect);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
