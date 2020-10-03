package my.sunghyuk.edabit.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class Program {
  /**
   * Repeating Letters
   * @see https://edabit.com/challenge/KeX3ZcaPo3sEqXTYb
   * @param s
   * @return 각 문자를 두 번씩 반복한 문자열 리턴
   */
  public static String doubleChar(String s) {
    /* StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      sb.append(s.charAt(i)).append(s.charAt(i));
    }
    return sb.toString(); */

    // Other Solution
    return s.replaceAll("(.{1})", "$1$1");
  }

  /**
   * Shuffle the Name
   * @see https://edabit.com/challenge/8WBpaPzLP7piuHNeR
   * @param s
   * @return 두 단어의 순서를 바꿔서 리턴
   */
  public static String nameShuffle(String s) {
    String[] words = s.split(" ");
    // return words[1] + " " + words[0];    
    return words[1].concat(" ").concat(words[0]);
  }

  /**
   * Phone Number Formatting
   * @see https://edabit.com/challenge/sPz2LcPZyAiBHRgwX
   * @param nums
   * @return 주어진 정수 배열을 "(123) 456-7890"의 형태로 리턴
   */
  public static String formatPhoneNumber(int[] nums) {
    /* StringBuilder sb = new StringBuilder();
    sb.append("(");
    getPhoneNumberFormat(sb, Arrays.copyOfRange(nums, 0, 3));
    sb.append(") ");
    getPhoneNumberFormat(sb, Arrays.copyOfRange(nums, 3, 6));
    sb.append("-");
    getPhoneNumberFormat(sb, Arrays.copyOfRange(nums, 6, nums.length));
    return sb.toString(); */

    // Other Solution
    /* return String.format("(%d%d%d) %d%d%d-%d%d%d%d", nums[0], nums[1], nums[2], nums[3], nums[4], nums[5], nums[6],
        nums[7], nums[8], nums[9]); */

    // Other Solution
    /* StringBuilder sb = new StringBuilder();
    for (int i : nums) {
      sb.append(i);
    }
    sb.insert(0, "(");
    sb.insert(4, ")");
    sb.insert(5, " ");
    sb.insert(9, "-");
    return sb.toString(); */

    // Other Solution
    StringBuilder sb = new StringBuilder();
    for (int num : nums) {
      sb.append(num);
    }
    return sb.toString().replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
  }

  private static StringBuilder getPhoneNumberFormat(StringBuilder sb, int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      // sb.append(String.valueOf(nums[i]));
      sb.append(nums[i]);
    }
    return sb;
  }

  /**
   * Xs and Os, Nobody Knows   
   * @see https://edabit.com/challenge/bkFqwEP5Gej23didA
   * @param str
   * @return 문자열에서 x,o의 개수를 구하여 같으면 true, 다르면 false. 대소문자 상관없이 개수에 포함
   */
  public static boolean getXO(String str) {
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

    // Other Solution
    // return str.replaceAll("[oO]", "").length() == str.replaceAll("[xX]", "").length();
  }

  /**
   * Switcharoo
   * @see https://edabit.com/challenge/c52kNwPuWo5kp9x4H
   * @param s
   * @return
   * 문자열의 첫 문자와 마지막 문자를 스위칭 하여 리턴
   * 문자열의 길이가 2보다 작다면 "Incompatible." 리턴. 첫 문자와 마지막 문자가 같다면 "Two's a pair." 리턴
   */
  public static String flipEndChars(String s) {
    String flipWord = "";
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
   * @see https://edabit.com/challenge/5LnycSd2xT4uwZCpi
   * @param s
   * @return 문자열의 단어 갯수 출력
   */
  public static int countWords(String s) {
    String[] wordsArray = s.split(" "); // " " 구분자로 문자열을 쪼갬. 나눈 문자열을 배열로 저장
    return wordsArray.length; // 배열의 길이 출력
  }

  /**
   * Cumulative Array Sum   
   * @see https://edabit.com/challenge/LmiWWX2kdWn2Z5aZv
   * @param nums
   * @return 1. 배열에 값이 없으면 그대로 리턴 2. 배열의 0번 인덱스는 0번 인덱스에 그대로 저장 3. 배열의 n번 인덱스까지의 값을 더해서 n번 인덱스에 저장
   */
  public static int[] cumulativeSum(int[] nums) {
    if (nums.length == 0) {
      return nums;
    }
    /* int[] sumArray = new int[nums.length];
    sumArray[0] = nums[0];
    // i = 1 --> sumArray[1] = nums[0] + nums[1];
    // i = 2 --> sumArray[2] = sumArray[1] + num[2];
    // i = 3 --> sumArray[3] = sumArray[2] + nums[3];
    for (int i = 1; i < nums.length; i++) {
      sumArray[i] = sumArray[i - 1] + nums[i];
    }
    return sumArray; */
    for (int i = 1; i < nums.length; i++) {
      nums[i] = nums[i - 1] + nums[i];
    }
    return nums;
  }

  /**
   * Remove All Special Characters from a String   
   * @see https://edabit.com/challenge/YNQQynxnFeoKNiqTM
   * @param s
   * @return 문자열에서 특수문자 제거
   */
  public static String removeSpecialCharacters(String s) {

    /* char[] specialCh = { '!', '@', '#', '$', '%', '^', '&', '\\', '*', '(', ')', '.', ',', '[', ']', '~', '?', '`', '{',
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
    return result; */

    // Other Solution
    // return s.replaceAll("[^-_a-zA-Z0-9 ]", "");
    // -와 _와 a에서z까지, A에서 Z까지, 0에서 9까지, 공백을 제외한 문자를 ""로 바꾸겠다 == 특수문자를 ""로 바꾸겠다
    // ^ : not의 의미.
    return s.replaceAll("[^-_\\w ]", ""); // a-zA-Z0-9를 \\w로 치환
  }

  /**
   * Return the Four Letter Strings
   * 4개의 문자로 이루어진 문자열들을 배열로 리턴
   * @see https://edabit.com/challenge/EmRPehwiJFk6rf2iD
   * @param s
   * @return
   */
  public static String[] isFourLetters(String[] s) {

    List<String> list = new ArrayList<>();
    for (int i = 0; i < s.length; i++) {
      if (s[i].length() == 4) {
        list.add(s[i]);
      }
    }
    return list.toArray(new String[list.size()]);
  }

  /**
   * Remove Every Vowel from a String
   * 문자열에서 모음 제거
   * @see https://edabit.com/challenge/oMCKfdMqgt9kxqA2M
   * @param s
   * @return
   */
  public static String removeVowels(String s) {
    // Program.removeSpecialCharacters 참고
    // return s.replaceAll("[`a`e`i`o`u`A`E`I`O`U]", "");
    // 모음만 선택한 정규표현식. [`특정문자] : 특정문자 선택
    return s.replaceAll("[aeiouAEIOU]", "");
  }

  /**
   * ATM PIN Code Validation
   * @see https://edabit.com/challenge/bL2E8p5DGWSNmEtAE
   * @param s
   * @return 4자리 or 6자리 숫자로만 이루어진 PIN -> true. 문자, 특수문자, 공백 포함 시 -> false
   */
  public static boolean validatePIN(String s) {
    // int pinNum = Integer.parseInt(s);    
    // s 문자열이 '+','-'를 갖는 경우 특수문자가 아닌 하나의 양수, 음수로 인식하여 정상적인 int값 반환함.

    for (int i = 0; i < s.length(); i++) {
      if (!Character.isDigit(s.charAt(i))) { // isDigit : 캐릭터가 숫자인지 판별하는 메서드
        return false; // 각각의 캐릭터가 숫자가 아니면 false
      }
    }
    return s.length() == 4 || s.length() == 6;
    // 이미 위의 과정에서 문자열이 숫자로 이루어져 있지 않으면 false를 반환하므로
    // 그 외의 문자열 s는 숫자로만 이루어져 있음. 따라서 s의 길이 == 숫자의 자릿수.
  }

  /**
   * Prefixes vs. Suffixes
   * @see https://edabit.com/challenge/jnrPtFbstb2cB3Raj
   * @param word
   * @param prefix
   * @return prefix가 word의 어두이면 true, 아니면 false. suffix가 word의 어미이면 true, 아니면 false
   */
  public static boolean isPrefix(String word, String prefix) {
    // return word.startsWith(prefix.replace("-", ""));
    // Other Solutoin
    return word.startsWith(prefix.substring(0, prefix.length() - 1));
  }

  public static boolean isSuffix(String word, String suffix) {
    // return word.endsWith(suffix.replace("-", ""));
    // Other Solution
    return word.endsWith(suffix.substring(1, suffix.length()));
  }

  /**
   * Count Ones in Binary Representation of Integer   
   * @see https://edabit.com/challenge/MwYW3sRdZxno5hXAF
   * @param n
   * @return n을 2진수로 바꾼 후 2진수에서 1의 갯수 리턴   
   */
  public static int countOnes(int n) {
    // n을 2로 나눔. # 몫이 2보다 작을 때까지. 그 몫과 나머지들을 합치면 2진수
    /* String binaryNum = "";
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
    return countOne; */

    // Other Solution
    // return Integer.bitCount(n);

    // Other Solution
    /* if (n == 0) {
      return 0;
    } else {
      return (n & 1) + countOnesOtherSol3(n >> 1);
    } */

    // Other Solution
    /* String binary = Integer.toBinaryString(n);
    int cnt = 0;
    for (int i = 0; i < binary.length(); i++) {
      if (binary.charAt(i) == '1') {
        cnt++;
      }
    }
    return cnt; */

    // Other Solution
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

  /**
   * Capitalize the First Letter of Each Word
   * @see https://edabit.com/challenge/mkxS3CnW98Ci3kwCh
   * @param s
   * @return 문자열에서 각 단어의 첫 번째 문자를 대문자로 변환
   */
  public static String makeTitle(String s) {

    String[] words = s.split(" ");
    for (int i = 0; i < words.length; i++) {
      words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1, words[i].length());
    }
    return String.join(" ", words);
  }

  /**
   * Are Letters in the Second String Present in the First?
   * 
   * @see https://edabit.com/challenge/mDM9eJXqjL7kJc3hh
   * @param s
   * @return 1. 배열의 1번째 인덱스 문자열의 문자가 0번째 인덱스 문자열 안에 다 들어가는가 들어가면 true, 아니면 false.
   * 2. 대문자와 소문자 같은 문자로 봄. 3. 정규표현식 이용하지 말고 풀기
   */
  public static boolean letterCheck(String[] s) {

    String firstStr = s[0].toLowerCase();
    String secondStr = s[1].toLowerCase();
    for (int i = 0; i < secondStr.length(); i++) {
      if (!firstStr.contains(String.valueOf(secondStr.charAt(i)))) {
        return false;
      }
    }
    return true;
  }

  /**
   * Capitalize the Names
   * @see https://edabit.com/challenge/pKmR5HRabYPkdGunz
   * @param s
   * @return 문자열 배열에서 각 문자열의 첫 문자를 대문자로, 나머지 문자는 소문자로 리턴
   */
  public static String[] capMe(String[] s) {

    for (int i = 0; i < s.length; i++) {
      s[i] = Character.toUpperCase(s[i].charAt(0)) + s[i].substring(1).toLowerCase();
    }
    return s;
  }

  /**
   * Is it Time for Milk and Cookies?
   * @see https://edabit.com/challenge/n6bgfrTFfNZt4yWkJ
   * @param date
   * @return 날짜가 크리스마스 이브면 true, 아니면 false
   */
  public static boolean timeForMilkAndCookies(GregorianCalendar date) {

    /* int month = date.get(Calendar.MONTH) + 1;
    int day = date.get(Calendar.DATE);
    return month == 12 && day == 24; */
    return date.get(Calendar.MONTH) == 11 && date.get(Calendar.DATE) == 24;
  }

  /**
   * Sort Numbers in Ascending Order
   * @see https://edabit.com/challenge/WM5s7vuHnXdcKCEjS
   * @param nums
   * @return 정수형 배열에서 요소를 오름차순으로 정렬
   */
  public static int[] sortNumsAscending(int[] nums) {

    /* if (nums == null) {
      return new int[0];
    }
    Arrays.sort(nums);
    return nums; */

    // Other Solution
    if (nums == null) {
      return new int[0];
    }
    int temp;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] < nums[j]) {
          temp = nums[j];
          nums[j] = nums[i];
          nums[i] = temp;
        }
      }
    }
    return nums;
  }

  /**
   * Maskify the String
   * @see https://edabit.com/challenge/ce3CbX2KwdwaJxxra
   * @param s
   * @return 문자열에서 마지막 4개의 문자만 빼고 #으로 변환
   */
  public static String maskify(String s) {

    /* if (s.length() <= 4) {
      return s;
    }
    String toHash = s.substring(0, s.length() - 4);
    // String lastFour = s.substring(s.length() - 4);
    toHash = toHash.replaceAll("[^#]", "#");
    return toHash + s.substring(s.length() - 4); */

    // Other Solution
    // return s.replaceAll(".(?=.{4})", "#");

    // Other Solution
    StringBuilder sb = new StringBuilder(s);
    for (int i = 0; i < s.length() - 4; i++) {
      sb.replace(i, i + 1, "#");
    }
    return sb.toString();
  }

  /**
   * Recursion: Fibonacci Numbers
   * @see https://edabit.com/challenge/H5Tabm7omS9ia8Rce
   * @param n
   * @return 1. 피보나치 수열에서 n번째 수의 값 구하기 2. 수열은 0으로 시작함
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

    /* int nMinus2 = 0;
    int nMinus1 = 1;
    for (int i = 2; i < n + 2; i++) {
      int tmp = nMinus2 + nMinus1;
      nMinus2 = nMinus1;
      nMinus1 = tmp;
    }
    return nMinus2; */

    // Other Solution
    return n < 2 ? n : fib(n - 1) + fib(n - 2);
  }

  /**
   * Get Sum of People's Budget
   * @see https://edabit.com/challenge/XsJnE47kiTt39t3da
   * @param persons
   * @return Person 객체의 배열에서 각 객체의 연봉을 모두 더하여 리턴
   */
  public static double getBudgets(Person[] persons) {

    /* Person p1 = persons[0];
    // 생성자 메소드가 배열에 담겨 파라미터로 들어오므로 각 배열의 값으로 객체 생성하면 됨.Test 파일 참조
    Person p2 = persons[1];
    Person p3 = persons[2];
    return p1.getBudget() + p2.getBudget() + p3.getBudget(); */

    double sum = 0.0;
    for (int i = 0; i < persons.length; i++) {
      sum += persons[i].getBudget();
    }
    return sum;
  }

  /**
   * Check if the String is a Palindrome
   * @see https://edabit.com/challenge/DfaTrBDZKjso6HBXs
   * @param str
   * @return Palindrome : madam, kayak 같은 역으로 정렬해도 원본과 같은 문자열. 1. 문자열이 Palindrome인가 리턴. 2. 대소문자 무시, 특수문자, 공백은 모두 무시
   */
  public static boolean isPalindrome(String str) {

    str = str.toLowerCase().replaceAll("[^a-z]", "");
    for (int i = 0; i <= str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
        // str.charAt(str.length() - i - 1 : 인덱스(앞문자)가 앞에서 뒤로 진행될수록 비교하는 뒷문자도 앞으로 진행되어야 하므로 진행하는 만큼 더 빼줌.
        return false;
      }
    }
    return true;

    // Other Solution
    /* str = str.toLowerCase().replaceAll("[^a-z]", "");
    StringBuilder sb = new StringBuilder();
    for (int i = str.length() - 1; i >= 0; i--) {
      sb.append(str.charAt(i));
    }
    return str.equals(sb.toString()); */

    // Other Solution
    /* str = str.toLowerCase().replaceAll("[^a-z]", "");
    return str.equals(new StringBuilder(str).reverse().toString()); */
  }

  /**
   * Return the Index of All Capital Letters
   * @see https://edabit.com/challenge/3ZooM5R5P63w5bPCv
   * @param s
   * @return 문자열 s에서 대문자인 문자의 인덱스를 배열로 리턴. 대문자가 없으면 빈 배열 리턴, 문자열에는 특수문자, 숫자가 포함됨.
   */
  public static int[] indexOfCaps(String s) {

    int[] capitalLetterIndex = new int[s.replaceAll("[^A-Z]", "").length()];
    // 문자열의 대문자 개수를 대문자 인덱스를 담을 배열의 크기로 지정
    for (int i = 0, j = 0; i < s.length(); i++) {
      if (Character.isUpperCase(s.charAt(i))) {
        capitalLetterIndex[j] = i; // 대문자의 인덱스(i)를 배열의 j번째 요소에 저장
        j++; // 배열 인덱스 증가
      }
    }
    return capitalLetterIndex;
  }

  /**
   * Is the Phone Number Formatted Correctly?
   * @see https://edabit.com/challenge/NWtZJ2wHGB7hz9iSd
   * @param s
   * @return 문자열 s의 형식이 "(123) 456-7890"의 형식을 갖는가
   */
  public static boolean isValidPhoneNumber(String s) {
    // return s.matches("\\(\\d{3}\\)\\s\\d{3}-\\d{4}");
    return s.matches("^[(]{1}[0-9]{3}[)]{1}[ ]{1}[0-9]{3}[-]{1}[0-9]{4}");
  }

  /**
   * Total Number of Unique Characters
   * @see https://edabit.com/challenge/FHJ7SPdj7hChTS5LW
   * @param s1
   * @param s2
   * @return 문자열 s1 + s2는 중복 문자를 제외한 몇 개로 문자로 이루어져 있는가. countUnique("sore", "zebra") ➞ 7
   */
  public static int countUnique(String s1, String s2) {
    Set<Character> set = new HashSet<>();
    char[] charArr = (s1 + s2).toCharArray();

    for (char ch : charArr) {
      set.add(ch);
    }
    return set.size();

    // Other Solution
    //return (int) (s1 + s2).chars().distinct().count();
  }

  /**
   * Convenience Store
   * @see https://edabit.com/challenge/jfquehNLzpXW5ZQu5
   * @param change
   * @param amountDue
   * @return 매개변수 int 배열 change는 가지고 있는 화폐 단위별 금액, amountDue는 지불할 금액. 배열은 {quarter, dime, nickel, penny}순. 각각 25/10/5/1 센트. 주어진 금액으로 지불할 수 있는가
   */
  public static boolean changeEnough(int[] change, double amountDue) {
    /* amountDue = amountDue * 100;
    return change[0] * 25 + change[1] * 10 + change[2] * 5 + change[3] >= amountDue; */

    // Other Solution
    double[] value = new double[] { 0.25, 0.10, 0.05, 0.01 };
    return IntStream.range(0, change.length).mapToDouble(i -> change[i] * value[i]).sum() >= amountDue;
  }

  /**
   * Omnipresent Value
   * @see https://edabit.com/challenge/ZY7b6LA5BeWQJnJX5
   * @param arr
   * @param val
   * @return 매개변수 val은 모든 일차원 배열에 존재하고 있는가. omnipresent([[1, 1], [1, 3], [5, 1], [6, 1]], 1) ➞ true
   */
  public static boolean omnipresent(int[][] arr, int val) {
    int cnt = 0;
    for (int[] oneDimensionArr : arr) {
      for (int num : oneDimensionArr) {
        if (num == val) {
          cnt++;
          break;
        }
      }
    }
    return cnt == arr.length;
  }

  /**
   * Fruit Juices
   * @see https://edabit.com/challenge/CC7f9DpPfMMqmkfvC
   * @param flavor
   * @param ml
   * @return 문자열 flavor에서 각 단어의 3글자와 ml에서의 숫자를 더하여 문자열로 리턴. getDrinkID("passion fruit", "750ml") ➞ "PASFRU750". 대문자로 리턴
   */
  public static String getDrinkID(String flavor, String ml) {
    String[] flavorArr = flavor.toUpperCase().split(" ");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < flavorArr.length; i++) {
      sb.append(flavorArr[i].substring(0, 3));
    }
    return sb.append(ml.replace("ml", "")).toString();
  }
}