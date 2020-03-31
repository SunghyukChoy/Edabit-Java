package my.sunghyuk.edabit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class NameShuffleTests {
  @Test
  public void test1() {
    assertEquals("Trump Donald", Program.nameShuffle("Donald Trump"));
  }
	
	@Test
  public void test2() {
    assertEquals("O'Donnel Rosie", Program.nameShuffle("Rosie O'Donnel"));
  }
	
	@Test
  public void test3() {
    assertEquals("Butts Seymour", Program.nameShuffle("Seymour Butts"));
  }
	
	@Test
  public void test4() {
    assertEquals("Greene Ebony", Program.nameShuffle("Ebony Greene"));
  }
	
	@Test
  public void test5() {
    assertEquals("Kennedy Ken", Program.nameShuffle("Ken Kennedy"));
  }
	
	@Test
  public void test6() {
    assertEquals("Gonzalez Allison", Program.nameShuffle("Allison Gonzalez"));
  }
	
	@Test
  public void test7() {
    assertEquals("Frazier Albert", Program.nameShuffle("Albert Frazier"));
  }
	
	@Test
  public void test8() {
    assertEquals("Hopkins Eloise", Program.nameShuffle("Eloise Hopkins"));
  }
	
	@Test
  public void test9() {
    assertEquals("Welch Donnie", Program.nameShuffle("Donnie Welch"));
  }
	
	@Test
  public void test10() {
    assertEquals("Thomas Vernon", Program.nameShuffle("Vernon Thomas"));
  }
}