package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ValidateEmailTests {

  @Test
  public void test1() {
    assertEquals(false, Program.validateEmail("@edabit.com"));
  }

  @Test
  public void test2() {
    assertEquals(false, Program.validateEmail("@edabit"));
  }

  @Test
  public void test3() {
    assertEquals(true, Program.validateEmail("matt@edabit.com"));
  }

  @Test
  public void test4() {
    assertEquals(false, Program.validateEmail(""));
  }

  @Test
  public void test5() {
    assertEquals(false, Program.validateEmail("hello.gmail@com"));
  }

  @Test
  public void test6() {
    assertEquals(true, Program.validateEmail("bill.gates@microsoft.com"));
  }

  @Test
  public void test7() {
    assertEquals(false, Program.validateEmail("hello@email"));
  }

  @Test
  public void test8() {
    assertEquals(false, Program.validateEmail("%^%$#%^%"));
  }

  @Test
  public void test9() {
    assertEquals(false, Program.validateEmail("www.email.com"));
  }

  @Test
  public void test10() {
    assertEquals(false, Program.validateEmail("email"));
  }

  @Test
  public void test11() {
    assertEquals(false, Program.validateEmail("asdfa.sdf@.com"));
  }

  @Test
  public void test12() {
    assertEquals(true, Program.validateEmail("asdfa.sdf@g.com"));
  }
}