package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author edwardclark
**/

public class isNarcissisticTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.isNarcissistic(6));
  }

  @Test
  public void test2() {
    assertEquals(true, Challenge.isNarcissistic(1741725));
  }

  @Test
  public void test3() {
    assertEquals(false, Challenge.isNarcissistic(66));
  }

  @Test
  public void test4() {
    assertEquals(false, Challenge.isNarcissistic(65239));
  }

  @Test
  public void test5() {
    assertEquals(false, Challenge.isNarcissistic(886243));
  }

  @Test
  public void test6() {
    assertEquals(true, Challenge.isNarcissistic(92727));
  }

  @Test
  public void test7() {
    assertEquals(true, Challenge.isNarcissistic(472335975));
  }

  @Test
  public void test8() {
    assertEquals(false, Challenge.isNarcissistic(42300981));
  }

  @Test
  public void test9() {
    assertEquals(true, Challenge.isNarcissistic(548834));
  }
}