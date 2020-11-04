package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GetFilenameTests {

  /** 
  --------------------------------------- 
  TestGen 2.1 for JUnit 4.13.0 		
  Test Case: DirectoryPath::getFilename 
  Timestamp: 11/4/2020 1:41:16 AM 
  --------------------------------------- 
  ® DARKKO 2020 © 
  **/

  @Test
  public void test01() {
    assertEquals("edabit.txt", Program.getFilename("C:/Projects/pil_tests/ascii/edabit.txt"));
  }

  @Test
  public void test02() {
    assertEquals("Beethoven_5.mp3", Program.getFilename("C:/Users/johnsmith/Music/Beethoven_5.mp3"));
  }

  @Test
  public void test03() {
    assertEquals("ffprobe.exe", Program.getFilename("ffprobe.exe"));
  }

  @Test
  public void test04() {
    assertEquals("unfinished2.midi", Program.getFilename("Music/Drafts/unfinished2.midi"));
  }

  @Test
  public void test05() {
    assertEquals("Atom.lnk", Program.getFilename("C:/Users/chad/OneDrive/Desktop/Atom.lnk"));
  }

  @Test
  public void test06() {
    assertEquals("DDLC.exe", Program.getFilename("senoron/OneDrive/Desktop/DDLC-1.1.1-pc/lib/windows-i686/DDLC.exe"));
  }

  @Test
  public void test07() {
    assertEquals("lombok.jar", Program.getFilename("Users/darkko/Downloads/lombok.jar"));
  }

  @Test
  public void test08() {
    assertEquals("geo_count.pdf", Program.getFilename("D:/Math/geometry/Lessons/1/geo_count.pdf"));
  }

  @Test
  public void test09() {
    assertEquals("bed_of_roses.mp3", Program.getFilename("Users/Music/Albums/Unplugged/JonBonJovi/bed_of_roses.mp3"));
  }
}
