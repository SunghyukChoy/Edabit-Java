package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReplaceNthTests {
  @Test
  public void test1() {
    assertEquals(
        "Sometimes it is b_tter to just walk away from things and go back to them lat_r when you're in a b_tter frame of mind.",
        Challenge.replaceNth(
            "Sometimes it is better to just walk away from things and go back to them later when you're in a better frame of mind.",
            3, "e", "_"));
  }

  @Test
  public void test2() {
    assertEquals("The cl@ck within this bl@g and the cl@ck @n my lapt@p are 1 h@ur different fr@m each @ther.",
        Challenge.replaceNth(
            "The clock within this blog and the clock on my laptop are 1 hour different from each other.", 1, "o",
            "@"));
  }

  @Test
  public void test3() {
    assertEquals("Lets all be unique together until we rea#ise we are all the same.",
        Challenge.replaceNth("Lets all be unique together until we realise we are all the same.", 4, "l", "#"));
  }

  @Test
  public void test4() {
    System.out.println("Tests are case sensitive.");
    assertEquals(
        "Sometimes, all you NExD to do is completely make an ass of yourself and laugh it off to realise that LIFE isn't so bad AFTxR all.",
        Challenge.replaceNth(
            "Sometimes, all you NEED to do is completely make an ass of yourself and laugh it off to realise that LIFE isn't so bad AFTER all.",
            2, "E", "x"));
  }

  @Test
  public void test5() {
    assertEquals("Is it free?", Challenge.replaceNth("Is it free?", 100, "e", "Y"));
  }

  @Test
  public void test6() {
    assertEquals("A glittering gem is not enough.",
        Challenge.replaceNth("A glittering gem is not enough.", 0, "o", "-"));
  }

  @Test
  public void test7() {
    assertEquals("Please wait outside of the house.",
        Challenge.replaceNth("Please wait outside of the house.", -3, "s", "s"));
  }

  @Test
  public void test8() {
    assertEquals("Joe made the sugar cookies; Susan d*corated them.",
        Challenge.replaceNth("Joe made the sugar cookies; Susan decorated them.", 5, "e", "*"));
  }

  @Test
  public void test9() {
    assertEquals("Writ3ng a list of random sentences 3s harder than I in3tially thought 3t would be.",
        Challenge.replaceNth("Writing a list of random sentences is harder than I initially thought it would be.", 2,
            "i", "3"));
  }

  @Test
  public void test10() {
    assertEquals("The book is in front of the table.",
        Challenge.replaceNth("The book is in front of the table.", 3, "f", "K"));
  }
}
