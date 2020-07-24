package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsAnagramTests {
  @Test
  public void test1() {
    assertEquals(true, Program.isAnagram("cristian", "Cristina"));
  }

  @Test
  public void test2() {
    assertEquals(true, Program.isAnagram("Dave Barry", "Ray Adverb"));
  }

  @Test
  public void test3() {
    assertEquals(false, Program.isAnagram("Nope", "Note"));
  }

  @Test
  public void test4() {
    assertEquals(false, Program.isAnagram("Apple", "Appeal"));
  }
}