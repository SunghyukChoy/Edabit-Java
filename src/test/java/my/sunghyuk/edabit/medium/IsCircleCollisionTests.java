package my.sunghyuk.edabit.medium;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class IsCircleCollisionTests {
  @Test
  public void test1() {
    assertThat(Program.isCircleCollision(new int[] { 10, 0, 0 }, new int[] { 10, 10, 10 }), is(true));
  }

  @Test
  public void test2() {
    assertThat(Program.isCircleCollision(new int[] { 10, 0, 0 }, new int[] { 5, 0, 0 }), is(true));
  }

  @Test
  public void test3() {
    assertThat(Program.isCircleCollision(new int[] { 1, 0, 0 }, new int[] { 1, 0, 0 }), is(true));
  }

  @Test
  public void test4() {
    assertThat(Program.isCircleCollision(new int[] { 5, 0, 0 }, new int[] { 5, 10, 10 }), is(false));
  }

  @Test
  public void test5() {
    assertThat(Program.isCircleCollision(new int[] { 1, 0, 0 }, new int[] { 1, 10, 10 }), is(false));
  }
}
