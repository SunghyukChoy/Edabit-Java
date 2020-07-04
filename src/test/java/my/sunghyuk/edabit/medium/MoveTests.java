package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MoveTests {
  @Test
  public void test1() {
    assertEquals("ifmmp", Challenge.move("hello"));
  }

  @Test
  public void test2() {
    assertEquals("mpm", Challenge.move("lol"));
  }

  @Test
  public void test3() {
    assertEquals("czf", Challenge.move("bye"));
  }
}