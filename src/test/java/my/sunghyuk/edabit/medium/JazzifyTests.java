
package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JazzifyTests {
  @Test
  public void test1() {
    assertEquals(Challenge.jazzify(new String[] { "G", "F", "C" }), new String[] { "G7", "F7", "C7" });
  }

  @Test
  public void test2() {
    assertEquals(Challenge.jazzify(new String[] { "Dm", "G", "E", "A" }),
        new String[] { "Dm7", "G7", "E7", "A7" });
  }

  @Test
  public void test3() {
    assertEquals(Challenge.jazzify(new String[] { "F7", "E7", "A7", "Ab7", "Gm7", "C7" }),
        new String[] { "F7", "E7", "A7", "Ab7", "Gm7", "C7" });
  }

  @Test
  public void test4() {
    assertEquals(Challenge.jazzify(new String[] { "G", "C7" }), new String[] { "G7", "C7" });
  }

  @Test
  public void test5() {
    assertEquals(Challenge.jazzify(new String[] {}), new String[] {});
  }
}