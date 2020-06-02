package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BinaryTests {
  @Test
  public void test1() {
    assertEquals("1100100", Challenge.binary(100));
  }
	
	@Test
  public void test2() {
    assertEquals("1", Challenge.binary(1));
  }
	
	@Test
  public void test3() {
    assertEquals("0", Challenge.binary(0));
  }
	
	@Test
  public void test4() {
    assertEquals("1000101", Challenge.binary(69));
  }
	
	@Test
  public void test5() {
    assertEquals("1111111111", Challenge.binary(1023));
  }
	
	@Test
  public void test6() {
    assertEquals("111111111", Challenge.binary(511));
  }
	
	@Test
  public void test7() {
    assertEquals("1010011010", Challenge.binary(666));
  }
	
	@Test
  public void test8() {
    assertEquals("1111011", Challenge.binary(123));
  }
}