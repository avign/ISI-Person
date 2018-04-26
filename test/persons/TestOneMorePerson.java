package persons;

import org.junit.Before;

import people.OneMorePerson;

/**
 * @author Epulapp
 *
 */
public class TestOneMorePerson extends TestPerson {

	@Before
	@Override
	public void setUp() {
		super.setUp();
		this.person = new OneMorePerson("Michel", "Platine", 1996, 2, 22);
	}
}
