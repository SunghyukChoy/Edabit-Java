package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ParityAnalysisTests {

  @Test
  public void test1() {
    assertEquals(true, Challenge.parityAnalysis(243));
  }

  @Test
  public void test2() {
    assertEquals(false, Challenge.parityAnalysis(12));
  }

  @Test
  public void test3() {
    assertEquals(true, Challenge.parityAnalysis(3));
  }

  @Test
  public void test4() {
    assertEquals(true, Challenge.parityAnalysis(5));
  }

  @Test
  public void test5() {
    assertEquals(true, Challenge.parityAnalysis(4));
  }

  @Test
  public void test6() {
    assertEquals(true, Challenge.parityAnalysis(3453));
  }

  @Test
  public void test7() {
    assertEquals(true, Challenge.parityAnalysis(0));
  }

  @Test
  public void test8() {
    assertEquals(true, Challenge.parityAnalysis(123456789));
  }

  @Test
  public void test9() {
    assertEquals(true, Challenge.parityAnalysis(987654321));
  }

  @Test
  public void test10() {
    assertEquals(false, Challenge.parityAnalysis(13));
  }

  @Test
  public void test11() {
    assertEquals(false, Challenge.parityAnalysis(37));
  }

  @Test
  public void test12() {
    assertEquals(false, Challenge.parityAnalysis(182));
  }

  @Test
  public void test13() {
    assertEquals(false, Challenge.parityAnalysis(133331));
  }
}

// made by @Joshua Señoron