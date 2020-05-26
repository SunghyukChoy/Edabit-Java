package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountOnesTests {
  @Test
  public void test1() {
    assertEquals(2, Program.countOnes(12));
  }
	
	@Test
  public void test2() {
    assertEquals(0, Program.countOnes(0));
  }
	
	@Test
  public void test3() {
    assertEquals(3, Program.countOnes(100));
  }
	
	@Test
  public void test4() {
    assertEquals(4, Program.countOnes(101));
  }
	
	@Test
  public void test5() {
    assertEquals(8, Program.countOnes(999));
  }
	
	@Test
  public void test6() {
    assertEquals(16, Program.countOnes(123456789));
  }
	
	@Test
  public void test7() {
    assertEquals(12, Program.countOnes(1234567890));
  }
}