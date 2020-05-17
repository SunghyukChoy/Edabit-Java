package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Random;

public class GetMiddleTests {
  @Test
  public void test1() {
		assertEquals("es", EasyChallenge.getMiddle("test"));
  }
	
	@Test
  public void test2() {
		assertEquals("t", EasyChallenge.getMiddle("testing"));
  }
	
	@Test
  public void test3() {
		assertEquals("dd", EasyChallenge.getMiddle("middle"));
  }
	
	@Test
  public void test4() {
		assertEquals("A", EasyChallenge.getMiddle("A"));
  }
	
	@Test
  public void test5() {
		assertEquals("bi", EasyChallenge.getMiddle("inhabitant"));
  }
	
	@Test
  public void test6() {
		assertEquals("o", EasyChallenge.getMiddle("brown"));
  }
	
	@Test
  public void test7() {
		assertEquals("aw", EasyChallenge.getMiddle("pawn"));
  }
	
	@Test
  public void test8() {
		assertEquals("i", EasyChallenge.getMiddle("cabinet"));
  }
	
	@Test
  public void test9() {
		assertEquals("e", EasyChallenge.getMiddle("fresh"));
  }
  
  private String middle(String word) {
    int mid = word.length() / 2;
    return (word.length() % 2 == 1 ? word.substring(mid, mid+1) : word.substring(mid-1, mid+1));
  }
  
  @Test
  public void randTests() {
    Random randGen = new Random();
    String alph = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    for (int i = 0; i < 50; i++) {
      int randLength = randGen.nextInt(1000)+1;
      String testWord = "";
      for (int e = 0; e < randLength; e++) {
        int alphI = randGen.nextInt(alph.length());
        testWord += alph.substring(alphI, alphI+1);
      }
      String expected = middle(testWord);
      String actual = EasyChallenge.getMiddle(testWord);
      assertEquals("Middle of " + testWord + " is " + expected + " not " + actual, expected, actual);
    }
  }
}