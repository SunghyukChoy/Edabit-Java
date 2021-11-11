package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HighestDigitTests {

  /** 
  ===================================== 
  TestGen 3.1 for JUnit 4.13.0 		
  Test Case: HighestDigit::highestDigit 
  Timestamp: 12/16/2020 09:03:49 PM 
  ------------------------------------- 
  ® DARKKO 2020 © 
  ===================================== 
  
  **/

  @Test
  public void test01() {
    assertEquals(6, Challenge.highestDigit(4666));
  }

  @Test
  public void test02() {
    assertEquals(5, Challenge.highestDigit(544));
  }

  @Test
  public void test03() {
    assertEquals(5, Challenge.highestDigit(51));
  }

  @Test
  public void test04() {
    assertEquals(0, Challenge.highestDigit(0));
  }

  @Test
  public void test05() {
    assertEquals(9, Challenge.highestDigit(7495037));
  }

  @Test
  public void test06() {
    assertEquals(2, Challenge.highestDigit(222222));
  }

}
// end of tests
