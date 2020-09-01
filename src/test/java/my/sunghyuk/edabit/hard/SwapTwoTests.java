
package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SwapTwoTests {
  @Test
  public void test1() {
    assertEquals("CDABGHEF", Challenge.swapTwo("ABCDEFGH"));
  }

  @Test
  public void test2() {
    assertEquals("BBAADDCCFFEE", Challenge.swapTwo("AABBCCDDEEFF"));
  }

  @Test
  public void test3() {
    assertEquals("mpooooalmpa", Challenge.swapTwo("oompaloompa"));
  }

  @Test
  public void test4() {
    assertEquals("ncmuinhks", Challenge.swapTwo("munchkins"));
  }

  @Test
  public void test5() {
    assertEquals("GGFFHHI", Challenge.swapTwo("FFGGHHI"));
  }

  @Test
  public void test6() {
    assertEquals("FFG", Challenge.swapTwo("FFG"));
  }

  @Test
  public void test7() {
    assertEquals("", Challenge.swapTwo(""));
  }
}