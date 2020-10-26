package my.sunghyuk.edabit.expert;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProductOfPrimesTests {

  @Test
  public void test1() {
    assertEquals(true, Challenge.productOfPrimes(2059));
  }

  @Test
  public void test2() {
    assertEquals(false, Challenge.productOfPrimes(7));
  }

  @Test
  public void test3() {
    assertEquals(true, Challenge.productOfPrimes(25));
  }

  @Test
  public void test4() {
    assertEquals(true, Challenge.productOfPrimes(39));
  }

  @Test
  public void test5() {
    assertEquals(true, Challenge.productOfPrimes(5767));
  }

  @Test
  public void test6() {
    assertEquals(true, Challenge.productOfPrimes(77));
  }

  @Test
  public void test7() {
    assertEquals(false, Challenge.productOfPrimes(12));
  }
}
