package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ValidatePINTests {
  @Test
  public void test1() {
    assertEquals(true, EasyProgram.validatePIN("1234"));
  }
	
	@Test
  public void test2() {
    assertEquals(false, EasyProgram.validatePIN("12345"));
  }
	
	@Test
  public void test3() {
    assertEquals(false, EasyProgram.validatePIN("a234"));
  }
	
	@Test
  public void test4() {
    assertEquals(false, EasyProgram.validatePIN(""));
  }
	
	@Test
  public void test5() {
    assertEquals(false, EasyProgram.validatePIN("%234"));
  }
	
	@Test
  public void test6() {
    assertEquals(false, EasyProgram.validatePIN("`234"));
  }
	
	@Test
  public void test7() {
    assertEquals(false, EasyProgram.validatePIN("@234"));
  }
	
	@Test
  public void test8() {
    assertEquals(false, EasyProgram.validatePIN("#234"));
  }
	
	@Test
  public void test9() {
    assertEquals(false, EasyProgram.validatePIN("$234"));
  }
	
	@Test
  public void test10() {
    assertEquals(false, EasyProgram.validatePIN("*234"));
  }
	
	@Test
  public void test11() {
    assertEquals(true, EasyProgram.validatePIN("5678"));
  }
	
	@Test
  public void test12() {
    assertEquals(false, EasyProgram.validatePIN("^234"));
  }
	
	@Test
  public void test13() {
    assertEquals(false, EasyProgram.validatePIN("(234"));
  }
	
	@Test
  public void test14() {
    assertEquals(false, EasyProgram.validatePIN(")234"));
  }
	
	@Test
  public void test15() {
    assertEquals(true, EasyProgram.validatePIN("123456"));
  }
	
	@Test
  public void test16() {
    assertEquals(false, EasyProgram.validatePIN("-234"));
  }
	
	@Test
  public void test17() {
    assertEquals(false, EasyProgram.validatePIN("_234"));
  }
	
	@Test
  public void test18() {
    assertEquals(false, EasyProgram.validatePIN("+234"));
  }
	
	@Test
  public void test19() {
    assertEquals(false, EasyProgram.validatePIN("=234"));
  }
	
	@Test
  public void test20() {
    assertEquals(false, EasyProgram.validatePIN("?234"));
  }

  @Test
  public void test21() {
    assertEquals(false, EasyProgram.validatePIN("12.3"));
  }
}