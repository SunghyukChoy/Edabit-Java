package my.sunghyuk.edabit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HalveCountTests {
  @Test
  public void test1() {
    assertEquals(8, Challenge.halveCount(1891, 4));
  }
	
	@Test
  public void test2() {
    assertEquals(6, Challenge.halveCount(1756, 14));
  }
	
	@Test
  public void test3() {
    assertEquals(11, Challenge.halveCount(7764, 2));
  }
	
	@Test
  public void test4() {
    assertEquals(4, Challenge.halveCount(1118, 47));
  }
	
	@Test
  public void test5() {
    assertEquals(1, Challenge.halveCount(161, 79));
  }
	
	@Test
  public void test6() {
    assertEquals(7, Challenge.halveCount(8573, 35));
  }
	
	@Test
  public void test7() {
    assertEquals(12, Challenge.halveCount(4123, 1));
  }
	
	@Test
  public void test8() {
    assertEquals(4, Challenge.halveCount(1348, 60));
  }
	
	@Test
  public void test9() {
    assertEquals(7, Challenge.halveCount(7549, 31));
  }
	
	@Test
  public void test10() {
    assertEquals(9, Challenge.halveCount(4469, 5));
  }
	
	@Test
  public void test11() {
    assertEquals(3, Challenge.halveCount(1123, 98));
  }
	
	@Test
  public void test12() {
    assertEquals(6, Challenge.halveCount(8197, 85));
  }
	
	@Test
  public void test13() {
    assertEquals(4, Challenge.halveCount(1199, 56));
  }
	
	@Test
  public void test14() {
    assertEquals(11, Challenge.halveCount(8845, 4));
  }
	
	@Test
  public void test15() {
    assertEquals(3, Challenge.halveCount(606, 67));
  }
	
	@Test
  public void test16() {
    assertEquals(9, Challenge.halveCount(3375, 6));
  }
	
	@Test
  public void test17() {
    assertEquals(9, Challenge.halveCount(7085, 10));
  }
	
	@Test
  public void test18() {
    assertEquals(5, Challenge.halveCount(299, 5));
  }
	
	@Test
  public void test19() {
    assertEquals(3, Challenge.halveCount(1208, 82));
  }
	
	@Test
  public void test20() {
    assertEquals(5, Challenge.halveCount(3635, 73));
  }
	
	@Test
  public void test21() {
    assertEquals(9, Challenge.halveCount(2382, 3));
  }
	
	@Test
  public void test22() {
    assertEquals(1, Challenge.halveCount(320, 80));
  }
}