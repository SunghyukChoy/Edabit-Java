package my.sunghyuk.edabit.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TotalVolumeTests {
  @Test
  public void test1() {
    assertEquals(Challenge.totalVolume(new int[][] { { 4, 2, 4 }, { 3, 3, 3 }, { 1, 1, 2 }, { 2, 1, 1 } }), 63);
  }

  @Test
  public void test2() {
    assertEquals(Challenge.totalVolume(new int[][] { { 2, 2, 2 }, { 2, 1, 1 } }), 10);
  }

  @Test
  public void test3() {
    assertEquals(Challenge.totalVolume(new int[][] { { 1, 1, 1 } }), 1);
  }

  @Test
  public void test4() {
    assertEquals(Challenge.totalVolume(new int[][] { { 5, 1, 10 }, { 1, 9, 2 } }), 68);
  }

  @Test
  public void test5() {
    assertEquals(Challenge.totalVolume(new int[][] { { 1, 1, 5 }, { 3, 3, 1 } }), 14);
  }
}
