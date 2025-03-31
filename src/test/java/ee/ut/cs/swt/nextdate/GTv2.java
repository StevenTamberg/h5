package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv2 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(5, 5, 1953);
	    String string0 = nextDate0.run(5, 2021, 2021);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(4, 4, 4);
	    String string0 = nextDate0.run(4, 4, 2502);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(4, 4, 4);
	    String string0 = nextDate0.run(4, 30, 1924);
	    assertEquals("5/1/1924", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 30, 12);
	    String string0 = nextDate0.run(5, 31, 1801);
	    assertEquals("6/1/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(581, 581, 581);
	    String string0 = nextDate0.run(12, 12, 1842);
	    assertEquals("12/13/1842", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(581, 581, 581);
	    String string0 = nextDate0.run(1842, 1005, (-1));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(581, 581, 581);
	    String string0 = nextDate0.run((-1323), 2, (-2471));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(544, 544, 544);
	    String string0 = nextDate0.run(364, (-5), (-1561));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(1973, 1973, 3);
	    String string0 = nextDate0.run(3, 3, 1973);
	    assertEquals("3/4/1973", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive() throws Throwable {
	    NextDate nextDate0 = new NextDate(581, 581, 581);
	    String string0 = nextDate0.run(2, 859, 5);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 30, 1);
	    String string0 = nextDate0.run(1, 30, 2021);
	    assertEquals("1/31/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate(24, 24, 24);
	    String string0 = nextDate0.run(10, 24, 1835);
	    assertEquals("10/25/1835", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(1831, 1831, 1831);
	    String string0 = nextDate0.run(8, 8, 1831);
	    assertEquals("8/9/1831", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate18() throws Throwable {
	    NextDate nextDate0 = new NextDate(1830, 23, (-502));
	    String string0 = nextDate0.run(9, 17, 1830);
	    assertEquals("9/18/1830", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate17() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 30, 6);
	    String string0 = nextDate0.run(6, 30, 2021);
	    assertEquals("7/1/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate19() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(11, 31, 2015);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(7, 7, 7);
	    String string0 = nextDate0.run(7, 7, 1924);
	    assertEquals("7/7/1924", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate((-23), 12, 1265);
	    String string0 = nextDate0.run(12, 31, 2011);
	    assertEquals("1/1/2012", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(544, 544, 544);
	    String string0 = nextDate0.run(2, 28, 2003);
	    assertEquals("3/1/2003", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 2, 1860);
	    assertEquals("2/3/1860", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(581, 581, 581);
	    String string0 = nextDate0.run(2, 28, 1988);
	    assertEquals("2/29/1988", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(29, 2, 2);
	    String string0 = nextDate0.run(2, 29, 2018);
	    assertEquals("2/29/2018", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 30, 2);
	    String string0 = nextDate0.run(2, 30, 2003);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(29, 2, 2);
	    String string0 = nextDate0.run(2, 29, 2016);
	    assertEquals("3/1/2016", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate20() throws Throwable {
	    NextDate nextDate0 = new NextDate(495, 495, 495);
	    String string0 = nextDate0.run(2, 28, 2000);
	    assertEquals("2/29/2000", string0);
	}

}