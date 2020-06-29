package my.sunghyuk.edabit.medium;

import java.util.Arrays;

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

}