package ro.ase.cts.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jdk.jfr.Category;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.clase.Student;
import ro.ase.cts.tests.categorii.*;

public class TestGrupaSeparat {
	private Grupa grupa;
	@BeforeEach
	public void setup() {
		grupa = new Grupa(1081);
		for(int i=0;i<35;i++) {
			IStudent stud = new Student();
			stud.adaugaNota(5);
			stud.adaugaNota(7);
			grupa.adaugaStudent(stud);
		}
	}
	
	@Test
	@Category(GetPromovabilitateCategory.class,TesteUrgenteCategory.class)
	public void testGetPromovabilitatePerformance() {
		assertTimeout(Duration.ofMillis(500),() -> {grupa.getPromovabilitate();});
	}

}
