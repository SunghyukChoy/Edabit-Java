package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IsFirstSuperiorTests {

  private Object[][] objVector = new Object[][] { { new Object[] { 1, 2, 3, 4 }, new Object[] { 1, 2, 3, 3 } },
      { new Object[] { 'a', 'b', 'c' }, new Object[] { 'a', 'd', 'c' } },
      { new Object[] { true, 10, "zebra" }, new Object[] { true, 10, "zebra" } },
      { new Object[] { true, 10, "zebra" }, new Object[] { true, 10, "ant" } },
      { new Object[] { true, true, false, true }, new Object[] { true, true, true, true } },
      { new Object[] { 9.1, 8.1, 7.1, 6.1 }, new Object[] { 9.1, 8.1, 7.1, 5.1 } },
      { new Object[] { "llama", "alligator" }, new Object[] { "llama", "buffalo" } },
      { new Object[] { "zebra", "ostrich", "whale" }, new Object[] { "ant", "ostrich", "whale" } },
      { new Object[] { 1, 2, 3, 4 }, new Object[] { 1, 2, 4, 4 } } };
  private boolean[] resVector = new boolean[] { true, false, false, true, false, true, false, true, false };

  @Test
  public void test01() {
    assertEquals(Program.isFirstSuperior((Object[]) objVector[0][0], (Object[]) objVector[0][1]), resVector[0]);
  }

  @Test
  public void test02() {
    assertEquals(Program.isFirstSuperior((Object[]) objVector[1][0], (Object[]) objVector[1][1]), resVector[1]);
  }

  @Test
  public void test03() {
    assertEquals(Program.isFirstSuperior((Object[]) objVector[2][0], (Object[]) objVector[2][1]), resVector[2]);
  }

  @Test
  public void test04() {
    assertEquals(Program.isFirstSuperior((Object[]) objVector[3][0], (Object[]) objVector[3][1]), resVector[3]);
  }

  @Test
  public void test05() {
    assertEquals(Program.isFirstSuperior((Object[]) objVector[4][0], (Object[]) objVector[4][1]), resVector[4]);
  }

  @Test
  public void test06() {
    assertEquals(Program.isFirstSuperior((Object[]) objVector[5][0], (Object[]) objVector[5][1]), resVector[5]);
  }

  @Test
  public void test07() {
    assertEquals(Program.isFirstSuperior((Object[]) objVector[6][0], (Object[]) objVector[6][1]), resVector[6]);
  }

  @Test
  public void test08() {
    assertEquals(Program.isFirstSuperior((Object[]) objVector[7][0], (Object[]) objVector[7][1]), resVector[7]);
  }

  @Test
  public void test09() {
    assertEquals(Program.isFirstSuperior((Object[]) objVector[8][0], (Object[]) objVector[8][1]), resVector[8]);
  }
}