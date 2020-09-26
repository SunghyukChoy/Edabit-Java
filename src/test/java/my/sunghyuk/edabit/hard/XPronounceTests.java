package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class XPronounceTests {
  @Test
  public void test1() {
    assertEquals("Inside the bocks was a zylophone", Challenge.xPronounce("Inside the box was a xylophone"));
  }

  @Test
  public void test2() {
    assertEquals("The ecks ray is eckscellent", Challenge.xPronounce("The x ray is excellent"));
  }

  @Test
  public void test3() {
    assertEquals("OMG ecks bocks unbocksing video ecks D", Challenge.xPronounce("OMG x box unboxing video x D"));
  }

  @Test
  public void test4() {
    assertEquals("I gotta make bucks but the clocks are ticking!",
        Challenge.xPronounce("I gotta make bux but the clox are ticking!"));
  }

  @Test
  public void test5() {
    assertEquals("this test does not have an ecks in it", Challenge.xPronounce("this test does not have an x in it"));
  }

  @Test
  public void test6() {
    assertEquals("Macks backs packs", Challenge.xPronounce("Max bax pax"));
  }

  @Test
  public void test7() {
    assertEquals("Anti vacks", Challenge.xPronounce("Anti vax"));
  }

  @Test
  public void test8() {
    assertEquals("Who is zavier and why does he have my car",
        Challenge.xPronounce("Who is xavier and why does he have my car"));
  }

  @Test
  public void test9() {
    assertEquals("OMG zylem unbocksing video ecks D", Challenge.xPronounce("OMG xylem unboxing video x D"));
  }
}
