package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class CloneTests {
  @Test
  public void test1() {
    assertArrayEquals(Program.clone(new Object[] { 1, 1 }), new Object[] { 1, 1, new Object[] { 1, 1 } });
  }

  @Test
  public void test2() {
    assertArrayEquals(Program.clone(new Object[] { 1, 2, 3 }), new Object[] { 1, 2, 3, new Object[] { 1, 2, 3 } });
  }

  @Test
  public void test3() {
    assertArrayEquals(Program.clone(new Object[] { "x", "y" }), new Object[] { "x", "y", new Object[] { "x", "y" } });
  }

  @Test
  public void test4() {
    assertArrayEquals(Program.clone(new Object[] { "a", "b", "c" }),
        new Object[] { "a", "b", "c", new Object[] { "a", "b", "c" } });
  }

  @Test
  public void test5() {
    assertArrayEquals(Program.clone(new Object[] {}), new Object[] { new Object[] {} });
  }
}
