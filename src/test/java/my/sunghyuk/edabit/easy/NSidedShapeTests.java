package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NSidedShapeTests {
  @Test
  public void test1() {
    assertEquals("circle", EasyChallenge.nSidedShape(1));
  }
	
	@Test
  public void test2() {
    assertEquals("semi-circle", EasyChallenge.nSidedShape(2));
  }
	
	@Test
  public void test3() {
    assertEquals("triangle", EasyChallenge.nSidedShape(3));
  }
	
	@Test
  public void test4() {
    assertEquals("square", EasyChallenge.nSidedShape(4));
  }
	
	@Test
  public void test5() {
    assertEquals("pentagon", EasyChallenge.nSidedShape(5));
  }
	
	@Test
  public void test6() {
    assertEquals("hexagon", EasyChallenge.nSidedShape(6));
  }
	
	@Test
  public void test7() {
    assertEquals("heptagon", EasyChallenge.nSidedShape(7));
  }
	
	@Test
  public void test8() {
    assertEquals("octagon", EasyChallenge.nSidedShape(8));
  }

	@Test
  public void test9() {
    assertEquals("nonagon", EasyChallenge.nSidedShape(9));
  }

	@Test
  public void test10() {
    assertEquals("decagon", EasyChallenge.nSidedShape(10));
  }
}