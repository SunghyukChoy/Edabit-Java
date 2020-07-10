package my.sunghyuk.edabit.medium;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class NoOddsTests {
  @Test
  public void test1() {
    assertThat(Program.noOdds(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }), is(new int[] { 2, 4, 6, 8 }));
  }

  @Test
  public void test2() {
    assertThat(Program.noOdds(new int[] { 43, 65, 23, 89, 53, 9, 6 }), is(new int[] { 6 }));
  }

  @Test
  public void test3() {
    assertThat(Program.noOdds(new int[] { 718, 991, 449, 644, 380, 440 }), is(new int[] { 718, 644, 380, 440 }));
  }

  @Test
  public void test4() {
    assertThat(Program.noOdds(new int[] { 148, 6, 16, 85 }), is(new int[] { 148, 6, 16 }));
  }

  @Test
  public void test5() {
    assertThat(Program.noOdds(new int[] { 9, 49, 23 }), is(new int[] {}));
  }

  @Test
  public void test6() {
    assertThat(Program.noOdds(new int[] { 34, 43, 32, 49, 40 }), is(new int[] { 34, 32, 40 }));
  }

  @Test
  public void test7() {
    assertThat(Program.noOdds(new int[] { 1232, 1990, 1284, 1391, 1958 }), is(new int[] { 1232, 1990, 1284, 1958 }));
  }

  @Test
  public void test8() {
    assertThat(Program.noOdds(new int[] { 2766, 2651, 2373, 2916, 2397, 2539 }), is(new int[] { 2766, 2916 }));
  }

  @Test
  public void test9() {
    assertThat(Program.noOdds(new int[] { 53, 65, 52, 62, 59 }), is(new int[] { 52, 62 }));
  }

  @Test
  public void test10() {
    assertThat(Program.noOdds(new int[] { 393, 156, 14, 166, 129, 246 }), is(new int[] { 156, 14, 166, 246 }));
  }
}