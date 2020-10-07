package my.sunghyuk.edabit.hard;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
  private Program() {

  }

  /**
   * Positives and Negatives
   * @see https://edabit.com/challenge/hYq8J8HJM3pwCFKiZ
   * @param arr
   * @return 정수 배열이 양의 정수, 음의 정수가 번갈아가며 이루어져 있는가. 어떤 수로 시작하든 상관없음. 요소에 0이 포함되면 false 리턴
   */
  public static boolean alternateSign(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      // 아래의 for문에서 i < arr.length - 1의 조건 때문에 요소가 한 개인 경우 arr[0] 실행 안 됨.
      if (arr[i] == 0) {
        return false;
      }
    }
    for (int i = 0; i < arr.length - 1; i++) {
      // System.out.println("arr[" + i + "] : " + arr[i]);
      if (arr[i] >= 0 && arr[i + 1] >= 0) {
        return false;
      }
      if (arr[i] <= 0 && arr[i + 1] <= 0) {
        return false;
      }
    }
    return true;
  }

  /**
   * String or Integer?
   * @see https://edabit.com/challenge/paaguQWznz2cPNCiA
   * @param var
   * @return Object 타입의 매개변수 var가 정수면 "int", 문자열이면 "str" 리턴
   */
  public static String intOrString(Object var) {
    /* String varStr = String.valueOf(var);
    if (varStr.equals(var)) {
      return "str";
    }
    if (varStr.equals(String.valueOf(var))) {
      return "int";
    }
    return ""; */

    // Other Solution
    return var instanceof String ? "str" : "int";
  }

  /**
   * In the Centre?
   * @see https://edabit.com/challenge/qbhH4bef2N275iQ2Z
   * @param str
   * @return 주어진 문자열 str은 대부분의 공백과 공백이 아닌 문자 하나의 조합으로 이루어져 있다. 이 문자열에서 공백이 아닌 문자의 위치는 문자열에 중앙에 있는가. isCentered("  #  ") ➞ true
   */
  public static boolean isCentered(String str) {
    /* String centreCh = "";
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != ' ') {
        centreCh = String.valueOf(str.charAt(i));
      }
    }
    return str.substring(0, str.indexOf(centreCh)).length() == str.substring(str.indexOf(centreCh) + 1).length(); */

    // Other Solution
    /* int i = 0;
    int j = 0;
    while (str.charAt(i) == ' ') {
      i++;
    }
    while (str.charAt(str.length() - 1 - j) == ' ') {
      j++;
    }
    return i == j; */

    // Other Solution
    /* for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
      if (str.charAt(i) != str.charAt(j)) {
        return false;
      }
    }
    return true; */

    // Other Solution
    return str.equals(new StringBuilder(str).reverse().toString());
  }

  /**
   * Exact Factorial Bounds
   * @see https://edabit.com/challenge/hTWrPnnCScgSsoN9A
   * @param n
   * @return 주어진 n이 팩토리얼 숫자인가. 그렇다면 n과 팩토리얼 수열에서의 마지막 값을 배열로 리턴, 아니라면 빈 배열 리턴. 재귀함수로 풀 수 있음.
   */
  public static long[] isExact(long n) {
    long factorialNum = 1;
    long i = 1;
    while (factorialNum < n) {
      factorialNum *= i;
      if (factorialNum == n) {
        return new long[] { n, i };
      }
      i++;
    }
    return new long[] {};
  }

  /**
   * Filter out Strings from an Array
   * @see https://edabit.com/challenge/vNszi3mbJA5BhgGFX
   * @param str
   * @return 문자열 배열에서 음수 값을 나타내지 않는 문자열만 배열로 리턴. 0은 음수 아님. 배열의 순서 유지, 중복된 요소는 제거. filterArray([1, 2, "aasf", "1", "123", 123]) ➞ [1, 2, 123]
   */
  public static String[] filterArray(String[] str) {
    for (int i = 0; i < str.length; i++) {
      str[i] = str[i].replaceAll("[^0-9]", "");
    }
    Set<String> numSet = new LinkedHashSet<>();
    for (int i = 0; i < str.length; i++) {
      if (!str[i].equals("")) {
        numSet.add(str[i]);
      }
    }
    return numSet.toArray(new String[numSet.size()]);
  }
}