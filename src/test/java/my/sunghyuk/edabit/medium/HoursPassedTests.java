package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HoursPassedTests {

  private String[][] strVector = new String[][] { { "3:00 AM", "9:00 AM" }, { "2:00 PM", "4:00 PM" },
      { "1:00 AM", "3:00 PM" }, { "2:00 AM", "3:00 PM" }, { "8:00 AM", "8:00 PM" }, { "12:00 AM", "10:00 PM" },
      { "1:00 AM", "1:00 AM" }, { "12:00 PM", "12:00 PM" } };
  private String[] resVector = new String[] { "6 hours", "2 hours", "14 hours", "13 hours", "12 hours", "22 hours",
      "No time has passed.", "No time has passed." };

  @Test
  public void test01() {
    assertEquals(Program.hoursPassed(strVector[0][0], strVector[0][1]), resVector[0]);
  }

  @Test
  public void test02() {
    assertEquals(Program.hoursPassed(strVector[1][0], strVector[1][1]), resVector[1]);
  }

  @Test
  public void test03() {
    assertEquals(Program.hoursPassed(strVector[2][0], strVector[2][1]), resVector[2]);
  }

  @Test
  public void test04() {
    assertEquals(Program.hoursPassed(strVector[3][0], strVector[3][1]), resVector[3]);
  }

  @Test
  public void test05() {
    assertEquals(Program.hoursPassed(strVector[4][0], strVector[4][1]), resVector[4]);
  }

  @Test
  public void test06() {
    assertEquals(Program.hoursPassed(strVector[5][0], strVector[5][1]), resVector[5]);
  }

  @Test
  public void test07() {
    assertEquals(Program.hoursPassed(strVector[6][0], strVector[6][1]), resVector[6]);
  }

  @Test
  public void test08() {
    assertEquals(Program.hoursPassed(strVector[7][0], strVector[7][1]), resVector[7]);
  }
}
