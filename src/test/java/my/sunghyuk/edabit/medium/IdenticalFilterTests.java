package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

@SuppressWarnings("deprecation")
public class IdenticalFilterTests {
  @Test
  public void test1() {
    assertEquals(Challenge.identicalFilter(new String[] { "aaaaaa", "bc", "d", "eeee", "xyz" }),
        new String[] { "aaaaaa", "d", "eeee" });
  }

  @Test
  public void test2() {
    assertEquals(Challenge.identicalFilter(new String[] { "88", "999", "22", "545", "133" }),
        new String[] { "88", "999", "22" });
  }

  @Test
  public void test3() {
    assertEquals(Challenge.identicalFilter(new String[] { "xxxxo", "oxo", "xox", "ooxxoo", "oxo" }),
        new String[] {});
  }

  @Test
  public void test4() {
    assertEquals(Challenge.identicalFilter(new String[] { "aa", "bb", "cc", "dd", "ee" }),
        new String[] { "aa", "bb", "cc", "dd", "ee" });
  }

  @Test
  public void test5() {
    assertEquals(Challenge.identicalFilter(new String[] { "aba", "bcb", "abb", "bcc", "eee" }),
        new String[] { "eee" });
  }

  @Test
  public void test6() {
    assertEquals(Challenge.identicalFilter(new String[] { "1", "2", "3" }), new String[] { "1", "2", "3" });
  }
}