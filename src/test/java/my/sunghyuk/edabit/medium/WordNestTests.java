package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WordNestTests {

  @Test
  public void test1() {
    assertEquals(4, Challenge.wordNest("engagement", "engenengagemengagemeengagementntentgagementagement"));
  }

  @Test
  public void test2() {
    assertEquals(1, Challenge.wordNest("passage", "passpassageage"));
  }

  @Test
  public void test3() {
    assertEquals(5, Challenge.wordNest("factory", "ffacfactofactfafactoryctoryoryrytoryactory"));
  }

  @Test
  public void test4() {
    assertEquals(6, Challenge.wordNest("deny", "ddededdddenyenyenyenynynyeny"));
  }

  @Test
  public void test5() {
    assertEquals(8, Challenge.wordNest("jinx", "jijijjijjijijjinxinxnxnxinxnxinxnxnx"));
  }

  @Test
  public void test6() {
    assertEquals(3, Challenge.wordNest("deal", "dedddealealealal"));
  }

  @Test
  public void test7() {
    assertEquals(2, Challenge.wordNest("paradox", "parparaparadoxdoxadox"));
  }

  @Test
  public void test8() {
    assertEquals(4, Challenge.wordNest("meet", "mmememmeeteeteteteet"));
  }

  @Test
  public void test9() {
    assertEquals(1, Challenge.wordNest("last", "lalastst"));
  }

  @Test
  public void test10() {
    assertEquals(3, Challenge.wordNest("silence", "sisilsisilencelenceencelence"));
  }

  @Test
  public void test11() {
    assertEquals(0, Challenge.wordNest("inflate", "inflate"));
  }

  @Test
  public void test12() {
    assertEquals(10, Challenge.wordNest("ruin", "rurrurrrrrrururuinininuinuinuinuinuininuinin"));
  }

  @Test
  public void test13() {
    assertEquals(7, Challenge.wordNest("episode", "episoepisepisepiepiepiepisoepisodedesodesodesodeodeodede"));
  }

  @Test
  public void test14() {
    assertEquals(8, Challenge.wordNest("dictate", "dictadicdidictdiddictadictadictateteteictatectateatectatetatete"));
  }

  @Test
  public void test15() {
    assertEquals(9, Challenge.wordNest("caller", "callcacacalccallcacaccallerallerllerllererallerlerllerllerer"));
  }

  @Test
  public void test16() {
    assertEquals(3, Challenge.wordNest("sweater", "sweatsweswsweatereateraterer"));
  }

  @Test
  public void test17() {
    assertEquals(8, Challenge.wordNest("measure", "measumememeasumemmeasmmeasureeasureureeasureasurereasureasurere"));
  }

  @Test
  public void test18() {
    assertEquals(5, Challenge.wordNest("relieve", "relierelierelrelierrelieveelieveveieveveve"));
  }

  @Test
  public void test19() {
    assertEquals(10, Challenge.wordNest("home", "hohohohhohohhhohhomeomemeomeomememeomemememe"));
  }

  @Test
  public void test20() {
    assertEquals(1, Challenge.wordNest("profession", "profesprofessionsion"));
  }

  @Test
  public void test21() {
    assertEquals(5, Challenge.wordNest("continuous", "contcontcontinuoconcocontinuousntinuoustinuoususinuousinuous"));
  }
}