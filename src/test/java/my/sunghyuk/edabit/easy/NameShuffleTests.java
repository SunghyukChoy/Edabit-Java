package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class NameShuffleTests {
  @Test
  public void test1() {
    assertEquals("Trump Donald", EasyProgram.nameShuffle("Donald Trump"));
  }
	
	@Test
  public void test2() {
    assertEquals("O'Donnel Rosie", EasyProgram.nameShuffle("Rosie O'Donnel"));
  }
	
	@Test
  public void test3() {
    assertEquals("Butts Seymour", EasyProgram.nameShuffle("Seymour Butts"));
  }
	
	@Test
  public void test4() {
    assertEquals("Greene Ebony", EasyProgram.nameShuffle("Ebony Greene"));
  }
	
	@Test
  public void test5() {
    assertEquals("Kennedy Ken", EasyProgram.nameShuffle("Ken Kennedy"));
  }
	
	@Test
  public void test6() {
    assertEquals("Gonzalez Allison", EasyProgram.nameShuffle("Allison Gonzalez"));
  }
	
	@Test
  public void test7() {
    assertEquals("Frazier Albert", EasyProgram.nameShuffle("Albert Frazier"));
  }
	
	@Test
  public void test8() {
    assertEquals("Hopkins Eloise", EasyProgram.nameShuffle("Eloise Hopkins"));
  }
	
	@Test
  public void test9() {
    assertEquals("Welch Donnie", EasyProgram.nameShuffle("Donnie Welch"));
  }
	
	@Test
  public void test10() {
    assertEquals("Thomas Vernon", EasyProgram.nameShuffle("Vernon Thomas"));
  }
}