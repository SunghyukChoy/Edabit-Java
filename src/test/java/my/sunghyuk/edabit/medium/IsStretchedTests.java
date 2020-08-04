package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsStretchedTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.isStretched("pppaaannndddaaa", "panda"));
  }

  @Test
  public void test2() {
    assertEquals(true, Challenge.isStretched("hheelllloo", "hello"));
  }

  @Test
  public void test3() {
    assertEquals(true, Challenge.isStretched("magnet", "magnet"));
  }

  @Test
  public void test4() {
    assertEquals(true, Challenge.isStretched("eeeeemmmmmoooootttttiiiiiooooonnnnn", "emotion"));
  }

  @Test
  public void test5() {
    assertEquals(false, Challenge.isStretched("sssshhiipp", "ship"));
  }

  @Test
  public void test6() {
    assertEquals(false, Challenge.isStretched("cccaaannnddooorrr", "candor"));
  }

  @Test
  public void test7() {
    assertEquals(false, Challenge.isStretched("relationshiipp", "relationship"));
  }

  @Test
  public void test8() {
    assertEquals(false, Challenge.isStretched("magneto", "magnet"));
  }

  @Test
  public void test9() {
    assertEquals(false, Challenge.isStretched("maggnet", "magnet"));
  }
}