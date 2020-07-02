package my.sunghyuk.edabit.medium;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class MeanTests {
  @Test
  public void test1() {
    assertThat(Program.mean(new int[] { 1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3 }), is(2.55));
  }

  @Test
  public void test2() {
    assertThat(Program.mean(new int[] { 324, 543, 654, 9876 }), is(2849.25));
  }

  @Test
  public void test3() {
    assertThat(Program.mean(new int[] { 0, 0, 0, 0 }), is(0.00));
  }

  @Test
  public void test4() {
    assertThat(Program.mean(new int[] { 30, 40, 20, 100, 30 }), is(44.00));
  }

  @Test
  public void test5() {
    assertThat(Program.mean(new int[] { 1, 1, 1, 0 }), is(0.75));
  }

  @Test
  public void test6() {
    assertThat(Program.mean(new int[] { 1, 1, 0, 1, 2, 1, 1, 1, 0, 0 }), is(0.80));
  }

  @Test
  public void test7() {
    assertThat(Program.mean(new int[] { 10000 }), is(10000.00));
  }
}