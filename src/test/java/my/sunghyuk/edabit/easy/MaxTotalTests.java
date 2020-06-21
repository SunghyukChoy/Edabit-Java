package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MaxTotalTests {
  @Test
  public void test0() {
    assertThat(Challenge.maxTotal(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 }), is(45));
  }

  @Test
  public void test1() {
    assertThat(Challenge.maxTotal(new int[] { 1, 1, 0, 1, 3, 10, 10, 10, 10, 1 }), is(43));
  }

  @Test
  public void test2() {
    assertThat(Challenge.maxTotal(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 100 }), is(100));
  }

  @Test
  public void test3() {
    assertThat(Challenge.maxTotal(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }), is(40));
  }

  @Test
  public void test4() {
    assertThat(Challenge.maxTotal(new int[] { 12, 8, 73, 1, 24, 11, 88, 39, 2, -47 }), is(236));
  }

  @Test
  public void test5() {
    assertThat(Challenge.maxTotal(new int[] { 48, 90, 42, -12, 1, -14, -36, -37, -9, -4 }), is(177));
  }

  @Test
  public void test6() {
    assertThat(Challenge.maxTotal(new int[] { -99, -38, -13, -84, 66, 13, -13, -16, 14, 15 }), is(95));
  }

  @Test
  public void test7() {
    assertThat(Challenge.maxTotal(new int[] { 60, -70, -53, -4, 53, -66, 10, -7, 56, 89 }), is(268));
  }

  @Test
  public void test8() {
    assertThat(Challenge.maxTotal(new int[] { 88, 45, 76, 34, -42, 10, -22, 85, -52, 49 }), is(343));
  }

  @Test
  public void test9() {
    assertThat(Challenge.maxTotal(new int[] { 70, -74, 20, -56, -15, 93, -75, 98, 46, 36 }), is(343));
  }

  @Test
  public void test10() {
    assertThat(Challenge.maxTotal(new int[] { -20, -61, 50, 52, 60, -70, 0, 69, 91, -36 }), is(322));
  }

  @Test
  public void test11() {
    assertThat(Challenge.maxTotal(new int[] { 31, 75, 78, 76, -51, -8, 17, -23, 34, 100 }), is(363));
  }

  @Test
  public void test12() {
    assertThat(Challenge.maxTotal(new int[] { -79, 85, 55, -5, -86, -72, 31, -68, 13, 1 }), is(185));
  }

  @Test
  public void test13() {
    assertThat(Challenge.maxTotal(new int[] { -93, -79, -26, 53, 74, -55, 68, -36, -6, -94 }), is(163));
  }

  @Test
  public void test14() {
    assertThat(Challenge.maxTotal(new int[] { -100, 21, 22, 65, 19, 2, -11, 3, 24, 73 }), is(205));
  }

  @Test
  public void test15() {
    assertThat(Challenge.maxTotal(new int[] { 92, -43, 80, 43, 23, -41, -19, 90, 78, 31 }), is(383));
  }

  @Test
  public void test16() {
    assertThat(Challenge.maxTotal(new int[] { -71, -11, -89, 60, 71, -62, 54, 11, 73, 49 }), is(307));
  }

  @Test
  public void test17() {
    assertThat(Challenge.maxTotal(new int[] { 61, -55, 60, -30, 27, 61, -68, -1, -36, -27 }), is(208));
  }

  @Test
  public void test18() {
    assertThat(Challenge.maxTotal(new int[] { 67, -44, 40, -75, 27, 71, -59, 4, 45, -91 }), is(250));
  }

  @Test
  public void test19() {
    assertThat(Challenge.maxTotal(new int[] { 27, -61, 81, -28, 5, 45, -81, 37, 30, 36 }), is(229));
  }

  @Test
  public void test20() {
    assertThat(Challenge.maxTotal(new int[] { 42, 34, -11, -41, -73, 53, 52, 34, 63, -15 }), is(244));
  }

  @Test
  public void test21() {
    assertThat(Challenge.maxTotal(new int[] { -89, 51, -24, -12, 26, 52, -98, -14, -99, 85 }), is(202));
  }

  @Test
  public void test22() {
    assertThat(Challenge.maxTotal(new int[] { -77, 24, 83, -67, -5, 58, -64, 21, 86, 41 }), is(292));
  }

  @Test
  public void test23() {
    assertThat(Challenge.maxTotal(new int[] { -69, 74, -78, 56, -9, -28, 39, 54, -74, 30 }), is(253));
  }

  @Test
  public void test24() {
    assertThat(Challenge.maxTotal(new int[] { 70, -25, 78, -58, -49, -42, -77, -52, 93, -37 }), is(179));
  }

  @Test
  public void test25() {
    assertThat(Challenge.maxTotal(new int[] { -30, -29, 32, -60, 84, -13, 67, -77, 94, 64 }), is(341));
  }

  @Test
  public void test26() {
    assertThat(Challenge.maxTotal(new int[] { -54, 7, 18, 83, -45, 68, 0, 78, 55, -30 }), is(302));
  }

  @Test
  public void test27() {
    assertThat(Challenge.maxTotal(new int[] { -81, -51, 63, 94, 22, -91, -75, 75, 28, -97 }), is(282));
  }

  @Test
  public void test28() {
    assertThat(Challenge.maxTotal(new int[] { 69, -34, -94, -50, -94, -38, -73, 33, 39, -99 }), is(69));
  }

  @Test
  public void test29() {
    assertThat(Challenge.maxTotal(new int[] { -60, -69, -55, -69, 5, 14, 97, 59, 93, 15 }), is(278));
  }

  @Test
  public void test30() {
    assertThat(Challenge.maxTotal(new int[] { 48, 77, -31, 74, 39, 8, -22, 24, 87, 10 }), is(325));
  }

  @Test
  public void test31() {
    assertThat(Challenge.maxTotal(new int[] { 56, 24, 46, 28, 61, 38, -32, 85, -36, -80 }), is(286));
  }

  @Test
  public void test32() {
    assertThat(Challenge.maxTotal(new int[] { -73, 72, 94, -5, 72, 0, 30, -93, -24, -10 }), is(268));
  }

  @Test
  public void test33() {
    assertThat(Challenge.maxTotal(new int[] { -48, 75, 31, -31, 29, 74, -56, -14, 7, -55 }), is(216));
  }

  @Test
  public void test34() {
    assertThat(Challenge.maxTotal(new int[] { -11, -92, 89, -23, -67, 45, 89, 10, -28, 76 }), is(309));
  }

  @Test
  public void test35() {
    assertThat(Challenge.maxTotal(new int[] { 37, -9, -27, -71, 62, 25, -55, 50, -56, -41 }), is(165));
  }

  @Test
  public void test36() {
    assertThat(Challenge.maxTotal(new int[] { 45, -34, 48, 19, 92, 73, -72, 67, 92, -32 }), is(372));
  }

  @Test
  public void test37() {
    assertThat(Challenge.maxTotal(new int[] { -26, -1, -37, 25, 4, -42, -44, -59, 83, 27 }), is(138));
  }

  @Test
  public void test38() {
    assertThat(Challenge.maxTotal(new int[] { -44, 92, -98, -8, -88, -65, 56, 66, -64, 35 }), is(241));
  }

  @Test
  public void test39() {
    assertThat(Challenge.maxTotal(new int[] { 45, -12, -73, 1, -6, -75, 94, 41, -7, -67 }), is(175));
  }

  @Test
  public void test40() {
    assertThat(Challenge.maxTotal(new int[] { 68, -27, -25, -54, -65, -20, 97, 61, 69, 31 }), is(326));
  }

  @Test
  public void test41() {
    assertThat(Challenge.maxTotal(new int[] { 11, -14, -9, -32, 79, -62, 81, -78, 62, -91 }), is(224));
  }

  @Test
  public void test42() {
    assertThat(Challenge.maxTotal(new int[] { -6, -82, 41, -44, 12, -10, 48, 84, 2, -18 }), is(187));
  }

  @Test
  public void test43() {
    assertThat(Challenge.maxTotal(new int[] { 8, -4, 19, -81, 26, -10, -96, 47, 50, 64 }), is(206));
  }

  @Test
  public void test44() {
    assertThat(Challenge.maxTotal(new int[] { 1, -98, 69, -46, -88, 12, 23, 85, 6, -18 }), is(195));
  }

  @Test
  public void test45() {
    assertThat(Challenge.maxTotal(new int[] { 65, 46, 62, 62, 0, -79, -35, -53, 43, 73 }), is(308));
  }

  @Test
  public void test46() {
    assertThat(Challenge.maxTotal(new int[] { 38, 8, 48, -1, -52, -22, 12, -61, -90, 9 }), is(115));
  }

  @Test
  public void test47() {
    assertThat(Challenge.maxTotal(new int[] { -48, 74, 81, -66, 33, -89, 16, 13, -82, 37 }), is(241));
  }

  @Test
  public void test48() {
    assertThat(Challenge.maxTotal(new int[] { -88, 3, 30, -16, 57, 17, -46, 26, -33, -55 }), is(133));
  }

  @Test
  public void test49() {
    assertThat(Challenge.maxTotal(new int[] { 4, -8, 28, 100, 71, -10, 7, 36, -57, 18 }), is(253));
  }

  @Test
  public void test50() {
    assertThat(Challenge.maxTotal(new int[] { -41, 73, 25, -55, 78, -76, -77, -80, 70, 78 }), is(324));
  }

  @Test
  public void test51() {
    assertThat(Challenge.maxTotal(new int[] { 3, -84, -65, -38, 80, -57, -75, -42, 87, -23 }), is(109));
  }

  @Test
  public void test52() {
    assertThat(Challenge.maxTotal(new int[] { -92, -18, 28, -63, 99, -80, -89, 89, -95, -27 }), is(171));
  }

  @Test
  public void test53() {
    assertThat(Challenge.maxTotal(new int[] { 32, -100, 29, -81, 14, 19, 23, -10, 55, -57 }), is(158));
  }

}