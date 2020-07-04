package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GCDPart1 {
  @Test
  public void test1() {
    assertEquals(2, Challenge.gcd(6, 10));
  }

  @Test
  public void test2() {
    assertEquals(17, Challenge.gcd(17, 85));
  }

  @Test
  public void test3() {
    assertEquals(9, Challenge.gcd(18, 153));
  }

  @Test
  public void test4() {
    assertEquals(14, Challenge.gcd(14, 14));
  }

  @Test
  public void test5() {
    assertEquals(1, Challenge.gcd(6, 31));
  }
}