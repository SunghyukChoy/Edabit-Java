package my.sunghyuk.edabit.medium;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class UniqueSortTests {
  @Test
  public void test1() {
    assertThat(Program.uniqueSort(new int[] { 1, 5, 8, 2, 3, 4, 4, 4, 10 }), is(new int[] { 1, 2, 3, 4, 5, 8, 10 }));
  }

  @Test
  public void test2() {
    assertThat(Program.uniqueSort(new int[] { 1, 2, 5, 4, 7, 7, 7 }), is(new int[] { 1, 2, 4, 5, 7 }));
  }

  @Test
  public void test3() {
    assertThat(Program.uniqueSort(new int[] { 7, 6, 5, 4, 3, 2, 1, 0, 1 }), is(new int[] { 0, 1, 2, 3, 4, 5, 6, 7 }));
  }

  @Test
  public void test4() {
    assertThat(Program.uniqueSort(new int[] { 3, 6, 5, 4, 3, 27, 1, 100, 1 }),
        is(new int[] { 1, 3, 4, 5, 6, 27, 100 }));
  }
}