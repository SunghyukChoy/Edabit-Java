package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SmallestTests {

  @Test
  public void test1() {
    assertEquals(104, Challenge.smallest(3, 8));
  }

  @Test
  public void test2() {
    assertEquals(10008, Challenge.smallest(5, 12));
  }

  @Test
  public void test3() {
    assertEquals(1000000, Challenge.smallest(7, 1));
  }

  @Test
  public void test4() {
    assertEquals(12, Challenge.smallest(2, 3));
  }

  @Test
  public void test5() {
    assertEquals(100000032, Challenge.smallest(9, 33));
  }

  @Test
  public void test6() {
    assertEquals(10000012, Challenge.smallest(8, 17));
  }

  @Test
  public void test7() {
    assertEquals(1005, Challenge.smallest(4, 67));
  }

  @Test
  public void test8() {
    assertEquals(1296, Challenge.smallest(4, 432));
  }

  @Test
  public void test9() {
    assertEquals(432, Challenge.smallest(3, 432));
  }

  @Test
  public void test10() {
    assertEquals(154, Challenge.smallest(3, 77));
  }
}