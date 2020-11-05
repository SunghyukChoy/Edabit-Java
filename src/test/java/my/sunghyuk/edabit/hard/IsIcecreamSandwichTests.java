package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsIcecreamSandwichTests {

  @Test
  public void test1() {
    assertEquals(true, Challenge.isIcecreamSandwich("AABBBAA"));
  }

  @Test
  public void test2() {
    assertEquals(true, Challenge.isIcecreamSandwich("3&&3"));
  }

  @Test
  public void test3() {
    assertEquals(true, Challenge.isIcecreamSandwich("yyyyymmmmmmmmyyyyy"));
  }

  @Test
  public void test4() {
    assertEquals(true, Challenge.isIcecreamSandwich("hhhhhhhhmhhhhhhhh"));
  }

  @Test
  public void test5() {
    assertEquals(true, Challenge.isIcecreamSandwich("CDC"));
  }

  @Test
  public void test6() {
    System.out.println("only filling");
    assertEquals(false, Challenge.isIcecreamSandwich("BBBBB"));
  }

  @Test
  public void test7() {
    System.out.println("ends are unbalanced");
    assertEquals(false, Challenge.isIcecreamSandwich("AAACCCAA"));
  }

  @Test
  public void test8() {
    System.out.println("can only have one type of filling");
    assertEquals(false, Challenge.isIcecreamSandwich("AACDCAA"));
  }

  @Test
  public void test9() {
    System.out.println("only one end");
    assertEquals(false, Challenge.isIcecreamSandwich("AAABB"));
  }

  @Test
  public void test10() {
    System.out.println("too short");
    assertEquals(false, Challenge.isIcecreamSandwich("AA"));
  }

  @Test
  public void test11() {
    System.out.println("too short");
    assertEquals(false, Challenge.isIcecreamSandwich("A"));
  }

  @Test
  public void test12() {
    System.out.println("too short");
    assertEquals(false, Challenge.isIcecreamSandwich(""));
  }
}
