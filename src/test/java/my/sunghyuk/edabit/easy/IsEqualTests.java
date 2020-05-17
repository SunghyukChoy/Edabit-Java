package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsEqualTests {
  @Test
  public void test1() {
    assertEquals(true, EasyChallenge.isEqual(2, 2));
  }
	
	@Test
  public void test2() {
    assertEquals(true, EasyChallenge.isEqual(88, 88));
  }
	
	@Test
  public void test3() {
    assertEquals(false, EasyChallenge.isEqual(36, 35));
  }
	
	@Test
  public void test4() {
    assertEquals(true, EasyChallenge.isEqual(1, 1));
  }
	
	@Test
  public void test5() {
    assertEquals(false, EasyChallenge.isEqual(5, 6));
  }
}