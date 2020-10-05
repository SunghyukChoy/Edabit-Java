
package my.sunghyuk.edabit.hard;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class IsExactTests {

  private long[] numVector = new long[] { 6, 24, 120, 5040, 40320, 3628800, 20922789888000L, 125, 721, 1024,
      41845579776000L };
  private long[][] resVector = new long[][] { { 6, 3 }, { 24, 4 }, { 120, 5 }, { 5040, 7 }, { 40320, 8 },
      { 3628800, 10 }, { 20922789888000L, 16 }, {}, {}, {}, {} };

  @Test
  public void test1() {
    assertArrayEquals(Program.isExact(numVector[0]), resVector[0]);
  }

  @Test
  public void test2() {
    assertArrayEquals(Program.isExact(numVector[1]), resVector[1]);
  }

  @Test
  public void test3() {
    assertArrayEquals(Program.isExact(numVector[2]), resVector[2]);
  }

  @Test
  public void test4() {
    assertArrayEquals(Program.isExact(numVector[3]), resVector[3]);
  }

  @Test
  public void test5() {
    assertArrayEquals(Program.isExact(numVector[4]), resVector[4]);
  }

  @Test
  public void test6() {
    assertArrayEquals(Program.isExact(numVector[5]), resVector[5]);
  }

  @Test
  public void test7() {
    assertArrayEquals(Program.isExact(numVector[6]), resVector[6]);
  }

  @Test
  public void test8() {
    assertArrayEquals(Program.isExact(numVector[7]), resVector[7]);
  }

  @Test
  public void test9() {
    assertArrayEquals(Program.isExact(numVector[8]), resVector[8]);
  }

  @Test
  public void test10() {
    assertArrayEquals(Program.isExact(numVector[9]), resVector[9]);
  }

  @Test
  public void test11() {
    assertArrayEquals(Program.isExact(numVector[10]), resVector[10]);
  }
}
