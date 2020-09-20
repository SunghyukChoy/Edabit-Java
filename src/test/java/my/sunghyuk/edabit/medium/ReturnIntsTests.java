package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ReturnIntsTests {
  @Test
  public void test1() {
    assertThat(Program.returnInts(new Object[] { 9, 2, "space", "car", "lion", 16 }), is(new int[] { 9, 2, 16 }));
  }

  @Test
  public void test2() {
    assertThat(Program.returnInts(new Object[] { "hello", 81, "basketball", 123, "fox" }), is(new int[] { 81, 123 }));
  }

  @Test
  public void test3() {
    assertThat(Program.returnInts(new Object[] { 10, "121", 56, 20, "car", 3, "lion" }),
        is(new int[] { 10, 56, 20, 3 }));
  }

  @Test
  public void test4() {
    assertThat(Program.returnInts(new Object[] { "String", true, 3.3, 1 }), is(new int[] { 1 }));
  }
}
