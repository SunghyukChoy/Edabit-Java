package my.sunghyuk.edabit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GetWordTests {
  @Test
  public void test1() {
    assertEquals("Magazine", Challenge.getWord("maga", "zine"));
  }
	
	@Test
  public void test2() {
    assertEquals("Reliable", Challenge.getWord("reli", "able"));
  }
	
	@Test
  public void test3() {
    assertEquals("Implicit", Challenge.getWord("impl", "icit"));
  }
	
	@Test
  public void test4() {
    assertEquals("Document", Challenge.getWord("docu", "ment"));
  }
	
	@Test
  public void test5() {
    assertEquals("Opposite", Challenge.getWord("oppo", "site"));
  }
	
	@Test
  public void test6() {
    assertEquals("Official", Challenge.getWord("offi", "cial"));
  }
	
	@Test
  public void test7() {
    assertEquals("Disagree", Challenge.getWord("disa", "gree"));
  }
	
	@Test
  public void test8() {
    assertEquals("Accident", Challenge.getWord("acci", "dent"));
  }
	
	@Test
  public void test9() {
    assertEquals("Omission", Challenge.getWord("omis", "sion"));
  }
	
	@Test
  public void test10() {
    assertEquals("Vigorous", Challenge.getWord("vigo", "rous"));
  }
	
	@Test
  public void test11() {
    assertEquals("Predator", Challenge.getWord("pred", "ator"));
  }
	
	@Test
  public void test12() {
    assertEquals("Progress", Challenge.getWord("prog", "ress"));
  }
	
	@Test
  public void test13() {
    assertEquals("Invasion", Challenge.getWord("inva", "sion"));
  }
	
	@Test
  public void test14() {
    assertEquals("Farewell", Challenge.getWord("fare", "well"));
  }
	
	@Test
  public void test15() {
    assertEquals("Majority", Challenge.getWord("majo", "rity"));
  }
	
	@Test
  public void test16() {
    assertEquals("Personal", Challenge.getWord("pers", "onal"));
  }
	
	@Test
  public void test17() {
    assertEquals("Sequence", Challenge.getWord("sequ", "ence"));
  }
	
	@Test
  public void test18() {
    assertEquals("Governor", Challenge.getWord("gove", "rnor"));
  }
	
	@Test
  public void test19() {
    assertEquals("Ignorant", Challenge.getWord("igno", "rant"));
  }
	
	@Test
  public void test20() {
    assertEquals("Finished", Challenge.getWord("fini", "shed"));
  }
}