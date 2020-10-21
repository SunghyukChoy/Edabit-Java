package my.sunghyuk.edabit.hard;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class CollectTests {
  private String[] strVector = new String[] { "intercontinentalisationalism", "strengths",
      "pneumonoultramicroscopicsilicovolcanoconiosis", "lexicographically", "anesthesiologists", "subdermatoglyphic",
      "sesquipedalianism", "recollection", "pseudopseudohypoparathyroidism", "floccinaucinihilipilification",
      "antidisestablishmentarianism", "supercalifragilisticexpialidocious", "incomprehensibilities", "astrophysicists",
      "honorificabilitudinitatibus", "unimaginatively", "euouae", "tsktsk", "uncopyrightable" };
  int[] numVector = new int[] { 6, 3, 15, 4, 6, 6, 6, 3, 7, 2, 5, 3, 9, 4, 12, 8, 7, 6, 11 };
  private String[][] resVector = new String[][] { { "ationa", "interc", "ntalis", "ontine" }, { "eng", "str", "ths" },
      { "croscopicsilico", "pneumonoultrami", "volcanoconiosis" }, { "aphi", "call", "cogr", "lexi" },
      { "anesth", "esiolo" }, { "matogl", "subder" }, { "pedali", "sesqui" }, { "ect", "ion", "oll", "rec" },
      { "hyroidi", "poparat", "pseudop", "seudohy" },
      { "at", "ci", "fl", "ic", "if", "ih", "il", "il", "in", "io", "ip", "na", "oc", "uc" },
      { "ablis", "antid", "arian", "hment", "isest" },
      { "ali", "ali", "doc", "erc", "fra", "gil", "ice", "iou", "ist", "sup", "xpi" }, { "ensibilit", "incompreh" },
      { "astr", "ophy", "sici" }, { "honorificabi", "litudinitati" }, { "unimagin" }, {}, { "tsktsk" },
      { "uncopyright" } };

  @Test
  public void test01() {
    assertArrayEquals(Program.collect(strVector[0], numVector[0]), resVector[0]);
  }

  @Test
  public void test02() {
    assertArrayEquals(Program.collect(strVector[1], numVector[1]), resVector[1]);
  }

  @Test
  public void test03() {
    assertArrayEquals(Program.collect(strVector[2], numVector[2]), resVector[2]);
  }

  @Test
  public void test04() {
    assertArrayEquals(Program.collect(strVector[3], numVector[3]), resVector[3]);
  }

  @Test
  public void test05() {
    assertArrayEquals(Program.collect(strVector[4], numVector[4]), resVector[4]);
  }

  @Test
  public void test06() {
    assertArrayEquals(Program.collect(strVector[5], numVector[5]), resVector[5]);
  }

  @Test
  public void test07() {
    assertArrayEquals(Program.collect(strVector[6], numVector[6]), resVector[6]);
  }

  @Test
  public void test08() {
    assertArrayEquals(Program.collect(strVector[7], numVector[7]), resVector[7]);
  }

  @Test
  public void test09() {
    assertArrayEquals(Program.collect(strVector[8], numVector[8]), resVector[8]);
  }

  @Test
  public void test10() {
    assertArrayEquals(Program.collect(strVector[9], numVector[9]), resVector[9]);
  }

  @Test
  public void test11() {
    assertArrayEquals(Program.collect(strVector[10], numVector[10]), resVector[10]);
  }

  @Test
  public void test12() {
    assertArrayEquals(Program.collect(strVector[11], numVector[11]), resVector[11]);
  }

  @Test
  public void test13() {
    assertArrayEquals(Program.collect(strVector[12], numVector[12]), resVector[12]);
  }

  @Test
  public void test14() {
    assertArrayEquals(Program.collect(strVector[13], numVector[13]), resVector[13]);
  }

  @Test
  public void test15() {
    assertArrayEquals(Program.collect(strVector[14], numVector[14]), resVector[14]);
  }

  @Test
  public void test16() {
    assertArrayEquals(Program.collect(strVector[15], numVector[15]), resVector[15]);
  }

  @Test
  public void test17() {
    assertArrayEquals(Program.collect(strVector[16], numVector[16]), resVector[16]);
  }

  @Test
  public void test18() {
    assertArrayEquals(Program.collect(strVector[17], numVector[17]), resVector[17]);
  }

  @Test
  public void test19() {
    assertArrayEquals(Program.collect(strVector[18], numVector[18]), resVector[18]);
  }
}
