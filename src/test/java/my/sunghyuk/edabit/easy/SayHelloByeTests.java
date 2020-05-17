package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SayHelloByeTests {
  @Test
  public void test1() {
    assertEquals("Hello Jose", Challenge.sayHelloBye("jose", 1));
  }
	
	@Test
  public void test2() {
    assertEquals("Hello Barry", Challenge.sayHelloBye("barry", 1));
  }
	
	@Test
  public void test3() {
    assertEquals("Bye Jon", Challenge.sayHelloBye("jon", 0));
  }
	
	@Test
  public void test4() {
    assertEquals("Hello Khloy", Challenge.sayHelloBye("khloy", 1));
  }
	
	@Test
  public void test5() {
    assertEquals("Bye Sara", Challenge.sayHelloBye("sara", 0));
  }
	
	@Test
  public void test6() {
    assertEquals("Bye Jon", Challenge.sayHelloBye("Jon", 0));
  }
	
	@Test
  public void test7() {
    assertEquals("Hello Matt", Challenge.sayHelloBye("Matt", 1));
  }
}