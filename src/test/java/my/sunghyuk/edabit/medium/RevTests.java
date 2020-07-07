package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RevTests {
  @Test
  public void test1() {
    assertEquals("512", Challenge.rev(215));
  }

  @Test
  public void test2() {
    assertEquals("522221", Challenge.rev(122225));
  }

  @Test
  public void test3() {
    assertEquals("512", Challenge.rev(215));
  }

  @Test
  public void test4() {
    System.out.println("Should work with negative numbers.");
    assertEquals("512", Challenge.rev(-215));
  }

  @Test
  public void test5() {
    System.out.println("Should work with negative numbers.");
    assertEquals("2512", Challenge.rev(-2152));
  }

  @Test
  public void test6() {
    System.out.println("Should work with negative numbers.");
    assertEquals("751221", Challenge.rev(-122157));
  }

  @Test
  public void test7() {
    System.out.println("Should work if all digits are the same.");
    assertEquals("666", Challenge.rev(666));
  }

  @Test
  public void test8() {
    System.out.println("Should work if all digits are the same.");
    assertEquals("999", Challenge.rev(999));
  }
}