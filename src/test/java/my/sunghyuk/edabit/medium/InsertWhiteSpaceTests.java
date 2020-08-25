package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InsertWhiteSpaceTests {
  @Test
  public void test1() {
    assertEquals("She Walks To The Beach", Challenge.insertWhitespace("SheWalksToTheBeach"));
  }

  @Test
  public void test2() {
    assertEquals("Marvin Talks Too Much", Challenge.insertWhitespace("MarvinTalksTooMuch"));
  }

  @Test
  public void test3() {
    assertEquals("Hopelessly Devoted To You", Challenge.insertWhitespace("HopelesslyDevotedToYou"));
  }

  @Test
  public void test4() {
    assertEquals("Even The Best Fall Down Sometimes", Challenge.insertWhitespace("EvenTheBestFallDownSometimes"));
  }

  @Test
  public void test5() {
    assertEquals("The Greatest Upset In History", Challenge.insertWhitespace("TheGreatestUpsetInHistory"));
  }
}