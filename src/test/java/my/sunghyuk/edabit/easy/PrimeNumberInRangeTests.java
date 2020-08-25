
package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrimeNumberInRangeTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.primeNumberInRange(10, 12));
  }

  @Test
  public void test2() {
    assertEquals(false, Challenge.primeNumberInRange(62, 66));
  }

  @Test
  public void test3() {
    assertEquals(true, Challenge.primeNumberInRange(441, 445));
  }

  @Test
  public void test4() {
    assertEquals(true, Challenge.primeNumberInRange(0, 2));
  }

  @Test
  public void test5() {
    assertEquals(false, Challenge.primeNumberInRange(20, 22));
  }

  @Test
  public void test6() {
    assertEquals(true, Challenge.primeNumberInRange(4444, 5555));
  }

  @Test
  public void test7() {
    assertEquals(false, Challenge.primeNumberInRange(114, 120));
  }
}