package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NextPrimeTests {
  @Test
  public void test1() {
    assertEquals(13, Challenge.nextPrime(12));
  }

  @Test
  public void test2() {
    assertEquals(29, Challenge.nextPrime(24));
  }

  @Test
  public void test3() {
    assertEquals(11, Challenge.nextPrime(11));
  }

  @Test
  public void test4() {
    assertEquals(13, Challenge.nextPrime(13));
  }

  @Test
  public void test5() {
    assertEquals(17, Challenge.nextPrime(14));
  }

  @Test
  public void test6() {
    assertEquals(37, Challenge.nextPrime(33));
  }
}