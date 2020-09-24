package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class canBuild2Tests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.canBuild("aPPleAL", "PAL"));
  }

  @Test
  public void test2() {
    assertEquals(true, Challenge.canBuild("OAT", "OAT"));
  }

  @Test
  public void test3() {
    assertEquals(true, Challenge.canBuild("maybelLINE", "maybe"));
  }

  @Test
  public void test4() {
    assertEquals(true, Challenge.canBuild("topsh", "shop"));
  }

  @Test
  public void test5() {
    assertEquals(true, Challenge.canBuild("topshSHP", "SHoP"));
  }

  @Test
  public void test6() {
    assertEquals(true, Challenge.canBuild("DAISIES", "SAID"));
  }

  @Test
  public void test7() {
    assertEquals(true, Challenge.canBuild("ToporP", "porT"));
  }

  @Test
  public void test8() {
    assertEquals(true, Challenge.canBuild("PoTluCK", "PuCK"));
  }

  @Test
  public void test9() {
    assertEquals(true, Challenge.canBuild("pATS", "p"));
  }

  @Test
  public void test10() {
    assertEquals(true, Challenge.canBuild("blah", ""));
  }

  @Test
  public void test11() {
    assertEquals(false, Challenge.canBuild("aPPleAL", "apple"));
  }

  @Test
  public void test12() {
    assertEquals(false, Challenge.canBuild("shortCAKE", "cakey"));
  }

  @Test
  public void test13() {
    assertEquals(false, Challenge.canBuild("maybeLINE", "lINE"));
  }

  @Test
  public void test14() {
    assertEquals(false, Challenge.canBuild("teaPOT", "lINE"));
  }

  @Test
  public void test15() {
    assertEquals(false, Challenge.canBuild("", "a"));
  }

  @Test
  public void test16() {
    assertEquals(false, Challenge.canBuild("a", "aA"));
  }

  @Test
  public void test17() {
    assertEquals(false, Challenge.canBuild("a", "A"));
  }

  @Test
  public void test18() {
    assertEquals(false, Challenge.canBuild("AAAAAA", "AAAAAAa"));
  }

  @Test
  public void test19() {
    assertEquals(false, Challenge.canBuild("apple", "appleY"));
  }

  @Test
  public void test20() {
    assertEquals(false, Challenge.canBuild("xxYYzZ", "zzZxYxY"));
  }

  @Test
  public void test21() {
    assertEquals(false, Challenge.canBuild("abCD", "aBCD"));
  }

  @Test
  public void test22() {
    assertEquals(false, Challenge.canBuild("abcc", "aabb"));
  }
}