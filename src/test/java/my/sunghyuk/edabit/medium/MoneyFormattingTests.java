package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MoneyFormattingTests {

  private double[] numVector = new double[] { 10, 31.4159, -56.99, -0.008, 0.05, 1000000, -314159.2653 };
  private String[] resVector = new String[] { "$10.00", "$31.42", "-$56.99", "-$0.01", "$0.05", "$1,000,000.00",
      "-$314,159.27" };

  @Test
  public void test01() {
    assertEquals(Program.dolladollaBills(numVector[0]), resVector[0]);
  }

  @Test
  public void test02() {
    assertEquals(Program.dolladollaBills(numVector[1]), resVector[1]);
  }

  @Test
  public void test03() {
    assertEquals(Program.dolladollaBills(numVector[2]), resVector[2]);
  }

  @Test
  public void test04() {
    assertEquals(Program.dolladollaBills(numVector[3]), resVector[3]);
  }

  @Test
  public void test05() {
    assertEquals(Program.dolladollaBills(numVector[4]), resVector[4]);
  }

  @Test
  public void test06() {
    assertEquals(Program.dolladollaBills(numVector[5]), resVector[5]);
  }

  @Test
  public void test07() {
    assertEquals(Program.dolladollaBills(numVector[6]), resVector[6]);
  }
}
