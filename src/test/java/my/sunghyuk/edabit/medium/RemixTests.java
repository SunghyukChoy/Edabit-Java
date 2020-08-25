
package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author edwardclark
 **/
public class RemixTests {
  @Test
  public void test1() {
    assertEquals("acdb", Challenge.remix("abcd", new int[] { 0, 3, 1, 2 }));
  }

  @Test
  public void test2() {
    assertEquals("OPtl", Challenge.remix("PlOt", new int[] { 1, 3, 0, 2 }));
  }

  @Test
  public void test3() {
    assertEquals("cmourpte", Challenge.remix("computer", new int[] { 0, 2, 1, 5, 3, 6, 7, 4 }));
  }

  @Test
  public void test4() {
    assertEquals("wistt", Challenge.remix("twist", new int[] { 4, 0, 1, 2, 3 }));
  }

  @Test
  public void test5() {
    assertEquals("rtibliensyopis",
        Challenge.remix("responsibility", new int[] { 0, 6, 8, 11, 10, 7, 13, 5, 3, 2, 4, 12, 1, 9 }));
  }

  @Test
  public void test6() {
    assertEquals("enrfeeIrcnte", Challenge.remix("Interference", new int[] { 6, 9, 10, 11, 7, 3, 0, 2, 5, 1, 8, 4 }));
  }

  @Test
  public void test7() {
    assertEquals("encqusee", Challenge.remix("sequence", new int[] { 5, 7, 3, 4, 0, 1, 2, 6 }));
  }
}