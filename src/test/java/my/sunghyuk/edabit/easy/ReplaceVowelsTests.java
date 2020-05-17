package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReplaceVowelsTests {
  @Test
  public void test1() {
    assertEquals("th# ##rdv#rk", EasyChallenge.replaceVowels("the aardvark", '#'));
  }
	
	@Test
  public void test2() {
    assertEquals("m?nn?? m??s?", EasyChallenge.replaceVowels("minnie mouse", '?'));
  }
	
	@Test
  public void test3() {
    assertEquals("sh*k*sp**r*", EasyChallenge.replaceVowels("shakespeare", '*'));
  }
	
	@Test
  public void test4() {
    assertEquals("<ll <s f<<r <n l<v< <nd w<r", EasyChallenge.replaceVowels("all is fair in love and war", '<'));
  }
}