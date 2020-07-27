package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsApocalypticTests {
  @Test
  public void test1() {
    assertEquals("Safe", Challenge.isApocalyptic(66));
  }

  @Test
  public void test2() {
    assertEquals("Single", Challenge.isApocalyptic(157));
  }

  @Test
  public void test3() {
    assertEquals("Double", Challenge.isApocalyptic(220));
  }

  @Test
  public void test4() {
    assertEquals("Triple", Challenge.isApocalyptic(931));
  }

  @Test
  public void test5() {
    assertEquals("Safe", Challenge.isApocalyptic(166));
  }

  @Test
  public void test6() {
    assertEquals("Double", Challenge.isApocalyptic(529));
  }

  @Test
  public void test7() {
    assertEquals("Single", Challenge.isApocalyptic(443));
  }

  @Test
  public void test8() {
    assertEquals("Safe", Challenge.isApocalyptic(166));
  }

  @Test
  public void test9() {
    assertEquals("Safe", Challenge.isApocalyptic(703));
  }

  @Test
  public void test10() {
    assertEquals("Single", Challenge.isApocalyptic(528));
  }

  @Test
  public void test11() {
    assertEquals("Double", Challenge.isApocalyptic(648));
  }
}