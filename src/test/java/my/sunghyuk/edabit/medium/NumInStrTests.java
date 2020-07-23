package my.sunghyuk.edabit.medium;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class NumInStrTests {
  @Test
  public void test1() {
    assertThat(Challenge.numInStr(new String[] { "abc", "abc10" }), is(new String[] { "abc10" }));
  }

  @Test
  public void test2() {
    assertThat(Challenge.numInStr(new String[] { "abc", "ab10c", "a10bc", "bcd" }),
        is(new String[] { "ab10c", "a10bc" }));
  }

  @Test
  public void test3() {
    assertThat(Challenge.numInStr(new String[] { "1", "a", " ", "b" }), is(new String[] { "1" }));
  }

  @Test
  public void test4() {
    assertThat(Challenge.numInStr(new String[] { "rct", "ABC", "Test", "xYz" }), is(new String[] {}));
  }

  @Test
  public void test5() {
    assertThat(Challenge.numInStr(new String[] { "this IS", "10xYZ", "xy2K77", "Z1K2W0", "xYz" }),
        is(new String[] { "10xYZ", "xy2K77", "Z1K2W0" }));
  }

  @Test
  public void test6() {
    assertThat(Challenge.numInStr(new String[] { "-/>", "10bc", "abc " }), is(new String[] { "10bc" }));
  }
}