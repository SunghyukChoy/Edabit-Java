package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SelectLettersTests {
  @Test
  public void test1() {
    assertEquals("help", Challenge.selectLetters("heLLO", "GUlp"));
  }

  @Test
  public void test2() {
    assertEquals("135", Challenge.selectLetters("1234567", "XxXxX"));
  }

  @Test
  public void test3() {
    assertEquals("EYSomeThings", Challenge.selectLetters("EVERYTHING", "SomeThings"));
  }

  @Test
  public void test4() {
    assertEquals("atrpten", Challenge.selectLetters("PaTtErN", "pAtTeRn"));
  }

  @Test
  public void test5() {
    assertEquals("", Challenge.selectLetters("nothing", "nothing"));
  }

  @Test
  public void test6() {
    assertEquals("What doR", Challenge.selectLetters("What do you think of it so far?", "RUBBISH!"));
  }
}
