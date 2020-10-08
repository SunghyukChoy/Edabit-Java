package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SeqTests {
  @Test
  public void test1() {
    assertEquals(2, Challenge.seq(1));
  }

  @Test
  public void test2() {
    assertEquals(6, Challenge.seq(2));
  }

  @Test
  public void test3() {
    System.out.println("If the formula is right, 0 can be an input.");
    assertEquals(1, Challenge.seq(0));
  }

  @Test
  public void test4() {
    assertEquals(478, Challenge.seq(18));
  }

  @Test
  public void test5() {
    assertEquals(1081, Challenge.seq(27));
  }

  @Test
  public void test6() {
    assertEquals(52, Challenge.seq(6));
  }

  @Test
  public void test7() {
    assertEquals(14653, Challenge.seq(99));
  }
}