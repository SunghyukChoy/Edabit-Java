package my.sunghyuk.edabit.easy;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DIscountTests {
	@Test
	public void test01() {
		assertEquals(25, Challenge.discount(100, 75), 5);
	}
	
	@Test
	public void test02() {
		assertEquals(105.5, Challenge.discount(211, 50), 5);
	}
	
	@Test
	public void test03() {
		assertEquals(231.27, Challenge.discount(593, 61), 5);
	}
	
	@Test
	public void test04() {
		assertEquals(338.6, Challenge.discount(1693, 80), 5);
	}
	
	@Test
	public void test05() {
		assertEquals(630, Challenge.discount(700, 10), 5);
	}
}