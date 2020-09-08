package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MysteryFunc6Tests {
  @Test
  public void test1() {
    assertEquals(10, Challenge.mysteryFunc6(152));
  }

  @Test
  public void test2() {
    assertEquals(48, Challenge.mysteryFunc6(832));
  }

  @Test
  public void test3() {
    assertEquals(25, Challenge.mysteryFunc6(5511));
  }

  @Test
  public void test4() {
    assertEquals(9, Challenge.mysteryFunc6(19));
  }

  @Test
  public void test5() {
    assertEquals(9, Challenge.mysteryFunc6(133));
  }
}
