package my.sunghyuk.edabit.hard;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class CanPartitionTests {
  @Test
  public void test1() {
    assertThat(Challenge.canPartition(new int[] { -1, -10, 1, -2, 20 }), is(false));
  }

  @Test
  public void test2() {
    assertThat(Challenge.canPartition(new int[] { -1, -20, 5, -1, -2, 2 }), is(true));
  }

  @Test
  public void test3() {
    assertThat(Challenge.canPartition(new int[] { 2, 8, 4, 1 }), is(true));
  }

  @Test
  public void test4() {
    assertThat(Challenge.canPartition(new int[] { 1, 1, -1, 1 }), is(false));
  }

  @Test
  public void test5() {
    assertThat(Challenge.canPartition(new int[] { -1, -1, 1, 1 }), is(true));
  }

  @Test
  public void test6() {
    assertThat(Challenge.canPartition(new int[] { 0, 5, 1, -1 }), is(false));
  }

  @Test
  public void test7() {
    assertThat(Challenge.canPartition(new int[] { 0, 1, 1, -1 }), is(false));
  }

  @Test
  public void test8() {
    assertThat(Challenge.canPartition(new int[] { 0, 1, 1, 1 }), is(false));
  }

  @Test
  public void test9() {
    assertThat(Challenge.canPartition(new int[] { 0, 0, 1, 1 }), is(true));
  }

  @Test
  public void test10() {
    assertThat(Challenge.canPartition(new int[] { 0, 0, 1 }), is(true));
  }

  @Test
  public void test11() {
    assertThat(Challenge.canPartition(new int[] { 0, 0, 0 }), is(true));
  }

  @Test
  public void test12() {
    assertThat(Challenge.canPartition(new int[] { 5, 5, 25, 100 }), is(false));
  }

  @Test
  public void test13() {
    assertThat(Challenge.canPartition(new int[] { -1, 5, 20, 100 }), is(false));
  }

  @Test
  public void test14() {
    assertThat(Challenge.canPartition(new int[] { 1, 1, 1, 1 }), is(true));
  }

  @Test
  public void test15() {
    assertThat(Challenge.canPartition(new int[] { -1, 1, -1 }), is(true));
  }

  @Test
  public void test16() {
    assertThat(Challenge.canPartition(new int[] { -1, 1, 1 }), is(false));
  }
}
