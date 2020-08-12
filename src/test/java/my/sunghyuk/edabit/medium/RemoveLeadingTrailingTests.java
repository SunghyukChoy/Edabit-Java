package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RemoveLeadingTrailingTests {
  @Test
  public void test1() {
    assertEquals("230", Challenge.removeLeadingTrailing("230.000"));
  }

  @Test
  public void test2() {
    assertEquals("402", Challenge.removeLeadingTrailing("00402"));
  }

  @Test
  public void test3() {
    assertEquals("3.14", Challenge.removeLeadingTrailing("03.1400"));
  }

  @Test
  public void test4() {
    assertEquals("30", Challenge.removeLeadingTrailing("30"));
  }

  @Test
  public void test5() {
    assertEquals("30", Challenge.removeLeadingTrailing("30.0000"));
  }

  @Test
  public void test6() {
    assertEquals("24340", Challenge.removeLeadingTrailing("24340"));
  }

  @Test
  public void test7() {
    assertEquals("404040", Challenge.removeLeadingTrailing("0404040"));
  }

  @Test
  public void test8() {
    assertEquals("0", Challenge.removeLeadingTrailing("0"));
  }

  @Test
  public void test9() {
    assertEquals("0", Challenge.removeLeadingTrailing("00"));
  }

  @Test
  public void test10() {
    assertEquals("0", Challenge.removeLeadingTrailing("0.000000"));
  }

  @Test
  public void test11() {
    assertEquals("0", Challenge.removeLeadingTrailing("0000.000"));
  }

  @Test
  public void test12() {
    assertEquals("0.0001", Challenge.removeLeadingTrailing("00.0001"));
  }

  @Test
  public void test13() {
    assertEquals("10000", Challenge.removeLeadingTrailing("10000"));
  }

  @Test
  public void test14() {
    assertEquals("1345", Challenge.removeLeadingTrailing("1345"));
  }

  @Test
  public void test15() {
    assertEquals("30.00002", Challenge.removeLeadingTrailing("30.000020"));
  }

  @Test
  public void test16() {
    assertEquals("200.1900001", Challenge.removeLeadingTrailing("00200.1900001"));
  }
}