package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsIsogramTests {

  @Test
  public void test1() {
    assertEquals(true, Challenge.isIsogram("Algorism"));
  }

  @Test
  public void test2() {
    assertEquals(false, Challenge.isIsogram("PasSword"));
  }

  @Test
  public void test3() {
    assertEquals(true, Challenge.isIsogram("Dermatoglyphics"));
  }

  @Test
  public void test4() {
    assertEquals(true, Challenge.isIsogram("Cat"));
  }

  @Test
  public void test5() {
    assertEquals(true, Challenge.isIsogram("Filmography"));
  }

  @Test
  public void test6() {
    assertEquals(false, Challenge.isIsogram("Consecutive"));
  }

  @Test
  public void test7() {
    assertEquals(true, Challenge.isIsogram("Bankruptcies"));
  }

  @Test
  public void test8() {
    assertEquals(true, Challenge.isIsogram("Unforgivable"));
  }

  @Test
  public void test9() {
    assertEquals(true, Challenge.isIsogram("Unpredictably"));
  }

  @Test
  public void test10() {
    assertEquals(false, Challenge.isIsogram("Moose"));
  }
}
