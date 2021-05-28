package ro.ase.cts.tests;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.clase.Student;

class TestGrupa {
	private Grupa grupa;

	@Test
	void testConstructorNrGrupaCorect() {
		Grupa grupa = new Grupa(1081);
		assertEquals(1081,grupa.getNrGrupa());
	}
	
	@Test
	public void testListExistanceConstructor() {
		Grupa grupa = new Grupa(1081);
		assertNotNull(grupa.getStudenti());
	}
	
	@Test
	public void TestConstructorLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000,grupa.getNrGrupa());
	}
	
	@Test
	public void TestConstructorLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100,grupa.getNrGrupa());
	}
	
	//@Test(expected = IllegalArgumentException.class)
	//public void TestExceptieNrGrupaConstructor() {
	//	Grupa grupa = new Grupa(900);
	//}
	
	@Test
	public void testPerformanceConstructor() {
		assertTimeout(Duration.ofMillis(500),()->{new Grupa(1081);});
	}
	
	@Test
	public void testGetPromovabilitateRight() {
		Grupa grupa = new Grupa(1081);
		for(int i=0;i<10;i++) {
			IStudent stud = new Student();
			stud.adaugaNota(5);
			stud.adaugaNota(7);
			grupa.adaugaStudent(stud);
		}
		for(int i=0;i<5;i++) {
			IStudent stud = new Student();
			stud.adaugaNota(4);
			stud.adaugaNota(7);
			grupa.adaugaStudent(stud);
		}
		assertEquals(0.66f, grupa.getPromovabilitate(),0.1);
	}
	
	@Test
	public void testGetPromovabilitateLimitaInferioara() {
		Grupa grupa = new Grupa(1001);
		for(int i=0;i<10;i++) {
			IStudent stud = new Student();
			stud.adaugaNota(4);
			stud.adaugaNota(7);
			grupa.adaugaStudent(stud);
		}
		assertEquals(0, grupa.getPromovabilitate(),0.01);
	}
	
	@Test
	public void testGetPromovabilitateLimitaSuperioara() {
		Grupa grupa = new Grupa(1081);
		for(int i=0;i<10;i++) {
			IStudent stud = new Student();
			stud.adaugaNota(5);
			stud.adaugaNota(7);
			grupa.adaugaStudent(stud);
		}
		assertEquals(1, grupa.getPromovabilitate(),0.01);
	}
	
	@Test 
	public void testGetPromovabilitateErrorCondition() {
		Grupa grupa = new Grupa(1081);
		assertThrows(IndexOutOfBoundsException.class,() -> {grupa.getPromovabilitate();});
	}
	
	@Test
	public void testGetPromovabilitateCardinality1() {
		Grupa grupa =  new Grupa (1081);
		IStudent stud = new Student();
		stud.adaugaNota(5);
		stud.adaugaNota(6);
		grupa.adaugaStudent(stud);
		assertEquals(1, grupa.getPromovabilitate(),0.01);
	}

}
