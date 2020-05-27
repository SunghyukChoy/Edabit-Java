package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GCDTests {
  @Test
  public void test1() {
    assertEquals(8, Challenge.gcd(32, 8));
  }
	
	@Test
  public void test2() {
    assertEquals(4, Challenge.gcd(8, 12));
  }
	
	@Test
  public void test3() {
    assertEquals(1, Challenge.gcd(17, 13));
  }
	
	@Test
  public void test4() {
    assertEquals(7, Challenge.gcd(14, 7));
  }
	
	@Test
  public void test5() {
    assertEquals(16, Challenge.gcd(32, 16));
  }
	
	@Test
  public void test6() {
    assertEquals(1, Challenge.gcd(17, 100));
  }
	
	@Test
  public void test7() {
    assertEquals(5, Challenge.gcd(55, 20));
  }
	
	@Test
  public void test8() {
    assertEquals(11, Challenge.gcd(55, 22));
  }
}