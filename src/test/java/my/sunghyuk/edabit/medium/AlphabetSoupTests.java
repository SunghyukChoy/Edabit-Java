package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AlphabetSoupTests {
  @Test
  public void test1() {
    assertEquals("ehllo", Program.alphabetSoup("hello"));
  }

  @Test
  public void test2() {
    assertEquals("abdeit", Program.alphabetSoup("edabit"));
  }

  @Test
  public void test3() {
    assertEquals("acehkr", Program.alphabetSoup("hacker"));
  }

  @Test
  public void test4() {
    assertEquals("eegk", Program.alphabetSoup("geek"));
  }

  @Test
  public void test5() {
    assertEquals("aacijprstv", Program.alphabetSoup("javascript"));
  }

  @Test
  public void test6() {
    assertEquals("bcdeiiilrty", Program.alphabetSoup("credibility"));
  }

  @Test
  public void test7() {
    assertEquals("aehoopprst", Program.alphabetSoup("apostrophe"));
  }

  @Test
  public void test8() {
    assertEquals("adeeiimnnortt", Program.alphabetSoup("determination"));
  }

  @Test
  public void test9() {
    assertEquals("inw", Program.alphabetSoup("win"));
  }

  @Test
  public void test10() {
    assertEquals("ehinsssty", Program.alphabetSoup("synthesis"));
  }
}