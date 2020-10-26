package my.sunghyuk.edabit.expert;

import my.sunghyuk.edabit.Helper;

public class Challenge {
  private Challenge() {

  }

  /**
   * Product of Two Prime Numbers
   * @see https://edabit.com/challenge/8b6hgBwoRAzqbAbYA
   * @param num
   * @return 정수 num은 두 약수의 곱으로 이루어진 값인가
   */
  public static boolean productOfPrimes(int num) {
    for (int i = 2; i <= num; i++) {
      if (num % i == 0 && Helper.isPrime(i) && Helper.isPrime(num / i)) {
        return true;
      }
    }
    return false;
  }
}