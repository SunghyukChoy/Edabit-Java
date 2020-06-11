package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StripSentenceTests {
  @Test
  public void test1() {
    assertEquals("th qck brwn fx jmps vr th lzy dg", Challenge.stripSentence("the quick brown fox jumps over the lazy dog", "aeiou"));
  }
	
	@Test
  public void test2() {
    assertEquals("the hiing nake initerly lither acro the rutling leave", Challenge.stripSentence("the hissing snakes sinisterly slither across the rustling leaves", "s"));
  }
	
	@Test
  public void test3() {
    assertEquals("", Challenge.stripSentence("gone, reduced to atoms", "go, muscat nerd"));
  }
	
	@Test
  public void test4() {
    assertEquals("uh oh i made a typo please fix it for me", Challenge.stripSentence("uh oh i made a typo please fixq it for me", "q"));
  }
	
	@Test
  public void test5() {
    assertEquals("phinx of black quartz, ude my vo!", Challenge.stripSentence("sphinx of black quartz, judge my vow!", "sgwj"));
  }
	
	@Test
  public void test6() {
    assertEquals("eclamation marks and the letter  are really annoying", Challenge.stripSentence("exclamation! marks! and! the! letter! x! arxxxxxxxxexxxxxx! rxxexxxallxxxxy! anxxxnoxyixxxxxxxngxxxxxx!xx", "x!"));
  }
	
	@Test
  public void test7() {
    assertEquals("!!!!!!!!!!!!!!!!!!!!!!!", Challenge.stripSentence("!!!!!!!!!!!!!!!!!!!!!!!", "?"));
  }
	
	@Test
  public void test8() {
    assertEquals("c r e p e s", Challenge.stripSentence("cat rat eat pat eat sat", "at"));
  }
	
	@Test
  public void test9() {
    assertEquals("abc", Challenge.stripSentence("abc", "def"));
  }
	
	@Test
  public void test10() {
    assertEquals("llegro ndnte", Challenge.stripSentence("allegro andante", "aaaaaaaaa"));
  }  
}