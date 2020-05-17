package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProgrammersTests {
  @Test
  public void test1() {
    assertEquals(8, EasyChallenge.programmers(1, 5, 9));
  }
	
	@Test
  public void test2() {
    assertEquals(10, EasyChallenge.programmers(43, 33, 43));
  }
	
	@Test
  public void test3() {
    assertEquals(74, EasyChallenge.programmers(88, 14, 23));
  }
	
	@Test
  public void test4() {
    assertEquals(41, EasyChallenge.programmers(33, 72, 74));
  }
	
	@Test
  public void test5() {
    assertEquals(493, EasyChallenge.programmers(147, 33, 526));
  }
	
	@Test
  public void test6() {
    assertEquals(223, EasyChallenge.programmers(234, 345, 457));
  }
}