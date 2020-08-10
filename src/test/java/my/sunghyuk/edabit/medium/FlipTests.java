package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FlipTests {
  @Test
  public void test1() {
    assertEquals("olleH", Challenge.flip("Hello", "word"));
  }

  @Test
  public void test2() {
    assertEquals("Hello", Challenge.flip("Hello", "sentence"));
  }

  @Test
  public void test3() {
    assertEquals("s'erehT reven hguone emit ot od lla eht gnihton uoy tnaw",
        Challenge.flip("There's never enough time to do all the nothing you want", "word"));
  }

  @Test
  public void test4() {
    assertEquals("want you nothing the all do to time enough never There's",
        Challenge.flip("There's never enough time to do all the nothing you want", "sentence"));
  }

  @Test
  public void test5() {
    assertEquals("I evah lla eseht taerg seneg tub er'yeht evissecer",
        Challenge.flip("I have all these great genes but they're recessive", "word"));
  }

  @Test
  public void test6() {
    assertEquals("recessive they're but genes great these all have I",
        Challenge.flip("I have all these great genes but they're recessive", "sentence"));
  }

  @Test
  public void test7() {
    assertEquals("I ekil smixam taht t'nod egaruocne roivaheb noitacifidom",
        Challenge.flip("I like maxims that don't encourage behavior modification", "word"));
  }

  @Test
  public void test8() {
    assertEquals("modification behavior encourage don't that maxims like I",
        Challenge.flip("I like maxims that don't encourage behavior modification", "sentence"));
  }
}

// Quotes credit: Bill Watterson