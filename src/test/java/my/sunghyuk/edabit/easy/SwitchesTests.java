package my.sunghyuk.edabit.easy;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class SwitchesTests {

  /** 
  ================================= 
  TestGen 4.0 for JUnit 4.13.0 		
  Test Case: Flick::switches 
  Timestamp: 03/13/2021 08:31:18 AM 
  --------------------------------- 
  ® DARKKO 2021 © 
  ================================= 
  
  **/

  @Test
  public void test01() {
    assertArrayEquals(new Boolean[] { true, false, false, false },
        Challenge.switches(new Object[] { "edabit", "flick", "eda", "bit" }));
  }

  @Test
  public void test02() {
    assertArrayEquals(new Boolean[] { false, false, false, false },
        Challenge.switches(new Object[] { "flick", 11037, 3.14, 53 }));
  }

  @Test
  public void test03() {
    assertArrayEquals(new Boolean[] { true, true, false, false, true },
        Challenge.switches(new Object[] { false, false, "flick", "sheep", "flick" }));
  }

  @Test
  public void test04() {
    assertArrayEquals(new Boolean[] { true, false },
        Challenge.switches(new Object[] { new String[] { "john", "smith", "susan" }, "flick" }));
  }

  @Test
  public void test05() {
    assertArrayEquals(new Boolean[] { false, true, false, true, false },
        Challenge.switches(new Object[] { "flick", "flick", "flick", "flick", "flick" }));
  }

  @Test
  public void test06() {
    assertArrayEquals(new Boolean[] {}, Challenge.switches(new Object[] {}));
  }

}
// end of tests
// credit goes to the original author/publisher @Joshua Señoron
