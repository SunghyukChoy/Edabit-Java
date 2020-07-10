package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ToHexTests {

  @Test
  public void test1() {
    assertEquals("42 69 67 20 42 6f 69", Challenge.toHex("Big Boi"));
  }

  @Test
  public void test2() {
    assertEquals("4d 61 72 74 79 20 50 6f 70 70 69 6e 73 6f 6e", Challenge.toHex("Marty Poppinson"));
  }

  @Test
  public void test3() {
    assertEquals("61 62 63 64 65 66 67 68 69", Challenge.toHex("abcdefghi"));
  }

  @Test
  public void test4() {
    assertEquals("6f 68 20 64 65 61 72", Challenge.toHex("oh dear"));
  }

  @Test
  public void test5() {
    assertEquals("69 20 68 61 74 65 20 43 23", Challenge.toHex("i hate C#"));
  }

  @Test
  public void test6() {
    assertEquals("69 20 6c 6f 76 65 20 43 2b 2b 20 2c 20 6e 6f 74 20 72 65 61 6c 6c 79",
        Challenge.toHex("i love C++ , not really"));
  }
}