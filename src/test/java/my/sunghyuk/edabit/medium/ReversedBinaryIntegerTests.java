package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReversedBinaryIntegerTests {

  @Test
  public void test1() {
    assertEquals(1, Challenge.reversedBinaryInteger(1));
  }

  @Test
  public void test2() {
    assertEquals(1, Challenge.reversedBinaryInteger(4));
  }

  @Test
  public void test3() {
    assertEquals(5, Challenge.reversedBinaryInteger(5));
  }

  @Test
  public void test4() {
    assertEquals(31, Challenge.reversedBinaryInteger(31));
  }

  @Test
  public void test5() {
    assertEquals(37, Challenge.reversedBinaryInteger(82));
  }

  @Test
  public void test6() {
    assertEquals(45, Challenge.reversedBinaryInteger(90));
  }

  @Test
  public void test7() {
    assertEquals(255, Challenge.reversedBinaryInteger(255));
  }

  @Test
  public void test8() {
    assertEquals(251, Challenge.reversedBinaryInteger(446));
  }

  @Test
  public void test9() {
    assertEquals(391, Challenge.reversedBinaryInteger(451));
  }

  @Test
  public void test10() {
    assertEquals(377, Challenge.reversedBinaryInteger(634));
  }

  @Test
  public void test11() {
    assertEquals(67, Challenge.reversedBinaryInteger(776));
  }

  @Test
  public void test12() {
    assertEquals(263, Challenge.reversedBinaryInteger(898));
  }

  @Test
  public void test13() {
    assertEquals(1937, Challenge.reversedBinaryInteger(1103));
  }

  @Test
  public void test14() {
    assertEquals(2487, Challenge.reversedBinaryInteger(3801));
  }

  @Test
  public void test15() {
    assertEquals(1, Challenge.reversedBinaryInteger(4096));
  }

  @Test
  public void test16() {
    assertEquals(10017, Challenge.reversedBinaryInteger(8505));
  }

  @Test
  public void test17() {
    assertEquals(328843, Challenge.reversedBinaryInteger(428293));
  }

  @Test
  public void test18() {
    assertEquals(904609, Challenge.reversedBinaryInteger(547643));
  }

  @Test
  public void test19() {
    assertEquals(681385, Challenge.reversedBinaryInteger(612965));
  }

  @Test
  public void test20() {
    assertEquals(1033263, Challenge.reversedBinaryInteger(999999));
  }
}