package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LineLengthTests {

  @Test
  public void test1() {
    int[][] arr = new int[2][2];
    arr[0][0] = 15;
    arr[0][1] = 7;
    arr[1][0] = 22;
    arr[1][1] = 11;
    assertEquals(8.06, Challenge.lineLength(arr), 0.1);
  }

  @Test
  public void test2() {
    int[][] arr = new int[2][2];
    arr[0][0] = 1;
    arr[0][1] = 1;
    arr[1][0] = 0;
    arr[1][1] = 0;
    assertEquals(1.41, Challenge.lineLength(arr), 0.1);
  }

  @Test
  public void test3() {
    int[][] arr = new int[2][2];
    arr[0][0] = -33;
    arr[0][1] = 33;
    arr[1][0] = 33;
    arr[1][1] = -33;
    assertEquals(93.3, Challenge.lineLength(arr), 0.1);
  }

  @Test
  public void test4() {
    int[][] arr = new int[2][2];
    arr[0][0] = 1;
    arr[0][1] = 2;
    arr[1][0] = 3;
    arr[1][1] = 4;
    assertEquals(2.82, Challenge.lineLength(arr), 0.1);
  }

  @Test
  public void test5() {
    int[][] arr = new int[2][2];
    arr[0][0] = 719;
    arr[0][1] = 10;
    arr[1][0] = -65;
    arr[1][1] = 1;
    assertEquals(784.05, Challenge.lineLength(arr), 0.1);
  }

  @Test
  public void test6() {
    int[][] arr = new int[2][2];
    arr[0][0] = -11;
    arr[0][1] = -12;
    arr[1][0] = -13;
    arr[1][1] = -14;
    assertEquals(2.82, Challenge.lineLength(arr), 0.1);
  }

  @Test
  public void test7() {
    int[][] arr = new int[2][2];
    arr[0][0] = 0;
    arr[0][1] = 0;
    arr[1][0] = 0;
    arr[1][1] = 0;
    assertEquals(0, Challenge.lineLength(arr), 0.1);
  }
}