package my.sunghyuk.edabit.easy;

/** 
 ==================================== 
 TestGen 2.1 for JUnit 4.13.0 		
 Test Case: WordEmphasis::emphasize 
 Timestamp: 11/7/2020 5:12:34 AM 
 ------------------------------------ 
 ® DARKKO 2020 © 
 ==================================== 
 **/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EmphasizeTests {

  @Test
  public void test01() {
    assertEquals("I Am, But All Yours, Tesh!", Program.emphasize("I AM, BUT aLL yOuRs, TESH!"));
  }

  @Test
  public void test02() {
    assertEquals("Truly A Masterpiece!", Program.emphasize("truly a masterpiece!"));
  }

  @Test
  public void test03() {
    assertEquals("Hello World!", Program.emphasize("hello world!"));
  }

  @Test
  public void test04() {
    assertEquals("Good Morning.", Program.emphasize("GOOD MORNING."));
  }

  @Test
  public void test05() {
    assertEquals("99 Red Balloons.", Program.emphasize("99 Red Balloons."));
  }

  @Test
  public void test06() {
    assertEquals("1 2 3 4 5 6 7 8 9", Program.emphasize("1 2 3 4 5 6 7 8 9"));
  }

  @Test
  public void test07() {
    assertEquals("", Program.emphasize(""));
  }

  @Test
  public void test08() {
    assertEquals("Joshua Senoron", Program.emphasize("joshua senoron"));
  }

  @Test
  public void test09() {
    assertEquals("You Just Did It!", Program.emphasize("yOU jUst dId It!"));
  }

  @Test
  public void test10() {
    assertEquals("Where To Diane?", Program.emphasize("whErE tO DIANE?"));
  }
}