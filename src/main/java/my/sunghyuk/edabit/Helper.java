package my.sunghyuk.edabit;

public class Helper {

  // 모음 검사 메소드
  public static boolean isVowel(char ch) {
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
      return true;
    } else {
      return false;
    }
  }

  // 소수 검사 메소드
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

  // 이전 소수 구하기 메소드
  public static int getPreviousPrime(int num) {
    while (true) {
      num--;
      if (isPrime(num)) {
        return num;
      }
    }
  }

  // 다음 소수 구하기 메소드
  public static int getNextPrime(int num) {
    while (true) {
      num++;
      if (isPrime(num)) {
        return num;
      }
    }
  }

  // Palindrome 검사 메소드
  public static boolean isPalindrome(String str) {
    for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }

  // 정수의 각 자리의 값을 곱한 값 구하기 메소드
  public static long getMultiplyDigit(long num) {
    long multiplyDigit = 1;
    while (num != 0) {
      multiplyDigit *= num % 10;
      num /= 10;
    }
    return multiplyDigit;
  }
}