package my.sunghyuk.edabit.hard;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class SplitTests {

  /**
   * @author edwardclark
  **/

  @Test
  public void test1() {
    assertThat(Challenge.split("()()()"), is(new String[] { "()", "()", "()" }));
  }

  @Test
  public void test2() {
    assertThat(Challenge.split(""), is(new String[] {}));
  }

  @Test
  public void test3() {
    assertThat(Challenge.split("()()(())"), is(new String[] { "()", "()", "(())" }));
  }

  @Test
  public void test4() {
    assertThat(Challenge.split("(())(())"), is(new String[] { "(())", "(())" }));
  }

  @Test
  public void test5() {
    assertThat(Challenge.split("((()))"), is(new String[] { "((()))" }));
  }

  @Test
  public void test6() {
    assertThat(Challenge.split("()(((((((((())))))))))"), is(new String[] { "()", "(((((((((())))))))))" }));
  }

  @Test
  public void test7() {
    assertThat(Challenge.split("((())()(()))(()(())())(()())"),
        is(new String[] { "((())()(()))", "(()(())())", "(()())" }));
  }

  @Test
  public void test8() {
    assertThat(Challenge.split("((()))(())()()(()())"), is(new String[] { "((()))", "(())", "()", "()", "(()())" }));
  }

  @Test
  public void test9() {
    assertThat(Challenge.split("((())())(()(()()))"), is(new String[] { "((())())", "(()(()()))" }));
  }

  @Test
  public void test10() {
    assertThat(Challenge.split("(()(()()))()(((()))()(()))(()((()))(())())"),
        is(new String[] { "(()(()()))", "()", "(((()))()(()))", "(()((()))(())())" }));
  }
}
