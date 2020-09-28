package my.sunghyuk.edabit.hard;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IsCenteredTests {
  @Test
  public void test1() {
    assertEquals(Program.isCentered("  #  "), true);
  }

  @Test
  public void test2() {
    assertEquals(Program.isCentered(" 2    "), false);
  }

  @Test
  public void test3() {
    assertEquals(Program.isCentered("@"), true);
  }

  @Test
  public void test4() {
    assertEquals(Program.isCentered(" 1"), false);
  }

  @Test
  public void test5() {
    assertEquals(Program.isCentered("7 "), false);
  }

  @Test
  public void test6() {
    assertEquals(Program.isCentered("  l "), false);
  }

  @Test
  public void test7() {
    assertEquals(Program.isCentered(" a  "), false);
  }

  @Test
  public void test8() {
    assertEquals(Program.isCentered("    G    "), true);
  }

  @Test
  public void test9() {
    assertEquals(Program.isCentered("        %        "), true);
  }
}