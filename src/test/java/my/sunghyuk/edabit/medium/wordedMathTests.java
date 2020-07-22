package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class wordedMathTests {
  @Test
  public void test1() {
    assertEquals("Two", Challenge.wordedMath("One plus one"));
  }

  @Test
  public void test2() {
    assertEquals("One", Challenge.wordedMath("zero Plus one"));
  }

  @Test
  public void test3() {
    assertEquals("Zero", Challenge.wordedMath("one minus one"));
  }
}

// made by @Joshua Señoron