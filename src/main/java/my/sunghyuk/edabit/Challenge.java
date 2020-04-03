package my.sunghyuk.edabit;

/**
 * Challenge
 */
public class Challenge {

  /**
   * Check point 1 : Logic 
   * Check point 2 : 어디까지 나눠야 하나
   * 
   * @param num
   * @return
   */
  public static boolean isPrimeByChoi(int num) {
    boolean flag = true;
    if (num == 1) {
      return false;
    }

    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        flag = false;
        break;

      } else if (num % num == 0) {
        flag = true;
      }
    }
    return flag;
  }

  public static boolean isPrime(int num) {
    if (num == 1) return false;

    for (int i = 2; i < Math.sqrt(num); i++) {
      if (num % i == 0)
        return false;
    }
    return true;
  }

  /**
   * Title : 문제이름
   * Link : https://edabit.com/challenge/gdRGePvnZDfQGDS8g
   * @param num1
   * @param num2
   * @return
   */
  public static boolean isEqual(int num1, int num2) {
		return num1 == num2;
  }

  public static int howManySeconds(int hours) {
		return hours * 3600;
  }
}