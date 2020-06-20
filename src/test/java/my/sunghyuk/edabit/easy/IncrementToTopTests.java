package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class IncrementToTopTests {
  @Test
  public void test1() {
    assertThat(Challenge.incrementToTop(new int[] { 3, 4, 5 }), is(3));
  }

  @Test
  public void test2() {
    assertThat(Challenge.incrementToTop(new int[] { 4, 3, 4 }), is(1));
  }

  @Test
  public void test3() {
    assertThat(Challenge.incrementToTop(new int[] { 3, 3, 3 }), is(0));
  }

  @Test
  public void test4() {
    assertThat(Challenge.incrementToTop(new int[] { 3, 10, 3 }), is(14));
  }

  @Test
  public void test5() {
    assertThat(Challenge.incrementToTop(new int[] { 1, 2, 3, 4, 5 }), is(10));
  }
}
