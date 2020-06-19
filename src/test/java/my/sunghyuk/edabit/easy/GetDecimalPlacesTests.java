package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GetDecimalPlacesTests {
  @Test
  public void test1() {
    assertEquals(2, Challenge.getDecimalPlaces("3.22"));
  }

	@Test
  public void test2() {
    assertEquals(0, Challenge.getDecimalPlaces("400"));
  }

	@Test
  public void test3() {
    assertEquals(2, Challenge.getDecimalPlaces("43.50"));
  }

	@Test
  public void test4() {
    assertEquals(0, Challenge.getDecimalPlaces("100,000,000"));
  }

	@Test
  public void test5() {
    assertEquals(4, Challenge.getDecimalPlaces("3.1415"));
  }

	@Test
  public void test6() {
    assertEquals(0, Challenge.getDecimalPlaces("0"));
  }

	@Test
  public void test7() {
    assertEquals(0, Challenge.getDecimalPlaces("01"));
  }

	@Test
  public void test8() {
    assertEquals(5, Challenge.getDecimalPlaces("00010.00010"));
  }

	@Test
  public void test9() {
    assertEquals(3, Challenge.getDecimalPlaces("3,141.592"));
  }
}

// made by @Joshua Señoron