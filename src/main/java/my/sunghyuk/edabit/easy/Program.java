package my.sunghyuk.edabit.easy;

import java.util.ArrayList;

// refacor : rename
public class Program {
  /**
   * Repeating Letters
   * 
   * @see https://edabit.com/challenge/KeX3ZcaPo3sEqXTYb
   */
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

  /**
   * Shuffle the Name
   * 
   * @see https://edabit.com/challenge/8WBpaPzLP7piuHNeR
   * @param s
   * @return
   */
  public static String nameShuffle(String s) {
    String[] words = s.split(" ");
    return words[1] + " " + words[0];
  }

  /**
   * Phone Number Formatting
   * 
   * @see https://edabit.com/challenge/sPz2LcPZyAiBHRgwX
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

  /**
   * Xs and Os, Nobody Knows link :
   * 
   * @see https://edabit.com/challenge/bkFqwEP5Gej23didA
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

  /**
   * Switcharoo
   * 
   * @see https://edabit.com/challenge/c52kNwPuWo5kp9x4H
   */
  public static String flipEndChars(String s) {

    String flipWord = "";
    // char firstChar = s.charAt(0);
    // char lastChar = s.charAt(s.length()-1);

    if (s.length() < 2) {
      flipWord = "Incompatible.";
    } else if (s.charAt(0) == s.charAt(s.length() - 1)) {
      flipWord = "Two's a pair.";
    } else {
      flipWord = s.charAt(s.length() - 1) + s.substring(1, s.length() - 1) + s.charAt(0);
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
    char lastChar = s.charAt(s.length() - 1);

    return lastChar + s.substring(1, s.length() - 1) + firstChar;
  }

  private static String isValid(String s) {
    if (s.length() < 2)
      return "Incompatible.";

    if (s.charAt(0) == s.charAt(s.length() - 1))
      return "Two's a pair.";

    return "";
  }

  /**
   * Get Word Count
   * 
   * @see https://edabit.com/challenge/5LnycSd2xT4uwZCpi
   * @param s
   * @return
   */
  public static int countWords(String s) {
    // s 문자열의 단어 갯수 출력
    String[] wordsArray = s.split(" "); // " " 구분자로 문자열을 쪼갬. 나눈 문자열을 배열로 저장
    return wordsArray.length; // 배열의 길이 출력
  }

  /**
   * Cumulative Array Sum
   * 
   * @see https://edabit.com/challenge/LmiWWX2kdWn2Z5aZv
   * @param nums
   * @return
   */
  public static int[] cumulativeSum(int[] nums) {
    // 1. 배열에 값이 없으면 그대로 리턴
    // 2. 배열의 0번 인덱스는 0번 인덱스에 그대로 저장
    // 3. 배열의 n번 인덱스까지의 값을 더해서 n번 인덱스에 저장
    if (nums.length == 0) {
      return nums;
    }
    int[] sumArray = new int[nums.length];
    sumArray[0] = nums[0];
    // i = 1 --> sumArray[1] = nums[0] + nums[1];
    // i = 2 --> sumArray[2] = sumArray[1] + num[2];
    // i = 3 --> sumArray[3] = sumArray[2] + nums[3];
    for (int i = 1; i < nums.length; i++) {
      sumArray[i] = sumArray[i - 1] + nums[i];
    }
    return sumArray;
  }

  /**
   * Remove All Special Characters from a String
   * 
   * @see https://edabit.com/challenge/YNQQynxnFeoKNiqTM
   * @param s
   * @return
   */
  public static String removeSpecialCharacters(String s) {
    // 문자열에서 특수문자 제거
    char[] specialCh = { '!', '@', '#', '$', '%', '^', '&', '\\', '*', '(', ')', '.', ',', '[', ']', '~', '?', '`', '{',
        '}', '+', '=', '<', '>', '|' };
    String result = "";
    for (int i = 0; i < s.length(); i++) {
      boolean isSpecialCh = false;
      for (int j = 0; j < specialCh.length; j++) {
        if (s.charAt(i) == specialCh[j]) {
          isSpecialCh = true; // 어떤 문자가 특수 문자면 flag를 true로 설정.
        }
      }
      if (!isSpecialCh) { // isSpecialCh이 false 일 때, result에 문자 저장.
        result += s.charAt(i);
      }
    }
    return result;
  }

  public static String removeSpecialCharactersDevelop(String s) {
    return s.replaceAll("[^-_a-zA-Z0-9 ]", "");
    // -와 _와 a에서z까지, A에서 Z까지, 0에서 9까지, 공백을 제외한 문자를 ""로 바꾸겠다 == 특수문자를 ""로 바꾸겠다
    // ^ : not의 의미.
    // return s.replaceAll("[^-_\\w ]", ""); // a-zA-Z0-9를 \\로 치환
  }

  /*************** 다시 풀 것 */
  /**
   * Return the Four Letter Strings
   * 
   * @see https://edabit.com/challenge/EmRPehwiJFk6rf2iD
   * @param s
   * @return
   */
  public static String[] isFourLetters(String[] s) {
    // 4개의 문자로 이루어진 문자열 리턴
    // String[] fourLetter = {};
    ArrayList<String> fourLetterList = new ArrayList<String>();
    for (int i = 0; i < s.length; i++) {
      if (s[i].length() == 4) {
        fourLetterList.add(s[i]);
      }
    }
    String[] fourLetter = new String[fourLetterList.size()];
    int size = 0;
    for (String temp : fourLetterList) {
      fourLetter[size++] = temp;
    }
    // String[] fourLetter = fourLetterList.toArray(new
    // String[fourLetterList.size()]);
    return fourLetter;
  }

  /**
   * Remove Every Vowel from a String
   * 
   * @see https://edabit.com/challenge/oMCKfdMqgt9kxqA2M
   * @param s
   * @return
   */
  public static String removeVowels(String s) {
    // 문자열에서 모음 제거
    // Program.removeSpecialCharacters 참고
    // return s.replaceAll("[`a`e`i`o`u`A`E`I`O`U]", "");
    // 모음만 선택한 정규표현식. [`특정문자] : 특정문자 선택
    return s.replaceAll("[aeiouAEIOU]", "");
  }

  /**
   * ATM PIN Code Validation
   * 
   * @see https://edabit.com/challenge/bL2E8p5DGWSNmEtAE
   * @param s
   * @return
   */
  public static boolean validatePIN(String s) {
    // 1. 4자리 or 6자리 숫자로만 이루어진 PIN -> true
    // 2. 문자, 특수문자, 공백 포함 시 -> false

    // int pinNum = Integer.parseInt(s);
    // s 문자열이 '+','-'를 갖는 경우 특수문자가 아닌 하나의 양수, 음수로 인식하여 정상적인 int값 반환함.
    for (int i = 0; i < s.length(); i++) {
      if (!Character.isDigit(s.charAt(i))) { // isDigit : 캐릭터가 숫자인지 판별하는 메서드
        return false; // 각각의 캐릭터가 숫자가 아니면 false
      }
    }
    return s.length() == 4 || s.length() == 6;
    // 이미 위의 과정에서 문자열이 숫자로 이루어져 있지 않으면 false를 반환하므로
    // 그 외의 문자열 s는 숫자로만 이주어져 있음. 따라서 s의 길이 == 숫자의 자릿수.
  }

  /***************************** not finished */
  /**
   * Prefixes vs. Suffixes
   * 
   * @see https://edabit.com/challenge/jnrPtFbstb2cB3Raj
   * @param word
   * @param prefix
   * @return
   */
  public static boolean isPrefix(String word, String prefix) {
    // 1. prefix가 word의 어두이면 true, 아니면 false
    return word.substring(0, prefix.length() - 1) == prefix.substring(0, prefix.length() - 1);
  }

  public static boolean isSuffix(String word, String suffix) {
    // 1. suffix가 word의 어미이면 true, 아니면 false
    return false;
  }

}