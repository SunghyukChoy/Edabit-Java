package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MangleTests {
  @Test
  public void test1() {
    assertEquals("GvO Ujnft!", Challenge.mangle("Fun times!"));
  }

  @Test
  public void test2() {
    System.out.println();
    assertEquals("UIf rvjdl cspxO gpy.", Challenge.mangle("The quick brown fox."));
  }

  @Test
  public void test3() {
    assertEquals("Pnfhb", Challenge.mangle("Omega"));
  }

  @Test
  public void test4() {
    assertEquals("J xjmm Ofwfs cf UIjt zpvOh bhbjO. Fwfs. PI EbnO… J kvtU hpU pmEfs.",
        Challenge.mangle("I will never be this young again. Ever. Oh damn… I just got older."));
  }

  @Test
  public void test5() {
    assertEquals("TIpvmE xf tUbsU dmbtt Opx, ps tIpvmE xf xbjU gps fwfszpOf Up hfU Ifsf?",
        Challenge.mangle("Should we start class now, or should we wait for everyone to get here?"));
  }

  @Test
  public void test6() {
    assertEquals("DIfdl cbdl Upnpsspx; J xjmm tff jg UIf cppl Ibt bssjwfE.",
        Challenge.mangle("Check back tomorrow; I will see if the book has arrived."));
  }

  @Test
  public void test7() {
    assertEquals("UIf mblf jt b mpOh xbz gspn Ifsf.", Challenge.mangle("The lake is a long way from here."));
  }

  @Test
  public void test8() {
    assertEquals("JU xbt hfUUjOh Ebsl, bOE xf xfsfO’U UIfsf zfU.",
        Challenge.mangle("It was getting dark, and we weren’t there yet."));
  }

  @Test
  public void test9() {
    assertEquals("UIf nztUfsjpvt Ejbsz sfdpsEt UIf wpjdf.",
        Challenge.mangle("The mysterious diary records the voice."));
  }

  @Test
  public void test10() {
    assertEquals("DbUt bsf hppE qfUt, gps UIfz bsf dmfbO bOE bsf OpU Opjtz.",
        Challenge.mangle("Cats are good pets, for they are clean and are not noisy."));
  }

  @Test
  public void test11() {
    System.out.println("Don't forget that \"z\" becomes \"a\"!");
    assertEquals("bcdA", Challenge.mangle("abcz"));
  }

  @Test
  public void test12() {
    System.out.println("If a letter is already uppercase, return it as uppercase.");
    assertEquals("BCDA", Challenge.mangle("ABCZ"));
  }
}
