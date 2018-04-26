package persons;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;

/**
 * @author Epulapp
 *
 */
public class TestOutilsPerson {

	private ArrayList<IPerson> list;
	@Mock
    private IPerson person1, person2, person3, person4;
	private GregorianCalendar date;
	
	/**
	 * setup des données de test
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		list = new ArrayList<IPerson>();
		date = new GregorianCalendar(2015, GregorianCalendar.JANUARY, 1);
		
		person1 = mock(IPerson.class);
		person2 = mock(IPerson.class);
		person3 = mock(IPerson.class);
		person4 = mock(IPerson.class);
		
        Mockito.when(person1.getAge(Mockito.any())).thenReturn(20);
        Mockito.when(person2.getAge(Mockito.any())).thenReturn(5);
        Mockito.when(person3.getAge(Mockito.any())).thenReturn(94);
        Mockito.when(person4.getAge(Mockito.any())).thenReturn(31);
        
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
	}

	/**
	 * Test min et max
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testMaxMinException() {
		assertEquals(2, OutilsPerson.getListBetween(list, date, 50, 30).size());
	}
	
	/**
	 * Test getListBetween
	 */
	@Test
	public void testListBetween() {
		assertEquals(2, OutilsPerson.getListBetween(list, date, 20, 40).size());
	}
	
	/**
	 * Test getAgePlus
	 */
	@Test
	public void testAgePlus() {
		assertEquals(94, OutilsPerson.getPlusAge(list, date));
	}
	
	/**
	 * Test anonyme sur les noms et prenoms
	 */
	@Test
	public void testAnonyme() {
		assertEquals(94, OutilsPerson.getPlusAge(list, date));
		
        Mockito.verify(person1, never()).getName();
        Mockito.verify(person1, never()).getFirstName();
    }
}
