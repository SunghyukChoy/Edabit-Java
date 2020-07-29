package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountAdverbsTests {
  @Test
  public void test1() {
    assertEquals(1, Challenge.countAdverbs("She ran hurriedly towards the stadium."));
  }

  @Test
  public void test2() {
    assertEquals(2, Challenge.countAdverbs("She ate the lasagna heartily and noisily."));
  }

  @Test
  public void test3() {
    assertEquals(0, Challenge.countAdverbs("He hates potatoes."));
  }

  @Test
  public void test4() {
    assertEquals(3, Challenge.countAdverbs("He was happily, crazily, foolishly over the moon."));
  }

  @Test
  public void test5() {
    assertEquals(1, Challenge.countAdverbs("She writes poetry beautifully."));
  }

  @Test
  public void test6() {
    assertEquals(0, Challenge.countAdverbs("There are many fat geese in the park."));
  }

  @Test
  public void test7() {
    assertEquals(2, Challenge.countAdverbs("The horse acted aggressively and stubbornly."));
  }

  @Test
  public void test8() {
    System.out.println("-ly should not be counted if it is not at the end.");
    assertEquals(0, Challenge.countAdverbs("She forgot where to buy the lysol."));
  }

  @Test
  public void test9() {
    System.out.println("-ly should not be counted if it is not at the end.");
    assertEquals(0, Challenge.countAdverbs("Ilya ran to the store."));
  }
}