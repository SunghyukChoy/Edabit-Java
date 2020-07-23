package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CountBoomerangsTests {
  @Test
  public void test1() {
    assertEquals(Program.countBoomerangs(new int[] { 9, 5, 9, 5, 1, 1, 1 }), 2);
  }

  @Test
  public void test2() {
    assertEquals(Program.countBoomerangs(new int[] { 5, 6, 6, 7, 6, 3, 9 }), 1);
  }

  @Test
  public void test3() {
    assertEquals(Program.countBoomerangs(new int[] { 4, 4, 4, 9, 9, 9, 9 }), 0);
  }

  @Test
  public void test4() {
    assertEquals(Program.countBoomerangs(new int[] { 5, 9, 5, 9, 5 }), 3);
  }

  @Test
  public void test5() {
    assertEquals(Program.countBoomerangs(new int[] { 4, 4, 4, 8, 4, 8, 4 }), 3);
  }

  @Test
  public void test6() {
    assertEquals(Program.countBoomerangs(new int[] { 2, 2, 2, 2, 2, 2, 3 }), 0);
  }

  @Test
  public void test7() {
    assertEquals(Program.countBoomerangs(new int[] { 2, 2, 2, 2, 3, 2, 3 }), 2);
  }

  @Test
  public void test8() {
    assertEquals(Program.countBoomerangs(new int[] { 1, 2, 1, 1, 1, 2, 1 }), 2);
  }

  @Test
  public void test9() {
    assertEquals(Program.countBoomerangs(new int[] { 5, 1, 1, 1, 1, 4, 1 }), 1);
  }

  @Test
  public void test10() {
    assertEquals(Program.countBoomerangs(new int[] { 3, 7, 3, 2, 1, 5, 1, 2, 2, -2, 2 }), 3);
  }

  @Test
  public void test11() {
    assertEquals(Program.countBoomerangs(new int[] { 1, 7, 1, 7, 1, 7, 1 }), 5);
  }

  @Test
  public void test12() {
    assertEquals(Program.countBoomerangs(new int[] { 5, 5, 5 }), 0);
  }
}