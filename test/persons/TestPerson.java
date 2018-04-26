package persons;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Epulapp
 *
 */
public class TestPerson {

	IPerson person;
	GregorianCalendar dateJour;
	GregorianCalendar dateAncienne;
	GregorianCalendar dateNaissance;

	@Before
	public void setUp() {
		this.person = new Person("Michel", "Platine", 1996, 2, 22);
		this.dateJour = new GregorianCalendar();
		this.dateAncienne = new GregorianCalendar(1900, GregorianCalendar.JANUARY, 1);
		this.dateNaissance = new GregorianCalendar(1996, GregorianCalendar.FEBRUARY, 22);
	}

	/**
	 * Test age par rapport à la dâte de naissance
	 */
	@Test
	public void testAgeNaissance() {
		assertEquals(0, person.getAge(this.dateNaissance));
	}

	/**
	 * Test age par rapport à une dâte plus ancienne sensé renvoyer une
	 * exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testAgeAncenne() {
		assertEquals(0, person.getAge(this.dateAncienne));
	}

	/**
	 * Test age par rapport à aujourd'hui
	 */
	@Test
	public void testAgeJour() {
		assertEquals(22, person.getAge(this.dateJour));
	}

	/**
	 * Test naissance avec date naissance
	 */
	@Test
	public void testBornNaissance() {
		assertTrue(person.wasBorn(this.dateNaissance));
	}

	/**
	 * Test naissance avec date plus ancienne
	 */
	@Test
	public void testBornAncienne() {
		assertFalse(person.wasBorn(this.dateAncienne));
	}

	/**
	 * Test naissance avec date aujourd'hui
	 */
	@Test
	public void testBornJour() {
		assertTrue(person.wasBorn(this.dateJour));
	}

}
