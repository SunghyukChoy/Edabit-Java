package my.sunghyuk.edabit.hard;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class MissingLetterTests {
  @Test
  public void test1() {
    assertThat(Challenge.missingLetter(new String[] { "a", "b", "c", "e", "f", "g" }), is("d"));
  }

  @Test
  public void test2() {
    assertThat(Challenge.missingLetter(new String[] { "O", "Q", "R", "S" }), is("P"));
  }

  @Test
  public void test3() {
    assertThat(Challenge.missingLetter(new String[] { "t", "u", "v", "w", "x", "z" }), is("y"));
  }

  @Test
  public void test4() {
    assertThat(Challenge.missingLetter(new String[] { "m", "o" }), is("n"));
  }

  @Test
  public void test5() {
    assertThat(Challenge.missingLetter(new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n",
        "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" }), is("i"));
  }

  @Test
  public void test6() {
    assertThat(Challenge.missingLetter(new String[] { "q", "s", "t" }), is("r"));
  }

  @Test
  public void test7() {
    assertThat(Challenge.missingLetter(new String[] { "c", "d", "e", "f", "g", "h", "i", "k", "l", "m", "n" }),
        is("j"));
  }

  @Test
  public void test8() {
    assertThat(Challenge.missingLetter(new String[] { "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p" }),
        is("l"));
  }

  @Test
  public void test9() {
    assertThat(Challenge.missingLetter(new String[] { "t", "u", "w", "x" }), is("v"));
  }

  @Test
  public void test10() {
    assertThat(Challenge.missingLetter(new String[] { "B", "D" }), is("C"));
  }
}
