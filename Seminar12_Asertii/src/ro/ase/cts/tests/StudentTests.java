package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume = "Costica";
		Student student = new Student(nume);
		assertEquals("Atributul nume nu a fost initializat",nume, student.getNume());
		assertNotNull("Atributul note nu a fost initializat",student.getNote());
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
	
	@Test
	public void testGetNotaExceptie() {
		Student student = new Student();
		student.adaugaNota(9);
		student.adaugaNota(8);
		//1
		try {
			//2
			student.getNota(5);
			//3 aici nu trb sa mai execute, pt ca ar trb sa arunce exceptie, asa ca daca ajunge aici trebuie sa i dam in acest punct fail
			fail("Metoda nu arunca exceptie!");
		} catch (IndexOutOfBoundsException e) {
			//4
		}
		//5
		catch (Exception e) {
			fail();
		}
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetNotaExceptieJUnit4() {
		Student student = new Student();
		student.adaugaNota(9);
		student.adaugaNota(8);
		student.getNota(5);
	}
	
	@Test
	public void testGetNotaExceptieJUnit5() {
		Student student = new Student();
		student.adaugaNota(9);
		student.adaugaNota(8);
		assertThrows(IndexOutOfBoundsException.class,() -> {student.getNota(5);});
	}
}
