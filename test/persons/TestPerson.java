package persons;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

public class TestPerson {
	
	IPerson person;
	
	/**
	 * Dates de test pour les méthodes wasBorn() et getAge()
	 */
	GregorianCalendar dateAfter;
	GregorianCalendar dateBefore;
	GregorianCalendar dateBirth;
	
	/**
	 * Initialisation des données de test
	 */
	@Before
	public void setUp() {
		this.person = new Person("Michel", "Platine", 1996, 2, 22);
		this.dateAfter = new GregorianCalendar();
		this.dateBefore = new GregorianCalendar(1900, GregorianCalendar.JANUARY, 1);
		this.dateBirth = new GregorianCalendar(1996, GregorianCalendar.FEBRUARY, 22);
	}
	
	/**
	 * Test de l'age en fonction d'aujourd'hui retourne vrai
	 */
	@Test
	public void testAgeToday() {
		assertEquals(54,person.getAge(this.dateAfter));
	}
	
	/**
	 * Test de l'age en fonction de la naissance
	 */
	@Test
	public void testAgeBirth() {
		assertEquals(0,person.getAge(this.dateBirth));
	}
	
	/**
	 * Test de l'age en fonction d'une date anterieure à la naissance
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testAgeException() {
		assertEquals(52,person.getAge(this.dateBefore));
	}
	
	/**
	 * Test de wasBorn() en fonction d'une date avant la naissance
	 */
	@Test
	public void testBornBefore() {
		assertFalse(person.wasBorn(this.dateBefore));
	}
	
	/**
	 * Test de wasBorn() en fonction d'aujourd'hui
	 */
	@Test
	public void testBornToday() {
		assertTrue(person.wasBorn(this.dateAfter));
	}
	
	/**
	 * Test de wasBorn() en fonction de la date de la naissance
	 */
	@Test
	public void testBornBirth() {
		assertTrue(person.wasBorn(this.dateBirth));
	}
}
