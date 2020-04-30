package my.sunghyuk.edabit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsSymmetricalTests {
  @Test
  public void test1() {
    assertEquals(false, Challenge.isSymmetrical(23));
  }
	
	@Test
  public void test2() {
    assertEquals(false, Challenge.isSymmetrical(9562));
  }
	
	@Test
  public void test3() {
    assertEquals(false, Challenge.isSymmetrical(10019));
  }
	
	@Test
  public void test4() {
    assertEquals(true, Challenge.isSymmetrical(1));
  }
	
	@Test
  public void test5() {
    assertEquals(true, Challenge.isSymmetrical(3223));
  }
	
	@Test
  public void test6() {
    assertEquals(true, Challenge.isSymmetrical(95559));
  }
	
	@Test
  public void test7() {
    assertEquals(true, Challenge.isSymmetrical(66566));
  }
}