package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DuplicatesTests {
  @Test
  public void test1() {
    assertEquals(3, Challenge.duplicates("Hello World!"));
  }

  @Test
  public void test2() {
    assertEquals(0, Challenge.duplicates("birthday"));
  }

  @Test
  public void test3() {
    assertEquals(1, Challenge.duplicates("helicopter"));
  }

  @Test
  public void test4() {
    assertEquals(1, Challenge.duplicates("foobar"));
  }

  @Test
  public void test5() {
    assertEquals(14, Challenge.duplicates("The Quick Brown Fox Jumps Over the Lazy Dog"));
  }

  @Test
  public void test6() {
    assertEquals(1, Challenge.duplicates("donald trump"));
  }

  @Test
  public void test7() {
    assertEquals(77, Challenge.duplicates(
        "Row, row, row your boat Gently down the stream Merrily merrily, merrily, merrily Life is but a dream."));
  }

  @Test
  public void test8() {
    assertEquals(45, Challenge.duplicates("Gen'rals gathered in their masses,Just like witches at black masses"));
  }

  @Test
  public void test9() {
    assertEquals(43, Challenge.duplicates("Evil minds that plot destruction,Sorcerer of death's construction"));
  }

  @Test
  public void test10() {
    assertEquals(0, Challenge.duplicates("gamer"));
  }

  @Test
  public void test11() {
    assertEquals(3, Challenge.duplicates("gamer gang"));
  }
}