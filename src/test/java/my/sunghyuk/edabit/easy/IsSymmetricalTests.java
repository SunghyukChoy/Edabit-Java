package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsSymmetricalTests {
  @Test
  public void test1() {
    assertEquals(false, EasyChallenge.isSymmetrical(23));
  }
	
	@Test
  public void test2() {
    assertEquals(false, EasyChallenge.isSymmetrical(9562));
  }
	
	@Test
  public void test3() {
    assertEquals(false, EasyChallenge.isSymmetrical(10019));
  }
	
	@Test
  public void test4() {
    assertEquals(true, EasyChallenge.isSymmetrical(1));
  }
	
	@Test
  public void test5() {
    assertEquals(true, EasyChallenge.isSymmetrical(3223));
  }
	
	@Test
  public void test6() {
    assertEquals(true, EasyChallenge.isSymmetrical(95559));
  }
	
	@Test
  public void test7() {
    assertEquals(true, EasyChallenge.isSymmetrical(66566));
  }
}