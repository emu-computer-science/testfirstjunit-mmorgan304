package testingDates;

import static org.junit.Assert.*;

import org.junit.Test;

import buildToTestLab.Date;

public class DateSetDateTest {

	@Test
	public void testSetDate() {
		Date d1 = new Date(); // sets date to 01/01/1000
		Date d2 = new Date(); 
		Date d3 = new Date();
		Date d4 = new Date();
		Date d5 = new Date();
		
		//legal
		d1.setDate(2000);
		d2.setDate(3, 10, 2000);
		
		//illegal
		d3.setDate(0);
		d4.setDate(34, 10, 2000);
		d5.setDate(3, 345345, 2000);
		
		assertEquals("Legal year change", 2000, d1.getYear());
		assertEquals("Legal date change", new Date(3, 10, 2000), d2);
		
		assertNotEquals("Illegal year change", 0, d3.getYear());
		assertNotEquals("Illegal month change", 34, d4.getMonth());
		assertNotEquals("Illegal day change", 34345, d5.getDay());
		
	}

}
