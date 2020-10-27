
package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HistogramTests {

  @Test
  public void test01() {
    assertEquals(Challenge.histogram(new int[] { 2, 4, 5, 6 }, "o"), "oo\noooo\nooooo\noooooo");
  }

  @Test
  public void test02() {
    assertEquals(Challenge.histogram(new int[] { 4, 2 }, "*"), "****\n**");
  }

  @Test
  public void test03() {
    assertEquals(Challenge.histogram(new int[] { 20, 1, 12 }, "H"), "HHHHHHHHHHHHHHHHHHHH\nH\nHHHHHHHHHHHH");
  }

  @Test
  public void test04() {
    assertEquals(Challenge.histogram(new int[] { 2, 1, 2, 4, 5, 2, 3 }, "#"), "##\n#\n##\n####\n#####\n##\n###");
  }
}
