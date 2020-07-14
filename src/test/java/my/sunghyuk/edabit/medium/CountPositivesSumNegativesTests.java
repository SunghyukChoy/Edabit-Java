package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.JUnit4;

public class CountPositivesSumNegativesTests {
  @Test
  public void test1() {
    int[] expectedResult = new int[] { 10, -65 };
    assertArrayEquals(expectedResult,
        Program.countPositivesSumNegatives(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15 }));
  }

  @Test
  public void test2() {
    int[] expectedResult = new int[] { 7, -252 };
    assertArrayEquals(expectedResult,
        Program.countPositivesSumNegatives(new int[] { 92, 6, 73, -77, 81, -90, 99, 8, -85, 34 }));
  }

  @Test
  public void test3() {
    int[] expectedResult = new int[] {};
    assertArrayEquals(expectedResult, Program.countPositivesSumNegatives(null));
  }

  @Test
  public void test4() {
    int[] expectedResult = new int[] {};
    assertArrayEquals(expectedResult, Program.countPositivesSumNegatives(new int[] {}));
  }

  @Test
  public void random_tests() {
    for (int i = 0; i < 20; i++) {
      int elementsNumber = (int) Math.floor(Math.random() * 100);
      int[] input = new int[elementsNumber];
      for (int j = 0; j < elementsNumber; j++) {
        input[j] = (int) Math.floor(Math.random() * 1000) - 500;
      }

      int[] expected = new int[0];
      if (elementsNumber > 0) {
        int countPositives = 0;
        int sumNegatives = 0;
        for (int ti = 0; ti < input.length; ti++) {
          if (input[ti] > 0) {
            countPositives++;
          }
          if (input[ti] < 0) {
            sumNegatives += input[ti];
          }
        }
        expected = new int[] { countPositives, sumNegatives };
      }

      assertArrayEquals(expected, Program.countPositivesSumNegatives(input));
    }
  }
}