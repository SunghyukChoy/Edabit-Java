package my.sunghyuk.edabit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReplaceVowelsTests {
  @Test
  public void test1() {
    assertEquals("th# ##rdv#rk", Challenge.replaceVowels("the aardvark", '#'));
  }
	
	@Test
  public void test2() {
    assertEquals("m?nn?? m??s?", Challenge.replaceVowels("minnie mouse", '?'));
  }
	
	@Test
  public void test3() {
    assertEquals("sh*k*sp**r*", Challenge.replaceVowels("shakespeare", '*'));
  }
	
	@Test
  public void test4() {
    assertEquals("<ll <s f<<r <n l<v< <nd w<r", Challenge.replaceVowels("all is fair in love and war", '<'));
  }
}