package my.sunghyuk.edabit.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Program {

  private Program() {
  }

  /**
   * Alphabet Soup
   * 
   * @see https://edabit.com/challenge/2zKtCWQM2rSxMQqLX
   * @param s
   * @return
   */
  public static String alphabetSoup(String s) {
    /**
     * 1. 알파벳순으로 정렬
     */
    char[] sArray = s.toCharArray();
    Arrays.sort(sArray);

    return String.valueOf(sArray);
  }

  public static String alphabetSoupOtherSol(String s) {
    String[] letters = s.split("");
    Arrays.sort(letters);
    return String.join("", letters);
  }

  /**
  * Array of Multiples
  * 매개변수 num의 배수를 갖고, 길이는 매개변수 length인 배열 리턴
  * 
  * @see https://edabit.com/challenge/rzpucPyoyEtXPo2BG
  * @param num
  * @param length
  * @return
  */
  public static int[] arrayOfMultiples(int num, int length) {
    int[] multiplesArr = new int[length];

    for (int i = 0; i < length; i++) {
      multiplesArr[i] = num * (i + 1);
    }
    return multiplesArr;
  }

  /**
   * Recursion: Array Sum
   * 배열 요소의 합. 재귀함수로 풀기
   * @see https://edabit.com/challenge/hf2THAoQRQbAx2jc9
   * @param arr
   * @return
   */
  public static int sum(int[] arr) {
    // return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
    // return arr[0] + arr.length == 0 ? 0 : sum(Arrays.copyOfRange(arr, 1, arr.length));
    // 둘 다 틀림. ArrayIndexOutOfBoundsException: 0 에러. 배열의 길이가 0인 경우 0번 인덱스를 찾을 수 없기 때문
    return arr.length == 0 ? 0 : sum(Arrays.copyOfRange(arr, 1, arr.length)) + arr[0];
  }

}