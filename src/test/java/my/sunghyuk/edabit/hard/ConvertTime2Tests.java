package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConvertTime2Tests {
  @Test
  public void test1() {
    assertEquals("0:00", Challenge.convertTime2("12:00 am"));
  }

  @Test
  public void test2() {
    assertEquals("18:20", Challenge.convertTime2("6:20 pm"));
  }

  @Test
  public void test3() {
    assertEquals("9:00 pm", Challenge.convertTime2("21:00"));
  }

  @Test
  public void test4() {
    assertEquals("5:05 am", Challenge.convertTime2("5:05"));
  }

  @Test
  public void test5() {
    assertEquals("9:30", Challenge.convertTime2("9:30 am"));
  }

  @Test
  public void test6() {
    assertEquals("12:00", Challenge.convertTime2("12:00 pm"));
  }
}