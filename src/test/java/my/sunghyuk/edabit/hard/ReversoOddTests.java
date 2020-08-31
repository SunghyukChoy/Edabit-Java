package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReversoOddTests {
  @Test
  public void test1() {
    assertEquals("enO owt eerht four", Challenge.reverseOdd("One two three four"));
  }

  @Test
  public void test2() {
    assertEquals("Make sure you only reverse words of odd length",
        Challenge.reverseOdd("Make sure uoy only esrever sdrow of ddo length"));
  }

  @Test
  public void test3() {
    System.out.println("Should work with empty string.");
    assertEquals("", Challenge.reverseOdd(""));
  }

  @Test
  public void test4() {
    System.out.println("Should work with only one word.");
    assertEquals("sananaB", Challenge.reverseOdd("Bananas"));
  }

  @Test
  public void test5() {
    assertEquals("Even even even even even even even even even",
        Challenge.reverseOdd("Even even even even even even even even even"));
  }

  @Test
  public void test6() {
    assertEquals("ddO ddo ddo ddo ddo ddo ddo ddo ddo ddo ddo",
        Challenge.reverseOdd("Odd odd odd odd odd odd odd odd odd odd odd"));
  }
}