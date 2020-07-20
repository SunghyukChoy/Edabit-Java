package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MathExprTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.mathExpr("5+4"));
  }

  @Test
  public void test2() {
    assertEquals(true, Challenge.mathExpr("4 * 5"));
  }

  @Test
  public void test3() {
    assertEquals(true, Challenge.mathExpr("3*6"));
  }

  @Test
  public void test4() {
    assertEquals(true, Challenge.mathExpr("4 - 5"));
  }

  @Test
  public void test5() {
    assertEquals(true, Challenge.mathExpr("6 % 7"));
  }

  @Test
  public void test6() {
    assertEquals(false, Challenge.mathExpr("a - b"));
  }

  @Test
  public void test7() {
    assertEquals(false, Challenge.mathExpr("a - 2"));
  }

  @Test
  public void test8() {
    assertEquals(false, Challenge.mathExpr("nope"));
  }
}