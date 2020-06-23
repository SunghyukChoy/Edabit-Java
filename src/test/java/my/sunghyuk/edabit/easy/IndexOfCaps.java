package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class IndexOfCaps {
  @Test
  public void test1() {
    assertThat(Program.indexOfCaps("eDaBiT"), is(new int[] { 1, 3, 5 }));
  }

  @Test
  public void test2() {
    assertThat(Program.indexOfCaps("eQuINoX"), is(new int[] { 1, 3, 4, 6 }));
  }

  @Test
  public void test3() {
    assertThat(Program.indexOfCaps("determine"), is(new int[] {}));
  }

  @Test
  public void test4() {
    assertThat(Program.indexOfCaps("STRIKE"), is(new int[] { 0, 1, 2, 3, 4, 5 }));
  }

  @Test
  public void test5() {
    assertThat(Program.indexOfCaps("sUn"), is(new int[] { 1 }));
  }

  @Test
  public void test6() {
    assertThat(Program.indexOfCaps("SpiDer"), is(new int[] { 0, 3 }));
  }

  @Test
  public void test7() {
    assertThat(Program.indexOfCaps("accOmpAnY"), is(new int[] { 3, 6, 8 }));
  }

  @Test
  public void test8() {
    assertThat(Program.indexOfCaps("@xCE#8S#i*$en"), is(new int[] { 2, 3, 6 }));
  }

  @Test
  public void test9() {
    assertThat(Program.indexOfCaps("1854036297"), is(new int[] {}));
  }

  @Test
  public void test10() {
    assertThat(Program.indexOfCaps("Fo?.arg~{86tUx=|OqZ!"), is(new int[] { 0, 12, 16, 18 }));
  }

}