package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DoesRhymeTests {
  @Test
  public void test1() {
    System.out.println("Should work with punctuation.");
    assertEquals(true, Challenge.doesRhyme("Sam I am!", "Green eggs and ham."));
  }

  @Test
  public void test2() {
    System.out.println("Should work with uppercase/punctuation.");
    assertEquals(true, Challenge.doesRhyme("Sam I am!", "Green eggs and HAM."));
  }

  @Test
  public void test3() {
    assertEquals(true, Challenge.doesRhyme("head straight to town", "give me not a frown"));
  }

  @Test
  public void test4() {
    assertEquals(true, Challenge.doesRhyme("with an unpleasant bump", "in a slump"));
  }

  @Test
  public void test5() {
    System.out.println("Should work with punctuation.");
    assertEquals(true, Challenge.doesRhyme("your elbow and chin!", "how much can you win?"));
  }

  @Test
  public void test6() {
    System.out.println("Should work with upper case letters.");
    assertEquals(true, Challenge.doesRhyme("you will start to race", "the waiting Place"));
  }

  @Test
  public void test7() {
    System.out.println("Should work with punctuation.");
    assertEquals(true, Challenge.doesRhyme("All that waiting and staying.", "where the band are playing."));
  }

  @Test
  public void test8() {
    assertEquals(false, Challenge.doesRhyme("You are off to the races", "a splendid day."));
  }

  @Test
  public void test9() {
    assertEquals(false, Challenge.doesRhyme("and frequently do?", "you gotta move."));
  }

  @Test
  public void test10() {
    assertEquals(false, Challenge.doesRhyme("down by the bay", "where the watermelons grow"));
  }

  @Test
  public void test11() {
    assertEquals(false, Challenge.doesRhyme("back to my home", "i dare not go"));
  }
}
