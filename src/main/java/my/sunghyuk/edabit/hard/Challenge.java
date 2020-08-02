package my.sunghyuk.edabit.hard;

import java.util.Arrays;

public class Challenge {

  /**
   * Seven Boom!
   * 정수형 배열의 요소 중에 숫자 7이 들어가면 "Boom!", 아니면 "there is no 7 in the array" 리턴.
   * @see https://edabit.com/challenge/CKqfEowjmSTw2jsso
   * @param arr
   * @return
   */
  public static String sevenBoom(int[] arr) {
    /* StringBuilder sb = new StringBuilder();
    for (int num : arr) {
      sb.append(num);
    }
    String[] chArr = sb.toString().split("");
    for (String character : chArr) {
      if (character.equals("7")) {
        return "Boom!";
      }
    }
    return "there is no 7 in the array"; */

    // Other Solution
    /* for (int i = 0; i < arr.length; i++) {
      while (arr[i] != 0) {
        if (arr[i] / 10 == 7 || arr[i] % 10 == 7) {
          return "Boom!";
        }
        arr[i] /= 10;
      }
    }
    return "there is no 7 in the array"; */

    // Other Solution
    return Arrays.toString(arr).contains("7") ? "Boom!" : "there is no 7 in the array";
  }

  /**
   * Consecutive Numbers
   * 배열의 요소가 연속된 숫자인가. 연속적인 요소가 아니거나 중복 요소가 있으면 false반환.
   * @see https://edabit.com/challenge/Md6usCHQ7Xsj2fQi3
   * @param arr
   * @return
   */
  public static boolean cons(int[] arr) {
    Arrays.sort(arr);    
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i + 1] - arr[i] != 1) {
        return false;
      }
    }
    return true;
  }
}