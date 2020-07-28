
package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SortDescTests {
  @Test
  public void test1() {
    assertEquals(321, Program.sortDesc(123));
  }

  @Test
  public void test2() {
    assertEquals(977766200, Program.sortDesc(670276097));
  }

  @Test
  public void test3() {
    assertEquals(9865210, Program.sortDesc(2619805));
  }

  @Test
  public void test4() {
    assertEquals(98421, Program.sortDesc(81294));
  }

  @Test
  public void test5() {
    assertEquals(987654321, Program.sortDesc(123495678));
  }

  @Test
  public void test6() {
    assertEquals(98421, Program.sortDesc(81294));
  }

  @Test
  public void test7() {
    assertEquals(0000000, Program.sortDesc(0000000));
  }

  @Test
  public void test8() {
    assertEquals(321, Program.sortDesc(321));
  }

  @Test
  public void test9() {
    assertEquals(986420, Program.sortDesc(628904));
  }

  @Test
  public void test10() {
    assertEquals(987653220, Program.sortDesc(289327560));
  }
}