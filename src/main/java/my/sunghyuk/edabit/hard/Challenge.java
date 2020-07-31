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
}