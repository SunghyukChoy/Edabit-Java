package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RemoveSpecialCharactersTests {
  @Test
  public void test1() {
    assertEquals("The quick brown fox", EasyProgram.removeSpecialCharacters("The quick brown fox!"));
  }
	
	@Test
  public void test2() {
    assertEquals("fd76fd-6GvKlO", EasyProgram.removeSpecialCharacters("%fd76$fd(-)6GvKlO."));
  }
	
	@Test
  public void test3() {
    assertEquals("D0nc sed 0di0 du1", EasyProgram.removeSpecialCharacters("D0n$c sed 0di0 du1"));
  }
	
	@Test
  public void test4() {
    assertEquals("cat_picjpeg", EasyProgram.removeSpecialCharacters("cat_pic.jpeg"));
  }
	
	@Test
  public void test5() {
    assertEquals("519-555-8093", EasyProgram.removeSpecialCharacters("519-555-8093"));
  }
	
	@Test
  public void test6() {
    assertEquals("h-drf_", EasyProgram.removeSpecialCharacters("h-d+=rf[]_{}<>.,`~!@#$%^&*(|)"));
  }
	
	@Test
  public void test7() {
    assertEquals("Etiam porta sem malesu-ada magna mollis euismod", EasyProgram.removeSpecialCharacters("Etiam#!!!!!,,, [`po%rta ~sem!] {male*su-ada} (ma*gna) mo^llis... eui$smod???"));
  }
}