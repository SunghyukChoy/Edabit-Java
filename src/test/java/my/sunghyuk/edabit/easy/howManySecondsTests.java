package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class howManySecondsTests {
  @Test
  public void test1() {
    assertEquals(7200, EasyChallenge.howManySeconds(2));
  }
	
	@Test
  public void test2() {
    assertEquals(36000, EasyChallenge.howManySeconds(10));
  }
	
	@Test
  public void test3() {
    assertEquals(86400, EasyChallenge.howManySeconds(24));
  }
	
	@Test
  public void test4() {
    assertEquals(129600, EasyChallenge.howManySeconds(36));
  }
}