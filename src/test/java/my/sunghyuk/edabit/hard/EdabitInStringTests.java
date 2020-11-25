package my.sunghyuk.edabit.hard;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author edwardclark
 **/

public class EdabitInStringTests {

  @Test
  public void test1() {
    assertEquals("NO", Challenge.edabitInString("eddaaabt"));
  }

  @Test
  public void test2() {
    assertEquals("YES", Challenge.edabitInString("edwardisabletodoittoo"));
  }

  @Test
  public void test3() {
    assertEquals("NO", Challenge.edabitInString("abecdfghijklmnopqrstuvwxyz"));
  }

  @Test
  public void test4() {
    assertEquals("NO", Challenge.edabitInString("edisthebestatthis"));
  }

  @Test
  public void test5() {
    assertEquals("YES", Challenge.edabitInString("teachandlearnbitbybit"));
  }

  @Test
  public void test6() {
    assertEquals("YES", Challenge.edabitInString(
        "fjkdlkskkkkkdkkdkdedaaakkjkkdkkdklqiieuirooeizooziiciibiiiiifooiioiiuuyeyttgguoosooodiifiufiiodikkjkls"));
  }
}
