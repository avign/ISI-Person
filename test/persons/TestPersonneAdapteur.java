package persons;

import org.junit.Before;

/**
 * @author Epulapp
 *
 */
public class TestPersonneAdapteur extends TestPerson {

	@Before
	@Override
	public void setUp() {
		super.setUp();
		this.person = new PersonneAdapteur("Michel", "Platine", 1996, 2, 22);
	}
}
