package my.sunghyuk.edabit;

/**
 * Challenge
 */
public class Challenge {

  /**
   * Check point 1 : Logic Check point 2 : 어디까지 나눠야 하나
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
    if (num == 1)
      return false;

    for (int i = 2; i < Math.sqrt(num); i++) {
      if (num % i == 0)
        return false;
    }
    return true;
  }

  /**
   * Title : 문제이름 Link : https://edabit.com/challenge/gdRGePvnZDfQGDS8g
   * 
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

  public static int programmers(int one, int two, int three) {
    
    int maxNum = 0;    
    int minNum = 0;

    if (one >= two && one >= three) {
      maxNum = one;
      if (two >= three) {
        minNum = three;
      } else {
        minNum = two;
      }     
    } else if (two >= one && two >= three) {
      maxNum = two;
      if (one >= three) {
        minNum = three;
      } else {
        minNum = one;
      }
    } else if (three >= one && three >= two) {
      maxNum = three;
      if (one >= two) {
        minNum = two;
      } else {
        minNum = one;
      }
    }
    return maxNum - minNum;
  }
}