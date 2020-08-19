package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NoDuplicateLettersTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.noDuplicateLetters("Easy does it."));
  }

  @Test
  public void test2() {
    assertEquals(false, Challenge.noDuplicateLetters("So far, so good."));
  }

  @Test
  public void test3() {
    assertEquals(false, Challenge.noDuplicateLetters("Better late than never."));
  }

  @Test
  public void test4() {
    assertEquals(true, Challenge.noDuplicateLetters("Beat around the bush."));
  }

  @Test
  public void test5() {
    assertEquals(false, Challenge.noDuplicateLetters("Give them the benefit of the doubt."));
  }

  @Test
  public void test6() {
    assertEquals(false, Challenge.noDuplicateLetters("Your guess is as good as mine."));
  }

  @Test
  public void test7() {
    assertEquals(true, Challenge.noDuplicateLetters("Make a long story short."));
  }

  @Test
  public void test8() {
    assertEquals(true, Challenge.noDuplicateLetters("Go back to the drawing board."));
  }

  @Test
  public void test9() {
    assertEquals(true, Challenge.noDuplicateLetters("Wrap your head around something."));
  }

  @Test
  public void test10() {
    assertEquals(false, Challenge.noDuplicateLetters("Get your act together."));
  }

  @Test
  public void test11() {
    assertEquals(false, Challenge.noDuplicateLetters("To make matters worse."));
  }

  @Test
  public void test12() {
    assertEquals(true, Challenge.noDuplicateLetters("No pain, no gain."));
  }

  @Test
  public void test13() {
    assertEquals(false, Challenge.noDuplicateLetters("We'll cross that bridge when we come to it."));
  }

  @Test
  public void test14() {
    assertEquals(false, Challenge.noDuplicateLetters("Call it a day."));
  }

  @Test
  public void test15() {
    assertEquals(false, Challenge.noDuplicateLetters("It's not rocket science."));
  }

  @Test
  public void test16() {
    assertEquals(false, Challenge.noDuplicateLetters("A blessing in disguise."));
  }

  @Test
  public void test17() {
    assertEquals(true, Challenge.noDuplicateLetters("Get out of hand."));
  }

  @Test
  public void test18() {
    assertEquals(true, Challenge.noDuplicateLetters("A dime a dozen."));
  }

  @Test
  public void test19() {
    assertEquals(true, Challenge.noDuplicateLetters("Time flies when you're having fun."));
  }

  @Test
  public void test20() {
    assertEquals(true, Challenge.noDuplicateLetters("The best of both worlds."));
  }

  @Test
  public void test21() {
    assertEquals(true, Challenge.noDuplicateLetters("Speak of the devil."));
  }

  @Test
  public void test22() {
    assertEquals(false, Challenge.noDuplicateLetters("You can say that again."));
  }

  @Test
  public void test23() {
    assertEquals(false, Challenge.noDuplicateLetters("Always be closing."));
  }
}