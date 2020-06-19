package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreaterThanOneTests {
  @Test
  public void test1() {
    assertEquals(false, Challenge.greaterThanOne("1/2"));
  }
	
	@Test
  public void test2() {
    assertEquals(true, Challenge.greaterThanOne("7/4"));
  }
	
	@Test
  public void test3() {
    assertEquals(false, Challenge.greaterThanOne("10/10"));
  }
	
	@Test
  public void test4() {
    assertEquals(false, Challenge.greaterThanOne("12/30"));
  }
	
	@Test
  public void test5() {
    assertEquals(true, Challenge.greaterThanOne("28/3"));
  }
	
	@Test
  public void test6() {
    assertEquals(true, Challenge.greaterThanOne("35/31"));
  }
	
	@Test
  public void test7() {
    assertEquals(false, Challenge.greaterThanOne("11/27"));
  }
	
	@Test
  public void test8() {
    assertEquals(true, Challenge.greaterThanOne("42/32"));
  }
	
	@Test
  public void test9() {
    assertEquals(true, Challenge.greaterThanOne("34/15"));
  }
	
	@Test
  public void test10() {
    assertEquals(false, Challenge.greaterThanOne("16/16"));
  }
	
	@Test
  public void test11() {
    assertEquals(false, Challenge.greaterThanOne("38/41"));
  }
	
	@Test
  public void test12() {
    assertEquals(true, Challenge.greaterThanOne("45/43"));
  }
	
	@Test
  public void test13() {
    assertEquals(false, Challenge.greaterThanOne("13/38"));
  }
	
	@Test
  public void test14() {
    assertEquals(true, Challenge.greaterThanOne("43/2"));
  }
	
	@Test
  public void test15() {
    assertEquals(false, Challenge.greaterThanOne("16/31"));
  }
	
	@Test
  public void test16() {
    assertEquals(true, Challenge.greaterThanOne("41/15"));
  }
	
	@Test
  public void test17() {
    assertEquals(false, Challenge.greaterThanOne("2/38"));
  }
	
	@Test
  public void test18() {
    assertEquals(true, Challenge.greaterThanOne("37/21"));
  }
}