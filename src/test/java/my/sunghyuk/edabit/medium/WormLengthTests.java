package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WormLengthTests {

  @Test
  public void test01() {
    assertEquals(Challenge.wormLength("----------"), "100 mm.");
  }

  @Test
  public void test02() {
    assertEquals(Challenge.wormLength(""), "invalid");
  }

  @Test
  public void test03() {
    assertEquals(Challenge.wormLength("---_-___---_"), "invalid");
  }

  @Test
  public void test04() {
    assertEquals(Challenge.wormLength("------"), "60 mm.");
  }

  @Test
  public void test05() {
    assertEquals(Challenge.wormLength("iwheguawhpvpaiehpiuwwega"), "invalid");
  }

  @Test
  public void test06() {
    assertEquals(Challenge.wormLength("QWERTYUIOPASDFGHJKL"), "invalid");
  }

  @Test
  public void test07() {
    assertEquals(Challenge.wormLength("------------"), "120 mm.");
  }
}
