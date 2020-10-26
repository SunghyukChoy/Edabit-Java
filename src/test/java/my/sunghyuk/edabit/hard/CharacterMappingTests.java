package my.sunghyuk.edabit.hard;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class CharacterMappingTests {
  @Test
  public void test1() {
    assertThat(Challenge.characterMapping("abcd"), is(new int[] { 0, 1, 2, 3 }));
  }

  @Test
  public void test2() {
    assertThat(Challenge.characterMapping("abb"), is(new int[] { 0, 1, 1 }));
  }

  @Test
  public void test3() {
    assertThat(Challenge.characterMapping("babbcb"), is(new int[] { 0, 1, 0, 0, 2, 0 }));
  }

  @Test
  public void test4() {
    assertThat(Challenge.characterMapping("aaabb"), is(new int[] { 0, 0, 0, 1, 1 }));
  }

  @Test
  public void test5() {
    assertThat(Challenge.characterMapping("abccbc"), is(new int[] { 0, 1, 2, 2, 1, 2 }));
  }

  @Test
  public void test6() {
    assertThat(Challenge.characterMapping("fluffy"), is(new int[] { 0, 1, 2, 0, 0, 3 }));
  }

  @Test
  public void test7() {
    assertThat(Challenge.characterMapping("madness"), is(new int[] { 0, 1, 2, 3, 4, 5, 5 }));
  }

  @Test
  public void test8() {
    assertThat(Challenge.characterMapping("buttery"), is(new int[] { 0, 1, 2, 2, 3, 4, 5 }));
  }

  @Test
  public void test9() {
    assertThat(Challenge.characterMapping("canine"), is(new int[] { 0, 1, 2, 3, 2, 4 }));
  }

  @Test
  public void test10() {
    assertThat(Challenge.characterMapping("hohoho"), is(new int[] { 0, 1, 0, 1, 0, 1 }));
  }

  @Test
  public void test11() {
    assertThat(Challenge.characterMapping("hmmmmm"), is(new int[] { 0, 1, 1, 1, 1, 1 }));
  }

  @Test
  public void test12() {
    assertThat(Challenge.characterMapping(""), is(new int[] {}));
  }
}
