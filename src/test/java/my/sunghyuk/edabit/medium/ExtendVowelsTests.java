package my.sunghyuk.edabit.medium;

/** 
 =================================== 
 TestGen 3.1 for JUnit 4.13.0 		
 Test Case: WordVowels::extendVowels 
 Timestamp: 11/29/2020 02:41:01 PM 
 ----------------------------------- 
 ® DARKKO 2020 © 
 =================================== 
 
 **/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ExtendVowelsTests {

  @Test
  public void test01() {
    assertEquals("Teeeeeeshaaaaaa", Program.extendVowels("Tesha", 5));
  }

  @Test
  public void test02() {
    assertEquals("Looooveeees", Program.extendVowels("Loves", 3));
  }

  @Test
  public void test03() {
    assertEquals("Xaaaaaaaviiiiiiieeeeeeer", Program.extendVowels("Xavier", 6));
  }

  @Test
  public void test04() {
    assertEquals("Heeeeeelloooooo", Program.extendVowels("Hello", 5));
  }

  @Test
  public void test05() {
    assertEquals("EEEEdaaaabiiiit", Program.extendVowels("Edabit", 3));
  }

  @Test
  public void test06() {
    assertEquals("Extend", Program.extendVowels("Extend", 0));
  }

  @Test
  public void test07() {
    assertEquals("invalid", Program.extendVowels("Shorten", -3));
  }

  @Test
  public void test08() {
    assertEquals("Teeeeesh", Program.extendVowels("Tesh", 4));
  }

  @Test
  public void test09() {
    assertEquals("Feels", Program.extendVowels("Feels", 0));
  }

  @Test
  public void test10() {
    assertEquals("Deeeeeeeeeep", Program.extendVowels("Deep", 4));
  }

  @Test
  public void test11() {
    assertEquals("invalid", Program.extendVowels("Concise", -5));
  }

  @Test
  public void test12() {
    assertEquals("Woooooooorld", Program.extendVowels("World", 7));
  }

  @Test
  public void test13() {
    assertEquals("Coooodiiiing", Program.extendVowels("Coding", 3));
  }

  @Test
  public void test14() {
    assertEquals("Waaaiiitiiing", Program.extendVowels("Waiting", 2));
  }

}
// end of tests
