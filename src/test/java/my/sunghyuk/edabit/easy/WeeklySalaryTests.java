package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WeeklySalaryTests {
  @Test
  public void test1() {
    assertEquals(560, Challenge.weeklySalary(new int[] { 8, 8, 8, 8, 8, 8, 0 }));
  }

  @Test
  public void test2() {
    assertEquals(720, Challenge.weeklySalary(new int[] { 8, 8, 8, 8, 8, 8, 8 }));
  }

  @Test
  public void test3() {
    assertEquals(0, Challenge.weeklySalary(new int[] { 0, 0, 0, 0, 0, 0, 0 }));
  }

  @Test
  public void test4() {
    assertEquals(100, Challenge.weeklySalary(new int[] { 1, 1, 1, 2, 5, 0, 0 }));
  }

  @Test
  public void test5() {
    assertEquals(400, Challenge.weeklySalary(new int[] { 0, 0, 0, 0, 0, 16, 0 }));
  }

  @Test
  public void test6() {
    assertEquals(990, Challenge.weeklySalary(new int[] { 10, 10, 10, 10, 10, 10, 10 }));
  }

  @Test
  public void test7() {
    assertEquals(600, Challenge.weeklySalary(new int[] { 0, 12, 0, 12, 0, 8, 8 }));
  }
}
