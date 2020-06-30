package my.sunghyuk.edabit.very_easy;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge {
  /**
   * Less Than 100?
   * 
   * @see : https://edabit.com/challenge/FSKb2sKrGoejfJLrd
   * 
   * @param a
   * @param b
   * @return boolean
   */
  public static boolean lessThan100(int a, int b) {
    return a + b < 100;
  }

  public static String repeat(String str, int n) {
    String repeatWord = "";
    for (int i = 0; i < str.length(); i++) {
      for (int j = 0; j < n; j++) {
        repeatWord += str.charAt(i);
      }
    }
    return repeatWord;
  }

  // 개선 여지 있음
  // 변수 여러개 넣으면 어떻게?
  public static int programmers(int one, int two, int three) {
    return Math.max(one, Math.max(two, three)) - Math.min(one, Math.min(two, three));
  }

  public static int[] calculateScores(String str) {
    int aCount = 0;
    int bCount = 0;
    int cCount = 0;
    for (int i = 0; i < str.length(); i++) {
      switch (str.charAt(i)) {
        case 'A':
          aCount++;
          break;
        case 'B':
          bCount++;
          break;
        case 'C':
          cCount++;
          break;
      }
    }
    int[] scores = { aCount, bCount, cCount };
    return scores;
  }

  public static boolean isPrime(int num) {
    if (num == 1) {
      return false;
    }

    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      } 
    }
    return true;
  }

  public static String joinPath(String portion1, String portion2) {
    String x = "abcd12abc34";
    portion1.replace("/", "");
    x.replaceAll("[^abc]", ""); // 얘가 더 느림, 그러니까 쓰지말자

    String[] texts = {"1234", "abc213", "444addc"}; // 배열이 천단위 만단위

    // bad replace pattern
    for (int i = 0; i < texts.length; i++) {
      texts[i] = texts[i].replaceAll("[a-z]", "");  // 이게 느린거
    }

    // good replace pattern
    Pattern pattern = Pattern.compile("[a-z]");
    
    for (int i = 0; i < texts.length; i++) {
      texts[i] = pattern.matcher(texts[i]).replaceAll("");
    }

    return portion1.replace("/", "") + "/" + portion2.replace("/", "");
  }
}