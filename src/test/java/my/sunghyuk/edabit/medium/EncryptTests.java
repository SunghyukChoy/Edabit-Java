package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EncryptTests {
  @Test
  public void test1() {
    assertEquals("0c0r0kaca", Challenge.encrypt("karaca"));
  }

  @Test
  public void test2() {
    assertEquals("k0r3baca", Challenge.encrypt("burak"));
  }

  @Test
  public void test3() {
    assertEquals("0n0n0baca", Challenge.encrypt("banana"));
  }

  @Test
  public void test4() {
    assertEquals("0c0pl0aca", Challenge.encrypt("alpaca"));
  }

  @Test
  public void test5() {
    assertEquals("2ll1haca", Challenge.encrypt("hello"));
  }
}