package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SpinAroundTests {

  @Test
  public void test01() {
    assertEquals(Program.spinAround(new String[] { "left", "right", "left", "right" }), 0);
  }

  @Test
  public void test02() {
    assertEquals(
        Program.spinAround(new String[] { "right", "right", "right", "right", "right", "right", "right", "right" }), 2);
  }

  @Test
  public void test03() {
    assertEquals(Program.spinAround(new String[] { "left", "left", "left", "left" }), 1);
  }

  @Test
  public void test04() {
    assertEquals(Program.spinAround(new String[] {}), 0);
  }

  @Test
  public void test05() {
    assertEquals(Program.spinAround(new String[] { "left" }), 0);
  }

  @Test
  public void test06() {
    assertEquals(Program.spinAround(new String[] { "right" }), 0);
  }

  @Test
  public void test07() {
    assertEquals(Program.spinAround(new String[] { "right", "right", "right", "left", "right", "right" }), 1);
  }

  @Test
  public void test08() {
    assertEquals(Program.spinAround(new String[] { "left", "left", "right", "left", "left", "left", "left", "left",
        "left", "right", "left", "left", "right", "right", "right", "right", "left", "left", "right", "right" }), 1);
  }

  @Test
  public void test09() {
    assertEquals(Program.spinAround(new String[] { "right", "left", "left", "right", "left", "left", "right", "left",
        "right", "right", "left", "left", "right", "right", "right", "left", "left", "right" }), 0);
  }

  @Test
  public void test10() {
    assertEquals(Program.spinAround(new String[] { "right", "right", "right", "right", "right", "right", "right",
        "right", "right", "right", "right", "right", "right", "right", "right", "right", "right", "right", "right",
        "right", "right", "right", "right", "right", "right", "right", "right", "right", "right", "right", "right",
        "right", "right", "right", "right", "right", "right", "right", "right", "right" }), 10);
  }

  @Test
  public void test11() {
    assertEquals(Program.spinAround(new String[] { "left", "left", "left", "left", "left", "left", "left", "left",
        "left", "left", "left", "left", "left", "left", "left", "left", "left", "left", "left", "left", "left", "left",
        "left", "left", "left", "left", "left", "left", "left", "left", "left", "left", "left", "left", "left", "left",
        "left", "left", "left", "left" }), 10);
  }
}
