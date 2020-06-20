package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsValidHexCodeTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.isValidHexCode("#CD5C5C"));
  }

  @Test
  public void test2() {
    assertEquals(true, Challenge.isValidHexCode("#EAECEE"));
  }

  @Test
  public void test3() {
    assertEquals(true, Challenge.isValidHexCode("#eaecee"));
  }

  @Test
  public void test4() {
    System.out.println("Length exceeds 6.");
    assertEquals(false, Challenge.isValidHexCode("#CD5C58C"));
  }

  @Test
  public void test5() {
    System.out.println("Alphabetic characters not in A-F.");
    assertEquals(false, Challenge.isValidHexCode("#CD5C5Z"));
  }

  @Test
  public void test6() {
    System.out.println("Unacceptable character.");
    assertEquals(false, Challenge.isValidHexCode("#CD5C&C"));
  }

  @Test
  public void test7() {
    System.out.println("Does not start with #.");
    assertEquals(false, Challenge.isValidHexCode("CD5C5C"));
  }

  @Test
  public void test8() {
    System.out.println("Length exceeds 6.");
    assertEquals(false, Challenge.isValidHexCode("#123CCCD"));
  }

  @Test
  public void test9() {
    assertEquals(true, Challenge.isValidHexCode("#123456"));
  }

  @Test
  public void test10() {
    assertEquals(true, Challenge.isValidHexCode("#987654"));
  }

  @Test
  public void test11() {
    System.out.println("Length exceeds 6.");
    assertEquals(false, Challenge.isValidHexCode("#9876543"));
  }

  @Test
  public void test12() {
    assertEquals(true, Challenge.isValidHexCode("#CCCCCC"));
  }

  @Test
  public void test13() {
    System.out.println("Not acceptable alphabetic characters.");
    assertEquals(false, Challenge.isValidHexCode("#ZCCZCC"));
  }

  @Test
  public void test14() {
    System.out.println("Not acceptable alphabetic characters.");
    assertEquals(false, Challenge.isValidHexCode("#Z88Z99"));
  }

  @Test
  public void test15() {
    System.out.println("Unacceptable character.");
    assertEquals(false, Challenge.isValidHexCode("#Z88!99"));
  }

}