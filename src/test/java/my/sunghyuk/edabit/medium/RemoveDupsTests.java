package my.sunghyuk.edabit.medium;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class RemoveDupsTests {

  @Test
  public void test1() {
    assertThat(Program.removeDups(new String[] { "John", "Taylor", "John" }), is(new String[] { "John", "Taylor" }));
  }

  @Test
  public void test2() {
    assertThat(Program.removeDups(new String[] { "John", "Taylor", "John", "john" }),
        is(new String[] { "John", "Taylor", "john" }));
  }

  @Test
  public void test3() {
    assertThat(Program.removeDups(new String[] { "javascript", "python", "python", "ruby", "javascript", "c", "ruby" }),
        is(new String[] { "javascript", "python", "ruby", "c" }));
  }

  @Test
  public void test4() {
    assertThat(Program.removeDups(new int[] { 1, 2, 2, 2, 3, 2, 5, 2, 6, 6, 3, 7, 1, 2, 5 }),
        is(new int[] { 1, 2, 3, 5, 6, 7 }));
  }

  @Test
  public void test5() {
    assertThat(Program.removeDups(new String[] { "#", "#", "%", "&", "#", "$", "&" }),
        is(new String[] { "#", "%", "&", "$" }));
  }
}