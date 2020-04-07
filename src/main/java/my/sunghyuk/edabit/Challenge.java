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
  
 /*  title : The 3 Programmers Problem 
  link : https://edabit.com/challenge/akHQKSkHT26TuA7Ka */

  // 첫 답안 제출.
  /* public static int programmers(int one, int two, int three) {   
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
  } */

  // 두 번째 제출 답안
  public static int programmers(int one, int two, int three) {

    int[] arr = new int[]{one, two, three};
    int maxNum = Integer.MIN_VALUE;
      // 0으로 초기화 시 매개변수 값으로 음수를 받게 되면 최대값은 0으로 출력될 수 있음.
      // 정수형 값 중 제일 작은 값 : Integer.MIN_VALUE;      
      // 일종의 공식. 최대값을 구하는 변수의 초기값 Integer.MIN_VALUE;
      // maxNum = arr[0]으로 초기화 할 수도 있음.       
    int minNum = Integer.MAX_VALUE;
      // 0으로 초기화 시 매개변수 값이 0보다 크면 최소값은 0으로 출력될 수 있음.
      // 정수형 값 중 제일 큰 값 : Integer.MAX.VALUE;
      // 일종의 공식. 최소값을 구하는 변수의 초기값 Integer.MAX_VALUE;
      // minNum = arr[0]으로 초기화 할 수도 있음.
    for(int i = 0; i < arr.length; i++) {
      // for(int i = 1; i < arr.length; i++). maxNum, minNum을 arr[0]으로 초기화 시 시작 index 바꿔줌.
      maxNum = Math.max(maxNum, arr[i]);
      minNum = Math.min(minNum, arr[i]);
    }
   return maxNum - minNum;
  }

  // by Seon
  /* public static int programmers(int... arr) {
                              // ... : 가변인자. 전달 받는 매겨 변수의 개수 유동적.
    int maxNum = Integer.MIN_VALUE;
    int minNum = Integer.MAX_VALUE;
    for(int i = 0; i < arr.length; i++) {
      maxNum = Math.max(maxNum, arr[i]);
      minNum = Math.min(minNum, arr[i]);
    }      
    return maxNum - minNum;
  } */
}