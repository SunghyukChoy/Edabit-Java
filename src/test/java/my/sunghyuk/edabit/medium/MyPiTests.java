package my.sunghyuk.edabit.medium;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class MyPiTests {

  @Test
  public void test1() {
    assertThat(Program.myPi(0), is(3.0));
  }

  @Test
  public void test2() {
    assertThat(Program.myPi(1), is(3.1));
  }

  @Test
  public void test3() {
    assertThat(Program.myPi(2), is(3.14));
  }

  @Test
  public void test4() {
    assertThat(Program.myPi(3), is(3.142));
  }

  @Test
  public void test5() {
    assertThat(Program.myPi(4), is(3.1416));
  }

  @Test
  public void test6() {
    assertThat(Program.myPi(5), is(3.14159));
  }

  @Test
  public void test7() {
    assertThat(Program.myPi(6), is(3.141593));
  }

  @Test
  public void test8() {
    assertThat(Program.myPi(7), is(3.1415927));
  }

  @Test
  public void test9() {
    assertThat(Program.myPi(8), is(3.14159265));
  }

  @Test
  public void test10() {
    assertThat(Program.myPi(9), is(3.141592654));
  }

  @Test
  public void test11() {
    assertThat(Program.myPi(10), is(3.1415926536));
  }

  @Test
  public void test12() {
    assertThat(Program.myPi(11), is(3.14159265359));
  }

  @Test
  public void test13() {
    assertThat(Program.myPi(12), is(3.141592653590));
  }

  @Test
  public void test14() {
    assertThat(Program.myPi(13), is(3.1415926535898));
  }

  @Test
  public void test15() {
    assertThat(Program.myPi(14), is(3.14159265358979));
  }

  @Test
  public void test16() {
    assertThat(Program.myPi(15), is(3.141592653589793));
  }
}