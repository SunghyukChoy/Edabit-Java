package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleTests {
  @Test
  public void test1() {
    assertEquals(1, Challenge.triangle(1));
  }
	
	@Test
  public void test2() {
    assertEquals(3, Challenge.triangle(2));
  }
	
	@Test
  public void test3() {
    assertEquals(6, Challenge.triangle(3));
  }
	
	@Test
  public void test4() {
    assertEquals(36, Challenge.triangle(8));
  }
	
	@Test
  public void test5() {
    assertEquals(2318781, Challenge.triangle(2153));
  }
}