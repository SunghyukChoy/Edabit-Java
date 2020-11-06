package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IndexFilteringTests {

  @Test
  public void test01() {
    assertEquals("tune", Program.indexFilter(new int[] { 2, 3, 8, 11 }, "Autumn in New York"));
  }

  @Test
  public void test02() {
    assertEquals("creamy", Program.indexFilter(new int[] { 0, 1, 5, 7, 4, 2 }, "Cry me a river"));
  }

  @Test
  public void test03() {
    assertEquals("frank sinatra", Program.indexFilter(new int[] { 9, -9, 2, 27, 36, 6, 5, 13, -1, 2, 0, 30, 2 },
        "That's life, I've got you under my skin"));
  }

  @Test
  public void test04() {
    assertEquals("ella", Program.indexFilter(new int[] { -1, 8, 8, 3 }, "Dream a Little Dream of Me"));
  }

}