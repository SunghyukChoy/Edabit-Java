package my.sunghyuk.edabit.medium;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class SameTests {
  @Test
  public void test1() {
    assertThat(Challenge.same(new int[] { 1, 3, 4, 4, 4 }, new int[] { 2, 5, 7 }), is(true));
  }

  @Test
  public void test2() {
    assertThat(Challenge.same(new int[] { 9, 8, 7, 6 }, new int[] { 4, 4, 3, 1 }), is(false));
  }

  @Test
  public void test3() {
    assertThat(Challenge.same(new int[] { 2 }, new int[] { 3, 3, 3, 3, 3 }), is(true));
  }

  @Test
  public void test4() {
    assertThat(Challenge.same(new int[] { 5, 6, 7, 9 }, new int[] { 4, 1 }), is(false));
  }

  @Test
  public void test5() {
    assertThat(Challenge.same(new int[] { 5, 9, 9 }, new int[] { 9, 5 }), is(true));
  }

  @Test
  public void test6() {
    assertThat(Challenge.same(new int[] { 1, 1, 1, 4 }, new int[] { 1, 4, 4, 4, 4, 4 }), is(true));
  }

  @Test
  public void test7() {
    assertThat(Challenge.same(new int[] {}, new int[] {}), is(true));
  }
}