package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DoubleCharTests {
  @Test
  public void test1() {
    assertEquals("SSttrriinngg", EasyProgram.doubleChar("String"));
  }

  @Test
  public void test2() {
    assertEquals("HHeelllloo  WWoorrlldd!!", EasyProgram.doubleChar("Hello World!"));
  }

  @Test
  public void test3() {
    assertEquals("11223344!!__  ", EasyProgram.doubleChar("1234!_ "));
  }

  @Test
  public void test4() {
    assertEquals("####^^&&%%%%**&&%%%%$$##@@@@!!", EasyProgram.doubleChar("##^&%%*&%%$#@@!"));
  }

  @Test
  public void test5() {
    assertEquals("ssccaannddaall", EasyProgram.doubleChar("scandal"));
  }

  @Test
  public void test6() {
    assertEquals("eeccoonnoommiiccss", EasyProgram.doubleChar("economics"));
  }

  @Test
  public void test7() {
    assertEquals("  ", EasyProgram.doubleChar(" "));
  }

  @Test
  public void test8() {
    assertEquals("______________", EasyProgram.doubleChar("_______"));
  }

  @Test
  public void test9() {
    assertEquals("eeqquuiipp  ggaalllloonn  rreeaadd", EasyProgram.doubleChar("equip gallon read"));
  }

  @Test
  public void test10() {
    assertEquals("bbaabbyy  iinnccrreeaassee", EasyProgram.doubleChar("baby increase"));
  }
}