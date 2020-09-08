package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MysteryFunc2Tests {
  @Test
  public void test1() {
    assertEquals(21, Challenge.mysteryFunc2(3));
  }

  @Test
  public void test2() {
    assertEquals(2221, Challenge.mysteryFunc2(9));
  }

  @Test
  public void test3() {
    assertEquals(2227, Challenge.mysteryFunc2(15));
  }

  @Test
  public void test4() {
    assertEquals(22221, Challenge.mysteryFunc2(17));
  }

  @Test
  public void test5() {
    assertEquals(22223, Challenge.mysteryFunc2(19));
  }

  @Test
  public void test6() {
    assertEquals(22228, Challenge.mysteryFunc2(24));
  }

  @Test
  public void test7() {
    assertEquals(222223, Challenge.mysteryFunc2(35));
  }
}