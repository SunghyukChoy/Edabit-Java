package my.sunghyuk.edabit.hard;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import my.sunghyuk.edabit.Helper;

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

  /**
   * Consecutive Numbers
   * 배열의 요소가 연속된 숫자인가. 연속적인 요소가 아니거나 중복 요소가 있으면 false반환.
   * @see https://edabit.com/challenge/Md6usCHQ7Xsj2fQi3
   * @param arr
   * @return
   */
  public static boolean cons(int[] arr) {
    Arrays.sort(arr);
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i + 1] - arr[i] != 1) {
        return false;
      }
    }
    return true;
  }

  /**
   * 24-Hour Time
   * 12시간 표시 문자열을 24시간 표시 문자열로 변환.
   * convertTime(“07:05:45PM”) ➞ “19:05:45”
   * @see https://edabit.com/challenge/bPSi354LyfXhA6RXf
   * @param s
   * @return
   */
  public static String convertTime(String s) {
    /* String hour = s.substring(0, 2);
    if (s.endsWith("AM")) {
      if (hour.equals("12")) {
        hour = String.format("%02d", Integer.parseInt(hour) - 12);
      } else {
        return s.substring(0, s.length() - 2);
      }
    }
    if (s.endsWith("PM")) {
      if (hour.equals("12")) {
        return s.substring(0, s.length() - 2);
      } else {
        hour = String.valueOf(Integer.parseInt(hour) + 12);
      }
    }
    return hour + s.substring(2, s.length() - 2); */

    // Other Solution
    /* DateTimeFormatter form = DateTimeFormatter.ofPattern("hh:mm:ssa");
    return LocalTime.parse(s, form).toString(); */

    // Other Solution
    int hour = Integer.parseInt(s.substring(0, 2)) % 12;
    boolean isAM = s.substring(8).equals("AM");
    return String.format("%02d%s", (hour + (isAM ? 0 : 12)) % 24, s.substring(2, 8));
    // String.format("%02d%s", 정수, 문자열) 
    // "%02d" : 해당 위치의 정수를 앞은 0으로 채우는 2자리수 정수로 변환
    // "%s" : 해당 위치의 문자열을 문자열로 변환.
  }

  /**
   * How Many "Prime Numbers" Are There?
   * 주어진 정수 num까지의 소수 개수 리턴
   * @see https://edabit.com/challenge/z8vvSdWjAPu5ufBuR
   * @param num
   * @return
   */
  public static int primeNumbers(int num) {
    int primeCnt = 0;
    for (int i = 0; i <= num; i++) {
      if (Helper.isPrime(i)) {
        primeCnt++;
      }
    }
    return primeCnt;
  }

  
}