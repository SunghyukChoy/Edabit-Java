package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CountTrueTests {

  @Test
  public void test1() {
    assertThat(Challenge.countTrue(new boolean[] { true, false, false, true, false }), is(2));
  }

  @Test
  public void test2() {
    assertThat(Challenge.countTrue(new boolean[] { false, false, false, false }), is(0));
  }

  @Test
  public void test3() {
    assertThat(Challenge.countTrue(new boolean[] {}), is(0));
  }

  @Test
  public void test4() {
    assertThat(Challenge.countTrue(new boolean[] { false, false, true, true, false, false, false, true, true, true,
        true, false, true, true, false }), is(8));
  }

  @Test
  public void test5() {
    assertThat(Challenge.countTrue(new boolean[] { true, false, true, true, false, false, false, false, false }),
        is(3));
  }

  @Test
  public void test6() {
    assertThat(Challenge.countTrue(new boolean[] { false, true, true, false, true, true, false, true, false, true,
        false, true, false, true, false }), is(8));
  }

  @Test
  public void test7() {
    assertThat(Challenge.countTrue(new boolean[] { true, false, true, true, true, false, true, true, false, false }),
        is(6));
  }

  @Test
  public void test8() {
    assertThat(
        Challenge.countTrue(new boolean[] { false, false, false, false, true, false, true, false, true, false, false }),
        is(3));
  }

  @Test
  public void test9() {
    assertThat(
        Challenge.countTrue(new boolean[] { true, false, false, false, true, false, false, true, false, false, false }),
        is(3));
  }

  @Test
  public void test10() {
    assertThat(Challenge.countTrue(new boolean[] { true, true, false, true, false, false, false, false, true, false }),
        is(4));
  }

  @Test
  public void test11() {
    assertThat(
        Challenge.countTrue(
            new boolean[] { true, false, true, true, false, true, true, true, true, false, true, false, true, false }),
        is(9));
  }

  @Test
  public void test12() {
    assertThat(Challenge.countTrue(new boolean[] { true, false, true, true, true, true, false, true, true, false, true,
        false, false, false, false }), is(8));
  }

  @Test
  public void test13() {
    assertThat(Challenge.countTrue(
        new boolean[] { true, true, false, false, false, false, true, false, true, true, false, true }), is(6));
  }
}
