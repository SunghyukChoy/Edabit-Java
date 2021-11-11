package my.sunghyuk.edabit.easy;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NumOfDigitsTests {

  @Test
  public void test01() {
    assertEquals(6, Challenge.numOfDigits(121317));
  }

  @Test
  public void test02() {
    assertEquals(5, Challenge.numOfDigits(13124));
  }

  @Test
  public void test03() {
    assertEquals(1, Challenge.numOfDigits(0));
  }

  @Test
  public void test04() {
    assertEquals(8, Challenge.numOfDigits(-12381428));
  }

  @Test
  public void test05() {
    assertEquals(2, Challenge.numOfDigits(12));
  }

  @Test
  public void test06() {
    assertEquals(2, Challenge.numOfDigits(42));
  }

  @Test
  public void test07() {
    assertEquals(4, Challenge.numOfDigits(1000));
  }

  @Test
  public void test08() {
    assertEquals(3, Challenge.numOfDigits(136));
  }

  @Test
  public void test09() {
    assertEquals(10, Challenge.numOfDigits(1000000000));
  }

  @Test
  public void test10() {
    assertEquals(10, Challenge.numOfDigits(2147483647));
  }

  @Test
  public void test11() {
    assertEquals(10, Challenge.numOfDigits(-2147483647));
  }

}
// end of tests
