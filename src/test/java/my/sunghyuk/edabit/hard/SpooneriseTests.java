package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SpooneriseTests {

  @Test
  public void test1() {
    assertEquals("fushing crailure", Challenge.spoonerise("crushing failure"));
  }

  @Test
  public void test2() {
    assertEquals("istmas chreve", Challenge.spoonerise("christmas eve"));
  }

  @Test
  public void test3() {
    assertEquals("flighlighter huid", Challenge.spoonerise("highlighter fluid"));
  }

  @Test
  public void test4() {
    assertEquals("bocolate chiscuits", Challenge.spoonerise("chocolate biscuits"));
  }

  @Test
  public void test5() {
    assertEquals("redabit ules!", Challenge.spoonerise("edabit rules!"));
  }
}