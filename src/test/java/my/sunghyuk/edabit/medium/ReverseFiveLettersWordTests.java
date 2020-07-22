package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReverseFiveLettersWordTests {

  @Test
  public void test1() {
    assertEquals("esreveR", Program.reverseFiveLettersWord("Reverse"));
  }

  @Test
  public void test2() {
    assertEquals("This is a lacipyt .ecnetnes", Program.reverseFiveLettersWord("This is a typical sentence."));
  }

  @Test
  public void test3() {
    assertEquals("The dog is big.", Program.reverseFiveLettersWord("The dog is big."));
  }

  @Test
  public void test4() {
    assertEquals("esreveR the redro of yreve word retaerg than or lauqe to five .sretcarahc",
    Program.reverseFiveLettersWord("Reverse the order of every word greater than or equal to five characters."));
  }

  @Test
  public void test5() {
    assertEquals("Lets all be euqinu rehtegot litnu we esilaer we are all the .emas",
    Program.reverseFiveLettersWord("Lets all be unique together until we realise we are all the same."));
  }

  @Test
  public void test6() {
    assertEquals("The old elppa slever in its .ytirohtua", Program.reverseFiveLettersWord("The old apple revels in its authority."));
  }

  @Test
  public void test7() {
    assertEquals("The retoohs says eybdoog to his .evol", Program.reverseFiveLettersWord("The shooter says goodbye to his love."));
  }

  @Test
  public void test8() {
    assertEquals("esaelP wait edistuo of the .esuoh", Program.reverseFiveLettersWord("Please wait outside of the house."));
  }

  @Test
  public void test9() {
    assertEquals("Two staes were .tnacav", Program.reverseFiveLettersWord("Two seats were vacant."));
  }

  @Test
  public void test10() {
    assertEquals("ruoF-ytxiS semoc gniksa for .daerb", Program.reverseFiveLettersWord("Sixty-Four comes asking for bread."));
  }
}