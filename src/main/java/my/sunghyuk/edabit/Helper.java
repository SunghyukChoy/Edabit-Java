package my.sunghyuk.edabit;

public class Helper {

  private Helper() {

  }

  /**
   * 모음 검사 메서드
   * @param ch
   * @return
   */
  public static boolean isVowel(char ch) {
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
        || ch == 'O' || ch == 'U') {
      return true;
    } else {
      return false;
    }
  }

  /**
   * 소수 검사 메서드
   * @param num
   * @return
   */
  public static boolean isPrime(int num) {
    if (num < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  /**
   * 이전 소수 구하기 메서드
   * @param num
   * @return
   */
  public static int getPreviousPrime(int num) {
    while (true) {
      num--;
      if (isPrime(num)) {
        return num;
      }
    }
  }

  /**
   * 다음 소수 구하기 메서드
   * @param num
   * @return
   */
  public static int getNextPrime(int num) {
    while (true) {
      num++;
      if (isPrime(num)) {
        return num;
      }
    }
  }

  /**
   * Palindrome 검사 메서드
   * @param str
   * @return
   */
  public static boolean isPalindrome(String str) {
    for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }

  /**
   * 정수의 각 자리의 값을 곱한 값 구하기 메소드
   * @param num
   * @return
   */
  public static long getMultiplyDigit(long num) {
    long multiplyDigit = 1;
    while (num != 0) {
      multiplyDigit *= num % 10;
      num /= 10;
    }
    return multiplyDigit;
  }

  /**
   * 짝수 검사 메서드
   * @param num
   * @return
   */
  public static boolean isEven(int num) {
    return num % 2 == 0;
  }

  /**
   * 홀수 검사 메서드
   * @param num
   * @return
   */
  public static boolean isOdd(int num) {
    return !isEven(num);
  }

  /**
   * 문자열에 공백 존재 여부 리턴
   * @param str
   * @return
   */
  public static boolean hasBlank(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        return true;
      }
    }
    return false;
  }

  /**
   * 문자열에 숫자 외의 다른 문자 존재 여부 리턴
   * @param str
   * @return
   */
  public static boolean hasNonNumber(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (!Character.isDigit(str.charAt(i))) {
        return true;
      }
    }
    return false;
  }

  /**
   * 정수의 길이를 리턴.
   * @param num
   * @return
   */
  public static int getNumLength(long num) {
    if (num == 0) {
      return 1;
    }
    int length = 0;
    while (num != 0) {
      num = num / 10;
      length++;
    }
    return length;
  }

  /**
   * 정수 num의 pow 제곱값 리턴.
   * 형변환으로 느려질 수 있는 Math.pow() 대체
   * @param num
   * @param pow
   * @return
   */
  public static int getPowValue(int num, int pow) {
    int powValue = 1;
    for (int i = 0; i < pow; i++) {
      powValue *= num;
    }
    return powValue;
  }
}