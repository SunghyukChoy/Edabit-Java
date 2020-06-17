package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FormatNumTests {
  @Test
  public void test1() {
    assertEquals("1,000", Challenge.formatNum(1000));
  }
	
	@Test
  public void test2() {
    assertEquals("1,000,000", Challenge.formatNum(1000000));
  }
	
	@Test
  public void test3() {
    assertEquals("20", Challenge.formatNum(20));
  }
	
	@Test
  public void test4() {
    assertEquals("0", Challenge.formatNum(0));
  }
	
	@Test
  public void test5() {
    assertEquals("12,948", Challenge.formatNum(12948));
  }
}