package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume = "Costica";
		Student student = new Student(nume);
		assertEquals(nume, student.getNume());
		assertNotNull(student.getNote());
	}

	@Test
	public void testConstructorFaraParametru() {
		Student student = new Student();
		assertNotNull(student.getNote());
		assertNotNull(student.getNume());
	}
	
	@Test
	public void testAdaugaNota() {
		Student student = new Student();
		int nota = 5;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testAdaugaNotaLength() {
		Student student = new Student();
		student.adaugaNota(5);
		assertEquals(1,student.getNote().size());
	}
	
	//regula 0-1-n: pt metodele ce lucreaza cu colectii, testam situatia cu niciun element, cu un sg element si n elemente --> 3 situatii
	
	@Test 
	public void testCalculeazaMedieN() {
		Student student = new Student();
		student.adaugaNota(5);
		student.adaugaNota(8);
		//cand testam nr reali atentie ca trebuie dat al treilea param marja de err din cauza zecimalelor
		assertEquals(6.5f,student.calculeazaMedie(),0.1);
	}
	
	@Test
	public void testCalculeazaMedieFaraNote() {
		Student student = new Student();
		assertEquals(0,student.calculeazaMedie(),0.1);
	}
	
	@Test
	public void testCalculeazaMedieONota() {
		Student student = new Student();
		student.adaugaNota(5);
		assertEquals(5,student.calculeazaMedie(),0.1);
	}
	
	@Test
	public void testAreRestanteAdevarat() {
		Student student = new Student();
		student.adaugaNota(9);
		student.adaugaNota(3);
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testAreRestanteFals() {
		Student student = new Student();
		student.adaugaNota(9);
		student.adaugaNota(8);
		assertFalse(student.areRestante());
	}
}
