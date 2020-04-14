package my.sunghyuk.edabit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RepeatTests {
  @Test
  public void test1() {
    assertEquals("mmmmmiiiiiccccceeeee", Challenge.repeat("mice", 5));
  }
	
	@Test
  public void test2() {
    assertEquals("hhheeellllllooo", Challenge.repeat("hello", 3));
  }
	
	@Test
  public void test3() {
    assertEquals("stop", Challenge.repeat("stop", 1));
  }
	
	@Test
  public void test4() {
    assertEquals("ttoommaattoo", Challenge.repeat("tomato", 2));
  }
}