package my.sunghyuk.edabit.hard;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class ReorderDigitsTests {
  @Test
  public void test1() {
    assertThat(Challenge.reorderDigits(new int[] { 515, 341, 98, 44, 211 }, "asc"),
        is(new int[] { 155, 134, 89, 44, 112 }));
  }

  @Test
  public void test2() {
    assertThat(Challenge.reorderDigits(new int[] { 515, 341, 98, 44, 211 }, "desc"),
        is(new int[] { 551, 431, 98, 44, 211 }));
  }

  @Test
  public void test3() {
    assertThat(Challenge.reorderDigits(new int[] { 63251, 78221 }, "asc"), is(new int[] { 12356, 12278 }));
  }

  @Test
  public void test4() {
    assertThat(Challenge.reorderDigits(new int[] { 63251, 78221 }, "desc"), is(new int[] { 65321, 87221 }));
  }

  @Test
  public void test5() {
    assertThat(Challenge.reorderDigits(new int[] { 1, 2, 3, 4 }, "asc"), is(new int[] { 1, 2, 3, 4 }));
  }

  @Test
  public void test6() {
    assertThat(Challenge.reorderDigits(new int[] { 1, 2, 3, 4 }, "desc"), is(new int[] { 1, 2, 3, 4 }));
  }

  @Test
  public void test7() {
    assertThat(Challenge.reorderDigits(new int[] { 12, 21, 15, 51 }, "asc"), is(new int[] { 12, 12, 15, 15 }));
  }

  @Test
  public void test8() {
    assertThat(Challenge.reorderDigits(new int[] { 12, 21, 15, 51 }, "desc"), is(new int[] { 21, 21, 51, 51 }));
  }
}
