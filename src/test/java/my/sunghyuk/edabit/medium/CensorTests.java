package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CensorTests {
  @Test
  public void test1() {
    assertEquals("The code is ******", Challenge.censor("The code is fourty"));
  }

  @Test
  public void test2() {
    assertEquals("Two plus ***** is five", Challenge.censor("Two plus three is five"));
  }

  @Test
  public void test3() {
    assertEquals("aaaa ***** 1234 *****", Challenge.censor("aaaa aaaaa 1234 12345"));
  }

  @Test
  public void test4() {
    assertEquals("****************", Challenge.censor("abcdefghijklmnop"));
  }

  @Test
  public void test5() {
    assertEquals("a", Challenge.censor("a"));
  }
}

// made by @Joshua Señoron