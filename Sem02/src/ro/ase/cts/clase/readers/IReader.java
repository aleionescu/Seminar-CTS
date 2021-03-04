package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;

import ro.ase.cts.clase.Aplicant;

public abstract class IReader {
	protected String filePath;
		
	public IReader(String filePath) {
		this.filePath = filePath;
	}
	
	public abstract java.util.List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException;
}
