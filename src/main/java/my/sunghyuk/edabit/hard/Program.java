package my.sunghyuk.edabit.hard;

import java.util.Arrays;

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
}