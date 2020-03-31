package my.sunghyuk.edabit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DoubleCharTests {
  @Test
  public void test1() {
    assertEquals("SSttrriinngg", Program.doubleChar("String"));
  }

  @Test
  public void test2() {
    assertEquals("HHeelllloo  WWoorrlldd!!", Program.doubleChar("Hello World!"));
  }

  @Test
  public void test3() {
    assertEquals("11223344!!__  ", Program.doubleChar("1234!_ "));
  }

  @Test
  public void test4() {
    assertEquals("####^^&&%%%%**&&%%%%$$##@@@@!!", Program.doubleChar("##^&%%*&%%$#@@!"));
  }

  @Test
  public void test5() {
    assertEquals("ssccaannddaall", Program.doubleChar("scandal"));
  }

  @Test
  public void test6() {
    assertEquals("eeccoonnoommiiccss", Program.doubleChar("economics"));
  }

  @Test
  public void test7() {
    assertEquals("  ", Program.doubleChar(" "));
  }

  @Test
  public void test8() {
    assertEquals("______________", Program.doubleChar("_______"));
  }

  @Test
  public void test9() {
    assertEquals("eeqquuiipp  ggaalllloonn  rreeaadd", Program.doubleChar("equip gallon read"));
  }

  @Test
  public void test10() {
    assertEquals("bbaabbyy  iinnccrreeaassee", Program.doubleChar("baby increase"));
  }
}