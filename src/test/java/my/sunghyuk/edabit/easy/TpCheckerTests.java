package my.sunghyuk.edabit.easy;

/** 
================================== 
TestGen 3.1 for JUnit 4.13.0 		
Test Case: SparedSquare::tpChecker 
Timestamp: 12/08/2020 02:33:31 AM 
---------------------------------- 
® DARKKO 2020 © 
================================== 

**/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TpCheckerTests {

  @Test
  public void test01() {
    assertEquals("Your TP will only last 2 days, buy more!", Program.tpChecker(4, 1));
  }

  @Test
  public void test02() {
    assertEquals("Your TP will last 17 days, no need to panic!", Program.tpChecker(2, 4));
  }

  @Test
  public void test03() {
    assertEquals("Your TP will last 58 days, no need to panic!", Program.tpChecker(3, 20));
  }

  @Test
  public void test04() {
    assertEquals("Your TP will last 26 days, no need to panic!", Program.tpChecker(4, 12));
  }

  @Test
  public void test05() {
    assertEquals("Your TP will only last 11 days, buy more!", Program.tpChecker(6, 8));
  }

  @Test
  public void test06() {
    assertEquals("Your TP will only last 8 days, buy more!", Program.tpChecker(1, 1));
  }

  @Test
  public void test07() {
    assertEquals("Your TP will only last 13 days, buy more!", Program.tpChecker(4, 6));
  }

  @Test
  public void test08() {
    assertEquals("Your TP will last 78 days, no need to panic!", Program.tpChecker(1, 9));
  }

  @Test
  public void test09() {
    assertEquals("Your TP will last 28 days, no need to panic!", Program.tpChecker(4, 13));
  }

  @Test
  public void test10() {
    assertEquals("Your TP will only last 11 days, buy more!", Program.tpChecker(6, 8));
  }

  @Test
  public void test11() {
    assertEquals("Your TP will last 15 days, no need to panic!", Program.tpChecker(4, 7));
  }

  @Test
  public void test12() {
    assertEquals("Your TP will last 43 days, no need to panic!", Program.tpChecker(1, 5));
  }

  @Test
  public void test13() {
    assertEquals("Your TP will last 21 days, no need to panic!", Program.tpChecker(6, 15));
  }

  @Test
  public void test14() {
    assertEquals("Your TP will only last 13 days, buy more!", Program.tpChecker(6, 9));
  }

  @Test
  public void test15() {
    assertEquals("Your TP will last 21 days, no need to panic!", Program.tpChecker(2, 5));
  }

  @Test
  public void test16() {
    assertEquals("Your TP will last 70 days, no need to panic!", Program.tpChecker(1, 8));
  }

  @Test
  public void test17() {
    assertEquals("Your TP will last 35 days, no need to panic!", Program.tpChecker(1, 4));
  }

  @Test
  public void test18() {
    assertEquals("Your TP will last 122 days, no need to panic!", Program.tpChecker(1, 14));
  }

  @Test
  public void test19() {
    assertEquals("Your TP will last 35 days, no need to panic!", Program.tpChecker(5, 20));
  }

  @Test
  public void test20() {
    assertEquals("Your TP will last 166 days, no need to panic!", Program.tpChecker(1, 19));
  }

  @Test
  public void test21() {
    assertEquals("Your TP will last 21 days, no need to panic!", Program.tpChecker(4, 10));
  }

  @Test
  public void test22() {
    assertEquals("Your TP will last 22 days, no need to panic!", Program.tpChecker(5, 13));
  }

  @Test
  public void test23() {
    assertEquals("Your TP will only last 5 days, buy more!", Program.tpChecker(5, 3));
  }

  @Test
  public void test24() {
    assertEquals("Your TP will last 26 days, no need to panic!", Program.tpChecker(5, 15));
  }

  @Test
  public void test25() {
    assertEquals("Your TP will last 43 days, no need to panic!", Program.tpChecker(2, 10));
  }

  @Test
  public void test26() {
    assertEquals("Your TP will only last 8 days, buy more!", Program.tpChecker(5, 5));
  }

  @Test
  public void test27() {
    assertEquals("Your TP will last 23 days, no need to panic!", Program.tpChecker(6, 16));
  }

  @Test
  public void test28() {
    assertEquals("Your TP will last 74 days, no need to panic!", Program.tpChecker(2, 17));
  }

  @Test
  public void test29() {
    assertEquals("Your TP will last 23 days, no need to panic!", Program.tpChecker(3, 8));
  }

  @Test
  public void test30() {
    assertEquals("Your TP will last 48 days, no need to panic!", Program.tpChecker(2, 11));
  }

  @Test
  public void test31() {
    assertEquals("Your TP will last 96 days, no need to panic!", Program.tpChecker(1, 11));
  }

  @Test
  public void test32() {
    assertEquals("Your TP will last 35 days, no need to panic!", Program.tpChecker(4, 16));
  }

  @Test
  public void test33() {
    assertEquals("Your TP will last 26 days, no need to panic!", Program.tpChecker(4, 12));
  }

  @Test
  public void test34() {
    assertEquals("Your TP will only last 13 days, buy more!", Program.tpChecker(2, 3));
  }

  @Test
  public void test35() {
    assertEquals("Your TP will last 24 days, no need to panic!", Program.tpChecker(4, 11));
  }

  @Test
  public void test36() {
    assertEquals("Your TP will last 61 days, no need to panic!", Program.tpChecker(2, 14));
  }

  @Test
  public void test37() {
    assertEquals("Your TP will only last 7 days, buy more!", Program.tpChecker(6, 5));
  }

  @Test
  public void test38() {
    assertEquals("Your TP will last 49 days, no need to panic!", Program.tpChecker(3, 17));
  }

  @Test
  public void test39() {
    assertEquals("Your TP will last 83 days, no need to panic!", Program.tpChecker(2, 19));
  }

  @Test
  public void test40() {
    assertEquals("Your TP will only last 10 days, buy more!", Program.tpChecker(5, 6));
  }

  @Test
  public void test41() {
    assertEquals("Your TP will last 65 days, no need to panic!", Program.tpChecker(2, 15));
  }

  @Test
  public void test42() {
    assertEquals("Your TP will last 32 days, no need to panic!", Program.tpChecker(4, 15));
  }

  @Test
  public void test43() {
    assertEquals("Your TP will last 21 days, no need to panic!", Program.tpChecker(5, 12));
  }

  @Test
  public void test44() {
    assertEquals("Your TP will last 87 days, no need to panic!", Program.tpChecker(2, 20));
  }

  @Test
  public void test45() {
    assertEquals("Your TP will last 17 days, no need to panic!", Program.tpChecker(5, 10));
  }

  @Test
  public void test46() {
    assertEquals("Your TP will last 35 days, no need to panic!", Program.tpChecker(3, 12));
  }

  @Test
  public void test47() {
    assertEquals("Your TP will last 57 days, no need to panic!", Program.tpChecker(2, 13));
  }

  @Test
  public void test48() {
    assertEquals("Your TP will last 52 days, no need to panic!", Program.tpChecker(1, 6));
  }

  @Test
  public void test49() {
    assertEquals("Your TP will only last 12 days, buy more!", Program.tpChecker(5, 7));
  }

  @Test
  public void test50() {
    assertEquals("Your TP will last 105 days, no need to panic!", Program.tpChecker(1, 12));
  }

  @Test
  public void test51() {
    assertEquals("Your TP will last 17 days, no need to panic!", Program.tpChecker(3, 6));
  }

  @Test
  public void test52() {
    assertEquals("Your TP will only last 7 days, buy more!", Program.tpChecker(5, 4));
  }

  @Test
  public void test53() {
    assertEquals("Your TP will only last 11 days, buy more!", Program.tpChecker(3, 4));
  }

  @Test
  public void test54() {
    assertEquals("Your TP will last 19 days, no need to panic!", Program.tpChecker(6, 13));
  }

  @Test
  public void test55() {
    assertEquals("Your TP will last 40 days, no need to panic!", Program.tpChecker(3, 14));
  }

  @Test
  public void test56() {
    assertEquals("Your TP will last 26 days, no need to panic!", Program.tpChecker(6, 18));
  }

}
// end of tests