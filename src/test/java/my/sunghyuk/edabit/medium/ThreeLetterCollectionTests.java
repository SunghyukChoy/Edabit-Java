package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class ThreeLetterCollectionTests {

  String[] strVector = new String[] { "slap", "click", "cat", "hi", "e", "", "programming",
      "antidisestablishmentarianism", "zoology", "assassination", "bookkeeper" };
  String[][] resVector = new String[][] { { "lap", "sla" }, { "cli", "ick", "lic" }, { "cat" }, {}, {}, {},
      { "amm", "gra", "ing", "min", "mmi", "ogr", "pro", "ram", "rog" },
      { "abl", "ani", "ant", "ari", "bli", "dis", "ent", "est", "hme", "ian", "idi", "ise", "ish", "ism", "lis", "men",
          "nis", "nta", "nti", "ria", "ses", "shm", "sta", "tab", "tar", "tid" },
      { "log", "ogy", "olo", "ool", "zoo" },
      { "ass", "ass", "ati", "ina", "ion", "nat", "sas", "sin", "ssa", "ssi", "tio" },
      { "boo", "eep", "epe", "kee", "kke", "okk", "ook", "per" } };

  @Test
  public void test01() {
    assertArrayEquals(Program.threeLetterCollection(strVector[0]), resVector[0]);
  }

  @Test
  public void test02() {
    assertArrayEquals(Program.threeLetterCollection(strVector[1]), resVector[1]);
  }

  @Test
  public void test03() {
    assertArrayEquals(Program.threeLetterCollection(strVector[2]), resVector[2]);
  }

  @Test
  public void test04() {
    assertArrayEquals(Program.threeLetterCollection(strVector[3]), resVector[3]);
  }

  @Test
  public void test05() {
    assertArrayEquals(Program.threeLetterCollection(strVector[4]), resVector[4]);
  }

  @Test
  public void test06() {
    assertArrayEquals(Program.threeLetterCollection(strVector[5]), resVector[5]);
  }

  @Test
  public void test07() {
    assertArrayEquals(Program.threeLetterCollection(strVector[6]), resVector[6]);
  }

  @Test
  public void test08() {
    assertArrayEquals(Program.threeLetterCollection(strVector[7]), resVector[7]);
  }

  @Test
  public void test09() {
    assertArrayEquals(Program.threeLetterCollection(strVector[8]), resVector[8]);
  }

  @Test
  public void test10() {
    assertArrayEquals(Program.threeLetterCollection(strVector[9]), resVector[9]);
  }

  @Test
  public void test11() {
    assertArrayEquals(Program.threeLetterCollection(strVector[10]), resVector[10]);
  }
}
