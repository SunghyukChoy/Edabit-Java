package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReplaceTheTests {
  @Test
  public void test1() {
    assertEquals("a dog and an envelope", Challenge.replaceThe("the dog and the envelope"));
  }

  @Test
  public void test2() {
    assertEquals("a boy ran at a wall", Challenge.replaceThe("the boy ran at the wall"));
  }

  @Test
  public void test3() {
    assertEquals("an egg, a spoon and an espionage", Challenge.replaceThe("the egg, the spoon and the espionage"));
  }

  @Test
  public void test4() {
    assertEquals("where is a spoon", Challenge.replaceThe("where is the spoon"));
  }

  @Test
  public void test5() {
    assertEquals("a quick brown fox jumps over a lazy dog",
        Challenge.replaceThe("the quick brown fox jumps over the lazy dog"));
  }

  @Test
  public void test6() {
    assertEquals("this edabit thing is quite neat", Challenge.replaceThe("this edabit thing is quite neat"));
  }

  @Test
  public void test7() {
    assertEquals("a lion, witch and a wardrobe", Challenge.replaceThe("the lion, witch and the wardrobe"));
  }

  @Test
  public void test8() {
    assertEquals("enter a correct password to access an epic program",
        Challenge.replaceThe("enter the correct password to access the epic program"));
  }

  @Test
  public void test9() {
    assertEquals("a man blew a final candle out and all was dark",
        Challenge.replaceThe("the man blew the final candle out and all was dark"));
  }

  @Test
  public void test10() {
    assertEquals("an ant ate an egg salad which an eel had been intending to eat over a weekend",
        Challenge.replaceThe("the ant ate the egg salad which the eel had been intending to eat over the weekend"));
  }

  @Test
  public void test11() {
    assertEquals("this a random english sentence which you have to pass",
        Challenge.replaceThe("this the random english sentence which you have to pass"));
  }
}