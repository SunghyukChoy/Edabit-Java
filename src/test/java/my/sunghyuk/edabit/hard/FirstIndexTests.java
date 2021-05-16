package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FirstIndexTests {

  @Test
  public void test1() {
    assertEquals(6, Challenge.firstIndex("68 65 6c 6c 6f 20 77 6f 72 6c 64", "world"));
  }

  @Test
  public void test2() {
    assertEquals(8, Challenge.firstIndex("47 6f 6f 64 62 79 65 20 77 6f 72 6c 64", "world"));
  }

  @Test
  public void test3() {
    assertEquals(4,
        Challenge.firstIndex("74 68 65 20 6e 65 65 64 6c 65 20 69 73 20 74 6f 20 62 65 20 66 6f 75 6e 64", "needle"));
  }

  @Test
  public void test4() {
    assertEquals(9, Challenge.firstIndex("a3 24 25 2d 2d 2d a3 24 20 77 6f 72 6c 64 2d 2d 2d", "world"));
  }

  @Test
  public void test5() {
    assertEquals(0, Challenge.firstIndex("42 6f 72 65 64 20 77 6f 72 6c 64", "Bored"));
  }
}
