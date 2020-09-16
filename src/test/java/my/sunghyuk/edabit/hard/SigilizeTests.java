package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SigilizeTests {
  @Test
  public void test1() {
    assertEquals("FRNDSWHLVM", Challenge.sigilize("I HAVE WONDERFUL FRIENDS WHO LOVE ME"));
  }

  @Test
  public void test2() {
    assertEquals("MBNYCSFL", Challenge.sigilize("My business is financially successful"));
  }

  @Test
  public void test3() {
    assertEquals("HVBJNDTPYSWL", Challenge.sigilize("I have a job I enjoy and it pays well"));
  }

  @Test
  public void test4() {
    assertEquals("CSMPLYGNTHRD", Challenge.sigilize("I heard the song closing time playing on the radio"));
  }

  @Test
  public void test5() {
    assertEquals("MLTHY", Challenge.sigilize("i am healthy"));
  }

  @Test
  public void test6() {
    assertEquals("FNDYSLMT", Challenge.sigilize("I FOUND MY SOULMATE"));
  }
}