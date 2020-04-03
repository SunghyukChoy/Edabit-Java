package my.sunghyuk.edabit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class howManySecondsTests {
  @Test
  public void test1() {
    assertEquals(7200, Challenge.howManySeconds(2));
  }
	
	@Test
  public void test2() {
    assertEquals(36000, Challenge.howManySeconds(10));
  }
	
	@Test
  public void test3() {
    assertEquals(86400, Challenge.howManySeconds(24));
  }
	
	@Test
  public void test4() {
    assertEquals(129600, Challenge.howManySeconds(36));
  }
}