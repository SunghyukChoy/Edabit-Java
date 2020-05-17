package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PowerOfTwoTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.powerOfTwo(32));
  }
	
	@Test
  public void test2() {
    assertEquals(true, Challenge.powerOfTwo(1));
  }
	
	@Test
  public void test3() {
    assertEquals(false, Challenge.powerOfTwo(-7));
  }
	
	@Test
  public void test4() {
    assertEquals(false, Challenge.powerOfTwo(18));
  }
}