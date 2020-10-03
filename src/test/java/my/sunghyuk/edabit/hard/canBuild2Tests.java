package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CanBuild2Tests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.canBuild2("aPPleAL", "PAL"));
  }

  @Test
  public void test2() {
    assertEquals(true, Challenge.canBuild2("OAT", "OAT"));
  }

  @Test
  public void test3() {
    assertEquals(true, Challenge.canBuild2("maybelLINE", "maybe"));
  }

  @Test
  public void test4() {
    assertEquals(true, Challenge.canBuild2("topsh", "shop"));
  }

  @Test
  public void test5() {
    assertEquals(true, Challenge.canBuild2("topshSHP", "SHoP"));
  }

  @Test
  public void test6() {
    assertEquals(true, Challenge.canBuild2("DAISIES", "SAID"));
  }

  @Test
  public void test7() {
    assertEquals(true, Challenge.canBuild2("ToporP", "porT"));
  }

  @Test
  public void test8() {
    assertEquals(true, Challenge.canBuild2("PoTluCK", "PuCK"));
  }

  @Test
  public void test9() {
    assertEquals(true, Challenge.canBuild2("pATS", "p"));
  }

  @Test
  public void test10() {
    assertEquals(true, Challenge.canBuild2("blah", ""));
  }

  @Test
  public void test11() {
    assertEquals(false, Challenge.canBuild2("aPPleAL", "apple"));
  }

  @Test
  public void test12() {
    assertEquals(false, Challenge.canBuild2("shortCAKE", "cakey"));
  }

  @Test
  public void test13() {
    assertEquals(false, Challenge.canBuild2("maybeLINE", "lINE"));
  }

  @Test
  public void test14() {
    assertEquals(false, Challenge.canBuild2("teaPOT", "lINE"));
  }

  @Test
  public void test15() {
    assertEquals(false, Challenge.canBuild2("", "a"));
  }

  @Test
  public void test16() {
    assertEquals(false, Challenge.canBuild2("a", "aA"));
  }

  @Test
  public void test17() {
    assertEquals(false, Challenge.canBuild2("a", "A"));
  }

  @Test
  public void test18() {
    assertEquals(false, Challenge.canBuild2("AAAAAA", "AAAAAAa"));
  }

  @Test
  public void test19() {
    assertEquals(false, Challenge.canBuild2("apple", "appleY"));
  }

  @Test
  public void test20() {
    assertEquals(false, Challenge.canBuild2("xxYYzZ", "zzZxYxY"));
  }

  @Test
  public void test21() {
    assertEquals(false, Challenge.canBuild2("abCD", "aBCD"));
  }

  @Test
  public void test22() {
    assertEquals(false, Challenge.canBuild2("abcc", "aabb"));
  }
}