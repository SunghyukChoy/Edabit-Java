
package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountPalindromesTests {
  @Test
  public void test1() {
    assertEquals(9, Challenge.countPalindromes(1, 10));
  }

  @Test
  public void test2() {
    assertEquals(1, Challenge.countPalindromes(555, 556));
  }

  @Test
  public void test3() {
    assertEquals(3, Challenge.countPalindromes(878, 898));
  }

  @Test
  public void test4() {
    assertEquals(5, Challenge.countPalindromes(8, 34));
  }

  @Test
  public void test5() {
    assertEquals(1, Challenge.countPalindromes(1550, 1556));
  }
}