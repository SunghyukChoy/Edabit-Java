package my.sunghyuk.edabit.hard;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SevenBoomTests {
  @Test
  public void test1() {
    assertEquals("Boom!", Challenge.sevenBoom(new int[] { 2, 6, 7, 9, 3 }));
  }

  @Test
  public void test2() {
    assertEquals("there is no 7 in the array", Challenge.sevenBoom(new int[] { 33, 68, 400, 5 }));
  }

  @Test
  public void test3() {
    assertEquals("there is no 7 in the array", Challenge.sevenBoom(new int[] { 86, 48, 100, 66 }));
  }

  @Test
  public void test4() {
    assertEquals("Boom!", Challenge.sevenBoom(new int[] { 76, 55, 44, 32 }));
  }

  @Test
  public void test5() {
    assertEquals("Boom!", Challenge.sevenBoom(new int[] { 35, 4, 9, 37 }));
  }
}