package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IsTripletTests {
  @Test
  public void test1() {
    assertEquals(Program.isTriplet(3, 4, 5), true);
  }

  @Test
  public void test2() {
    assertEquals(Program.isTriplet(1, 2, 3), false);
  }

  @Test
  public void test3() {
    assertEquals(Program.isTriplet(3, 18, 8), false);
  }

  @Test
  public void test4() {
    assertEquals(Program.isTriplet(7, 12, 7), false);
  }

  @Test
  public void test5() {
    assertEquals(Program.isTriplet(13, 5, 12), true);
  }

  @Test
  public void test6() {
    assertEquals(Program.isTriplet(12, 20, 18), false);
  }

  @Test
  public void test7() {
    assertEquals(Program.isTriplet(17, 14, 2), false);
  }

  @Test
  public void test8() {
    assertEquals(Program.isTriplet(6, 15, 12), false);
  }

  @Test
  public void test9() {
    assertEquals(Program.isTriplet(60, 61, 11), true);
  }

  @Test
  public void test10() {
    assertEquals(Program.isTriplet(7, 13, 15), false);
  }

  @Test
  public void test11() {
    assertEquals(Program.isTriplet(12, 18, 7), false);
  }

  @Test
  public void test12() {
    assertEquals(Program.isTriplet(8, 17, 15), true);
  }

  @Test
  public void test13() {
    assertEquals(Program.isTriplet(3120, 79, 3121), true);
  }
}