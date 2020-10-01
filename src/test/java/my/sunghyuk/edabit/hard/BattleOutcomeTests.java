package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BattleOutcomeTests {
  @Test
  public void test1() {
    assertEquals(351, Challenge.battleOutcome(32531));
  }

  @Test
  public void test2() {
    assertEquals(1, Challenge.battleOutcome(111));
  }

  @Test
  public void test3() {
    assertEquals(59, Challenge.battleOutcome(5289));
  }

  @Test
  public void test4() {
    assertEquals(781, Challenge.battleOutcome(76811));
  }

  @Test
  public void test5() {
    assertEquals(3596, Challenge.battleOutcome(3245196));
  }

  @Test
  public void test6() {
    assertEquals(929, Challenge.battleOutcome(93552129));
  }
}