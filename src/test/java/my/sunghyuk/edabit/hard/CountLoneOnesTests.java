package my.sunghyuk.edabit.hard;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CountLoneOnesTests {

  @Test
  public void test1() {
    assertEquals(Challenge.countLoneOnes(101), 2);
  }

  @Test
  public void test2() {
    assertEquals(Challenge.countLoneOnes(1191), 1);
  }

  @Test
  public void test3() {
    assertEquals(Challenge.countLoneOnes(12131415161718191L), 9);
  }

  @Test
  public void test4() {
    assertEquals(Challenge.countLoneOnes(11231212111L), 2);
  }

  @Test
  public void test5() {
    assertEquals(Challenge.countLoneOnes(1), 1);
  }

  @Test
  public void test6() {
    assertEquals(Challenge.countLoneOnes(0), 0);
  }

  @Test
  public void test7() {
    assertEquals(Challenge.countLoneOnes(1111), 0);
  }

  @Test
  public void test8() {
    assertEquals(Challenge.countLoneOnes(11101), 1);
  }

  @Test
  public void test9() {
    assertEquals(Challenge.countLoneOnes(462), 0);
  }

  @Test
  public void test10() {
    assertEquals(Challenge.countLoneOnes(101010101), 5);
  }
}
