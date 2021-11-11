package my.sunghyuk.edabit.easy;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StutteringTests {

  @Test
  public void test01() {
    assertEquals("as... as... astounding!", Challenge.stuttering("astounding"));
  }

  @Test
  public void test02() {
    assertEquals("en... en... enticing!", Challenge.stuttering("enticing"));
  }

  @Test
  public void test03() {
    assertEquals("da... da... dazzling!", Challenge.stuttering("dazzling"));
  }

  @Test
  public void test04() {
    assertEquals("al... al... alluring!", Challenge.stuttering("alluring"));
  }

  @Test
  public void test05() {
    assertEquals("ou... ou... outstanding!", Challenge.stuttering("outstanding"));
  }

  @Test
  public void test06() {
    assertEquals("as... as... astonishing!", Challenge.stuttering("astonishing"));
  }

  @Test
  public void test07() {
    assertEquals("im... im... impressive!", Challenge.stuttering("impressive"));
  }

  @Test
  public void test08() {
    assertEquals("re... re... revolutionize!", Challenge.stuttering("revolutionize"));
  }

  @Test
  public void test09() {
    assertEquals("re... re... recurring!", Challenge.stuttering("recurring"));
  }

  @Test
  public void test10() {
    assertEquals("re... re... recollection!", Challenge.stuttering("recollection"));
  }

  @Test
  public void test11() {
    assertEquals("so... so... so!", Challenge.stuttering("so"));
  }

  @Test
  public void test12() {
    assertEquals("go... go... gorgeous!", Challenge.stuttering("gorgeous"));
  }

  @Test
  public void test13() {
    assertEquals("ca... ca... captivating!", Challenge.stuttering("captivating"));
  }

  @Test
  public void test14() {
    assertEquals("in... in... increasing!", Challenge.stuttering("increasing"));
  }

  @Test
  public void test15() {
    assertEquals("ad... ad... adventures!", Challenge.stuttering("adventures"));
  }

  @Test
  public void test16() {
    assertEquals("ta... ta... tantalizing!", Challenge.stuttering("tantalizing"));
  }

  @Test
  public void test17() {
    assertEquals("ac... ac... acceptable!", Challenge.stuttering("acceptable"));
  }

  @Test
  public void test18() {
    assertEquals("ac... ac... accountable!", Challenge.stuttering("accountable"));
  }

  @Test
  public void test19() {
    assertEquals("in... in... incredible!", Challenge.stuttering("incredible"));
  }

  @Test
  public void test20() {
    assertEquals("ex... ex... exquisite!", Challenge.stuttering("exquisite"));
  }

  @Test
  public void test21() {
    assertEquals("am... am... am!", Challenge.stuttering("am"));
  }

  @Test
  public void test22() {
    assertEquals("en... en... enduring!", Challenge.stuttering("enduring"));
  }

  @Test
  public void test23() {
    assertEquals("co... co... considering!", Challenge.stuttering("considering"));
  }
}
