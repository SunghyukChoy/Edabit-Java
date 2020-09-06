package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LeftDigitTests {
  @Test
  public void test1() {
    assertEquals(2, Challenge.leftDigit("TrAdE2W1n95!"));
  }

  @Test
  public void test2() {
    assertEquals(3, Challenge.leftDigit("V3r1ta$"));
  }

  @Test
  public void test3() {
    assertEquals(1, Challenge.leftDigit("U//DertHe1nflu3nC3"));
  }

  @Test
  public void test4() {
    assertEquals(5, Challenge.leftDigit("J@v@5cR1PT"));
  }

  @Test
  public void test5() {
    assertEquals(0, Challenge.leftDigit("0nSlaUgh7*d3atH"));
  }

  @Test
  public void test6() {
    assertEquals(8, Challenge.leftDigit("F8andD3st1nY"));
  }
}
