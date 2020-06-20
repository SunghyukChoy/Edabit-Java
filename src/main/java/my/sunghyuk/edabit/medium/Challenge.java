package my.sunghyuk.edabit.medium;

public class Challenge {
  /**
   * Algorithms II: The Euclidean Algorithm
   * 
   * @see : https://edabit.com/challenge/HmicQW4LMYyNHXRzT Function Recursive 에 관한
   *      문제
   * 
   * @param a
   * @param b
   * @return
   */
  public static int euclidean(int a, int b) {
    // Ensure that "a" >= "b". If "a" < "b", swap them.
    if (a < b) {
      int c = b;
      b = a;
      a = c;
    }

    // Find the remainder. Divide "a" by "b" and set "r" as the remainder.
    int r = a % b;

    // Is "r" zero? If so terminate the function and return "b" (the second number).
    if (r == 0)
      return b;

    // Set "a" = "b" and "b" = "r" and start the algorithm over again.
    return euclidean(b, r);
  }

  /**
   * Valid Hex Code
   * 
   * @see https://edabit.com/challenge/9zBJYnBekqAo52zEp
   * @param str
   * @return
   */
  public static boolean isValidHexCode(String str) {
    /**
     * 1. 문자열은 #으로 시작 
     * 2. 그 뒤에 문자들은 0~9,a~f 까지 
     * 3. #제외 6글자
     */
    /**
     * Java String 클래스에서 제공되는 정규표현식 관련 메서드
     * 1. boolean matches(String regex);
     * 2. String replaceAll(String regex, String replacement);
     * 3. String replaceFirst(String regex, String replacement);
     * 4. String split(String regex);
     */

    // // 3.
    // if (str.length() != 7) {
    //   return false;
    // }

    // // 1.
    // if (str.charAt(0) != '#') {
    //   return false;
    // }

    // // 2.
    // for (int i = 1; i < str.length(); i++) {
    //   char ch = str.charAt(i);

    //   if (!((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F'))) {
    //     return false;
    //   }

    // }

    // return true;   

    // ^# : #으로 시작하고
    // [\\da-fA-F] : \\d : 0에서 9, a에서 f, A에서 F까지
    // {6} : 앞 조건식의 문자가 6개
    return str.matches("^#[\\da-fA-F]{6}");
  }
}