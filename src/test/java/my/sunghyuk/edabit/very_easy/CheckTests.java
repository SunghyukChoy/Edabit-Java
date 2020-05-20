package my.sunghyuk.edabit.very_easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CheckTests {
  @Test
  public void test1() {
    assertEquals(true, Program.check(new int[]{1, 2, 3, 4, 5}, 3));
  }
	
	@Test
  public void test2() {
    assertEquals(false, Program.check(new int[]{1, 1, 2, 1, 1}, 3));
  }
	
	@Test
  public void test3() {
    assertEquals(true, Program.check(new int[]{1, 1, 2, 1, 5, 4, 7}, 7));
  }
	
	@Test
  public void test4() {
    assertEquals(false, Program.check(new int[]{1, 1, 2, 1, 5, 4, 7}, 8));
  }
	
	@Test
  public void test5() {
    assertEquals(true, Program.check(new int[]{5, 5, 5, 6}, 5));
  }
	
	@Test
  public void test6() {
    assertEquals(false, Program.check(new int[]{}, 5));
  }
}