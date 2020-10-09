package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TruncateTests {
  @Test
  public void test1() {
    System.out.println("Clean cut.");
    assertEquals("Lorem ipsum", Challenge.truncate("Lorem ipsum dolor sit amet.", 11));
  }

  @Test
  public void test2() {
    System.out.println("Dirty cut; you have to discard the last word.");
    assertEquals("Lorem ipsum", Challenge.truncate("Lorem ipsum dolor sit amet.", 16));
  }

  @Test
  public void test3() {
    System.out.println("If length is greater than the strings length.");
    assertEquals("Lorem ipsum", Challenge.truncate("Lorem ipsum", 20));
  }

  @Test
  public void test4() {
    assertEquals("", Challenge.truncate("Lorem ipsum", 4));
  }

  @Test
  public void test5() {
    assertEquals("", Challenge.truncate("Lorem ipsum", 0));
  }

  @Test
  public void test6() {
    assertEquals("", Challenge.truncate("", 30));
  }
}