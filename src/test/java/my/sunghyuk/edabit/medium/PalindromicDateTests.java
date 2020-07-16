package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PalindromicDateTests {

  @Test
  public void test1() {
    assertEquals(true, Challenge.palindromicDate("02/02/2020"));
  }

  @Test
  public void test2() {
    assertEquals(false, Challenge.palindromicDate("11/12/2019"));
  }

  @Test
  public void test3() {
    assertEquals(false, Challenge.palindromicDate("11/02/2011"));
  }

  @Test
  public void test4() {
    assertEquals(false, Challenge.palindromicDate("06/10/1469"));
  }

  @Test
  public void test5() {
    assertEquals(false, Challenge.palindromicDate("06/05/3133"));
  }

  @Test
  public void test6() {
    assertEquals(true, Challenge.palindromicDate("12/12/2121"));
  }

  @Test
  public void test7() {
    assertEquals(true, Challenge.palindromicDate("09/09/9090"));
  }

  @Test
  public void test8() {
    assertEquals(false, Challenge.palindromicDate("11/04/2203"));
  }

  @Test
  public void test9() {
    assertEquals(true, Challenge.palindromicDate("07/07/7070"));
  }

  @Test
  public void test10() {
    assertEquals(false, Challenge.palindromicDate("06/11/2923"));
  }

  @Test
  public void test11() {
    assertEquals(false, Challenge.palindromicDate("03/08/8030"));
  }

  @Test
  public void test12() {
    assertEquals(true, Challenge.palindromicDate("01/01/1010"));
  }

  @Test
  public void test13() {
    assertEquals(false, Challenge.palindromicDate("03/11/3369"));
  }

  @Test
  public void test14() {
    assertEquals(false, Challenge.palindromicDate("11/03/2775"));
  }

  @Test
  public void test15() {
    assertEquals(false, Challenge.palindromicDate("03/03/1822"));
  }
}