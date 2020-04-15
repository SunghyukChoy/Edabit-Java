package my.sunghyuk.edabit;

/**
 * Program
 */
public class Program {

  public static String doubleChar(String s) {
    String repeatCh = "";
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      repeatCh += "" + ch + ch;
      // System.out.println(repeatCh);
    }

    return repeatCh;
  }

  public static int sumOf1To10() {

    int result = 0;
    for (int i = 1; i <= 10; i++) {
      result += i;
    }
    return result;
  }

  public static String nameShuffle(String s) {
    String[] words = s.split(" ");
    return words[1] + " " + words[0];
  }

  /*
   * title : Phone Number Formatting link :
   * https://edabit.com/challenge/sPz2LcPZyAiBHRgwX
   */
  public static String formatPhoneNumber(int[] nums) {
    String firstWord = "(";
    String secondWord = " ";
    String thirdWord = "-";

    for (int i = 0; i <= 2; i++) {
      firstWord += ("" + nums[i]);
      // 숫자를 문자로 변환하는 방법.
    }
    firstWord = firstWord + ")";

    for (int i = 3; i <= 5; i++) {
      secondWord += ("" + nums[i]);
    }

    for (int i = 6; i <= 9; i++) {
      thirdWord += ("" + nums[i]);
    }

    return firstWord + secondWord + thirdWord;
  }

  public static int length(String str) {
    return str.length();
    // .length 아닌 length() 메서드.
  }

  /*
   * title : Xs and Os, Nobody Knows link :
   * https://edabit.com/challenge/bkFqwEP5Gej23didA
   */
  public static boolean getXO(String str) {
    // 문자열에서 o,x 갯수 알아내기
    // 그 갯수 비교

    int xCount = 0;
    int oCount = 0;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'x' || str.charAt(i) == 'X') {
        xCount++;
      } else if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
        oCount++;
      }
    }
    return xCount == oCount;
  }

  /*
   * title : Switcharoo 
   * https://edabit.com/challenge/c52kNwPuWo5kp9x4H
   */
  public static String flipEndChars(String s) {

    String flipWord = "";
    // char firstChar = s.charAt(0);
    // char lastChar = s.charAt(s.length()-1);
    
    if (s.length() < 2) {
      flipWord = "Incompatible.";
    } else if (s.charAt(0) == s.charAt(s.length()-1)) {
      flipWord = "Two's a pair.";
    } else {
      flipWord = s.charAt(s.length()-1) + s.substring(1, s.length() - 1) + s.charAt(0);
    }
    return flipWord;
  }

  // 현업 많이 사용하는 코드
  public static String flipEndChars2(String s) {

    /* Validation Check : Javascript */
    String validationMessage = isValid(s);

    if (validationMessage != "")
      return validationMessage;
    
    char firstChar = s.charAt(0);
    char lastChar = s.charAt(s.length()-1);

    return lastChar + s.substring(1, s.length() - 1) + firstChar;
  }

  private static String isValid(String s) {
    if (s.length() < 2)
      return "Incompatible.";
  
    if (s.charAt(0) == s.charAt(s.length() - 1))
      return "Two's a pair.";

    return "";
  }
}