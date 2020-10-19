package my.sunghyuk.edabit.medium;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class UnrepeatedTests {
  @Test
  public void test1() {
    assertThat(Challenge.unrepeated("hello"), is("helo"));
  }

  @Test
  public void test2() {
    assertThat(Challenge.unrepeated("WWEE!!"), is("WE!"));
  }

  @Test
  public void test3() {
    assertThat(Challenge.unrepeated("call 911"), is("cal 91"));
  }

  @Test
  public void test4() {
    assertThat(Challenge.unrepeated("aaaaaa"), is("a"));
  }

  @Test
  public void test5() {
    assertThat(Challenge.unrepeated("altwaff test"), is("altwf es"));
  }
}
