package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RemoveLastVowelTests {

  @Test
  public void test1() {
    assertEquals("Thos wh dar t fal miserbly cn achiev gretly.",
        Challenge.removeLastVowel("Those who dare to fail miserably can achieve greatly."));
  }

  @Test
  public void test2() {
    assertEquals("Lov s  serios mentl diseas.", Challenge.removeLastVowel("Love is a serious mental disease."));
  }

  @Test
  public void test3() {
    assertEquals("Gt bsy livng r gt bsy dyng.", Challenge.removeLastVowel("Get busy living or get busy dying."));
  }

  @Test
  public void test4() {
    assertEquals("f yo wnt t liv  hppy lif, ti t t  gol, nt t peopl.",
        Challenge.removeLastVowel("If you want to live a happy life, tie it to a goal, not to people."));
  }
}
