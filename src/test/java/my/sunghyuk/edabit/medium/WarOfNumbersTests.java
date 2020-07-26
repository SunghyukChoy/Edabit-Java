package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WarOfNumbersTests {
  @Test
  public void test1() {
    assertEquals(168, Challenge.warOfNumbers(new int[] { 5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243 }));
  }

  @Test
  public void test2() {
    assertEquals(793, Challenge.warOfNumbers(new int[] { 654, 7, 23, 3, 78, 4, 56, 34 }));
  }

  @Test
  public void test3() {
    assertEquals(5, Challenge.warOfNumbers(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
  }

  @Test
  public void test4() {
    assertEquals(228,
        Challenge.warOfNumbers(new int[] { 97, 83, 209, 141, 134, 298, 110, 207, 229, 275, 115, 64, 244, 278 }));
  }

  @Test
  public void test5() {
    assertEquals(83, Challenge.warOfNumbers(new int[] { 332, 92, 35, 315, 109, 168, 320, 230, 63, 323, 16, 204, 105, 17,
        226, 157, 245, 44, 223, 136, 93 }));
  }

  @Test
  public void test6() {
    assertEquals(846, Challenge.warOfNumbers(new int[] { 322, 89, 36, 310, 297, 157, 251, 55, 264, 244, 200, 304, 25,
        308, 311, 269, 303, 257, 6, 311, 307, 310, 50, 46, 54, 237, 59, 105, 267 }));
  }

  @Test
  public void test7() {
    assertEquals(0, Challenge.warOfNumbers(new int[] { 50, 100, 149, 1, 200, 199, 3, 2 }));
  }
}