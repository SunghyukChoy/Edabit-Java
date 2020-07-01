package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountUniqueTests {
  @Test
  public void test1() {
    assertEquals(5, Program.countUnique("apple", "play"));
  }

  @Test
  public void test2() {
    assertEquals(7, Program.countUnique("sore", "zebra"));
  }

  @Test
  public void test3() {
    assertEquals(6, Program.countUnique("pip", "geeks"));
  }

  @Test
  public void test4() {
    assertEquals(5, Program.countUnique("a", "soup"));
  }

  @Test
  public void test5() {
    assertEquals(5, Program.countUnique("maniac", "maniac"));
  }
}