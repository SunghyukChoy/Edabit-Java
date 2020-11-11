package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GetMissingTests {

  @Test
  public void test01() {
    assertEquals("hijklmno", Program.getMissing("abcdefgpqrstuvwxyz"));
  }

  @Test
  public void test02() {
    assertEquals("abcdefghijklmnop", Program.getMissing("zyxwvutsrq"));
  }

  @Test
  public void test03() {
    assertEquals("abcdefghijklmnopqrstuvwxyz", Program.getMissing(""));
  }

  @Test
  public void test04() {
    assertEquals("", Program.getMissing("abcdefghijklmnopqrstuvwxyz"));
  }

  @Test
  public void test05() {
    assertEquals("abcdefghkloprstuvxyz", Program.getMissing("qinjwm"));
  }

  @Test
  public void test06() {
    assertEquals("bcdfjmnosvxy", Program.getMissing("luiqtkgwzheapr"));
  }

  @Test
  public void test07() {
    assertEquals("bcdefghilmoprstuvwxyz", Program.getMissing("qankj"));
  }

  @Test
  public void test08() {
    assertEquals("hjlq", Program.getMissing("bawgeuskmfcrpodnxztviy"));
  }

  @Test
  public void test09() {
    assertEquals("bcefhijklmoqrstuvwxyz", Program.getMissing("gdpna"));
  }

  @Test
  public void test10() {
    assertEquals("acdefgjklmnopqrstuvwxyz", Program.getMissing("hbi"));
  }

  @Test
  public void test11() {
    assertEquals("egr", Program.getMissing("djxifockvwhaqbnmstzpylu"));
  }

  @Test
  public void test12() {
    assertEquals("behiklquy", Program.getMissing("gastzwjcnvoprfmxd"));
  }

  @Test
  public void test13() {
    assertEquals("abcdefghjklmnopqrsvwyz", Program.getMissing("xuti"));
  }

  @Test
  public void test14() {
    assertEquals("defghijklmnopqrstuvwxyz", Program.getMissing("abc"));
  }

  @Test
  public void test15() {
    assertEquals("efglnxz", Program.getMissing("kchiatvmbqrdsyopwju"));
  }

  @Test
  public void test16() {
    assertEquals("acdefghilmnopqrstuvwyz", Program.getMissing("xbkj"));
  }

  @Test
  public void test17() {
    assertEquals("adfghijlmnpqtuwxz", Program.getMissing("cbvkyroes"));
  }

  @Test
  public void test18() {
    assertEquals("abcdefghijklmnopqrtuvwxyz", Program.getMissing("s"));
  }

  @Test
  public void test19() {
    assertEquals("aknpqrxy", Program.getMissing("idvgzujmswloefcthb"));
  }

  @Test
  public void test20() {
    assertEquals("bilnpqsw", Program.getMissing("fmoraygevhkxzutcjd"));
  }

  @Test
  public void test21() {
    assertEquals("bcdeghijklmorstwxz", Program.getMissing("vuynqpaf"));
  }

  @Test
  public void test22() {
    assertEquals("abcdefghiklmnopqrstuvwxyz", Program.getMissing("j"));
  }

}
// end of tests