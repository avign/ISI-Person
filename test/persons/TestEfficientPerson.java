package persons;

import org.junit.Before;

import people.EfficientPerson;

/**
 * @author Epulapp
 *
 */
public class TestEfficientPerson extends TestPerson {

	@Before
	@Override
	public void setUp() {
		super.setUp();
		this.person = new EfficientPerson("Michel", "Platine", 22);
	}
}
