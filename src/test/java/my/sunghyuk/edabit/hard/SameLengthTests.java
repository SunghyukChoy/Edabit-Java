package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SameLengthTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.sameLength("10"));
  }

  @Test
  public void test2() {
    assertEquals(true, Challenge.sameLength("1010"));
  }

  @Test
  public void test3() {
    assertEquals(true, Challenge.sameLength("1100"));
  }

  @Test
  public void test4() {
    assertEquals(true, Challenge.sameLength("10101110001100"));
  }

  @Test
  public void test5() {
    assertEquals(true, Challenge.sameLength("1111000010101100"));
  }

  @Test
  public void test6() {
    assertEquals(false, Challenge.sameLength("1001"));
  }

  @Test
  public void test7() {
    assertEquals(false, Challenge.sameLength("101001"));
  }

  @Test
  public void test8() {
    assertEquals(false, Challenge.sameLength("101"));
  }

  @Test
  public void test9() {
    assertEquals(false, Challenge.sameLength("10010"));
  }

  @Test
  public void test10() {
    assertEquals(false, Challenge.sameLength("110"));
  }

  @Test
  public void test11() {
    assertEquals(false, Challenge.sameLength("11001"));
  }

  @Test
  public void test12() {
    assertEquals(false, Challenge.sameLength("11100011000"));
  }

  @Test
  public void test13() {
    assertEquals(true, Challenge.sameLength("001101010001110011"));
  }

  @Test
  public void test14() {
    assertEquals(false, Challenge.sameLength("001101000111001"));
  }

  @Test
  public void test15() {
    assertEquals(false, Challenge.sameLength("1"));
  }
}