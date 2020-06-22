package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SameCaseTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.sameCase("HELLO"));
  }

  @Test
  public void test2() {
    assertEquals(false, Challenge.sameCase("HEllo"));
  }

  @Test
  public void test3() {
    assertEquals(false, Challenge.sameCase("mArmALadE"));
  }

  @Test
  public void test4() {
    assertEquals(true, Challenge.sameCase("marmalade"));
  }

  @Test
  public void test5() {
    assertEquals(true, Challenge.sameCase("MARMALADE"));
  }

  @Test
  public void test6() {
    assertEquals(false, Challenge.sameCase("ketchUP"));
  }

  @Test
  public void test7() {
    assertEquals(true, Challenge.sameCase("pickle"));
  }

  @Test
  public void test8() {
    assertEquals(true, Challenge.sameCase("MUSTARD"));
  }
}