package my.sunghyuk.edabit.medium;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class FindLargestNumsTests {

  @Test
  public void test1() {
    assertThat(Challenge.findLargestNums(new double[][] { { 4, 2, 7, 1 }, { 20, 70, 40, 90 }, { 1, 2, 0 } }),
        is(new double[] { 7, 90, 2 }));
  }

  @Test
  public void test2() {
    assertThat(
        Challenge.findLargestNums(
            new double[][] { { 0.4321, 0.7634, 0.652 }, { 1.324, 9.32, 2.5423, 6.4314 }, { 9, 3, 6, 3 } }),
        is(new double[] { 0.7634, 9.32, 9 }));
  }

  @Test
  public void test3() {
    assertThat(Challenge.findLargestNums(new double[][] { { -34, -54, -74 }, { -32, -2, -65 }, { -54, 7, -43 } }),
        is(new double[] { -34, -2, 7 }));
  }

  @Test
  public void test4() {
    assertThat(
        Challenge.findLargestNums(new double[][] { { 0.34, -5, 1.34 }, { -6.432, -1.762, -1.99 }, { 32, 65, -6 } }),
        is(new double[] { 1.34, -1.762, 65 }));
  }

  @Test
  public void test5() {
    assertThat(Challenge.findLargestNums(new double[][] { { 0, 0, 0, 0 }, { 3, 3, 3, 3 }, { -2, -2 } }),
        is(new double[] { 0, 3, -2 }));
  }
}