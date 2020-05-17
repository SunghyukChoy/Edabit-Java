package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PowerOfTwoTests {
  @Test
  public void test1() {
    assertEquals(true, EasyChallenge.powerOfTwo(32));
  }
	
	@Test
  public void test2() {
    assertEquals(true, EasyChallenge.powerOfTwo(1));
  }
	
	@Test
  public void test3() {
    assertEquals(false, EasyChallenge.powerOfTwo(-7));
  }
	
	@Test
  public void test4() {
    assertEquals(false, EasyChallenge.powerOfTwo(18));
  }
}