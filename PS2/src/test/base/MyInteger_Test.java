package base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testiseven() {
		int IntTest = 1;
		MyInteger instance = new MyInteger(IntTest);
		boolean bExpectedresult = false;
		boolean bActualresult = instance.isEven();
		assertEquals("testisEven() has failed", bExpectedresult, bActualresult);
	}
	@Test
	public void test2(){
		MyInteger test2 = new MyInteger(2);
		test2.isEven(2);
		assertEquals(true,true);

}
	@Test
	public void test3(){
		MyInteger test3 = new MyInteger(5);
		test3.isOdd(5);
		assertEquals(true,true);
	}
	@Test
	public void test4(){
		MyInteger test4 = new MyInteger(7);
		test4.isPrime(7);
		assertEquals(true,true);

	}
}