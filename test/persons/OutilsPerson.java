package persons;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * @author Epulapp
 *
 */
public class OutilsPerson {
	
	public static ArrayList<IPerson> getListBetween(ArrayList<IPerson> list, GregorianCalendar date, int minAge, int maxAge) {
		if(minAge > maxAge)
			throw new IllegalArgumentException();
		
		int agePerson;
		ArrayList<IPerson> list2 = new ArrayList<IPerson>();
		for(IPerson person : list) {
			agePerson = person.getAge(date);
			if(agePerson >= minAge && agePerson <= maxAge)
				list2.add(person);
		}
		
		return list2;
	}
	
	public static int getPlusAge(ArrayList<IPerson> list, GregorianCalendar date) {
		
		int agePerson;
		int ageMax = 0;
		for(IPerson person : list) {
			agePerson = person.getAge(date);
			if(agePerson > ageMax)
				ageMax = agePerson;
		}
		
		return ageMax;
	}
}
