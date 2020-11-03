package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DnaToRnaTests {
  private String[] strVector = new String[] { "GATTACCA", "GCGTAC", "ATTAGCGCGATATACGCGTAC", "CAGTATGCTGCAT", "CGATATA",
      "GCAGCTACA" };
  private String[] resVector = new String[] { "CUAAUGGU", "CGCAUG", "UAAUCGCGCUAUAUGCGCAUG", "GUCAUACGACGUA", "GCUAUAU",
      "CGUCGAUGU" };

  @Test
  public void test01() {
    assertEquals(Program.dnaToRna(strVector[0]), resVector[0]);
  }

  @Test
  public void test02() {
    assertEquals(Program.dnaToRna(strVector[1]), resVector[1]);
  }

  @Test
  public void test03() {
    assertEquals(Program.dnaToRna(strVector[2]), resVector[2]);
  }

  @Test
  public void test04() {
    assertEquals(Program.dnaToRna(strVector[3]), resVector[3]);
  }

  @Test
  public void test05() {
    assertEquals(Program.dnaToRna(strVector[4]), resVector[4]);
  }

  @Test
  public void test06() {
    assertEquals(Program.dnaToRna(strVector[5]), resVector[5]);
  }
}