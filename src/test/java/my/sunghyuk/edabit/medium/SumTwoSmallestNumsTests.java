package my.sunghyuk.edabit.medium;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class SumTwoSmallestNumsTests {

  @Test
  public void test1() {
    assertThat(Challenge.sumTwoSmallestNums(new int[] { 19, 5, 42, 2, 77 }), is(7));
  }

  @Test
  public void test2() {
    assertThat(Challenge.sumTwoSmallestNums(new int[] { 2, 9, 6, -1 }), is(8));
  }

  @Test
  public void test3() {
    assertThat(Challenge.sumTwoSmallestNums(new int[] { 879, 953, 694, -847, 342, 221, -91, -723, 791, -587 }),
        is(563));
  }

  @Test
  public void test4() {
    assertThat(Challenge.sumTwoSmallestNums(new int[] { 3683, 2902, 3951, -475, 1617, -2385 }), is(4519));
  }

  @Test
  public void test5() {
    assertThat(Challenge.sumTwoSmallestNums(new int[] { 280, 134, 108 }), is(242));
  }

  @Test
  public void test6() {
    assertThat(Challenge.sumTwoSmallestNums(new int[] { 280, 134, 108, 1 }), is(109));
  }

  @Test
  public void test7() {
    assertThat(Challenge.sumTwoSmallestNums(new int[] { 321, 406, -176 }), is(727));
  }

  @Test
  public void test8() {
    assertThat(Challenge.sumTwoSmallestNums(new int[] { 1, 1, 1, 1 }), is(2));
  }

  @Test
  public void test9() {
    assertThat(Challenge.sumTwoSmallestNums(new int[] { -1, -1, 1, 1 }), is(2));
  }
}