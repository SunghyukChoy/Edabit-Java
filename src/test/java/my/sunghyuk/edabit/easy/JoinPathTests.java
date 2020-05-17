package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JoinPathTests {
  @Test
  public void test1() {
    assertEquals("portion1/portion2", EasyChallenge.joinPath("portion1", "portion2"));
  }
	
	@Test
  public void test2() {
    assertEquals("portion1/portion2", EasyChallenge.joinPath("portion1/", "portion2"));
  }
	
	@Test
  public void test3() {
    assertEquals("portion1/portion2", EasyChallenge.joinPath("portion1", "/portion2"));
  }
	
	@Test
  public void test4() {
    assertEquals("portion1/portion2", EasyChallenge.joinPath("portion1/", "/portion2"));
  }
	
	@Test
  public void test5() {
    assertEquals("5wf7fny/stJKXlc8", EasyChallenge.joinPath("5wf7fny", "stJKXlc8"));
  }
	
	@Test
  public void test6() {
    assertEquals("5wf7fny/stJKXlc8", EasyChallenge.joinPath("5wf7fny/", "stJKXlc8"));
  }
	
	@Test
  public void test7() {
    assertEquals("5wf7fny/stJKXlc8", EasyChallenge.joinPath("5wf7fny", "/stJKXlc8"));
  }
	
	@Test
  public void test8() {
    assertEquals("5wf7fny/stJKXlc8", EasyChallenge.joinPath("5wf7fny/", "/stJKXlc8"));
  }
	
	@Test
  public void test9() {
    assertEquals("7ASOjVuT/wwPOgKX", EasyChallenge.joinPath("7ASOjVuT/", "wwPOgKX"));
  }
	
	@Test
  public void test10() {
    assertEquals("1h1gRAxu/apQtQYgl", EasyChallenge.joinPath("1h1gRAxu/", "/apQtQYgl"));
  }
}