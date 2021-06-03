package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.tests.mocks.DummyStudent;
import ro.ase.cts.tests.mocks.FakeStudent;
import ro.ase.cts.tests.mocks.StubStudent;

public class TestGrupaMock {

	@Test
	public void testAdaugaStudentDummyObject() {
		IStudent stud = new DummyStudent();
		Grupa grupa = new Grupa(1081);
		grupa.adaugaStudent(stud);
		assertEquals("Adaugare student",1,grupa.getStudenti().size());
	}
	
	@Test
	public void testGetPromovabilitateStudentStubObject() {
		IStudent stud = new StubStudent();
		Grupa grupa = new Grupa(1081);
		grupa.adaugaStudent(stud);
		assertEquals(1,grupa.getPromovabilitate(),0.015);
	}
	
	@Test
	public void testGetPromovabilitateFakeStudent() {
		Grupa grupa = new Grupa(1081);
		for(int i=0;i<8;i++) {
			FakeStudent student= new FakeStudent();
			student.setAreRestante(false);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<2;i++) {
			FakeStudent student= new FakeStudent();
			student.setAreRestante(true);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.8f, grupa.getPromovabilitate(),0.015);
	}

}
