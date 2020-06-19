package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HowManyTimesTests {
  @Test
  public void test1() {
    assertEquals(123, Challenge.howManyTimes("qudusayo"));
  }
	
	@Test
  public void test2() {
    assertEquals(43, Challenge.howManyTimes("que"));
  }
	
	@Test
  public void test3() {
    assertEquals(7, Challenge.howManyTimes("abd"));
  }
}