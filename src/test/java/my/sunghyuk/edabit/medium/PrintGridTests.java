package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrintGridTests {

  @Test
  public void printGrid36() {
    String res = "1, 4, 7, 10, 13, 16\n" + "2, 5, 8, 11, 14, 17\n" + "3, 6, 9, 12, 15, 18";
    assertEquals(res, Challenge.printGrid(3, 6));
  }

  @Test
  public void printGrid53() {
    String res = "1, 6, 11\n" + "2, 7, 12\n" + "3, 8, 13\n" + "4, 9, 14\n" + "5, 10, 15";
    assertEquals(res, Challenge.printGrid(5, 3));
  }

  @Test
  public void printGrid41() {
    String res = "1\n" + "2\n" + "3\n" + "4";
    assertEquals(res, Challenge.printGrid(4, 1));
  }

  @Test
  public void printGrid13() {
    String res = "1, 2, 3";
    assertEquals(res, Challenge.printGrid(1, 3));
  }

  @Test
  public void printGrid102() {
    String res = "1, 11\n" + "2, 12\n" + "3, 13\n" + "4, 14\n" + "5, 15\n" + "6, 16\n" + "7, 17\n" + "8, 18\n"
        + "9, 19\n" + "10, 20";
    assertEquals(res, Challenge.printGrid(10, 2));
  }
}
