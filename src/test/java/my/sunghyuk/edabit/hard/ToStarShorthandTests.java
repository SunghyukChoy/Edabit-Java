package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ToStarShorthandTests {

  @Test
  public void test1() {
    assertEquals("ab*2c*3", Challenge.toStarShorthand("abbccc"));
  }

  @Test
  public void test2() {
    assertEquals("ha*4p*2y*5", Challenge.toStarShorthand("haaaappyyyyy"));
  }

  @Test
  public void test3() {
    assertEquals("7*5gef*2", Challenge.toStarShorthand("77777geff"));
  }

  @Test
  public void test4() {
    assertEquals("1*22*23*24*2", Challenge.toStarShorthand("11223344"));
  }

  @Test
  public void test5() {
    assertEquals("abc", Challenge.toStarShorthand("abc"));
  }

  @Test
  public void test6() {
    assertEquals("", Challenge.toStarShorthand(""));
  }

  @Test
  public void test7() {
    assertEquals("a*2bc*3a*2d*2e", Challenge.toStarShorthand("aabcccaadde"));
  }
}
