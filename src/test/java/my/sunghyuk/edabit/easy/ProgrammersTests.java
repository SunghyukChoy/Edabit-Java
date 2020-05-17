package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProgrammersTests {
  @Test
  public void test1() {
    assertEquals(8, Challenge.programmers(1, 5, 9));
  }
	
	@Test
  public void test2() {
    assertEquals(10, Challenge.programmers(43, 33, 43));
  }
	
	@Test
  public void test3() {
    assertEquals(74, Challenge.programmers(88, 14, 23));
  }
	
	@Test
  public void test4() {
    assertEquals(41, Challenge.programmers(33, 72, 74));
  }
	
	@Test
  public void test5() {
    assertEquals(493, Challenge.programmers(147, 33, 526));
  }
	
	@Test
  public void test6() {
    assertEquals(223, Challenge.programmers(234, 345, 457));
  }
}