package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SayHelloByeTests {
  @Test
  public void test1() {
    assertEquals("Hello Jose", EasyChallenge.sayHelloBye("jose", 1));
  }
	
	@Test
  public void test2() {
    assertEquals("Hello Barry", EasyChallenge.sayHelloBye("barry", 1));
  }
	
	@Test
  public void test3() {
    assertEquals("Bye Jon", EasyChallenge.sayHelloBye("jon", 0));
  }
	
	@Test
  public void test4() {
    assertEquals("Hello Khloy", EasyChallenge.sayHelloBye("khloy", 1));
  }
	
	@Test
  public void test5() {
    assertEquals("Bye Sara", EasyChallenge.sayHelloBye("sara", 0));
  }
	
	@Test
  public void test6() {
    assertEquals("Bye Jon", EasyChallenge.sayHelloBye("Jon", 0));
  }
	
	@Test
  public void test7() {
    assertEquals("Hello Matt", EasyChallenge.sayHelloBye("Matt", 1));
  }
}