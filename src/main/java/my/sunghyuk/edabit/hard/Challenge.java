package my.sunghyuk.edabit.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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

  /**
   * Closest Palindrome Number
   * 주어진 정수에서 가장 가까운 Palindrome 리턴. 같은 거리에 두 Palindrome이 있다면 더 작은 수 리턴
   * 주어진 정수가 Palindrome이면 그대로 리턴
   * closestPalindrome(100) ➞ 99. 99 and 101 are equally distant, so we return the smaller palindrome.
   * @see https://edabit.com/challenge/F2Kizgj7QxSab7R7p
   * @param num
   * @return
   */
  public static long closestPalindrome(int num) {
    if (Helper.isPalindrome(num)) {
      return num;
    }
    int smallerPalindrome = num;
    int biggerPalindrome = num;
    while (true) {
      --smallerPalindrome;
      ++biggerPalindrome;
      if (Helper.isPalindrome(smallerPalindrome) && Helper.isPalindrome(biggerPalindrome)) {
        return smallerPalindrome;
      }
      // 두 수가 동시에 Palindrome인 경우는 위에서 처리하고 아래의 코드에선 무조건 한 쪽이 먼저 도달하므로 조건문에서 바로 리턴, 또는 두 조건문의 순서를 바꿔도 상관없음.
      if (Helper.isPalindrome(smallerPalindrome)) {
        return smallerPalindrome;
      }
      if (Helper.isPalindrome(biggerPalindrome)) {
        return biggerPalindrome;
      }
    }
  }

  /**
   * Reverse the Odd Length Words
   * 문장에서 단어의 길이가 홀수인 단어만 역순으로 출력
   * @see https://edabit.com/challenge/p5kyThBZDR7oJhjR7   
   * @param str
   * @return
   */
  public static String reverseOdd(String str) {
    String[] wordArr = str.split(" ");
    for (int i = 0; i < wordArr.length; i++) {
      if (wordArr[i].length() % 2 != 0) {
        StringBuilder oddWord = new StringBuilder(wordArr[i]);
        wordArr[i] = oddWord.reverse().toString();
      }
    }
    return String.join(" ", wordArr);
  }

  /**
   * Swapping Two by Two
   * 문자 두 개씩 한 쌍을 만들어 서로 자리 바꾸기. swapTwo("ABCDEFGH") ➞ "CDABGHEF"
   * 두 쌍이 만들어지지 않으면 바꾸지 않음. swapTwo("FFGGHHI") ➞ "GGFFHHI"
   * @see https://edabit.com/challenge/Bt6tuyqL7ESZHpsec
   * @param str
   * @return
   */
  public static String swapTwo(String str) {
    /* List<String> firstPair = new ArrayList<>();
    List<String> secondPair = new ArrayList<>();    
    while (str.length() >= 4) {
      firstPair.add(str.substring(0, 2));
      str = str.substring(2);
      secondPair.add(str.substring(0, 2));
      str = str.substring(2);
    }    
    StringBuilder sb = new StringBuilder();    
    for (int i = 0; i < firstPair.size(); i++) {
      sb.append(secondPair.get(i));
      sb.append(firstPair.get(i));
    }
    
    return sb.append(str).toString(); */

    // Other Solution
    // return str.replaceAll("\\G(..)(..)", "$2$1");

    // Other Solution
    /* StringBuilder sb = new StringBuilder();
    int i = 0;
    while (i < str.length()) {
      if (i + 3 < str.length()) {
        sb.append(str.charAt(i + 2)).append(str.charAt(i + 3));
        sb.append(str.charAt(i)).append(str.charAt(i + 1));
        i += 4;
      } else {
        sb.append(str.charAt(i));
        i++;
      }
    }
    return sb.toString(); */

    // Other Solution
    /* if (str.length() < 4) {
      return str;
    }
    String swapStr = str.substring(2, 4) + str.substring(0, 2);
    if (str.length() > swapStr.length()) {
      swapStr += swapTwo(str.substring(4));
    }
    return swapStr; */

    // Other Solution
    StringBuilder sb = new StringBuilder();
    while (str.length() >= 4) {
      sb.append(str.substring(2, 4));
      sb.append(str.substring(0, 2));
      str = str.substring(4);
    }
    return sb.append(str).toString();
  }

  /**
   * No Yelling
   * @see https://edabit.com/challenge/33tRK98geLPcf73PF
   * @param phrase
   * @return 문장의 맨 끝에 중복되는 ?, !를 한 개만 남겨놓고 제거. 문장의 중간에 ?, !는 유지
   * "I just!!! can!!! not!!! believe!!! it!!!" ➞ "I just!!! can!!! not!!! believe!!! it!"
   */
  public static String noYelling(String phrase) {
    String[] words = phrase.split(" ");
    if (words[words.length - 1].contains("?")) {
      words[words.length - 1] = words[words.length - 1].replaceAll("\\?+", "?");
    } else if (words[words.length - 1].contains("!")) {
      words[words.length - 1] = words[words.length - 1].replaceAll("\\!+", "!");
    }
    return String.join(" ", words);

    // Other Solution
    // return phrase.replaceAll("(?<=\\w+)\\p{Punct}*(\\p{Punct}{1}$)", "$1");

    // Other Solution
    /* while (phrase.endsWith("!!") || phrase.endsWith("??")) {
      phrase = phrase.substring(0, phrase.length() - 1);
      phrase = noYelling(phrase);
    }
    return phrase; */
  }
}