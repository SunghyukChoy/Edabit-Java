package my.sunghyuk.edabit.medium;

/**
 *
 * @author edwardclark
 */
import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class GetBirthdayCakeTests {
  @Test
  public void test1() {
    assertThat(Challenge.getBirthdayCake("Jack", 10), is(new String[] { "##############################",
        "# 10 Happy Birthday Jack! 10 #", "##############################" }));
  }

  @Test
  public void test2() {
    assertThat(Challenge.getBirthdayCake("Russell", 19), is(new String[] { "*********************************",
        "* 19 Happy Birthday Russell! 19 *", "*********************************" }));
  }

  @Test
  public void test3() {
    assertThat(Challenge.getBirthdayCake("Isabelle", 2), is(new String[] { "################################",
        "# 2 Happy Birthday Isabelle! 2 #", "################################" }));
  }

  @Test
  public void test4() {
    assertThat(Challenge.getBirthdayCake("Princess", 40), is(new String[] { "##################################",
        "# 40 Happy Birthday Princess! 40 #", "##################################" }));
  }

  @Test
  public void test5() {
    assertThat(Challenge.getBirthdayCake("Maxwell", 85), is(new String[] { "*********************************",
        "* 85 Happy Birthday Maxwell! 85 *", "*********************************" }));
  }

  @Test
  public void test6() {
    assertThat(Challenge.getBirthdayCake("Zenobia", 63), is(new String[] { "*********************************",
        "* 63 Happy Birthday Zenobia! 63 *", "*********************************" }));
  }

  @Test
  public void test7() {
    assertThat(Challenge.getBirthdayCake("Adrian", 91), is(new String[] { "********************************",
        "* 91 Happy Birthday Adrian! 91 *", "********************************" }));
  }

  @Test
  public void test8() {
    assertThat(Challenge.getBirthdayCake("Gayle", 28), is(new String[] { "###############################",
        "# 28 Happy Birthday Gayle! 28 #", "###############################" }));
  }

  @Test
  public void test9() {
    assertThat(Challenge.getBirthdayCake("Jo", 69), is(new String[] { "****************************",
        "* 69 Happy Birthday Jo! 69 *", "****************************" }));
  }

  @Test
  public void test10() {
    assertThat(Challenge.getBirthdayCake("Val", 80), is(new String[] { "#############################",
        "# 80 Happy Birthday Val! 80 #", "#############################" }));
  }

  @Test
  public void test11() {
    assertThat(Challenge.getBirthdayCake("Jo", 22), is(new String[] { "############################",
        "# 22 Happy Birthday Jo! 22 #", "############################" }));
  }

  @Test
  public void test12() {
    assertThat(Challenge.getBirthdayCake("Gayle", 4), is(new String[] { "#############################",
        "# 4 Happy Birthday Gayle! 4 #", "#############################" }));
  }

  @Test
  public void test13() {
    assertThat(Challenge.getBirthdayCake("Norine", 24), is(new String[] { "################################",
        "# 24 Happy Birthday Norine! 24 #", "################################" }));
  }

  @Test
  public void test14() {
    assertThat(Challenge.getBirthdayCake("Val", 63), is(new String[] { "*****************************",
        "* 63 Happy Birthday Val! 63 *", "*****************************" }));
  }

  @Test
  public void test15() {
    assertThat(Challenge.getBirthdayCake("Gayle", 25), is(new String[] { "*******************************",
        "* 25 Happy Birthday Gayle! 25 *", "*******************************" }));
  }

  @Test
  public void test16() {
    assertThat(Challenge.getBirthdayCake("Princess", 52), is(new String[] { "##################################",
        "# 52 Happy Birthday Princess! 52 #", "##################################" }));
  }

  @Test
  public void test17() {
    assertThat(Challenge.getBirthdayCake("Adrian", 90), is(new String[] { "################################",
        "# 90 Happy Birthday Adrian! 90 #", "################################" }));
  }

  @Test
  public void test18() {
    assertThat(Challenge.getBirthdayCake("Loyd", 90), is(new String[] { "##############################",
        "# 90 Happy Birthday Loyd! 90 #", "##############################" }));
  }

  @Test
  public void test19() {
    assertThat(Challenge.getBirthdayCake("Shelia", 76), is(new String[] { "################################",
        "# 76 Happy Birthday Shelia! 76 #", "################################" }));
  }

  @Test
  public void test20() {
    assertThat(Challenge.getBirthdayCake("Evangelina", 75), is(new String[] { "************************************",
        "* 75 Happy Birthday Evangelina! 75 *", "************************************" }));
  }

  @Test
  public void test21() {
    assertThat(Challenge.getBirthdayCake("Lorenzo", 15), is(new String[] { "*********************************",
        "* 15 Happy Birthday Lorenzo! 15 *", "*********************************" }));
  }

  @Test
  public void test22() {
    assertThat(Challenge.getBirthdayCake("Riva", 4), is(new String[] { "############################",
        "# 4 Happy Birthday Riva! 4 #", "############################" }));
  }

  @Test
  public void test23() {
    assertThat(Challenge.getBirthdayCake("Fletcher", 72), is(new String[] { "##################################",
        "# 72 Happy Birthday Fletcher! 72 #", "##################################" }));
  }

  @Test
  public void test24() {
    assertThat(Challenge.getBirthdayCake("Hulda", 51), is(new String[] { "*******************************",
        "* 51 Happy Birthday Hulda! 51 *", "*******************************" }));
  }

  @Test
  public void test25() {
    assertThat(Challenge.getBirthdayCake("Bari", 15), is(new String[] { "******************************",
        "* 15 Happy Birthday Bari! 15 *", "******************************" }));
  }

  @Test
  public void test26() {
    assertThat(Challenge.getBirthdayCake("Dorris", 48), is(new String[] { "################################",
        "# 48 Happy Birthday Dorris! 48 #", "################################" }));
  }

  @Test
  public void test27() {
    assertThat(Challenge.getBirthdayCake("Ervin", 83), is(new String[] { "*******************************",
        "* 83 Happy Birthday Ervin! 83 *", "*******************************" }));
  }

  @Test
  public void test28() {
    assertThat(Challenge.getBirthdayCake("Cherelle", 80), is(new String[] { "##################################",
        "# 80 Happy Birthday Cherelle! 80 #", "##################################" }));
  }

  @Test
  public void test29() {
    assertThat(Challenge.getBirthdayCake("Deedee", 93), is(new String[] { "********************************",
        "* 93 Happy Birthday Deedee! 93 *", "********************************" }));
  }

  @Test
  public void test30() {
    assertThat(Challenge.getBirthdayCake("Youlanda", 29), is(new String[] { "**********************************",
        "* 29 Happy Birthday Youlanda! 29 *", "**********************************" }));
  }

  @Test
  public void test31() {
    assertThat(Challenge.getBirthdayCake("Deedee", 48), is(new String[] { "################################",
        "# 48 Happy Birthday Deedee! 48 #", "################################" }));
  }

  @Test
  public void test32() {
    assertThat(Challenge.getBirthdayCake("Kristine", 6), is(new String[] { "################################",
        "# 6 Happy Birthday Kristine! 6 #", "################################" }));
  }

  @Test
  public void test33() {
    assertThat(Challenge.getBirthdayCake("Kristine", 43), is(new String[] { "**********************************",
        "* 43 Happy Birthday Kristine! 43 *", "**********************************" }));
  }

  @Test
  public void test34() {
    assertThat(Challenge.getBirthdayCake("Fletcher", 61), is(new String[] { "**********************************",
        "* 61 Happy Birthday Fletcher! 61 *", "**********************************" }));
  }

  @Test
  public void test35() {
    assertThat(Challenge.getBirthdayCake("Bari", 94), is(new String[] { "##############################",
        "# 94 Happy Birthday Bari! 94 #", "##############################" }));
  }

  @Test
  public void test36() {
    assertThat(Challenge.getBirthdayCake("Clotilde", 35), is(new String[] { "**********************************",
        "* 35 Happy Birthday Clotilde! 35 *", "**********************************" }));
  }

  @Test
  public void test37() {
    assertThat(Challenge.getBirthdayCake("Ervin", 98), is(new String[] { "###############################",
        "# 98 Happy Birthday Ervin! 98 #", "###############################" }));
  }

  @Test
  public void test38() {
    assertThat(Challenge.getBirthdayCake("Margot", 89), is(new String[] { "********************************",
        "* 89 Happy Birthday Margot! 89 *", "********************************" }));
  }

  @Test
  public void test39() {
    assertThat(Challenge.getBirthdayCake("Shelia", 8), is(new String[] { "##############################",
        "# 8 Happy Birthday Shelia! 8 #", "##############################" }));
  }

  @Test
  public void test40() {
    assertThat(Challenge.getBirthdayCake("Clotilde", 46), is(new String[] { "##################################",
        "# 46 Happy Birthday Clotilde! 46 #", "##################################" }));
  }

  @Test
  public void test41() {
    assertThat(Challenge.getBirthdayCake("Riva", 1), is(new String[] { "****************************",
        "* 1 Happy Birthday Riva! 1 *", "****************************" }));
  }

  @Test
  public void test42() {
    assertThat(Challenge.getBirthdayCake("Bobby", 89), is(new String[] { "*******************************",
        "* 89 Happy Birthday Bobby! 89 *", "*******************************" }));
  }

  @Test
  public void test43() {
    assertThat(Challenge.getBirthdayCake("Riva", 8), is(new String[] { "############################",
        "# 8 Happy Birthday Riva! 8 #", "############################" }));
  }

  @Test
  public void test44() {
    assertThat(Challenge.getBirthdayCake("Todd", 32), is(new String[] { "##############################",
        "# 32 Happy Birthday Todd! 32 #", "##############################" }));
  }

  @Test
  public void test45() {
    assertThat(Challenge.getBirthdayCake("Jefferey", 49), is(new String[] { "**********************************",
        "* 49 Happy Birthday Jefferey! 49 *", "**********************************" }));
  }

  @Test
  public void test46() {
    assertThat(Challenge.getBirthdayCake("Cherelle", 44), is(new String[] { "##################################",
        "# 44 Happy Birthday Cherelle! 44 #", "##################################" }));
  }

  @Test
  public void test47() {
    assertThat(Challenge.getBirthdayCake("Jacques", 7), is(new String[] { "*******************************",
        "* 7 Happy Birthday Jacques! 7 *", "*******************************" }));
  }

  @Test
  public void test48() {
    assertThat(Challenge.getBirthdayCake("Maxwell", 84), is(new String[] { "#################################",
        "# 84 Happy Birthday Maxwell! 84 #", "#################################" }));
  }

  @Test
  public void test49() {
    assertThat(Challenge.getBirthdayCake("Clotilde", 92), is(new String[] { "##################################",
        "# 92 Happy Birthday Clotilde! 92 #", "##################################" }));
  }

  @Test
  public void test50() {
    assertThat(Challenge.getBirthdayCake("Evangelina", 60), is(new String[] { "####################################",
        "# 60 Happy Birthday Evangelina! 60 #", "####################################" }));
  }

  @Test
  public void test51() {
    assertThat(Challenge.getBirthdayCake("Dorris", 54), is(new String[] { "################################",
        "# 54 Happy Birthday Dorris! 54 #", "################################" }));
  }

  @Test
  public void test52() {
    assertThat(Challenge.getBirthdayCake("Jacqulyn", 52), is(new String[] { "##################################",
        "# 52 Happy Birthday Jacqulyn! 52 #", "##################################" }));
  }

  @Test
  public void test53() {
    assertThat(Challenge.getBirthdayCake("Lucrecia", 95), is(new String[] { "**********************************",
        "* 95 Happy Birthday Lucrecia! 95 *", "**********************************" }));
  }

  @Test
  public void test54() {
    assertThat(Challenge.getBirthdayCake("Shelia", 75), is(new String[] { "********************************",
        "* 75 Happy Birthday Shelia! 75 *", "********************************" }));
  }

  @Test
  public void test55() {
    assertThat(Challenge.getBirthdayCake("Gayle", 59), is(new String[] { "*******************************",
        "* 59 Happy Birthday Gayle! 59 *", "*******************************" }));
  }

  @Test
  public void test56() {
    assertThat(Challenge.getBirthdayCake("Margot", 25), is(new String[] { "********************************",
        "* 25 Happy Birthday Margot! 25 *", "********************************" }));
  }

  @Test
  public void test57() {
    assertThat(Challenge.getBirthdayCake("Hulda", 55), is(new String[] { "*******************************",
        "* 55 Happy Birthday Hulda! 55 *", "*******************************" }));
  }

  @Test
  public void test58() {
    assertThat(Challenge.getBirthdayCake("Adrian", 23), is(new String[] { "********************************",
        "* 23 Happy Birthday Adrian! 23 *", "********************************" }));
  }

  @Test
  public void test59() {
    assertThat(Challenge.getBirthdayCake("Stephine", 48), is(new String[] { "##################################",
        "# 48 Happy Birthday Stephine! 48 #", "##################################" }));
  }

  @Test
  public void test60() {
    assertThat(Challenge.getBirthdayCake("Loyd", 23), is(new String[] { "******************************",
        "* 23 Happy Birthday Loyd! 23 *", "******************************" }));
  }

  @Test
  public void test61() {
    assertThat(Challenge.getBirthdayCake("Dorris", 5), is(new String[] { "******************************",
        "* 5 Happy Birthday Dorris! 5 *", "******************************" }));
  }

  @Test
  public void test62() {
    assertThat(Challenge.getBirthdayCake("Riva", 41), is(new String[] { "******************************",
        "* 41 Happy Birthday Riva! 41 *", "******************************" }));
  }

  @Test
  public void test63() {
    assertThat(Challenge.getBirthdayCake("Evangelina", 97), is(new String[] { "************************************",
        "* 97 Happy Birthday Evangelina! 97 *", "************************************" }));
  }

  @Test
  public void test64() {
    assertThat(Challenge.getBirthdayCake("Jacques", 68), is(new String[] { "#################################",
        "# 68 Happy Birthday Jacques! 68 #", "#################################" }));
  }

  @Test
  public void test65() {
    assertThat(Challenge.getBirthdayCake("Todd", 53), is(new String[] { "******************************",
        "* 53 Happy Birthday Todd! 53 *", "******************************" }));
  }

  @Test
  public void test66() {
    assertThat(Challenge.getBirthdayCake("Agnus", 18), is(new String[] { "###############################",
        "# 18 Happy Birthday Agnus! 18 #", "###############################" }));
  }

  @Test
  public void test67() {
    assertThat(Challenge.getBirthdayCake("Vernita", 88), is(new String[] { "#################################",
        "# 88 Happy Birthday Vernita! 88 #", "#################################" }));
  }

  @Test
  public void test68() {
    assertThat(Challenge.getBirthdayCake("Gayle", 7), is(new String[] { "*****************************",
        "* 7 Happy Birthday Gayle! 7 *", "*****************************" }));
  }

  @Test
  public void test69() {
    assertThat(Challenge.getBirthdayCake("Jacques", 95), is(new String[] { "*********************************",
        "* 95 Happy Birthday Jacques! 95 *", "*********************************" }));
  }

  @Test
  public void test70() {
    assertThat(Challenge.getBirthdayCake("Kasandra", 57), is(new String[] { "**********************************",
        "* 57 Happy Birthday Kasandra! 57 *", "**********************************" }));
  }

  @Test
  public void test71() {
    assertThat(Challenge.getBirthdayCake("Phoebe", 39), is(new String[] { "********************************",
        "* 39 Happy Birthday Phoebe! 39 *", "********************************" }));
  }

  @Test
  public void test72() {
    assertThat(Challenge.getBirthdayCake("Fletcher", 76), is(new String[] { "##################################",
        "# 76 Happy Birthday Fletcher! 76 #", "##################################" }));
  }

  @Test
  public void test73() {
    assertThat(Challenge.getBirthdayCake("Kristine", 12), is(new String[] { "##################################",
        "# 12 Happy Birthday Kristine! 12 #", "##################################" }));
  }

}