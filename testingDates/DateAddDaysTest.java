package testingDates;

import static org.junit.Assert.*;

import org.junit.Test;

import buildToTestLab.Date;

public class DateAddDaysTest {

	@Test
	public void testSameMonth() {
		Date d1 = new Date("January", 1, 2025);
		Date d2 = new Date("January", 15, 2025);
		
		Date sameMonth1 = new Date("January", 2, 2025);
		Date sameMonth2 = new Date("January", 16, 2025);
		
		assertEquals("Add to same month 1", sameMonth1, d1.addOneDay());
		assertEquals("Add to same month 15", sameMonth2, d2.addOneDay());
	}
	
	@Test
	public void testDifferentMonth() {
		Date d1 = new Date("January", 31, 2025);
		Date d2 = new Date("February", 28, 2025);
		Date d3 = new Date("April", 30, 2025);
		
		Date differentMonth1 = new Date("February", 1, 2025);
		Date differentMonth2 = new Date("March", 1, 2025);
		Date differentMonth3 = new Date("May", 1, 2025);
		
		assertEquals("Produce different month Feb", differentMonth1, d1.addOneDay());
		assertEquals("Produce different month March", differentMonth2, d2.addOneDay());
		assertEquals("Produce different month May", differentMonth3, d3.addOneDay());
	}
	
	@Test
	public void testDifferentYear() {
		Date d1 = new Date("December", 31, 2025);
		
		Date differentYear = new Date("January", 1, 2026);
		
		assertEquals("Produce different year", differentYear, d1.addOneDay());
	}

}
