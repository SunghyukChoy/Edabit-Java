
package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrimeNumbersTests {
  @Test
  public void test1() {
    assertEquals(8, Challenge.primeNumbers(20));
  }

  @Test
  public void test2() {
    assertEquals(10, Challenge.primeNumbers(30));
  }

  @Test
  public void test3() {
    assertEquals(25, Challenge.primeNumbers(100));
  }

  @Test
  public void test4() {
    assertEquals(46, Challenge.primeNumbers(200));
  }

  @Test
  public void test5() {
    assertEquals(168, Challenge.primeNumbers(1000));
  }

  @Test
  public void test6() {
    assertEquals(0, Challenge.primeNumbers(-5));
  }

  @Test
  public void test7() {
    assertEquals(18, Challenge.primeNumbers(66));
  }

  @Test
  public void test8() {
    assertEquals(32, Challenge.primeNumbers(133));
  }

  @Test
  public void test9() {
    assertEquals(25, Challenge.primeNumbers(99));
  }
}