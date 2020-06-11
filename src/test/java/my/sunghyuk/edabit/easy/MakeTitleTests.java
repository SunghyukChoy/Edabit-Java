package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MakeTitleTests {
  @Test
  public void test1() {
    assertEquals("I Am A Title", Program.makeTitle("I am a title"));
  }
	
	@Test
  public void test2() {
    assertEquals("I AM A TITLE", Program.makeTitle("I AM A TITLE"));
  }
	
	@Test
  public void test3() {
    assertEquals("I AM A TITLE", Program.makeTitle("i aM a tITLE"));
  }
	
	@Test
  public void test4() {
    assertEquals("The First Letter Of Every Word Is Capitalized", Program.makeTitle("the first letter of every word is capitalized"));
  }
	
	@Test
  public void test5() {
    assertEquals("I Like Pizza", Program.makeTitle("I Like Pizza"));
  }
	
	@Test
  public void test6() {
    assertEquals("Don't Count Your ChiCKens BeFore They HatCh", Program.makeTitle("Don't count your ChiCKens BeFore They HatCh"));
  }
	
	
	@Test
  public void test7() {
    assertEquals("All Generalizations Are False, Including This One", Program.makeTitle("All generalizations are false, including this one"));
  }
	
	@Test
  public void test8() {
    assertEquals("Me And My Wife Lived Happily For Twenty Years And Then We Met.", Program.makeTitle("Me and my wife lived happily for twenty years and then we met."));
  }
	
	@Test
  public void test9() {
    assertEquals("There Are No Stupid Questions, Just Stupid People.", Program.makeTitle("There are no stupid questions, just stupid people."));
  }
	
	@Test
  public void test10() {
    assertEquals("1f You C4n R34d 7h15, You R34lly N33d 2 G37 L41d", Program.makeTitle("1f you c4n r34d 7h15, you r34lly n33d 2 g37 l41d"));
  }
}