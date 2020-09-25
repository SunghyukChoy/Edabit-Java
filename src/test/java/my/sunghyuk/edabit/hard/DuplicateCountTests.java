package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DuplicateCountTests {
  @Test
  public void test1() {
    assertEquals(0, Challenge.duplicateCount("abcde"));
  }

  @Test
  public void test2() {
    System.out.println("Duplicate characters are case sensitive.");
    assertEquals(0, Challenge.duplicateCount("Aa"));
  }

  @Test
  public void test3() {
    assertEquals(2, Challenge.duplicateCount("aabbcde"));
  }

  @Test
  public void test4() {
    assertEquals(2, Challenge.duplicateCount("aabbcdeB"));
  }

  @Test
  public void test5() {
    assertEquals(1, Challenge.duplicateCount("indivisibility"));
  }

  @Test
  public void test6() {
    assertEquals(2, Challenge.duplicateCount("Indivisibilities"));
  }

  @Test
  public void test7() {
    assertEquals(2, Challenge.duplicateCount("aa1112"));
  }

  @Test
  public void test8() {
    assertEquals(1, Challenge.duplicateCount("bb2c"));
  }

  @Test
  public void test9() {
    assertEquals(0, Challenge.duplicateCount("a"));
  }

  @Test
  public void test10() {
    assertEquals(2, Challenge.duplicateCount("aaabbcde"));
  }
}
