package my.sunghyuk.edabit.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

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

  /**
   * Prefixes vs. Suffixes
   * 
   * @see https://edabit.com/challenge/jnrPtFbstb2cB3Raj
   * @param word
   * @param prefix
   * @return
   */
  // 1. prefix가 word의 어두이면 true, 아니면 false
  // 2. suffix가 word의 어미이면 true, 아니면 false
  public static boolean isPrefix(String word, String prefix) {

    return word.startsWith(prefix.replace("-", ""));
  }

  public static boolean isSuffix(String word, String suffix) {

    return word.endsWith(suffix.replace("-", ""));
  }

  public static boolean isPrefixOtherSol(String word, String prefix) {
    if (word.startsWith(prefix.substring(0, prefix.length() - 1))) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean isSuffixOtherSol(String word, String suffix) {
    if (word.endsWith(suffix.substring(1, suffix.length()))) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Count Ones in Binary Representation of Integer
   * 
   * @see https://edabit.com/challenge/MwYW3sRdZxno5hXAF
   * @param n
   * @return
   */
  // 1. n을 2진수로 바꾼 후 2진수에서 1의 갯수 리턴
  public static int countOnes(int n) {
    // # n을 2로 나눔.
    // # 몫이 2보다 작을 때까지.
    // # 그 몫과 나머지들을 합치면 2진수

    String binaryNum = "";
    int remainder;
    while (n > 1) { // n이 2 이상인 동안
      remainder = n % 2;
      n /= 2;
      binaryNum += String.valueOf(remainder); // 숫자를 문자열로 바꿔줌.
    }
    binaryNum += String.valueOf(n); // 마지막에 남는 몫 n. 몫 + 나머지나머지나머지나머지... = 2진수
    // 위의 연산은 2진수를 원래의 순서대로 출력할 수 없음.. 역순으로 출력됨...

    int countOne = 0;
    for (int i = 0; i < binaryNum.length(); i++) {
      if (binaryNum.charAt(i) == '1') {
        countOne++;
      }
    }
    return countOne;
  }

  public static int countOnesOtherSol1(int n) {
    return Integer.bitCount(n);
  }

  public static int countOnesOtherSol2(int n) {
    int count = 0;

    while (n != 0) {
      int reminder = n % 2;
      if (reminder == 1) {
        count++;
      }
      n /= 2;
    }
    return count;
  }

  public static int countOnesOtherSol3(int n) {
    if (n == 0) {
      return 0;
    } else {
      return (n & 1) + countOnesOtherSol3(n >> 1);
    }
  }

  public static int countOnesOtherSol4(int n) {
    String binary = Integer.toBinaryString(n);
    int cnt = 0;
    for (int i = 0; i < binary.length(); i++) {
      if (binary.charAt(i) == '1') {
        cnt++;
      }
    }
    return cnt;
  }

  /**
   * Capitalize the First Letter of Each Word
   * 
   * @see https://edabit.com/challenge/mkxS3CnW98Ci3kwCh
   * @param s
   * @return
   */
  // 1. 문자열에서 각 단어의 첫 번째 문자를 대문자로 변환
  // # 변환 # split # substring #toUpperCase # 문자열
  public static String makeTitle(String s) {

    String[] words = s.split(" ");

    for (int i = 0; i < words.length; i++) {
      words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1, words[i].length());
    }

    String capWords = words[0];
    // 위의 for문에서 변환한 요소를 초기값으로 저장
    for (int i = 1; i < words.length; i++) {
      capWords += " " + words[i];
    }
    return capWords;
  }

  /**
   * Are Letters in the Second String Present in the First?
   * 
   * @see https://edabit.com/challenge/mDM9eJXqjL7kJc3hh
   * @param s
   * @return
   */
  // 1. 배열의 1번째 인덱스 문자열의 문자가 0번째 인덱스 문자열 안에 다 들어가는가 들어가면 true 아니면 false
  // 2. 대문자와 소문자 같은 문자로 봄
  // 3. 정규표현식 이용하지 말고 풀기
  public static boolean letterCheck(String[] s) {

    String chars = s[0].toLowerCase();
    String text = s[1].toLowerCase();

    for (int i = 0; i < text.length(); i++) {
      if (!(chars.contains(text.charAt(i) + ""))) {
        return false;
      }
    }

    return true;

  }

  public static boolean letterCheckOtherSol(String[] s) {
    String a = s[0].toLowerCase();
    String b = s[1].toLowerCase();

    for (char c : b.toCharArray()) {
      if (!a.contains(String.valueOf(c))) {
        return false;
      }
    }

    return true;
  }

  /**
   * Capitalize the Names
   * 
   * @see https://edabit.com/challenge/pKmR5HRabYPkdGunz
   * @param s
   * @return
   */
  // 1. 각 요소의 첫 문자를 대문자로
  // 2. 나머지 요소들은 소문자로
  // # 변환 # toUpperCase # toLowerCase
  public static String[] capMe(String[] s) {

    for (int i = 0; i < s.length; i++) {
      char firstLetter = Character.toUpperCase(s[i].charAt(0));
      String lowerLetters = s[i].substring(1, s[i].length()).toLowerCase();
      s[i] = firstLetter + lowerLetters;
    }
    return s;
  }

  public static String[] capMeOtherSol(String[] s) {

    for (int i = 0; i < s.length; i++) {
      s[i] = Character.toUpperCase(s[i].charAt(0)) + s[i].substring(1).toLowerCase();
    }
    return s;
  }

  /**
   * Is it Time for Milk and Cookies?
   * 
   * @see https://edabit.com/challenge/n6bgfrTFfNZt4yWkJ
   * @param date
   * @return
   */
  public static boolean timeForMilkAndCookies(GregorianCalendar date) {

    int month = date.get(Calendar.MONTH) + 1;
    int day = date.get(Calendar.DATE);

    return month == 12 && day == 24;
  }

  /**
   * Sort Numbers in Ascending Order
   * 
   * @see https://edabit.com/challenge/WM5s7vuHnXdcKCEjS
   * @param nums
   * @return
   */
  public static int[] sortNumsAscending(int[] nums) {
    // 1. 숫자를 오름차순으로 정렬
    if (nums == null) {
      return new int[0];
    }

    Arrays.sort(nums);
    return nums;
  }

  /**
   * Maskify the String 1. 문자열에서 마지막 4개의 문자만 빼고 #으로 변환
   * 
   * @see https://edabit.com/challenge/ce3CbX2KwdwaJxxra
   * @param s
   * @return
   */
  public static String maskify(String s) {

    if (s.length() <= 4) {
      return s;
    }

    String toHash = s.substring(0, s.length() - 4);
    // String lastFour = s.substring(s.length() - 4);

    toHash = toHash.replaceAll("[^#]", "#");

    return toHash + s.substring(s.length() - 4);
  }

  public static String maskifyOtherSol(String s) {
    StringBuilder sb = new StringBuilder(s);
    for (int i = 0; i < s.length() - 4; i++) {
      sb.replace(i, i + 1, "#");
    }
    return sb.toString();
  }

  /**
   * Recursion: Fibonacci Numbers 1. 피보나치 수열에서 n번째 수의 값 구하기 2. 수열은 0으로 시작함
   * 
   * @see https://edabit.com/challenge/H5Tabm7omS9ia8Rce
   * @param n
   * @return
   */
  public static int fib(int n) {
    // 피보나치 수열 : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
    // F(0) = 0, 
    // F(1) = 1, 
    // F(n) = F(n-2) + F(n-1)
    // if (n == 0)
    //   return 0;

    // if (n == 1)
    //   return 1;

    // return fib(n-2) + fib(n-1);

    int nMinus2 = 0;
    int nMinus1 = 1;

    for (int i = 2; i < n + 2; i++) {
      int tmp = nMinus2 + nMinus1;
      nMinus2 = nMinus1;
      nMinus1 = tmp;
    }

    return nMinus2;
  }

  /**
   * Get Sum of People's Budget
   * 
   * @see https://edabit.com/challenge/XsJnE47kiTt39t3da
   * @param persons
   * @return
   */
  public static double getBudgets(Person[] persons) {

    Person p1 = persons[0];
    // 생성자 메소드가 배열에 담겨 파라미터로 들어오므로 각 배열의 값으로 객체 생성하면 됨.Test 파일 참조
    Person p2 = persons[1];
    Person p3 = persons[2];
    return p1.getBudget() + p2.getBudget() + p3.getBudget();
  }

  public static double getBudgetsOtherSol(Person[] persons) {
    double sum = 0.0;
    for (int i = 0; i < persons.length; i++) {
      sum += persons[i].getBudget();
    }
    return sum;
  }

  /**
   * Check if the String is a Palindrome
   * 
   * @see https://edabit.com/challenge/DfaTrBDZKjso6HBXs
   * @param str
   * @return
   */
  public static boolean isPalindrome(String str) {
    // 1. str은 앞뒤가 똑같은 문자열인가
    // Palindrome : madam, kayak 같은 역으로 정렬해도 원본과 같은 문자열
    // 2. 대소문자 무시, 특수문자, 공백은 모두 무시

    str = str.toLowerCase().replaceAll("[^a-zA-Z]", "");

    // 되는 코드. 아래에 다른 코드로 수정함.
    // String reverseStr = "";
    // for (int i = str.length() - 1; i >= 0; i--) {
    // reverseStr += str.charAt(i);
    // }
    // return str.equals(reverseStr);

    // 되는 코드. 아래에 다른 코드로 수정함.
    // for (int i = 0; i <= str.length() / 2; i++) {
    // if (str.charAt(i) == str.charAt(str.length() - i - 1)) {

    // continue;
    // } else {
    // return false;
    // }
    // }
    // return true;

    for (int i = 0; i <= str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
        // str.charAt(str.length() - i - 1 :
        // 인덱스(앞문자)가 앞에서 뒤로 진행될수록 비교하는 뒷문자도 앞으로 진행되어야 하므로
        // 진행하는 i만큼 더 빼줌.
        return false;
      }
    }
    return true;
  }

  public static boolean isPalindromeOtherSol(String str) {
    str = str.toLowerCase().replaceAll("[^a-z]", "");
    return str.equals(new StringBuilder(str).reverse().toString());
  }

  /**
   * Return the Index of All Capital Letters
   * 문자열 s에서 대문자인 문자의 인덱스를 배열로 리턴
   * 대문자가 없으면 빈 배열 리턴, 문자열에는 특수문자, 숫자가 포함됨.
   * 
   * @see https://edabit.com/challenge/3ZooM5R5P63w5bPCv
   * @param s
   * @return
   */
  public static int[] indexOfCaps(String s) {

    String capital = s.replaceAll("[^A-Z]", "");
    // 대문자만 담을 배열의 길이
    int[] capIndex = new int[capital.length()];

    for (int i = 0, j = 0; i < s.length(); i++) {
      if (Character.isUpperCase(s.charAt(i))) {
        capIndex[j] = i;
        j++;
      }
    }
    return capIndex;
  }

  /**
   * Is the Phone Number Formatted Correctly?
   * 문자열 s의 형식이 "(123) 456-7890"의 형식을 갖는가 
   * 
   * @see https://edabit.com/challenge/NWtZJ2wHGB7hz9iSd
   * @param s
   * @return
   */
  public static boolean isValidPhoneNumber(String s) {

    // return s.matches("\\(\\d{3}\\)\\s\\d{3}-\\d{4}");
    return s.matches("^[(]{1}[0-9]{3}[)]{1}[ ]{1}[0-9]{3}[-]{1}[0-9]{4}");
  }
}