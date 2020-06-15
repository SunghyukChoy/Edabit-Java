package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaskifyTests {
  @Test
  public void test1() {
    assertEquals("############5616", Program.maskify("4556364607935616"));
  }
	
	@Test
  public void test2() {
    assertEquals("#######5616", Program.maskify("64607935616"));
  }
	
	@Test
  public void test3() {
    assertEquals("1", Program.maskify("1"));
  }
	
	@Test
  public void test4() {
    assertEquals("", Program.maskify(""));
  }
	
	@Test
  public void test5() {
    assertEquals("################;C~H", Program.maskify("tBy>L/cMe+?<j:6n;C~H"));
  }
	
	@Test
  public void test6() {
    assertEquals("12", Program.maskify("12"));
  }
	
	@Test
  public void test7() {
    assertEquals("##########################j7vJ", Program.maskify("8Ikhlf6yoxPOwi5cB014eWbRumj7vJ"));
  }
	
	@Test
  public void test8() {
    assertEquals("123", Program.maskify("123"));
  }
	
	@Test
  public void test9() {
    assertEquals("######=e\"_", Program.maskify(")E$aCU=e\"_"));
  }
	
	@Test
  public void test10() {
    assertEquals("######1408", Program.maskify("2673951408"));
  }
	
	@Test
  public void test11() {
    assertEquals("1234", Program.maskify("1234"));
  }
}