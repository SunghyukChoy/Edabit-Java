package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GetWordTests {
  @Test
  public void test1() {
    assertEquals("Magazine", EasyChallenge.getWord("maga", "zine"));
  }
	
	@Test
  public void test2() {
    assertEquals("Reliable", EasyChallenge.getWord("reli", "able"));
  }
	
	@Test
  public void test3() {
    assertEquals("Implicit", EasyChallenge.getWord("impl", "icit"));
  }
	
	@Test
  public void test4() {
    assertEquals("Document", EasyChallenge.getWord("docu", "ment"));
  }
	
	@Test
  public void test5() {
    assertEquals("Opposite", EasyChallenge.getWord("oppo", "site"));
  }
	
	@Test
  public void test6() {
    assertEquals("Official", EasyChallenge.getWord("offi", "cial"));
  }
	
	@Test
  public void test7() {
    assertEquals("Disagree", EasyChallenge.getWord("disa", "gree"));
  }
	
	@Test
  public void test8() {
    assertEquals("Accident", EasyChallenge.getWord("acci", "dent"));
  }
	
	@Test
  public void test9() {
    assertEquals("Omission", EasyChallenge.getWord("omis", "sion"));
  }
	
	@Test
  public void test10() {
    assertEquals("Vigorous", EasyChallenge.getWord("vigo", "rous"));
  }
	
	@Test
  public void test11() {
    assertEquals("Predator", EasyChallenge.getWord("pred", "ator"));
  }
	
	@Test
  public void test12() {
    assertEquals("Progress", EasyChallenge.getWord("prog", "ress"));
  }
	
	@Test
  public void test13() {
    assertEquals("Invasion", EasyChallenge.getWord("inva", "sion"));
  }
	
	@Test
  public void test14() {
    assertEquals("Farewell", EasyChallenge.getWord("fare", "well"));
  }
	
	@Test
  public void test15() {
    assertEquals("Majority", EasyChallenge.getWord("majo", "rity"));
  }
	
	@Test
  public void test16() {
    assertEquals("Personal", EasyChallenge.getWord("pers", "onal"));
  }
	
	@Test
  public void test17() {
    assertEquals("Sequence", EasyChallenge.getWord("sequ", "ence"));
  }
	
	@Test
  public void test18() {
    assertEquals("Governor", EasyChallenge.getWord("gove", "rnor"));
  }
	
	@Test
  public void test19() {
    assertEquals("Ignorant", EasyChallenge.getWord("igno", "rant"));
  }
	
	@Test
  public void test20() {
    assertEquals("Finished", EasyChallenge.getWord("fini", "shed"));
  }
}