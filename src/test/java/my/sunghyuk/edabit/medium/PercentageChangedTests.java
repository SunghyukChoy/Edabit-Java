package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PercentageChangedTests {
  @Test
  public void test1() {
    assertEquals(Program.percentageChanged("$800", "$600"), "25% decrease");
  }

  @Test
  public void test2() {
    assertEquals(Program.percentageChanged("$1000", "$840"), "16% decrease");
  }

  @Test
  public void test3() {
    assertEquals(Program.percentageChanged("$100", "$950"), "850% increase");
  }
}
