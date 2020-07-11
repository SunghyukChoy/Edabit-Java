package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsPrimeTests {

  @Test
  public void test1() {
    assertEquals(false, Program.isPrime(1));
  }

  @Test
  public void test2() {
    assertEquals(true, Program.isPrime(2));
  }

  @Test
  public void test3() {
    assertEquals(true, Program.isPrime(3));
  }

  @Test
  public void test4() {
    assertEquals(false, Program.isPrime(4));
  }

  @Test
  public void test5() {
    assertEquals(true, Program.isPrime(5));
  }

  @Test
  public void test6() {
    assertEquals(false, Program.isPrime(6));
  }

  @Test
  public void test7() {
    assertEquals(true, Program.isPrime(7));
  }

  @Test
  public void test8() {
    assertEquals(false, Program.isPrime(8));
  }

  @Test
  public void test9() {
    assertEquals(false, Program.isPrime(9));
  }

  @Test
  public void test10() {
    assertEquals(false, Program.isPrime(10));
  }

  @Test
  public void test11() {
    assertEquals(true, Program.isPrime(11));
  }

  @Test
  public void test12() {
    assertEquals(false, Program.isPrime(102));
  }

  @Test
  public void test13() {
    assertEquals(true, Program.isPrime(103));
  }
}