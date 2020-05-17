package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class HashPlusCountTests {
  @Test
  public void test1() {
    assertThat(Challenge.hashPlusCount("####"), is(new int[] { 4, 0 }));
  }

  @Test
  public void test2() {
    assertThat(Challenge.hashPlusCount("#"), is(new int[] { 1, 0 }));
  }

  @Test
  public void test3() {
    assertThat(Challenge.hashPlusCount("+++++++"), is(new int[] { 0, 7 }));
  }

  @Test
  public void test4() {
    assertThat(Challenge.hashPlusCount("++"), is(new int[] { 0, 2 }));
  }

  @Test
  public void test5() {
    assertThat(Challenge.hashPlusCount("#+#+"), is(new int[] { 2, 2 }));
  }

  @Test
  public void test6() {
    assertThat(Challenge.hashPlusCount("###+"), is(new int[] { 3, 1 }));
  }

  @Test
  public void test7() {
    assertThat(Challenge.hashPlusCount("##+++#"), is(new int[] { 3, 3 }));
  }

  @Test
  public void test8() {
    assertThat(Challenge.hashPlusCount("#+++#+#++#"), is(new int[] { 4, 6 }));
  }

  @Test
  public void test9() {
    assertThat(Challenge.hashPlusCount(""), is(new int[] { 0, 0 }));
  }
}