package my.sunghyuk.edabit.easy;

/** 
 =================================== 
 TestGen 3.1 for JUnit 4.13.0 		
 Test Case: RemoveLetters::removeABC 
 Timestamp: 11/29/2020 02:38:07 AM 
 ----------------------------------- 
 ® DARKKO 2020 © 
 =================================== 
 
 **/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RemoveABCTests {

  @Test
  public void test01() {
    assertEquals("Tesh is my world", Program.removeABC("Tesha is my world"));
  }

  @Test
  public void test02() {
    assertEquals("I just n't stop wnting you", Program.removeABC("I just can't stop wanting you"));
  }

  @Test
  public void test03() {
    assertEquals("This might e  it hrd", Program.removeABC("This might be a bit hard"));
  }

  @Test
  public void test04() {
    assertEquals("This is wesome", Program.removeABC("This is awesome"));
  }

  @Test
  public void test05() {
    assertEquals(null, Program.removeABC("hello world!"));
  }

  @Test
  public void test06() {
    assertEquals("oding is fun!", Program.removeABC("coding is fun!"));
  }

  @Test
  public void test07() {
    assertEquals(null, Program.removeABC(""));
  }

  @Test
  public void test08() {
    assertEquals(null, Program.removeABC("The world is not enough"));
  }

}
// end of tests
