package my.sunghyuk.edabit.hard;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class FindOddTests {
  @Test
  public void test1() {
    assertThat(Challenge.findOdd(new int[] { 20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5 }), is(5));
  }

  @Test
  public void test2() {
    assertThat(Challenge.findOdd(new int[] { 1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5 }), is(-1));
  }

  @Test
  public void test3() {
    assertThat(Challenge.findOdd(new int[] { 20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5 }), is(5));
  }

  @Test
  public void test4() {
    assertThat(Challenge.findOdd(new int[] { 10 }), is(10));
  }

  @Test
  public void test5() {
    assertThat(Challenge.findOdd(new int[] { 1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1 }), is(10));
  }

  @Test
  public void test6() {
    assertThat(Challenge.findOdd(new int[] { 5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10 }), is(1));
  }
}
