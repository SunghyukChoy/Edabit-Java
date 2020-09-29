package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OmnipresentTests {
  @Test
  public void test1() {
    assertEquals(true, Program.omnipresent(new int[][] { { 1, 1 }, { 1, 3 }, { 5, 1 }, { 6, 1 } }, 1));
  }

  @Test
  public void test2() {
    assertEquals(false, Program.omnipresent(new int[][] { { 1, 1 }, { 1, 3 }, { 5, 1 }, { 6, 1 } }, 6));
  }

  @Test
  public void test3() {
    assertEquals(true, Program.omnipresent(new int[][] { { 5 }, { 5 }, { 5 }, { 6, 5 } }, 5));
  }

  @Test
  public void test4() {
    assertEquals(false, Program.omnipresent(new int[][] { { 5 }, { 5 }, { 5 }, { 6, 5 } }, 6));
  }

  @Test
  public void test5() {
    assertEquals(true, Program.omnipresent(new int[][] { { 5, 1 }, { 5, 1 }, { 5, 1 }, { 6, 5, 1 } }, 1));
  }
}
