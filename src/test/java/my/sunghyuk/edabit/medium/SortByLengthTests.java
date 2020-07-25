package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SortByLengthTests {

  @Test
  public void test1() {
    assertEquals("my Hello friend", Challenge.sortByLength("Hello my friend"));
  }

  @Test
  public void test2() {
    assertEquals("a if of are can two dead keep them Three secret,",
        Challenge.sortByLength("Three can keep a secret, if two of them are dead"));
  }

  @Test
  public void test3() {
    assertEquals("be is or To to be, not the that question.",
        Challenge.sortByLength("To be or not to be, that is the question."));
  }

  @Test
  public void test4() {
    assertEquals("a I have dream", Challenge.sortByLength("I have a dream"));
  }

  @Test
  public void test5() {
    assertEquals("is end the This", Challenge.sortByLength("This is the end"));
  }
}