package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NSidedShapeTests {
  @Test
  public void test1() {
    assertEquals("circle", Challenge.nSidedShape(1));
  }
	
	@Test
  public void test2() {
    assertEquals("semi-circle", Challenge.nSidedShape(2));
  }
	
	@Test
  public void test3() {
    assertEquals("triangle", Challenge.nSidedShape(3));
  }
	
	@Test
  public void test4() {
    assertEquals("square", Challenge.nSidedShape(4));
  }
	
	@Test
  public void test5() {
    assertEquals("pentagon", Challenge.nSidedShape(5));
  }
	
	@Test
  public void test6() {
    assertEquals("hexagon", Challenge.nSidedShape(6));
  }
	
	@Test
  public void test7() {
    assertEquals("heptagon", Challenge.nSidedShape(7));
  }
	
	@Test
  public void test8() {
    assertEquals("octagon", Challenge.nSidedShape(8));
  }

	@Test
  public void test9() {
    assertEquals("nonagon", Challenge.nSidedShape(9));
  }

	@Test
  public void test10() {
    assertEquals("decagon", Challenge.nSidedShape(10));
  }
}