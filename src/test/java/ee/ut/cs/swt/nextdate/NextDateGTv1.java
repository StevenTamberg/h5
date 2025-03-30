package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class NextDateGTv1 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(1827, 1827, 1827);
	    String string0 = nextDate0.run(8, 31, 1827);
	    assertEquals("9/1/1827", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 3, 3);
	    String string0 = nextDate0.run(3, 3, 1827);
	    assertEquals("3/4/1827", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(1827, 1827, 1827);
	    String string0 = nextDate0.run(11, 31, 1827);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1827, 1827, 1827);
	    String string0 = nextDate0.run(2, 30, 1827);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(1877, 1877, 1877);
	    String string0 = nextDate0.run(7, 7, 1877);
	    assertEquals("7/7/1877", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(1827, 1827, 1827);
	    String string0 = nextDate0.run(12, 12, 1827);
	    assertEquals("12/13/1827", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(1827, 1827, 1827);
	    String string0 = nextDate0.run(1815, 2, 1836);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 4, 4);
	    String string0 = nextDate0.run(4, (-288), 29);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 4, 4);
	    String string0 = nextDate0.run((-2530), 840, (-753));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(11, 11, 2774);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(1838, 1838, 1838);
	    String string0 = nextDate0.run(9, 9, 1838);
	    assertEquals("9/10/1838", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 2, 1);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(1827, 1827, 1827);
	    String string0 = nextDate0.run(6, 31, 1827);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1847, 12, 12);
	    String string0 = nextDate0.run(12, 1847, 1847);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(1827, 1827, 1827);
	    String string0 = nextDate0.run(2, 28, 1827);
	    assertEquals("3/1/1827", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(1900, 1900, 1900);
	    String string0 = nextDate0.run(2, 2, 1900);
	    assertEquals("2/3/1900", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 1818);
	    assertEquals("1/2/1818", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(51, 51, 51);
	    String string0 = nextDate0.run(2, 29, 1826);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(1818, 1818, 1818);
	    String string0 = nextDate0.run(5, 5, 1818);
	    assertEquals("5/6/1818", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(1811, 1811, 1811);
	    String string0 = nextDate0.run(4, 30, 1811);
	    assertEquals("5/1/1811", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(1838, 1838, 1838);
	    String string0 = nextDate0.run(10, 10, 1838);
	    assertEquals("10/11/1838", string0);
	}

}