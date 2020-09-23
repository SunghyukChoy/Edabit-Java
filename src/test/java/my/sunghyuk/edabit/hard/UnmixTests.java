package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UnmixTests {
  @Test
  public void test1() {
    assertEquals("214365", Challenge.unmix("123456"));
  }

  @Test
  public void test2() {
    assertEquals("This is a mixed up string.", Challenge.unmix("hTsii  s aimex dpus rtni.g"));
  }

  @Test
  public void test3() {
    assertEquals("abcde", Challenge.unmix("badce"));
  }

  @Test
  public void test4() {
    assertEquals("I am feeling a little dizzy!", Challenge.unmix(" Imaf eeilgna l tilt eidzz!y"));
  }

  @Test
  public void test5() {
    System.out.println("Should work with empty strings as well.");
    assertEquals("", Challenge.unmix(""));
  }
}
