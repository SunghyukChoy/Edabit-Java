package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReverseTests {
  @Test
  public void test1() {
    assertEquals("olleh", Program.reverse("hello"));
  }

  @Test
  public void test2() {
    assertEquals("dlrow", Program.reverse("world"));
  }

  @Test
  public void test3() {
    assertEquals("a", Program.reverse("a"));
  }

  @Test
  public void test4() {
    System.out.println("An empty string should return an empty string.");
    assertEquals("", Program.reverse(""));
  }
}