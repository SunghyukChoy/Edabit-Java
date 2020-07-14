package my.sunghyuk.edabit.medium;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class FindBrokenKeysTests {
  @Test
  public void test1() {
    assertThat(Challenge.findBrokenKeys("happy birthday", "hawwy birthday"), is(new String[] { "p" }));
  }

  @Test
  public void test2() {
    assertThat(Challenge.findBrokenKeys("starry night", "starrq light"), is(new String[] { "y", "n" }));
  }

  @Test
  public void test3() {
    assertThat(Challenge.findBrokenKeys("beethoven", "affthoif5"), is(new String[] { "b", "e", "v", "n" }));
  }

  @Test
  public void test4() {
    assertThat(Challenge.findBrokenKeys("mozart", "aiwgvx"), is(new String[] { "m", "o", "z", "a", "r", "t" }));
  }

  @Test
  public void test5() {
    System.out.println("It should work for numbers.");
    assertThat(Challenge.findBrokenKeys("5678", "4678"), is(new String[] { "5" }));
  }

  @Test
  public void test6() {
    System.out.println("It should work for punctuation.");
    assertThat(Challenge.findBrokenKeys("!!??$$", "$$!!??"), is(new String[] { "!", "?", "$" }));
  }
}