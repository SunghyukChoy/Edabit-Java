package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReturnTheEndOfNumberTests {
  @Test
  public void test1() {
    assertEquals("334-TH", Challenge.returnTheEndOfNumber(334));
  }

  @Test
  public void test2() {
    assertEquals("12341-ST", Challenge.returnTheEndOfNumber(12341));
  }

  @Test
  public void test3() {
    assertEquals("1-ST", Challenge.returnTheEndOfNumber(1));
  }

  @Test
  public void test4() {
    assertEquals("3222-ND", Challenge.returnTheEndOfNumber(3222));
  }

  @Test
  public void test5() {
    assertEquals("563-RD", Challenge.returnTheEndOfNumber(563));
  }

  @Test
  public void test6() {
    assertEquals("412-TH", Challenge.returnTheEndOfNumber(412));
  }

  @Test
  public void test7() {
    assertEquals("711-TH", Challenge.returnTheEndOfNumber(711));
  }

  @Test
  public void test8() {
    assertEquals("213-TH", Challenge.returnTheEndOfNumber(213));
  }
}
