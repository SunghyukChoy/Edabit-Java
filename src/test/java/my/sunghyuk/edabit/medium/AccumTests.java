package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AccumTests {

  @Test
  public void test1() {
    assertEquals("A-Bb-Ccc-Dddd", Challenge.accum("abcd"));
  }

  @Test
  public void test2() {
    assertEquals("R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy", Challenge.accum("RqaEzty"));
  }

  @Test
  public void test3() {
    assertEquals("C-Ww-Aaa-Tttt", Challenge.accum("cwAt"));
  }

  @Test
  public void test4() {
    assertEquals("V-Gg-Yyy-Cccc-Ddddd-Nnnnnn-Qqqqqqq-Aaaaaaaa", Challenge.accum("VgyCdnQa"));
  }

  @Test
  public void test5() {
    assertEquals("N-Rr-Bbb-Ssss-Ddddd-Nnnnnn-Ooooooo-Ssssssss-Mmmmmmmmm-Llllllllll", Challenge.accum("nRBSdNOsMl"));
  }

  @Test
  public void test6() {
    assertEquals("N-Uu-Eee", Challenge.accum("nuE"));
  }

  @Test
  public void test7() {
    assertEquals(
        "R-Ll-Ddd-Rrrr-Hhhhh-Zzzzzz-Uuuuuuu-Qqqqqqqq-Aaaaaaaaa-Qqqqqqqqqq-Sssssssssss-Oooooooooooo-Hhhhhhhhhhhhh-Eeeeeeeeeeeeee-Fffffffffffffff-Zzzzzzzzzzzzzzzz-Iiiiiiiiiiiiiiiii-Bbbbbbbbbbbbbbbbbb-Yyyyyyyyyyyyyyyyyyy-Oooooooooooooooooooo-Bbbbbbbbbbbbbbbbbbbbb-Tttttttttttttttttttttt-Mmmmmmmmmmmmmmmmmmmmmmm-Xxxxxxxxxxxxxxxxxxxxxxxx-Kkkkkkkkkkkkkkkkkkkkkkkkk-Ffffffffffffffffffffffffff-Ccccccccccccccccccccccccccc-Jjjjjjjjjjjjjjjjjjjjjjjjjjjj-Vvvvvvvvvvvvvvvvvvvvvvvvvvvvv-Eeeeeeeeeeeeeeeeeeeeeeeeeeeeee",
        Challenge.accum("RlDrhZuQaqsoHEfziByObtMxkFCJVe"));
  }

  @Test
  public void test8() {
    assertEquals("E-Xx-Ppp-Zzzz-Ppppp-Ffffff-Xxxxxxx", Challenge.accum("EXpzPFx"));
  }

  @Test
  public void test9() {
    assertEquals("N-Uu", Challenge.accum("NU"));
  }

  @Test
  public void test10() {
    assertEquals("G", Challenge.accum("g"));
  }
}