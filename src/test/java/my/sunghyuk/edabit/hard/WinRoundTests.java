package my.sunghyuk.edabit.hard;

/** 
  =================================== 
  TestGen 2.1 for JUnit 4.13.0 		
  Test Case: NumberedCard::winRound 
  Timestamp: 11/7/2020 12:51:51 AM 
  ----------------------------------- 
  ® DARKKO 2020 © 
  =================================== 
  **/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WinRoundTests {

  @Test
  public void test01() {
    assertEquals(true, Program.winRound(new int[] { 2, 5, 2, 6, 9 }, new int[] { 3, 7, 3, 1, 2 }));
  }

  @Test
  public void test02() {
    assertEquals(false, Program.winRound(new int[] { 1, 2, 3, 4, 5 }, new int[] { 9, 8, 7, 6, 5 }));
  }

  @Test
  public void test03() {
    assertEquals(false, Program.winRound(new int[] { 4, 3, 4, 4, 5 }, new int[] { 3, 2, 5, 4, 1 }));
  }

  @Test
  public void test04() {
    assertEquals(true, Program.winRound(new int[] { 3, 2, 8, 9, 4 }, new int[] { 0, 7, 9, 3, 1 }));
  }

  @Test
  public void test05() {
    assertEquals(true, Program.winRound(new int[] { 1, 4, 9, 2, 1 }, new int[] { 3, 7, 7, 8, 7 }));
  }

  @Test
  public void test06() {
    assertEquals(true, Program.winRound(new int[] { 6, 5, 5, 8, 5 }, new int[] { 6, 2, 5, 2, 5 }));
  }

  @Test
  public void test07() {
    assertEquals(false, Program.winRound(new int[] { 5, 3, 5, 9, 2 }, new int[] { 5, 9, 2, 8, 0 }));
  }

  @Test
  public void test08() {
    assertEquals(false, Program.winRound(new int[] { 3, 2, 0, 3, 5 }, new int[] { 7, 5, 8, 6, 2 }));
  }

  @Test
  public void test09() {
    assertEquals(true, Program.winRound(new int[] { 4, 1, 0, 2, 9 }, new int[] { 3, 5, 5, 2, 8 }));
  }

  @Test
  public void test10() {
    assertEquals(true, Program.winRound(new int[] { 9, 8, 7, 3, 4 }, new int[] { 5, 3, 4, 7, 9 }));
  }

  @Test
  public void test11() {
    assertEquals(true, Program.winRound(new int[] { 3, 3, 3, 9, 9 }, new int[] { 9, 0, 0, 6, 6 }));
  }

  @Test
  public void test12() {
    assertEquals(false, Program.winRound(new int[] { 3, 2, 8, 2, 0 }, new int[] { 8, 5, 4, 5, 7 }));
  }

  @Test
  public void test13() {
    assertEquals(false, Program.winRound(new int[] { 6, 2, 6, 8, 0 }, new int[] { 7, 6, 3, 2, 9 }));
  }

  @Test
  public void test14() {
    assertEquals(true, Program.winRound(new int[] { 8, 3, 5, 3, 5 }, new int[] { 5, 5, 4, 4, 6 }));
  }

  @Test
  public void test15() {
    assertEquals(false, Program.winRound(new int[] { 4, 0, 7, 7, 7 }, new int[] { 8, 6, 7, 6, 3 }));
  }

  @Test
  public void test16() {
    assertEquals(false, Program.winRound(new int[] { 5, 4, 8, 4, 8 }, new int[] { 6, 6, 9, 3, 6 }));
  }

  @Test
  public void test17() {
    assertEquals(false, Program.winRound(new int[] { 8, 1, 2, 6, 5 }, new int[] { 2, 6, 7, 1, 8 }));
  }

  @Test
  public void test18() {
    assertEquals(true, Program.winRound(new int[] { 9, 3, 8, 8, 6 }, new int[] { 3, 1, 7, 9, 3 }));
  }

  @Test
  public void test19() {
    assertEquals(false, Program.winRound(new int[] { 7, 2, 3, 0, 3 }, new int[] { 1, 7, 9, 9, 9 }));
  }

  @Test
  public void test20() {
    assertEquals(true, Program.winRound(new int[] { 2, 7, 4, 6, 5 }, new int[] { 2, 3, 1, 5, 6 }));
  }

  @Test
  public void test21() {
    assertEquals(false, Program.winRound(new int[] { 1, 7, 6, 3, 3 }, new int[] { 8, 0, 7, 1, 1 }));
  }

  @Test
  public void test22() {
    assertEquals(true, Program.winRound(new int[] { 5, 1, 6, 4, 7 }, new int[] { 0, 7, 0, 1, 0 }));
  }

  @Test
  public void test23() {
    assertEquals(true, Program.winRound(new int[] { 6, 0, 9, 5, 9 }, new int[] { 4, 0, 3, 2, 5 }));
  }

  @Test
  public void test24() {
    assertEquals(true, Program.winRound(new int[] { 1, 1, 7, 0, 5 }, new int[] { 0, 0, 4, 7, 2 }));
  }

  @Test
  public void test25() {
    assertEquals(false, Program.winRound(new int[] { 3, 3, 8, 3, 8 }, new int[] { 8, 8, 4, 5, 5 }));
  }

  @Test
  public void test26() {
    assertEquals(false, Program.winRound(new int[] { 4, 4, 2, 3, 4 }, new int[] { 3, 6, 1, 5, 7 }));
  }

  @Test
  public void test27() {
    assertEquals(false, Program.winRound(new int[] { 4, 0, 4, 0, 1 }, new int[] { 2, 5, 1, 4, 1 }));
  }

  @Test
  public void test28() {
    assertEquals(false, Program.winRound(new int[] { 5, 0, 1, 7, 5 }, new int[] { 6, 9, 7, 2, 7 }));
  }

  @Test
  public void test29() {
    assertEquals(false, Program.winRound(new int[] { 6, 1, 1, 4, 2 }, new int[] { 6, 4, 7, 1, 2 }));
  }

  @Test
  public void test30() {
    assertEquals(false, Program.winRound(new int[] { 8, 3, 5, 8, 4 }, new int[] { 0, 8, 7, 8, 7 }));
  }
}
