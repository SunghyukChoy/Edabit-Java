package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsSmoothTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.isSmooth("Marta appreciated deep perpendicular right trapezoids"));
  }

  @Test
  public void test2() {
    assertEquals(false, Challenge.isSmooth("Someone is outside the doorway"));
  }

  @Test
  public void test3() {
    assertEquals(true, Challenge.isSmooth("She eats super righteously"));
  }

  @Test
  public void test4() {
    assertEquals(true, Challenge.isSmooth("Ben naps so often"));
  }

  @Test
  public void test5() {
    assertEquals(false, Challenge.isSmooth("Cute triangles are cute"));
  }

  @Test
  public void test6() {
    assertEquals(true, Challenge.isSmooth("Mad dislikes sharp pointy yoyos"));
  }

  @Test
  public void test7() {
    assertEquals(true, Challenge.isSmooth("Rita asks Sam mean numbered dilemmas"));
  }

  @Test
  public void test8() {
    assertEquals(false, Challenge.isSmooth("Marigold daffodils streaming happily."));
  }

  @Test
  public void test9() {
    assertEquals(false, Challenge.isSmooth("Simply wonderful laughing."));
  }
}