package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EuclideanTests {
  @Test
  public void test1() {
    assertEquals(2, Challenge.euclidean(4, 2));
  }

  @Test
  public void test2() {
    assertEquals(5, Challenge.euclidean(25, 5));
  }

  @Test
  public void test3() {
    assertEquals(8, Challenge.euclidean(280, 64));
  }

  @Test
  public void test4() {
    assertEquals(3, Challenge.euclidean(3, 6));
  }

  @Test
  public void test5() {
    assertEquals(4, Challenge.euclidean(64, 52));
  }
}