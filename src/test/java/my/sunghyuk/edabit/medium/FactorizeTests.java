package my.sunghyuk.edabit.medium;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class FactorizeTests {

  @Test
  public void test1() {
    assertThat(Challenge.factorize(12), is(new int[] { 1, 2, 3, 4, 6, 12 }));
  }

  @Test
  public void test2() {
    assertThat(Challenge.factorize(4), is(new int[] { 1, 2, 4 }));
  }

  @Test
  public void test3() {
    assertThat(Challenge.factorize(17), is(new int[] { 1, 17 }));
  }

  @Test
  public void test4() {
    assertThat(Challenge.factorize(24), is(new int[] { 1, 2, 3, 4, 6, 8, 12, 24 }));
  }

  @Test
  public void test5() {
    assertThat(Challenge.factorize(1), is(new int[] { 1 }));
  }
}