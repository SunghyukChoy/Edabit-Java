package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class DecimatorTests {
  @Test
  public void test1() {
    assertThat(Program.decimator("1234567890"), is("123456789"));
  }

  @Test
  public void test2() {
    assertThat(Program.decimator("1234567890AB"), is("1234567890"));
  }

  @Test
  public void test3() {
    assertThat(Program.decimator("123"), is("12"));
  }

  @Test
  public void test4() {
    assertThat(Program.decimator("123456789012345678901"), is("123456789012345678"));
  }

  @Test
  public void test5() {
    assertThat(Program.decimator("ABCDEFGHIJKLMNOPQRSTUVWXYZ"), is("ABCDEFGHIJKLMNOPQRSTUVW"));
  }

  @Test
  public void test6() {
    assertThat(Program.decimator("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"),
        is("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrst"));
  }

  @Test
  public void test7() {
    assertThat(Program.decimator("A"), is(""));
  }

  @Test
  public void test8() {
    assertThat(Program.decimator(""), is(""));
  }
}
