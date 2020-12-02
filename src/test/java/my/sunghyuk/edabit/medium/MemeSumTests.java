package my.sunghyuk.edabit.medium;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class MemeSumTests {

  @Test
  public void test1() {
    assertThat(Challenge.memeSum(2, 11), is(13));
  }

  @Test
  public void test2() {
    assertThat(Challenge.memeSum(0, 1), is(1));
  }

  @Test
  public void test3() {
    assertThat(Challenge.memeSum(0, 0), is(0));
  }

  @Test
  public void test4() {
    assertThat(Challenge.memeSum(16, 18), is(214));
  }

  @Test
  public void test5() {
    assertThat(Challenge.memeSum(26, 39), is(515));
  }

  @Test
  public void test6() {
    assertThat(Challenge.memeSum(122, 81), is(1103));
  }

  @Test
  public void test7() {
    assertThat(Challenge.memeSum(1222, 30277), is(31499));
  }

  @Test
  public void test8() {
    assertThat(Challenge.memeSum(38810, 1383), is(391193));
  }

  @Test
  public void test9() {
    assertThat(Challenge.memeSum(1236, 30977), is(31111013));
  }

  @Test
  public void test10() {
    assertThat(Challenge.memeSum(49999, 49999), is(818181818));
  }
}

// Mubashir
