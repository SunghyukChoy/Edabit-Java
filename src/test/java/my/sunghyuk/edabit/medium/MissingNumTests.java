package my.sunghyuk.edabit.medium;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class MissingNumTests {
  @Test
  public void test1() {
    assertThat(Program.missingNum(new int[] { 1, 2, 3, 4, 6, 7, 8, 9, 10 }), is(5));
  }

  @Test
  public void test2() {
    assertThat(Program.missingNum(new int[] { 7, 2, 3, 6, 5, 9, 1, 4, 8 }), is(10));
  }

  @Test
  public void test3() {
    assertThat(Program.missingNum(new int[] { 7, 2, 3, 9, 4, 5, 6, 8, 10 }), is(1));
  }

  @Test
  public void test4() {
    assertThat(Program.missingNum(new int[] { 10, 5, 1, 2, 4, 6, 8, 3, 9 }), is(7));
  }

  @Test
  public void test5() {
    assertThat(Program.missingNum(new int[] { 1, 7, 2, 4, 8, 10, 5, 6, 9 }), is(3));
  }

  @Test
  public void test6() {
    assertThat(Program.missingNum(new int[] { -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 4 }), is(3));
  }

  @Test
  public void test7() {
    assertThat(Program.missingNum(new int[] { -7, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4 }), is(-6));
  }
}