package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LongestCommonEndingTests {
  @Test
  public void test1() {
    assertEquals("tiful", Challenge.longestCommonEnding("pitiful", "beautiful"));
  }

  @Test
  public void test2() {
    assertEquals("ck", Challenge.longestCommonEnding("truck", "trick"));
  }

  @Test
  public void test3() {
    assertEquals("ote", Challenge.longestCommonEnding("vote", "asymptote"));
  }

  @Test
  public void test4() {
    assertEquals("ation", Challenge.longestCommonEnding("multiplication", "ration"));
  }

  @Test
  public void test5() {
    assertEquals("tent", Challenge.longestCommonEnding("potent", "tent"));
  }

  @Test
  public void test6() {
    assertEquals("", Challenge.longestCommonEnding("skyscraper", "carnivore"));
  }
}