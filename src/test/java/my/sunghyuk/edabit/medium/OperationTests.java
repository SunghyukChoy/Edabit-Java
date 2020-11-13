package my.sunghyuk.edabit.medium;

/** 
 ==================================== 
 TestGen 2.3 for JUnit 4.13.0 		
 Test Case: BasicOperation::operation 
 Timestamp: 11/10/2020 7:19:52 AM 
 ------------------------------------ 
 ® DARKKO 2020 © 
 ====================================
 **/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OperationTests {

  @Test
  public void test01() {
    assertEquals(3, Program.operation("1", "2", "add"));
  }

  @Test
  public void test02() {
    assertEquals(-19, Program.operation("1", "-20", "add"));
  }

  @Test
  public void test03() {
    assertEquals(-2147483648, Program.operation("9", "0", "divide"));
  }

  @Test
  public void test04() {
    assertEquals(100, Program.operation("10", "10", "multiply"));
  }

  @Test
  public void test05() {
    assertEquals(100, Program.operation("-10", "-10", "multiply"));
  }

  @Test
  public void test06() {
    assertEquals(0, Program.operation("10", "10", "subtract"));
  }

  @Test
  public void test07() {
    assertEquals(0, Program.operation("0", "0", "subtract"));
  }

  @Test
  public void test08() {
    assertEquals(0, Program.operation("0", "1", "divide"));
  }

  @Test
  public void test09() {
    assertEquals(0, Program.operation("0", "25415", "divide"));
  }
}