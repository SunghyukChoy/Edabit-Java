package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MinutesToSecondsTests {

  private String[] strVector = new String[] { "01:00", "13:56", "10:60", "132:21", "132:271", "01:30", "10:00" };
  private int[] resVector = new int[] { 60, 836, -1, 7941, -1, 90, 600 };

  @Test
  public void test01() {
    assertEquals(Program.minutesToSeconds(strVector[0]), resVector[0]);
  }

  @Test
  public void test02() {
    assertEquals(Program.minutesToSeconds(strVector[1]), resVector[1]);
  }

  @Test
  public void test03() {
    assertEquals(Program.minutesToSeconds(strVector[2]), resVector[2]);
  }

  @Test
  public void test04() {
    assertEquals(Program.minutesToSeconds(strVector[3]), resVector[3]);
  }

  @Test
  public void test05() {
    assertEquals(Program.minutesToSeconds(strVector[4]), resVector[4]);
  }

  @Test
  public void test06() {
    assertEquals(Program.minutesToSeconds(strVector[5]), resVector[5]);
  }

  @Test
  public void test07() {
    assertEquals(Program.minutesToSeconds(strVector[6]), resVector[6]);
  }
}

// all credits to the original author and publisher @Joshua Señoron