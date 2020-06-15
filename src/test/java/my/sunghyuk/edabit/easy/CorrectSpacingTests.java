package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CorrectSpacingTests {
  @Test
  public void test1() {
    assertEquals("A glittering gem is not enough.", Challenge.correctSpacing(" A  glittering  gem     is    not   enough.  "));
  }
	
	@Test
  public void test2() {
    assertEquals("She did her best to help him.", Challenge.correctSpacing("   She      did  her best  to  help    him.  "));
  }
	
	@Test
  public void test3() {
    assertEquals("They made sure to get there early.", Challenge.correctSpacing("  They      made  sure   to get   there  early. "));
  }
	
	@Test
  public void test4() {
    assertEquals("She did her best to help him.", Challenge.correctSpacing("  She  did   her      best     to   help him. "));
  }
	
	@Test
  public void test5() {
    assertEquals("I love eating toasted cheese and tuna sandwiches.", Challenge.correctSpacing("      I     love  eating    toasted  cheese   and tuna  sandwiches."));
  }
	
	@Test
  public void test6() {
    assertEquals("There were foggy conditions on the trail.", Challenge.correctSpacing("  There     were  foggy   conditions on   the      trail.   "));
  }
	
	@Test
  public void test7() {
    assertEquals("The roads were impassable due to snow.", Challenge.correctSpacing("     The  roads   were  impassable  due to      snow.  "));
  }
	
	@Test
  public void test8() {
    assertEquals("Better to paint with bold colors.", Challenge.correctSpacing(" Better   to      paint  with  bold  colors.   "));
  }
	
	@Test
  public void test9() {
    assertEquals("Remember to stretch before you run.", Challenge.correctSpacing("     Remember to  stretch      before you  run.  "));
  }
	
	@Test
  public void test10() {
    assertEquals("You rarely see a royal flush in poker.", Challenge.correctSpacing("  You  rarely    see  a royal   flush     in   poker. "));
  }
	
	@Test
  public void test11() {
    assertEquals("She was too short to see over the fence.", Challenge.correctSpacing("  She was too      short     to   see    over  the   fence.   "));
  }
	
	@Test
  public void test12() {
    assertEquals("I will post the letter tonight.", Challenge.correctSpacing("   I   will  post     the letter      tonight.  "));
  }
	
	@Test
  public void test13() {
    assertEquals("He could not remember a thing.", Challenge.correctSpacing(" He      could  not remember   a     thing.   "));
  }
	
	@Test
  public void test14() {
    assertEquals("Sometimes it is better to just walk away.", Challenge.correctSpacing("      Sometimes     it    is  better   to  just walk away."));
  }
	
	@Test
  public void test15() {
    assertEquals("A lack of stirring makes the sauce stick.", Challenge.correctSpacing(" A   lack   of      stirring  makes  the sauce     stick.  "));
  }
	
	@Test
  public void test16() {
    assertEquals("I really want my dessert.", Challenge.correctSpacing("   I      really   want  my dessert.  "));
  }
	
	@Test
  public void test17() {
    assertEquals("Let me help you with your bags.", Challenge.correctSpacing("   Let      me help you  with     your    bags.   "));
  }
	
	@Test
  public void test18() {
    assertEquals("Around the world in eighty days.", Challenge.correctSpacing("      Around  the world     in   eighty   days.  "));
  }
	
	@Test
  public void test19() {
    assertEquals("The soup of the day is lentil.", Challenge.correctSpacing("      The soup   of    the  day   is     lentil. "));
  }
	
	@Test
  public void test20() {
    assertEquals("Winter is coming.", Challenge.correctSpacing("    Winter is   coming. "));
  }
}