package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlusSignTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.plusSign("+f+d+c+#+f+"));
  }

  @Test
  public void test2() {
    assertEquals(true, Challenge.plusSign("+d+=3=+s+"));
  }

  @Test
  public void test3() {
    assertEquals(false, Challenge.plusSign("+d+k+##f+"));
  }

  @Test
  public void test4() {
    assertEquals(false, Challenge.plusSign("hf+d++#+f+"));
  }

  @Test
  public void test5() {
    assertEquals(true, Challenge.plusSign("+d+i+#+c+"));
  }

  @Test
  public void test6() {
    assertEquals(false, Challenge.plusSign("a+"));
  }

  @Test
  public void test7() {
    assertEquals(false, Challenge.plusSign("f++d+g+8+"));
  }

  @Test
  public void test8() {
    assertEquals(false, Challenge.plusSign("+s+7+fg+r+8+"));
  }

  @Test
  public void test9() {
    assertEquals(false, Challenge.plusSign("aa++"));
  }
}