package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MinSwapsTests {
  @Test
  public void test1() {
    assertEquals(0, Challenge.minSwaps("1001", "1001"));
  }

  @Test
  public void test2() {
    assertEquals(1, Challenge.minSwaps("1100", "1001"));
  }

  @Test
  public void test3() {
    assertEquals(1, Challenge.minSwaps("110011", "010111"));
  }

  @Test
  public void test4() {
    assertEquals(2, Challenge.minSwaps("1100", "0011"));
  }

  @Test
  public void test5() {
    assertEquals(2, Challenge.minSwaps("110011", "001111"));
  }

  @Test
  public void test6() {
    assertEquals(3, Challenge.minSwaps("10011001", "01100101"));
  }

  @Test
  public void test7() {
    assertEquals(3, Challenge.minSwaps("11111000001100", "10110010100110"));
  }

  @Test
  public void test8() {
    assertEquals(3, Challenge.minSwaps("01100100100111", "10110010100110"));
  }

  @Test
  public void test9() {
    assertEquals(3, Challenge.minSwaps("11110011001", "01100110111"));
  }

  @Test
  public void test10() {
    assertEquals(3, Challenge.minSwaps("100110001", "010100110"));
  }

  @Test
  public void test11() {
    assertEquals(3, Challenge.minSwaps("100101011", "011001101"));
  }

  @Test
  public void test12() {
    assertEquals(4, Challenge.minSwaps("10011001", "01100110"));
  }
}