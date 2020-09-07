package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NoYellingTests {
  @Test
  public void test1() {
    assertEquals("What went wrong?", Challenge.noYelling("What went wrong?????????"));
  }

  @Test
  public void test2() {
    assertEquals("Oh my goodness!", Challenge.noYelling("Oh my goodness!!!"));
  }

  @Test
  public void test3() {
    assertEquals("WHAT!", Challenge.noYelling("WHAT!"));
  }

  @Test
  public void test4() {
    assertEquals("WHAT?", Challenge.noYelling("WHAT?"));
  }

  @Test
  public void test5() {
    assertEquals("Oh my goodness!", Challenge.noYelling("Oh my goodness!"));
  }

  @Test
  public void test6() {
    assertEquals("I just cannot believe it.", Challenge.noYelling("I just cannot believe it."));
  }

  @Test
  public void test7() {
    assertEquals("I just!!! can!!! not!!! believe!!! it!",
        Challenge.noYelling("I just!!! can!!! not!!! believe!!! it!!!"));
  }

  @Test
  public void test8() {
    assertEquals("That's a ton!! of cheese!", Challenge.noYelling("That's a ton!! of cheese!!!!"));
  }
}
