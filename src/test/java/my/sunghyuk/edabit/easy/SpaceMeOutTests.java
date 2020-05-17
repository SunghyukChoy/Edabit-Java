package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SpaceMeOutTests {
  @Test
  public void test1() {
    assertEquals("s p a c e", EasyChallenge.spaceMeOut("space"));
  }
	
	@Test
  public void test2() {
    assertEquals("f a r   o u t", EasyChallenge.spaceMeOut("far out"));
  }
	
	@Test
  public void test3() {
    assertEquals("e l o n g a t e d   m u s k", EasyChallenge.spaceMeOut("elongated musk"));
  }
	
	@Test
  public void test4() {
    assertEquals("l o n g", EasyChallenge.spaceMeOut("long"));
  }
	
	@Test
  public void test5() {
    assertEquals("1 2 3", EasyChallenge.spaceMeOut("123"));
  }
	
	@Test
  public void test6() {
    assertEquals("a 1 b 2 c 3", EasyChallenge.spaceMeOut("a1b2c3"));
  }
}

// made by @Joshua Señoron