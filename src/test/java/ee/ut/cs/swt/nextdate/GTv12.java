package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv12 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 36, 1954);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndPositive() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run((-1270), 12, 6);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 2255);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 30, 30);
	    String string0 = nextDate0.run(3, 30, 1806);
	    assertEquals("3/31/1806", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 10, 10);
	    String string0 = nextDate0.run(10, 31, 1910);
	    assertEquals("11/1/1910", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    String string0 = nextDate0.run(6, 31, 1910);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(4, 4, 4);
	    String string0 = nextDate0.run(4, 4, 1801);
	    assertEquals("4/5/1801", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 29, 1931);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run((-1406), (-1986), 1568);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(11, 1304, 2);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 1826);
	    assertEquals("1/2/1826", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(28, 9, 6);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 30, 2021);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate(8, 8, 8);
	    String string0 = nextDate0.run(8, 8, 1826);
	    assertEquals("8/9/1826", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 30, 30);
	    String string0 = nextDate0.run(5, 31, 2021);
	    assertEquals("6/1/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate17() throws Throwable {
	    NextDate nextDate0 = new NextDate(9, 9, 9);
	    String string0 = nextDate0.run(9, 9, 1826);
	    assertEquals("9/10/1826", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(11, 30, 2015);
	    assertEquals("12/1/2015", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 30, 30);
	    String string0 = nextDate0.run(12, 31, 1803);
	    assertEquals("1/1/1804", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 12, 1956);
	    assertEquals("12/13/1956", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(7, 11, 2015);
	    assertEquals("7/11/2015", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 28, 1956);
	    assertEquals("3/1/1956", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 2, 1813);
	    assertEquals("2/3/1813", string0);
	}

}