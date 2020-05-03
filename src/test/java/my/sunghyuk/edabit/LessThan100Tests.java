package my.sunghyuk.edabit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LessThan100Tests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.lessThan100(5, 57));
  }
	
	@Test
  public void test2() {
    assertEquals(false, Challenge.lessThan100(77, 30));
  }
	
	@Test
  public void test3() {
    assertEquals(true, Challenge.lessThan100(0, 59));
  }
	
	@Test
  public void test4() {
    assertEquals(false, Challenge.lessThan100(78, 35));
  }
	
	@Test
  public void test5() {
    assertEquals(true, Challenge.lessThan100(63, 11));
  }
	
	@Test
  public void test6() {
    assertEquals(false, Challenge.lessThan100(37, 99));
  }
	
	@Test
  public void test7() {
    assertEquals(true, Challenge.lessThan100(52, 11));
  }
	
	@Test
  public void test8() {
    assertEquals(false, Challenge.lessThan100(82, 95));
  }
	
	@Test
  public void test9() {
    assertEquals(true, Challenge.lessThan100(17, 44));
  }
	
	@Test
  public void test10() {
    assertEquals(false, Challenge.lessThan100(74, 53));
  }
	
	@Test
  public void test11() {
    assertEquals(true, Challenge.lessThan100(3, 77));
  }
	
	@Test
  public void test12() {
    assertEquals(false, Challenge.lessThan100(25, 80));
  }
	
	@Test
  public void test13() {
    assertEquals(true, Challenge.lessThan100(59, 28));
  }
	
	@Test
  public void test14() {
    assertEquals(false, Challenge.lessThan100(69, 87));
  }
	
	@Test
  public void test15() {
    assertEquals(true, Challenge.lessThan100(10, 45));
  }
	
	@Test
  public void test16() {
    assertEquals(false, Challenge.lessThan100(43, 58));
  }
	
	@Test
  public void test17() {
    assertEquals(true, Challenge.lessThan100(50, 44));
  }
	
	@Test
  public void test18() {
    assertEquals(false, Challenge.lessThan100(74, 89));
  }
	
	@Test
  public void test19() {
    assertEquals(true, Challenge.lessThan100(3, 27));
  }
	
	@Test
  public void test20() {
    assertEquals(false, Challenge.lessThan100(21, 79));
  }
}