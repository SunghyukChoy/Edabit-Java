package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MissingLetterTests {
  @Test
  public void test1() {
    System.out.println("Example #1");
    assertEquals("c", Challenge.missingLetter("abdefg"));
  }

  @Test
  public void test2() {
    System.out.println("Example #2");
    assertEquals("r", Challenge.missingLetter("mnopqs"));
  }

  @Test
  public void test3() {
    System.out.println("Example #3");
    assertEquals("w", Challenge.missingLetter("tuvxyz"));
  }

  @Test
  public void test4() {
    assertEquals("k", Challenge.missingLetter("jlm"));
  }

  @Test
  public void test5() {
    assertEquals("t", Challenge.missingLetter("rsu"));
  }

  @Test
  public void test6() {
    assertEquals("f", Challenge.missingLetter("eghij"));
  }

  @Test
  public void test7() {
    assertEquals("s", Challenge.missingLetter("qrtuv"));
  }

  @Test
  public void test8() {
    System.out.println("Example #4");
    assertEquals("No Missing Letter", Challenge.missingLetter("ghijklmno"));
  }

  @Test
  public void test9() {
    assertEquals("No Missing Letter", Challenge.missingLetter("xyz"));
  }
}