package my.sunghyuk.edabit.hard;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author edwardclark
 **/
public class ConvertTime1Tests {
  @Test
  public void test1() {
    assertEquals("19:05:45", Challenge.convertTime1("07:05:45PM"));
  }

  @Test
  public void test2() {
    assertEquals("00:40:22", Challenge.convertTime1("12:40:22AM"));
  }

  @Test
  public void test3() {
    assertEquals("12:45:54", Challenge.convertTime1("12:45:54PM"));
  }

  @Test
  public void test4() {
    assertEquals("17:32:33", Challenge.convertTime1("05:32:33PM"));
  }

  @Test
  public void test5() {
    assertEquals("23:59:59", Challenge.convertTime1("11:59:59PM"));
  }

  @Test
  public void test6() {
    assertEquals("11:59:59", Challenge.convertTime1("11:59:59AM"));
  }

  @Test
  public void test7() {
    assertEquals("06:00:19", Challenge.convertTime1("06:00:19AM"));
  }
}