package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FindZipTests {
  @Test
  public void test1() {
    assertEquals(18, Challenge.findZip("all zip files are zipped"));
  }

  @Test
  public void test2() {
    assertEquals(-1, Challenge.findZip("all zip files are compressed"));
  }

  @Test
  public void test3() {
    assertEquals(-1, Challenge.findZip(
        "We believe university-level zip education can be both high quality and low cost. Using the economics of the Internet, we've connected some of the greatest teachers to hundreds of thousands of students all over the world."));
  }

  @Test
  public void test4() {
    assertEquals(169, Challenge.findZip(
        "Zip is a file format used for data compression and archiving. A zip file contains one or more files that have been compressed, to reduce file size, or stored as is. The zip file format permits a number of compression algorithms."));
  }
}