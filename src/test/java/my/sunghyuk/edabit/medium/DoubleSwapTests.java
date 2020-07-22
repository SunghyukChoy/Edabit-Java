package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DoubleSwapTests {
  @Test
  public void test1() {
    assertEquals("bbaaccc", Challenge.doubleSwap("aabbccc", 'a', 'b'));
  }

  @Test
  public void test2() {
    assertEquals("random w&rds writt#n h#r#", Challenge.doubleSwap("random w#rds writt&n h&r&", '#', '&'));
  }

  @Test
  public void test3() {
    assertEquals("129 985 556 799 888", Challenge.doubleSwap("128 895 556 788 999", '8', '9'));
  }

  @Test
  public void test4() {
    assertEquals("amaam aim", Challenge.doubleSwap("mamma mia", 'm', 'a'));
  }

  @Test
  public void test5() {
    assertEquals("##**##", Challenge.doubleSwap("**##**", '*', '#'));
  }

  @Test
  public void test6() {
    assertEquals("123546789", Challenge.doubleSwap("123456789", '4', '5'));
  }

  @Test
  public void test7() {
    assertEquals("&&556644", Challenge.doubleSwap("445566&&", '4', '&'));
  }

  @Test
  public void test8() {
    assertEquals("!?@.,", Challenge.doubleSwap("!?@,.", ',', '.'));
  }

  @Test
  public void test9() {
    assertEquals("T_T Q_Q =.= >.<", Challenge.doubleSwap("Q_Q T_T =.= >.<", 'Q', 'T'));
  }

  @Test
  public void test10() {
    assertEquals("><", Challenge.doubleSwap("<>", '>', '<'));
  }

  @Test
  public void test11() {
    assertEquals("110010", Challenge.doubleSwap("001101", '1', '0'));
  }
}