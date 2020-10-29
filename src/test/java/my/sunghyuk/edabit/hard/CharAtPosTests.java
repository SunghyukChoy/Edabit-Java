package my.sunghyuk.edabit.hard;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class CharAtPosTests {

  @Test
  public void test01() {
    assertArrayEquals(new Character[] { 'E', 'A', 'I' },
        Program.charAtPos(new Character[] { 'E', 'D', 'A', 'B', 'I', 'T' }, "even"));
  }

  @Test
  public void test02() {
    assertArrayEquals(new Character[] { 'D', 'B', 'T' },
        Program.charAtPos(new Character[] { 'E', 'D', 'A', 'B', 'I', 'T' }, "odd"));
  }

  @Test
  public void test03() {
    assertArrayEquals(new Character[] { 'Q', 'E', 'T', 'U', 'O' },
        Program.charAtPos(new Character[] { 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P' }, "even"));
  }

  @Test
  public void test04() {
    assertArrayEquals(new Character[] { 'O', 'U', 'T', 'E', 'Q' },
        Program.charAtPos(new Character[] { 'P', 'O', 'I', 'U', 'Y', 'T', 'R', 'E', 'W', 'Q' }, "odd"));
  }

  @Test
  public void test05() {
    assertArrayEquals(new Character[] { 'S', 'F', 'H', 'K', 'Z' },
        Program.charAtPos(new Character[] { 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z' }, "odd"));
  }

  @Test
  public void test06() {
    assertArrayEquals(new Character[] { 'A', 'D', 'G', 'J', 'L' },
        Program.charAtPos(new Character[] { 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z' }, "even"));
  }

  @Test
  public void test07() {
    assertArrayEquals(new Integer[] { 4, 8 }, Program.charAtPos(new Integer[] { 2, 4, 6, 8, 10 }, "even"));
  }

  @Test
  public void test08() {
    assertArrayEquals(new Integer[] { 2, 4, 6, 8, 10 },
        Program.charAtPos(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, "odd"));
  }

  @Test
  public void test09() {
    assertArrayEquals(new String[] { "@", "$", "^", "*", ")" },
        Program.charAtPos(new String[] { "!", "@", "#", "$", "%", "^", "&", "*", "(", ")" }, "odd"));
  }

  @Test
  public void test10() {
    assertArrayEquals(new String[] { "(", "&", "%", "#", "!" },
        Program.charAtPos(new String[] { ")", "(", "*", "&", "^", "%", "$", "#", "@", "!" }, "odd"));
  }

  @Test
  public void test11() {
    assertArrayEquals(new String[] { "O", "B", "T", "Y" },
        Program.charAtPos(new String[] { "O", "R", "B", "I", "T", "L", "Y" }, "odd"));
  }

  @Test
  public void test12() {
    assertArrayEquals(new String[] { "R", "I", "L" },
        Program.charAtPos(new String[] { "O", "R", "B", "I", "T", "L", "Y" }, "even"));
  }
}
