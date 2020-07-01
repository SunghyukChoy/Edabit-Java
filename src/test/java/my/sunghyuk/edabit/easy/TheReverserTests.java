package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TheReverserTests {
  @Test
  public void test1() {
    assertEquals("DLROw OLLEh", Challenge.theReverser("Hello World"));
  }

  @Test
  public void test2() {
    assertEquals("eSrEvEr", Challenge.theReverser("ReVeRsE"));
  }

  @Test
  public void test3() {
    assertEquals("RELIPMOC AVAj", Challenge.theReverser("Java compiler"));
  }

}