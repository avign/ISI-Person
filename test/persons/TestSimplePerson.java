package persons;

import org.junit.Before;

import people.SimplePerson;

/**
 * @author Epulapp
 *
 */
public class TestSimplePerson extends TestPerson {

	@Before
	@Override
	public void setUp() {
		super.setUp();
		this.person = new SimplePerson("Michel", "Platine", 1996, 2, 22);
	}
}
