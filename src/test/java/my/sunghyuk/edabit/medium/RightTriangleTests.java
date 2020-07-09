package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RightTriangleTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.rightTriangle(3, 4, 5));
  }

  @Test
  public void test2() {
    assertEquals(true, Challenge.rightTriangle(145, 105, 100));
  }

  @Test
  public void test3() {
    assertEquals(false, Challenge.rightTriangle(70, 130, 110));
  }

  @Test
  public void test4() {
    assertEquals(false, Challenge.rightTriangle(60, 60, 60));
  }

  @Test
  public void test5() {
    System.out.println("A triangle can't have an edge of length 0.");
    assertEquals(false, Challenge.rightTriangle(0, 4, 4));
  }

  @Test
  public void test6() {
    System.out.println("A triangle can't have edges of negative length.");
    assertEquals(false, Challenge.rightTriangle(-3, 4, 5));
  }

  @Test
  public void test7() {
    assertEquals(true, Challenge.rightTriangle(115, 277, 252));
  }

  @Test
  public void test8() {
    assertEquals(false, Challenge.rightTriangle(140, 170, 220));
  }

  @Test
  public void test9() {
    assertEquals(true, Challenge.rightTriangle(915, 1748, 1973));
  }
}