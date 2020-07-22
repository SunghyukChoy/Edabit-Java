package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MysteryFuncTests {
  @Test
  public void test1() {
    assertEquals(21, Challenge.mysteryFunc(3));
  }

  @Test
  public void test2() {
    assertEquals(2221, Challenge.mysteryFunc(9));
  }

  @Test
  public void test3() {
    assertEquals(2227, Challenge.mysteryFunc(15));
  }

  @Test
  public void test4() {
    assertEquals(22221, Challenge.mysteryFunc(17));
  }

  @Test
  public void test5() {
    assertEquals(22223, Challenge.mysteryFunc(19));
  }

  @Test
  public void test6() {
    assertEquals(22228, Challenge.mysteryFunc(24));
  }

  @Test
  public void test7() {
    assertEquals(222223, Challenge.mysteryFunc(35));
  }
}