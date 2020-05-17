package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RepeatTests {
  @Test
  public void test1() {
    assertEquals("mmmmmiiiiiccccceeeee", EasyChallenge.repeat("mice", 5));
  }
	
	@Test
  public void test2() {
    assertEquals("hhheeellllllooo", EasyChallenge.repeat("hello", 3));
  }
	
	@Test
  public void test3() {
    assertEquals("stop", EasyChallenge.repeat("stop", 1));
  }
	
	@Test
  public void test4() {
    assertEquals("ttoommaattoo", EasyChallenge.repeat("tomato", 2));
  }
}