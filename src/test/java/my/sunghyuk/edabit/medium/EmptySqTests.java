package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EmptySqTests {
  @Test
  public void test1() {
    assertEquals(24, Challenge.emptySq(3));
  }

  @Test
  public void test2() {
    assertEquals(0, Challenge.emptySq(1));
  }

  @Test
  public void test3() {
    assertEquals(2808, Challenge.emptySq(27));
  }

  @Test
  public void test4() {
    assertEquals(24, Challenge.emptySq(3));
  }

  @Test
  public void test5() {
    System.out.println("Even though the box is unexisting, the amount of empty squares is also 0.");
    assertEquals(0, Challenge.emptySq(0));
  }

  @Test
  public void test6() {
    assertEquals(360, Challenge.emptySq(10));
  }

  @Test
  public void test7() {
    assertEquals(1368, Challenge.emptySq(19));
  }

  @Test
  public void test8() {
    assertEquals(14160, Challenge.emptySq(60));
  }

  @Test
  public void test9() {
    assertEquals(168, Challenge.emptySq(7));
  }
}