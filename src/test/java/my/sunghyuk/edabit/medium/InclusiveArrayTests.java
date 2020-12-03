package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class InclusiveArrayTests {

  @Test
  public void test01() {
    assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, Program.inclusiveArray(1, 5));
  }

  @Test
  public void test02() {
    assertArrayEquals(new int[] { 2, 3, 4, 5, 6, 7, 8 }, Program.inclusiveArray(2, 8));
  }

  @Test
  public void test03() {
    assertArrayEquals(new int[] { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 }, Program.inclusiveArray(10, 20));
  }

  @Test
  public void test04() {
    assertArrayEquals(new int[] { 17 }, Program.inclusiveArray(17, 5));
  }

  @Test
  public void test05() {
    assertArrayEquals(new int[] { 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 }, Program.inclusiveArray(40, 50));
  }

  @Test
  public void test06() {
    assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
        25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41 }, Program.inclusiveArray(1, 41));
  }

  @Test
  public void test07() {
    assertArrayEquals(new int[] { 24 }, Program.inclusiveArray(24, 17));
  }

  @Test
  public void test08() {
    assertArrayEquals(new int[] { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31,
        32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59,
        60, 61, 62, 63, 64, 65, 66 }, Program.inclusiveArray(11, 66));
  }

  @Test
  public void test09() {
    assertArrayEquals(new int[] { 9 }, Program.inclusiveArray(9, 3));
  }

  @Test
  public void test10() {
    assertArrayEquals(new int[] { 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 }, Program.inclusiveArray(6, 16));
  }
}