package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CapSpaceTests {
  @Test
  public void test1() {
    assertEquals("hello world", Challenge.capSpace("helloWorld"));
  }

  @Test
  public void test2() {
    assertEquals("i love my teapot", Challenge.capSpace("iLoveMyTeapot"));
  }

  @Test
  public void test3() {
    assertEquals("stay indoors", Challenge.capSpace("stayIndoors"));
  }
}