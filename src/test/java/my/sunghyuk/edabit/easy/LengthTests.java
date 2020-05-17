package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LengthTests {
	@Test
  public void test1() {
		assertEquals(8, EasyProgram.length("shipment"));
  }
	
	@Test
  public void test2() {
		assertEquals(5, EasyProgram.length("apple"));
  }
	
	@Test
  public void test3() {
		assertEquals(4, EasyProgram.length("make"));
  }
	
	@Test
  public void test4() {
		assertEquals(1, EasyProgram.length("a"));
  }
	
	@Test
  public void test5() {
		assertEquals(0, EasyProgram.length(""));
  }
}