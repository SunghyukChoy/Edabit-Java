package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BalancedTests {
  @Test
  public void test1() {
    assertEquals(false, Challenge.balanced("at"));
  }

  @Test
  public void test2() {
    assertEquals(false, Challenge.balanced("forgetful"));
  }

  @Test
  public void test3() {
    assertEquals(true, Challenge.balanced("vegetation"));
  }

  @Test
  public void test4() {
    assertEquals(false, Challenge.balanced("disillusioned"));
  }

  @Test
  public void test5() {
    assertEquals(true, Challenge.balanced("abstract"));
  }

  @Test
  public void test6() {
    assertEquals(false, Challenge.balanced("clever"));
  }

  @Test
  public void test7() {
    assertEquals(true, Challenge.balanced("seasoning"));
  }

  @Test
  public void test8() {
    assertEquals(false, Challenge.balanced("measure"));
  }

  @Test
  public void test9() {
    assertEquals(true, Challenge.balanced("conditionalities"));
  }

  @Test
  public void test10() {
    assertEquals(false, Challenge.balanced("uptight"));
  }

  @Test
  public void test11() {
    assertEquals(false, Challenge.balanced("ticket"));
  }

  @Test
  public void test12() {
    assertEquals(false, Challenge.balanced("calculate"));
  }

  @Test
  public void test13() {
    assertEquals(false, Challenge.balanced("join"));
  }

  @Test
  public void test14() {
    assertEquals(true, Challenge.balanced("anesthesiologies"));
  }

  @Test
  public void test15() {
    assertEquals(false, Challenge.balanced("command"));
  }

  @Test
  public void test16() {
    assertEquals(true, Challenge.balanced("graphite"));
  }

  @Test
  public void test17() {
    assertEquals(true, Challenge.balanced("quadratically"));
  }

  @Test
  public void test18() {
    assertEquals(false, Challenge.balanced("right"));
  }

  @Test
  public void test19() {
    assertEquals(true, Challenge.balanced("fossil"));
  }

  @Test
  public void test20() {
    assertEquals(false, Challenge.balanced("sparkling"));
  }

  @Test
  public void test21() {
    assertEquals(true, Challenge.balanced("dolphin"));
  }

  @Test
  public void test22() {
    assertEquals(true, Challenge.balanced("baseball"));
  }

  @Test
  public void test23() {
    assertEquals(false, Challenge.balanced("immense"));
  }

  @Test
  public void test24() {
    assertEquals(true, Challenge.balanced("pattern"));
  }

  @Test
  public void test25() {
    assertEquals(false, Challenge.balanced("hand"));
  }

  @Test
  public void test26() {
    assertEquals(true, Challenge.balanced("radar"));
  }

  @Test
  public void test27() {
    assertEquals(false, Challenge.balanced("oven"));
  }

  @Test
  public void test28() {
    assertEquals(true, Challenge.balanced("immutability"));
  }

  @Test
  public void test29() {
    assertEquals(true, Challenge.balanced("kayak"));
  }

  @Test
  public void test30() {
    assertEquals(true, Challenge.balanced("bartender"));
  }

  @Test
  public void test31() {
    assertEquals(false, Challenge.balanced("weight"));
  }

  @Test
  public void test32() {
    assertEquals(true, Challenge.balanced("lightbulbs"));
  }

  @Test
  public void test33() {
    assertEquals(true, Challenge.balanced("tail"));
  }
}