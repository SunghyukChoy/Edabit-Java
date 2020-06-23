package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsValidPhoneNumberTests {
  @Test
  public void test1() {
    assertEquals(true, Program.isValidPhoneNumber("(123) 456-7890"));
  }

  @Test
  public void test2() {
    assertEquals(false, Program.isValidPhoneNumber("(1111)555 2345"));
  }

  @Test
  public void test3() {
    assertEquals(false, Program.isValidPhoneNumber("(098) 123 4567"));
  }

  @Test
  public void test4() {
    assertEquals(false, Program.isValidPhoneNumber("(123)456-7890"));
  }

  @Test
  public void test5() {
    assertEquals(false, Program.isValidPhoneNumber("abc(123)456-7890"));
  }

  @Test
  public void test6() {
    assertEquals(false, Program.isValidPhoneNumber("(123)456-7890abc"));
  }

  @Test
  public void test7() {
    assertEquals(false, Program.isValidPhoneNumber("abc(123)456-7890abc"));
  }

  @Test
  public void test8() {
    assertEquals(false, Program.isValidPhoneNumber("abc(123) 456-7890"));
  }

  @Test
  public void test9() {
    assertEquals(false, Program.isValidPhoneNumber("(123) 456-7890abc"));
  }

  @Test
  public void test10() {
    assertEquals(false, Program.isValidPhoneNumber("abc(123) 456-7890abc"));
  }

  @Test
  public void test11() {
    assertEquals(false, Program.isValidPhoneNumber("(123)-456-7890"));
  }

  @Test
  public void test12() {
    assertEquals(false, Program.isValidPhoneNumber("(123)_456-7890"));
  }

  @Test
  public void test13() {
    assertEquals(false, Program.isValidPhoneNumber("-123) 456-7890"));
  }

  @Test
  public void test14() {
    assertEquals(true, Program.isValidPhoneNumber("(519) 505-6498"));
  }
}