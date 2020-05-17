package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RemoveSpecialCharactersTests {
  @Test
  public void test1() {
    assertEquals("The quick brown fox", Program.removeSpecialCharacters("The quick brown fox!"));
  }
	
	@Test
  public void test2() {
    assertEquals("fd76fd-6GvKlO", Program.removeSpecialCharacters("%fd76$fd(-)6GvKlO."));
  }
	
	@Test
  public void test3() {
    assertEquals("D0nc sed 0di0 du1", Program.removeSpecialCharacters("D0n$c sed 0di0 du1"));
  }
	
	@Test
  public void test4() {
    assertEquals("cat_picjpeg", Program.removeSpecialCharacters("cat_pic.jpeg"));
  }
	
	@Test
  public void test5() {
    assertEquals("519-555-8093", Program.removeSpecialCharacters("519-555-8093"));
  }
	
	@Test
  public void test6() {
    assertEquals("h-drf_", Program.removeSpecialCharacters("h-d+=rf[]_{}<>.,`~!@#$%^&*(|)"));
  }
	
	@Test
  public void test7() {
    assertEquals("Etiam porta sem malesu-ada magna mollis euismod", Program.removeSpecialCharacters("Etiam#!!!!!,,, [`po%rta ~sem!] {male*su-ada} (ma*gna) mo^llis... eui$smod???"));
  }
}