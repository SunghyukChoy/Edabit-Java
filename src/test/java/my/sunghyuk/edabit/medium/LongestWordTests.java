package my.sunghyuk.edabit.medium;

/** 
 ------------------------------------- 
 CodeGen 1.3 for JUnit 4.13.0 		
 Test Case: WordLengths::longestWord 
 Timestamp: 10/18/2020 7:27:24 PM 
 ------------------------------------- 
 ® DARKKO 2020 © 
 
 **/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LongestWordTests {
  @Test
  public void test01() {
    assertEquals("darkness", Program.longestWord("Hello darkness my old friend."));
  }

  @Test
  public void test02() {
    assertEquals("Hello", Program.longestWord("Hello there mate."));
  }

  @Test
  public void test03() {
    assertEquals("Margaret's", Program.longestWord("Margaret's toy is a pretty doll."));
  }

  @Test
  public void test04() {
    assertEquals("forever.", Program.longestWord("A thing of beauty is a joy forever."));
  }

  @Test
  public void test05() {
    assertEquals("Forgetfulness", Program.longestWord("Forgetfulness is by all means powerless!"));
  }

  @Test
  public void test06() {
    assertEquals("'strengths'",
        Program.longestWord("The word 'strengths' is the longest and most commonly used word with a single vowel."));
  }

}
// end of tests
