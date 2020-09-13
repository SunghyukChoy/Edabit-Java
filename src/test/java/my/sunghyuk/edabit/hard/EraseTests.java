package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EraseTests {
  @Test
  public void test1() {
    assertEquals("hello", Challenge.erase("he##l#hel#llo"));
  }

  @Test
  public void test2() {
    assertEquals("majo spks", Challenge.erase("major# spar##ks"));
  }

  @Test
  public void test3() {
    assertEquals("t boy", Challenge.erase("si###t boy"));
  }

  @Test
  public void test4() {
    assertEquals("motionsick", Challenge.erase("motion #sick"));
  }

  @Test
  public void test5() {
    assertEquals("otn sin", Challenge.erase("m#oti#o#n sick##ne#ss##"));
  }

  @Test
  public void test6() {
    assertEquals("courage", Challenge.erase("courz#i#age"));
  }

  @Test
  public void test7() {
    assertEquals(" tc", Challenge.erase("aris##### c#r#ti#c"));
  }

  @Test
  public void test8() {
    assertEquals("beau", Challenge.erase("beauty##"));
  }

  @Test
  public void test9() {
    assertEquals("beaut", Challenge.erase("beauty#"));
  }

  @Test
  public void test10() {
    assertEquals("", Challenge.erase("b#"));
  }

  @Test
  public void test11() {
    assertEquals("", Challenge.erase("####"));
  }
}
