package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CapLastTests {
  @Test
  public void test1() {
    assertEquals("hellO", Challenge.capLast("hello"));
  }

  @Test
  public void test2() {
    assertEquals("MY NamE IS EdabiT", Challenge.capLast("My Name Is Edabit"));
  }

  @Test
  public void test3() {
    assertEquals("HELP THE LAST LETTERS CAPITALISE", Challenge.capLast("HELp THe LASt LETTERs CAPITALISe"));
  }

  @Test
  public void test4() {
    assertEquals("hellooooO", Challenge.capLast("hellooooo"));
  }

  @Test
  public void test5() {
    assertEquals("hahA I aM alreadY capitaliseD", Challenge.capLast("hahA I aM alreadY capitaliseD"));
  }
}

// made by @Joshua Señoron