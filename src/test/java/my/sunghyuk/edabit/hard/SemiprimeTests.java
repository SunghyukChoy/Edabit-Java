package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SemiprimeTests {

  @Test
  public void test1() {
    assertEquals("Semiprime", Challenge.semiprime(49));
  }

  @Test
  public void test2() {
    assertEquals("Squarefree Semiprime", Challenge.semiprime(15));
  }

  @Test
  public void test3() {
    assertEquals("Neither", Challenge.semiprime(19));
  }

  @Test
  public void test4() {
    assertEquals("Neither", Challenge.semiprime(75));
  }

  @Test
  public void test5() {
    assertEquals("Semiprime", Challenge.semiprime(169));
  }

  @Test
  public void test6() {
    assertEquals("Squarefree Semiprime", Challenge.semiprime(203));
  }

  @Test
  public void test7() {
    assertEquals("Squarefree Semiprime", Challenge.semiprime(177));
  }

  @Test
  public void test8() {
    assertEquals("Neither", Challenge.semiprime(125));
  }

  @Test
  public void test9() {
    assertEquals("Neither", Challenge.semiprime(70));
  }
}
