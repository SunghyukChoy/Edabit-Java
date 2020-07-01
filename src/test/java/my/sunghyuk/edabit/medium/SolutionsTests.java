package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionsTests {
  @Test
  public void test1() {
    assertEquals(2, Challenge.solutions(1, 0, -1));
  }

  @Test
  public void test2() {
    assertEquals(1, Challenge.solutions(1, 0, 0));
  }

  @Test
  public void test3() {
    assertEquals(0, Challenge.solutions(1, 0, 1));
  }

  @Test
  public void test4() {
    assertEquals(0, Challenge.solutions(200, 420, 800));
  }

  @Test
  public void test5() {
    assertEquals(2, Challenge.solutions(200, 420, -800));
  }

  @Test
  public void test6() {
    assertEquals(2, Challenge.solutions(1000, 1000, 0));
  }

  @Test
  public void test7() {
    assertEquals(1, Challenge.solutions(10000, 400, 4));
  }
}