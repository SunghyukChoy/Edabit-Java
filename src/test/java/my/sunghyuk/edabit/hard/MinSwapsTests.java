package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MinSwapsTests {
  @Test
  public void test1() {
    assertEquals(4, Challenge.minSwaps("010010111"));
  }

  @Test
  public void test2() {
    assertEquals(0, Challenge.minSwaps("010101010"));
  }

  @Test
  public void test3() {
    assertEquals(1, Challenge.minSwaps("101010100"));
  }

  @Test
  public void test4() {
    assertEquals(2, Challenge.minSwaps("101010000"));
  }

  @Test
  public void test5() {
    assertEquals(3, Challenge.minSwaps("101000000"));
  }

  @Test
  public void test6() {
    assertEquals(1, Challenge.minSwaps("10001"));
  }

  @Test
  public void test7() {
    assertEquals(2, Challenge.minSwaps("10010"));
  }
}
