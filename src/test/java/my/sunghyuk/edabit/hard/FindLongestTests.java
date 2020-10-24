package my.sunghyuk.edabit.hard;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FindLongestTests {

  private String[] strVector = new String[] { "Hello darkness my old friend.",
      "Yourself is your soul's captain and fate's master.", "The pretty daughter's toy, a doll, is as pretty as her.",
      "A thing of beauty is a joy forever.", "Forgetfulness is by all means powerless!",
      "\"Strengths\" is the longest and most commonly used word that contains only a single vowel." };
  private String[] resVector = new String[] { "darkness", "yourself", "daughter", "forever", "forgetfulness",
      "strengths" };

  @Test
  public void test01() {
    assertEquals(Program.findLongest(strVector[0]), resVector[0]);
  }

  @Test
  public void test02() {
    assertEquals(Program.findLongest(strVector[1]), resVector[1]);
  }

  @Test
  public void test03() {
    assertEquals(Program.findLongest(strVector[2]), resVector[2]);
  }

  @Test
  public void test04() {
    assertEquals(Program.findLongest(strVector[3]), resVector[3]);
  }

  @Test
  public void test05() {
    assertEquals(Program.findLongest(strVector[4]), resVector[4]);
  }

  @Test
  public void test06() {
    assertEquals(Program.findLongest(strVector[5]), resVector[5]);
  }
}
