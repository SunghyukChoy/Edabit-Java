package my.sunghyuk.edabit.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
  public static String convertTime1(String s) {
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

  /**
   * Carrying the Digits
   * @see https://edabit.com/challenge/5snfPLPbvjAsZ5kjo
   * @param n1
   * @param n2
   * @return 두 정수를 더했을 때 숫자 올림(자리 올림)은 몇 번 하는가
   * carryDigits(36, 135) ➞ 1 // You carry the 1 when you sum 6 and 5 together.
   */
  public static int carryDigits(int n1, int n2) {
    int cnt = 0;
    int i = 0; // 합이 10 이상일 때 넘겨주는 값
    while (n1 != 0 && n2 != 0) {
      if (n1 % 10 + n2 % 10 + i >= 10) {
        cnt++;
        i++;
      }
      n1 = n1 / 10;
      n2 = n2 / 10;
    }
    return cnt;
  }

  /**
   * Reverse Letters, Keep Numbers in Place
   * @see https://edabit.com/challenge/AQr6ZPvSWzJ2cPTGt
   * @param str
   * @return 문자열에서 문자는 거꾸로, 숫자는 원래대로 출력. reverse("ab89c") ➞ "cb89a"
   */
  public static String reverse(String str) {

    /* Map<Integer, String> map = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      if (Character.isDigit(str.charAt(i))) {
        map.put(i, String.valueOf(str.charAt(i)));
      }
    }
    StringBuilder sb = new StringBuilder();
    for (int i = str.length() - 1; i >= 0; i--) {
      if (!Character.isDigit(str.charAt(i))) {
        sb.append(str.charAt(i));
      }
    }
    Set<Map.Entry<Integer, String>> set = map.entrySet();
    Iterator<Map.Entry<Integer, String>> it = set.iterator();
    while (it.hasNext()) {
      Map.Entry<Integer, String> entry = it.next();
      sb.insert(entry.getKey(), entry.getValue());
    }
    return sb.toString(); */

    // Other Solution
    /* String letterStr = str.replaceAll("\\d", "");
    // 숫자를 제거한 문자로 이루어진 문자열
    int index = letterStr.length() - 1;
    // letterStr의 마지막 인덱스
    char[] charArr = str.toCharArray();
    // 원본 문자열의 문자 배열
    for (int i = 0; i < charArr.length; i++) {
      if (Character.isLetter(charArr[i])) {
        // 원본 문자열에서 charArr[i]가 문자인 경우
        charArr[i] = letterStr.charAt(index);
        // 그 자리에 letterStr의 마지막 문자를 넣음. 원본 문자열에 문자를 역순으로 넣는 과정.
        // 숫자의 경우 해당하지 않고 넘어감
        index--;
      }
    }
    return new String(charArr); */

    // Other Solution
    if (str == null) {
      return str;
    }
    String reverseLetters = new StringBuilder(str.replaceAll("\\d", "")).reverse().toString();
    StringBuilder sb = new StringBuilder();
    int i = 0;
    for (char ch : str.toCharArray()) {
      sb.append(Character.isDigit(ch) ? ch : reverseLetters.charAt(i++));
      // charAt(i++) : i 먼저 참조하고 ++ 연산 수행. 초기값 0 먼저 참조 후 1씩 증가. 아래 코드와 같음
      /* if (Character.isDigit(ch)) {
        sb.append(ch);
      } else {
        char letter = reverseLetters.charAt(i);
        sb.append(letter);
        i++;
      } */
    }
    return sb.toString();
  }

  /**
   * Mangle the String
   * @see https://edabit.com/challenge/BJkkDwsZrB8SFTAQ2
   * @param str
   * @return 문자열의 문자를 해당 문자의 다음 문자로 변환하여 리턴. mangle("Fun times!") ➞ "GvO Ujnft!".
   * 문자 'z', 'Z'는 'a','A'로 리턴. 변환한 문자가 모음이면 대문자로 리턴.
   */
  public static String mangle(String str) {
    char[] charArr = str.toCharArray();

    for (int i = 0; i < charArr.length; i++) {
      if (charArr[i] == 'z' || charArr[i] == 'Z') {
        charArr[i] = 'A';
      } else if (Character.isLetter(charArr[i])) {
        charArr[i] += 1;
        if (Helper.isVowel(charArr[i])) {
          charArr[i] = Character.toUpperCase(charArr[i]);
        }
      }
    }
    StringBuilder sb = new StringBuilder();
    for (char ch : charArr) {
      sb.append(ch);
    }
    return sb.toString();

    // Other Solution
    /* StringBuilder sb = new StringBuilder();
    String letter = "";
    for (char ch : str.toCharArray()) {
      if ((ch >= 'a' && ch < 'z') || (ch >= 'A' && ch < 'Z')) {
        ch += 1;
        letter = String.valueOf(ch);
      } else if (ch == 'z' || ch == 'Z') {
        letter = "A";
      } else {
        letter = String.valueOf(ch);
      }
    
      if (letter.matches("[aeiou]")) {
        letter = letter.toUpperCase();
      }
    
      sb.append(letter);
    }
    return sb.toString(); */
  }

  /**
   * Backspace Attack
   * @see https://edabit.com/challenge/hYKyiwgw9Ni5ELtDL
   * @param str
   * @return backspace 키가 잘못 입력되어 '#'으로 입력됨. 문자열 str에서 원래 입력하려고 했던 문자열 출력
   * erase("major# spar##ks") ➞ "majo spks". erase("si###t boy") ➞ "t boy"
   */
  public static String erase(String str) {

    /* if (!str.contains("#")) {
      return str;
    }
    
    StringBuilder sb = new StringBuilder();
    int hashIndex = str.indexOf("#");
    
    if (hashIndex != 0) {
      // hashIndex가 0인 경우 (지우려는 문자의 수보다 입력된 backspace가 많은 경우. "si### boy"의 경우) 아래의 substring 메서드 실행 불가능. StringIndexOutOfBoundsException 발생
      sb.append(str.substring(0, hashIndex - 1));
      // 첫 문자부터 hash 이전의 문자(지우려고 의도했던 문자)의 이전 문자까지 저장. 즉 지울 문자 + "#"의 이전 문자까지 저장
    }
    sb.append(str.substring(hashIndex + 1));
    // 첫 번째 hash 이후의 문자 저장
    return erase(sb.toString()); */

    // Other Solution
    /* Stack<String> bAStack = new Stack<>();
    for (int i = 0; i < str.length(); i++) {
      if (!bAStack.isEmpty() && str.charAt(i) == '#') {
        bAStack.pop();
      } else if (bAStack.isEmpty() && str.charAt(i) == '#') {
        continue;
      } else {
        bAStack.push(String.valueOf(str.charAt(i)));
      }
    }
    return String.join("", bAStack); */

    // Other Solution
    /* while (str.contains("#")) {
      int index = str.indexOf("#");
      if (index - 1 >= 0
          && (Character.isAlphabetic(str.charAt(index - 1)) || Character.isSpaceChar(str.charAt(index - 1)))) {
        String erase = Character.toString(str.charAt(index - 1));
        str = str.replaceFirst(erase + "#", "");
      } else {
        str = str.replaceFirst("#", "");
      }
    }
    return str; */

    // Other Solution
    StringBuilder sb = new StringBuilder();
    for (char c : str.toCharArray()) {
      if (c == '#') {
        if (sb.length() != 0) {
          sb.deleteCharAt(sb.length() - 1);
        }
      } else {
        sb.append(c);
      }
    }
    return sb.toString();
  }

  /**
   * Persistent Little Bugger
   * @see https://edabit.com/challenge/zZxPQRjn8q2iB9Biv
   * @param num
   * @return 정수 num의 각 자리 수를 곱한 값이 한 자리의 값이 나오려면 몇 번 반복해야 하는가
   * bugger(39) ➞ 3 // Because 3 * 9 = 27, 2 * 7 = 14, 1 * 4 = 4 and 4 has only one digit.
   * 
   */
  public static int bugger(int num) {

    int step = 0;
    int multiplyDigit = 1;
    while (num >= 10) {
      while (num != 0) {
        multiplyDigit *= num % 10;
        num /= 10;
      }
      step++;
      num = multiplyDigit;
      multiplyDigit = 1;
    }
    return step;
  }

  /**
   * Almost Palindrome
   * @see https://edabit.com/challenge/E9AHcnWg7fDfardLF
   * @param str
   * @return 문자열에서 문자 하나만 바꾸었을 때 Palindrome이 될 수 있는가.
   * almostPalindrome("abccia") ➞ true // Transformed to "abccba" by changing "i" to "b".
   * 주어진 문자열이 이미 Palindrome이라면 false 리턴
   */
  public static boolean almostPalindrome(String str) {

    /* char[] charArr = str.toCharArray();
    for (int i = 0; i < charArr.length; i++) {
      if (charArr[i] != charArr[charArr.length - 1 - i]) { // 문자열의 앞문자와 뒷문자를 비교하여 다르면
        charArr[i] = charArr[charArr.length - 1 - i]; // 두 문자를 같은 문자로 통일 시킨 뒤
        return Helper.isPalindrome(String.valueOf(charArr)); // 그 문자열을 Palindrome 검사
    
        // if (Helper.isPalindrome(String.valueOf(charArr))) {
        //   return true;
        //   // 이 if문 왜 안 되는지 모르겠음. else 구문으로 return false까지 해줘야 정답 출력
        // }
      }
    }
    return false; // 주어진 문자열이 이미 Palindrome이라면 위의 if문 타지 않으므로 return false. */

    // Other Solution
    int differenceCnt = 0; // 앞뒤 문자를 비교하여 다른 횟수
    for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        differenceCnt++;
      }
    }
    return differenceCnt == 1;
  }

  /**
   * Magic Sigil Generator
   * @see https://edabit.com/challenge/6mLZjPrNFrfGfdwqa
   * @param desire
   * @return Sigil 만들기. 
   * 1) 문자를 대문자로 변환하고 2) 문자열에서 공백을 제거하고 3) 중복문자를 제거하되 마지막에 나온 문자를 남긴다
   * sigilize("I FOUND MY SOULMATE") ➞ "FNDYSLMT"
   */
  public static String sigilize(String desire) {

    desire = desire.toUpperCase().replaceAll("[AEIOU ]", "");
    StringBuilder sb = new StringBuilder();
    for (int i = desire.length() - 1; i >= 0; i--) {
      if (!sb.toString().contains(String.valueOf(desire.charAt(i)))) {
        sb.insert(0, desire.charAt(i));
      }
    }
    return sb.toString();

    // Other Solution    
    /* desire = desire.toUpperCase().replaceAll("[AEIOU\\s]", "");
    desire = new StringBuilder(desire).reverse().toString();
    Set<String> set = new LinkedHashSet<>(Arrays.asList(desire.split("")));
    return new StringBuilder(String.join("", set)).reverse().toString(); */

    // Other Solution
    // return desire.replaceAll("(.)(?=.*\\1)", "").toUpperCase().replaceAll("[AEIOU\\s]", "");
  }

  /**
   * Phone Number Word Decoder
   * @see https://edabit.com/challenge/8NZaLdJBkhZCgNBc7
   * @param phone
   * @return 전화번호 형식으로 주어진 문자열에서, 문자열에 포함된 문자를 대응하는 숫자로 바꾸기
   * textToNum("653-TRY-THIS") ➞ "653-879-8447"
   */
  public static String textToNum(String phone) {
    return phone.replaceAll("[ABC]", "2").replaceAll("[DEF]", "3").replaceAll("[GHI]", "4").replaceAll("[JKL]", "5")
        .replaceAll("[MNO]", "6").replaceAll("[PQRS]", "7").replaceAll("[TUV]", "8").replaceAll("[WXYZ]", "9");

    // Other Solution
    /* String[] decodeStr = new String[] { "none", "none", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };
    for (int i = 2; i < decodeStr.length; i++) {
      phone = phone.replaceAll("[" + decodeStr[i] + "]", String.valueOf(i));
    }
    return phone; */
  }

  /**
   * Building up a Word
   * @see https://edabit.com/challenge/Eiyu2SZk9rgdp5gZd
   * @param arr
   * @return 문자열 배열에서 다음 요소는 이전 요소에서 문자열의 맨 앞 또는 맨 뒤에 문자 하나만을 붙여서 만들 수 있는 요소인가. ["a", "at", "ate", "late", "plate", "plater", "platter"] ➞ False. ["it", "bit", "bite", "biters"] ➞ False
   */
  public static boolean canBuild1(String[] arr) {

    /* for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i].length() + 1 != arr[i + 1].length()) {
        return false;
      }
      // if (arr[i].charAt(0) == arr[i + 1].charAt(0)
      //     && arr[i].charAt(arr[i].length() - 1) == arr[i + 1].charAt(arr[i + 1].length() - 1)) {
      //   return false;
      // }
      // 위의 조건문은 but -> butt 같은 경우('t'를 중간에 붙였다고 할 수도 있고 끝에 붙였다고 할 수도 있는 경우)에서 false 리턴하지 않음. 왜..?
    
      if (!arr[i + 1].startsWith(arr[i]) && !arr[i + 1].endsWith(arr[i])) {
        // !(arr[i + 1].startsWith(arr[i]) || arr[i + 1].endsWith(arr[i])) 과 같은 식
        return false;
      }
    }
    return true; */

    // Other Solution
    for (int i = 1; i < arr.length; i++) {
      if (!arr[i].contains(arr[i - 1]) || arr[i].length() - arr[i - 1].length() != 1) {
        return false;
      }
    }
    return true;
  }

  /**
   * Find the Missing Letter
   * @see https://edabit.com/challenge/4hZ9cHgvkZ94sr2ae
   * @param arr
   * @return 알파벳 순서의 문자열 배열에서 중간에 빠진 문자열 리턴
   */
  public static String missingLetter(String[] arr) {
    String str = String.join("", arr);
    char[] charArr = str.toCharArray();
    for (int i = 0; i < charArr.length - 1; i++) {
      if (charArr[i] + 1 != charArr[i + 1]) { // 아스키값 비교. 정수값을 비교함
        return String.valueOf((char) (charArr[i] + 1));
        // 아스키값을 문자로 변환 후 다시 문자열로 변환. 괄호 잘 칠 것.
      }
    }
    return "";

    // Other Solution
    /* String str = String.join("", arr);
    for (int i = str.charAt(0); i < str.charAt(str.length() - 1); i++) {
      if (!str.contains(Character.toString((char) i))) {
        return Character.toString((char) i);
      }
    }
    return null; */

    // Other Solution
    /* char letter = arr[0].charAt(0);
    int i = 0;
    while (("" + letter).equals(arr[i])) {
      letter++;
      i++;
    }
    return "" + letter; */
  }

  /**
   * Find the Odd Integer
   * @see https://edabit.com/challenge/8SHAyg8kdX8y72S3z
   * @param arr
   * @return 정수 배열에서 홀수 번 등장하는 요소 리턴. findOdd([1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5]) ➞ -1
   */
  public static int findOdd(int[] arr) {
    if (arr.length == 1) {
      return arr[0];
    }
    Arrays.sort(arr);
    if (arr[0] != arr[1]) {
      return arr[0];
    }
    return findOdd(Arrays.copyOfRange(arr, 2, arr.length));

    // Other Solution
    /* ArrayList<Integer> oddIntegers = new ArrayList<>();
    for (int i : arr) {
      if (oddIntegers.contains(Integer.valueOf(i))) {
        oddIntegers.remove(Integer.valueOf(i));
      } else {
        oddIntegers.add(Integer.valueOf(i));
      }
    }
    return oddIntegers.get(0).intValue(); */

    // Other Solution
    /* for (int i = 0; i < arr.length; i++) {
      int count = 0;
      for (int j = 0; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count++;
        }
      }
      if (count % 2 != 0) {
        return arr[i];
      }
    }
    return 0; */
  }

  /**
   * Numbers That are Also Writers
   * @see https://edabit.com/challenge/7PSvBgGjiA252WdiN
   * @param n
   * @return 숫자가 Autobiographical인가. Autobiographical는 자기 자신을 나타내는 수이다. 1) 수의 왼쪽자리부터 시작하여 0의 개수, 1의 개수, 2의 개수...를 나타낸다. 6210001000 is autobiographical, because it has six 0's, two 1's, one 2, zero 3's, zero 4's, zero 5's, one 6, zero 7's, zero 8's, and zero 9's. 2) isAutobiographical(12345) ➞ false 3) n은 항상 0 이상의 정수이며 10자리를 넘는 수는 주어지지 않는다. 
   */
  public static boolean isAutobiographical(int n) {
    String nStr = String.valueOf(n);
    // n의 모든 digit을 비교하기 위한 초기 n의 문자열. 아래의 for문에서 n은 계속 변하므로 nStr 선언 없이 String.valueOf(n)을 그대로 사용하면 n의 모든 digit을 완전히 검사할 수 없음.
    for (int i = 0; i <= nStr.length() - 1; i++) {
      int digit = n / (int) Math.pow(10, nStr.length() - 1 - i);
      // 숫자의 길이가 짧아지는 만큼 몫(digit)을 구하기 위한 10의 제곱수도 작아저야 하므로 -i 해줌.
      if (digit != getNumberCnt(nStr, i)) {
        return false;
      }
      n = n % (int) Math.pow(10, nStr.length() - 1 - i);
      // 숫자의 길이가 짧아지는 만큼 n을 재정의하기 위한 10의 제곱수도 작아저야 하므로 -i 해줌.
    }
    return true;

    // Other Solution
    /* String nStr = String.valueOf(n);
    for (int i = 0; i < nStr.length(); i++) {
      int digit = Integer.parseInt(String.valueOf(nStr.charAt(i)));
      String index = String.valueOf(i);
      if (digit != nStr.length() - nStr.replaceAll(index, "").length()) {
        return false;
      }
    }
    return true; */

    // Other Solution. 다시 볼 것
    /* char[] nCharArr = Integer.toString(n).toCharArray();
    int[] numberArr = new int[nCharArr.length];
    int[] digits = new int[10];
    for (int i = 0; i < nCharArr.length; i++) {
      numberArr[i] = nCharArr[i] - '0';
    }
    for (int i : numberArr) {
      digits[i]++;
    }
    for (int i = 0; i < numberArr.length; i++) {
      if (numberArr[i] != digits[i]) {
        return false;
      }
    }
    return true; */
  }

  private static int getNumberCnt(String str, int num) {
    int cnt = 0;
    String[] strArr = str.split("");
    for (int i = 0; i < strArr.length; i++) {
      if (strArr[i].equals(String.valueOf(num))) {
        cnt++;
      }
    }
    return cnt;
  }

  /**
   * Unmix My Strings
   * @see https://edabit.com/challenge/XRAGxXj4KtakkvD3F
   * @param str
   * @return 문자 두 개씩 한 쌍을 이루어 서로 자리 바꾸기. 쌍이 이루어지지 않으면 바꾸지 않음. unmix("badce") ➞ "abcde"
   */
  public static String unmix(String str) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length() - 1; i = i + 2) {
      sb.append(str.charAt(i + 1)).append(str.charAt(i));
    }
    if (str.length() % 2 != 0) {
      sb.append(str.charAt(str.length() - 1));
    }
    return sb.toString();

    // Other Solution
    // return str.replaceAll("(.)(.)", "$2$1");
  }

  /**
   * Ransom Letter
   * @see https://edabit.com/challenge/vuxkHGZg8fuWCivPH
   * @param str1
   * @param str2
   * @return ransom note letter : 신문이나 잡지 등에서 글자를 잘라 새로운 문장을 만드는 타이포그래피. 주어진 문자열 str1의 문자들로 str2를 만들 수 있는가. 대소문자 구별 있음. canBuild("aPPleAL", "PAL") ➞ true. canBuild("aPPleAL", "apple") ➞ false  
   */
  public static boolean canBuild2(String str1, String str2) {
    // 추가한 테스트(test22, str1과 str2의 길이가 같고 str1에 해당 문자가 있지만 str2의 해당문자보다 수가 적은 경우)에서 틀림
    /* if (str1.length() < str2.length()) {
      return false;
    }
    int cnt = 0;
    for (int i = 0; i < str2.length(); i++) {
      for (int j = 0; j < str1.length(); j++) {
        if (str2.charAt(i) == str1.charAt(j)) {
          cnt++;
          break;
        }
      }
    }
    return cnt == str2.length(); */

    // Other Solution
    // 추가한 테스트(test22, str1과 str2의 길이가 같고 str1에 해당 문자가 있지만 str2의 해당문자보다 수가 적은 경우)에서 틀림
    /* if (str2.length() > str1.length()) {
      return false;
    }
    for (int i = 0; i < str2.length(); i++) {
      if (!str1.contains(String.valueOf(str2.charAt(i)))) {
        return false;
      }
    }
    return true; */

    // Other Solution
    StringBuilder s1 = new StringBuilder(str1);
    StringBuilder s2 = new StringBuilder(str2);
    for (int i = 0; i < s2.length(); i++) {
      char ch = s2.charAt(i);
      if (s1.indexOf(Character.toString(ch)) > -1) {
        s1.deleteCharAt(s1.indexOf(Character.toString(ch)));
        // str1의 해당 문자 개수가 str2보다 많아야 문자열을 만들 수 있음. 서로 대응하는 문자를 삭제해 str1에서의 해당 문자가 str2의 해당 문자보다 많은지 확인함.
      } else {
        return false;
      }
    }
    return true;

    // Other Solution
    /* for (int n = 0; n < str2.length(); n++) {
      if (str1.replaceFirst(str2.substring(n, n + 1), "").equals(str1)) {
        // str2의 첫 문자를 str1에서 첫 한 개만 제거할 때 기존의 str1과 같냐
        return false;
      } else {
        str1 = str1.replaceFirst(str2.substring(n, n + 1), "");
      }
    }
    return true; */
  }

  /**
   * Count the Number of Duplicate Characters
   * @see https://edabit.com/challenge/ENozFXdPz9YTTHdps
   * @param str
   * @return 문자열에서 중복되는 문자의 개수 리턴. 대소문자 구별. duplicateCount("aabbcde") ➞ 2
   */
  public static int duplicateCount(String str) {

    /* if (str.length() <= 1) {
      return 0;
    }
    int cnt = 0;
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(0) == str.charAt(i)) {
        cnt++;
        break;
      }
    }
    str = str.replace(String.valueOf(str.charAt(0)), "");
    return cnt + duplicateCount(str); */

    // Other Solution
    /* StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j < str.length(); j++) {
        if (str.charAt(i) == str.charAt(j)) {
          sb.append(str.charAt(i));
          break;
        }
      }
    }
    return sb.toString().replaceAll("(.)(?=.*\\1)", "").length(); */

    // Other Solution
    /* int duplicateCount = 0;
    Map<Character, Integer> map = new HashMap<>();
    for (char ch : str.toCharArray()) {
      if (map.containsKey(ch)) {
        int counter = map.get(ch);
        map.put(ch, ++counter);
      } else {
        map.put(ch, 1);        
      }
    }
    for (char ch : map.keySet()) {
      if (map.get(ch) > 1) {
        duplicateCount++;
      }
    }
    return duplicateCount; */

    // Other Solution
    /* Set<Character> set = new HashSet<>();
    Set<Character> duplicateSet = new HashSet<>();
    for (char ch : str.toCharArray()) {
      if (!set.contains(ch)) {
        set.add(ch);
      } else {
        duplicateSet.add(ch);
      }
    }
    return duplicateSet.size(); */

    // Other Solution
    Set<Character> set = new HashSet<>();
    for (int i = 0; i < str.length() - 1; i++) {
      for (int j = i + 1; j < str.length(); j++) {
        if (str.charAt(i) == str.charAt(j)) {
          set.add(str.charAt(i));
          break;
        }
      }
    }
    return set.size();
  }

  /**
   * Pronouncing the Xs
   * @see https://edabit.com/challenge/g5n85W62rJqZakMry
   * @param sentence
   * @return 문장에서 x 발음이 들어가는 단어들을 다음 규칙에 맞게 바꾸기. 모든 'x'는 "cks"로 바꾸되 1) 'x'로 시작하는 단어라면 'z'로 바꾸기 2) 단어 자체가 'x'라면 "ecks"로 바꾸기. "The x ray is excellent" ➞ "The ecks ray is eckscellent". "Inside the box was a xylophone" ➞ "Inside the bocks was a zylophone"
   */
  public static String xPronounce(String sentence) {
    /* String[] words = sentence.split(" ");
    for (int i = 0; i < words.length; i++) {
      if (words[i].equals("x")) {
        words[i] = "ecks";
      }
    
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < words[i].length(); j++) {
        if (words[i].charAt(j) == 'x' && j == 0) {
          sb.append('z');
        } else if (words[i].charAt(j) == 'x') {
          sb.append("cks");
        } else {
          sb.append(words[i].charAt(j));
        }
      }
      words[i] = sb.toString();
    }    
    return String.join(" ", words); */

    // Other Solution
    return sentence.replace(" x ", " ecks ").replace(" x", " z").replace("x", "cks"); // replace 순서 유의
  }

  /**
   * Body Mass Index
   * @param weight
   * @param height
   * @return BMI 수치를 구하여 수치와 비만상태를 문자열로 리턴. BMI : 몸무게(kg) / 키(m)^2. 1 inch = 0.0254 meter, 1 pound = 0.453592 kilogram
   */
  public static String BMI(String weight, String height) {
    String[] weightArr = weight.split(" ");
    double weightValue = Double.parseDouble(weightArr[0]);
    String[] heightArr = height.split(" ");
    double heightValue = Double.parseDouble(heightArr[0]);
    if (weightArr[1].equals("pounds")) {
      weightValue *= 0.453592;
    }
    if (heightArr[1].equals("inches")) {
      heightValue *= 0.0254;
    }
    double bmi = weightValue / Math.pow(heightValue, 2);
    String state = "";
    if (bmi < 18.5) {
      state = "Underweight";
    } else if (bmi >= 18.5 && bmi <= 24.9) {
      state = "Normal weight";
    } else if (bmi >= 25 && bmi <= 29.9) {
      state = "Overweight";
    } else {
      state = "Obesity";
    }
    return String.format("%.1f %s", bmi, state);
  }

  /**
   * Most Common Last Vowel
   * @see https://edabit.com/challenge/sHWvPRwcY93w6qGNB
   * @param str
   * @return 공통되는 모음 중 가장 마지막에 위치한 모음 리턴 1) 가장 많은 모음은 문장에 하나만 존재 2) 모음이 하나라면 그 모음을 리턴 3) 소  문자로 리턴
   */
  public static String commonLastVowel(String str) {
    str = str.toLowerCase();
    for (int i = str.length() - 1; i >= 0; i--) {
      if (Helper.isVowel(str.charAt(i)) && str.substring(0, i).contains(String.valueOf(str.charAt(i)))) {
        return String.valueOf(str.charAt(i));
      }
    }
    return str.replaceAll("[^aeiou]", ""); // 모음이 하나만 있는 경우
  }

  /**
   * Digits Battle!
   * @see https://edabit.com/challenge/42DtofyzmZXjWXCtw
   * @param num
   * @return 숫자의 왼쪽부터 2개를 한 쌍으로 묶어서 비교를 했을 때 더 큰 수가 이김. 이긴 수를 모아서 정수로 리턴. 두 수가 같으면 이긴 수 모음에 넣지 않음. 한 쌍이 만들어지지 않으면 그 수를 그대로 모음.
   * battleOutcome(578921445) ➞ 7925 // [57]: 7 wins; [89] 9 wins; [21] 2 wins; // [44] neither wins; 5 (automatically) wins
   */
  public static int battleOutcome(int num) {
    StringBuilder sb = new StringBuilder();
    String numStr = String.valueOf(num);
    while (numStr.length() > 1) {
      if (numStr.charAt(0) == numStr.charAt(1)) {
        numStr = numStr.substring(2);
      } else {
        sb.append(numStr.charAt(0) > numStr.charAt(1) ? numStr.charAt(0) : numStr.charAt(1));
        numStr = numStr.substring(2);
      }
    }
    if (String.valueOf(num).length() % 2 != 0) {
      sb.append(String.valueOf(num).charAt(String.valueOf(num).length() - 1));
    }
    return Integer.parseInt(sb.toString());
  }

  /**
   * A Capital Challenge
   * @param s1
   * @param s2
   * @return 각 문자열에서 어떤 문자가 대문자인 경우 서로 다른 문자열에서 그 문자의 위치에 해당하는 문자를 찾아 더하여 문자열로 리턴. 두 문자열의 길이는 서로 다를 수 있음. 문자가 알파벳이 아닌 경우가 있음. selectLetters("heLLO", "GUlp") ➞ "help". selectLetters("1234567", "XxXxX")  ➞ "135"
   */
  public static String selectLetters(String s1, String s2) {

    int shorterLength = Math.min(s1.length(), s2.length());
    // 해당 인덱스의 문자가 다른 문자열에서는 없을 수 있으므로 공통되는 문자의 길이까지만 검사함
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < shorterLength; i++) {
      if (Character.isUpperCase(s2.charAt(i))) {
        sb.append(s1.charAt(i));
      }
    }
    for (int i = 0; i < shorterLength; i++) {
      if (Character.isUpperCase(s1.charAt(i))) {
        sb.append(s2.charAt(i));
      }
    }
    return sb.toString();
  }

  /**
   * Reorder Digits
   * @see https://edabit.com/challenge/EiTYFd9jwghDz3aoG
   * @param arr
   * @param orderBy
   * @return orderBy가 "asc"라면 배열에서 정수를 (digit-오름차순) 정수로 만들고, "desc"라면 정수를 (digit-내림차순) 정수로 만들어 리턴. 
   */
  public static int[] reorderDigits(int[] arr, String orderBy) {

    for (int i = 0; i < arr.length; i++) {
      if (orderBy.equals("asc")) {
        arr[i] = ascSort(arr[i]);
      } else if (orderBy.equals("desc")) {
        arr[i] = descSort(arr[i]);
      }
    }
    return arr;
  }

  private static int ascSort(int num) {
    char[] numCharArr = String.valueOf(num).toCharArray();
    Arrays.sort(numCharArr);
    return Integer.parseInt(String.valueOf(numCharArr));
  }

  private static int descSort(int num) {
    char[] numCharArr = String.valueOf(num).toCharArray();
    Arrays.sort(numCharArr);
    return Integer.parseInt(new StringBuilder(String.valueOf(numCharArr)).reverse().toString());
  }

  /**
   * Product of Remaining Elements
   * @see https://edabit.com/challenge/EjQM5woRAhYEmuGFp
   * @param arr
   * @return 정수 배열에서 어떤 한 요소는 나머지 요소들을 곱한 값인가
   */
  public static boolean canPartition(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int elementsMultiply = 1;
      for (int j = 0; j < arr.length; j++) {
        if (i != j) {
          elementsMultiply *= arr[j];
        }
        // arr[i[를 제외하지 않고 모든 요소를 모두 곱한 후 다시 arr[i]로 나누는 것은 arr[i]가 0이고 다른 요소들을 0이 아닐 때 실제 elementsMultiply는 0이 아님에도 0으로 만들어 버리므로 틀린 코드임. 처음부터 arr[i]는 제외하고 곱해야 함.
      }
      if (arr[i] == elementsMultiply) {
        return true;
      }
    }
    return false;
  }

  /**
   * Rhyme Time
   * @see https://edabit.com/challenge/gdiL9PHcySFP74mnK
   * @param str1
   * @param str2
   * @return 매개변수 두 문자열은 라임이 맞는가...는 뭔말인지 모르겠고 각 문장의 마지막 단어가 같은 모음으로 구성되어 있는가. 대소문자 구별 안 함. doesRhyme("Sam I am!", "Green eggs and ham.") ➞ true
   */
  public static boolean doesRhyme(String str1, String str2) {
    // String[] str1Arr = str1.toLowerCase().split(" ");
    // String[] str2Arr = str2.toLowerCase().split(" ");
    return str1.toLowerCase().split(" ")[str1.toLowerCase().split(" ").length - 1].replaceAll("[^aeiou]", "")
        .equals(str2.toLowerCase().split(" ")[str2.toLowerCase().split(" ").length - 1].replaceAll("[^aeiou]", ""));
    // equals() 대신 == 쓰면 틀림.
  }

  /**
   * Know Your Neighbor
   * @see https://edabit.com/challenge/ka4Mk98LW4TEbcqzH
   * @param str
   * @return 문자열의 각 문자는 "+"로 둘러쌓여 있는가. 1) 어떠한 문자의 양쪽에 모두 "+"가 있는지를 의미 2) "+"가 문자에 꼭 인접해야 하는 것은 아님. "+f+d+c+#+f+" ➞ true / "+d+=3=+s+" ➞ true / "f++d+g+8+" ➞ false
   */
  public static boolean plusSign(String str) {

    while (str.length() != 1) {
      // 문자열을 계속 재정의 하여 마지막 "+" 하나만 남기 전까지
      int firstPlusIdx = str.indexOf("+");
      int secondPlusIdx = str.indexOf("+", firstPlusIdx + 1);
      if (firstPlusIdx == -1 || secondPlusIdx == -1) {
        return false;
      }
      String word = str.substring(0, secondPlusIdx + 1);
      StringBuilder sb = new StringBuilder(word);
      if (!word.equals(sb.reverse().toString())) {
        // !sb.toString().equals(sb.reverse()) 하면 boolean 값 제대로 안 나옴
        return false;
      }
      str = str.substring(secondPlusIdx);
      // 검사한 문자열의 두 번째 "+"부터 시작하는 문자열로 재정의
    }
    return true;

    // Other Solution
    /* for (int i = 0; i < str.length(); i++) {
      if (Character.isLetter(str.charAt(i))) {
        if (i == 0 || i == str.length() - 1 || str.charAt(i - 1) != '+' || str.charAt(i + 1) != '+') {
          return false;
        }
      }
    }
    return true; */
  }

  /**
   * 12 vs 24 Hours
   * @see https://edabit.com/challenge/ayvtiYuzTxkphRBxB
   * @param time
   * @return 24시 시간제는 12시 시간제로, 12시 시간제는 24시 시간제로
   */
  public static String convertTime2(String time) {
    String[] timeArr = time.split(":");

    if (time.contains("am") || time.contains("pm")) {
      timeArr[1] = timeArr[1].replaceAll("[^0-9]", "");
      if (Integer.parseInt(timeArr[0]) == 12) {
        timeArr[0] = "0";
      }
      if (time.contains("pm")) {
        timeArr[0] = String.valueOf(Integer.parseInt(timeArr[0]) + 12);
      }
    }

    if (!time.contains("am") && !time.contains("pm")) {
      if (Integer.parseInt(timeArr[0]) < 12) {
        timeArr[1] = timeArr[1] + " am";
      } else {
        timeArr[0] = String.valueOf(Integer.parseInt(timeArr[0]) - 12);
        timeArr[1] = timeArr[1] + " pm";
      }
    }
    return String.join(":", timeArr);
  }

  /**
   * Powerful Numbers
   * @see https://edabit.com/challenge/ACHoZjkBGijBvwbDP
   * @param num
   * @return  num의 약수 중 소수들의 집합에서 모든 소수의 제곱값 또한 num의 약수라면 num은 Powerful Number라 한다. num은 Powerful Number인가. isPowerful(36) ➞ true // p = (2, 3) (prime factors of 36) // 2^2 = 4 (factor of 36) // 3^2 = 9 (factor of 36)
   */
  public static boolean isPowerful(int num) {
    List<Integer> primeList = new ArrayList<>();
    for (int i = 1; i <= num; i++) {
      if (num % i == 0 && Helper.isPrime(i)) {
        primeList.add(i);
      }
    }
    for (Integer prime : primeList) {
      if (num % Math.pow(prime, 2) != 0) {
        return false;
      }
    }
    return true;
  }

  /**
   * Truncate String at a Given Length
   * @see https://edabit.com/challenge/WXTuWJ5nSEzjcakQJ
   * @param str
   * @param length
   * @return 주어진 길이만큼 문자열을 자르는데, 문장이 깔끔하게 잘리지 않으면 (문장의 단어 중간에서 잘린다면) 중간에 잘리는 단어는 제거하고 리턴 1) truncate("Lorem ipsum dolor sit amet.", 11) ➞ "Lorem ipsum" 2) truncate("Lorem ipsum dolor sit amet.", 16) ➞ "Lorem ipsum"
   */
  public static String truncate(String str, int length) {
    if (length > str.length()) {
      return str;
    }
    if (!str.substring(0, length).contains(" ")) {
      return "";
    }
    while (str.charAt(length) != ' ') {
      length--;
    }
    return str.substring(0, length);

    // Other Solution
    /* while (str.length() > length) {
      if (str.lastIndexOf(" ") > 0) {
        str = str.substring(0, str.lastIndexOf(" "));        
        // str.length() == length가 될 때까지 문장의 뒷 단어들을 자름.
      } else { // lastIndexOf(" ")가 -1 나오는 경우
        str = "";
      }
    }
    return str.trim(); */

    // Other Solution
    /* StringBuilder sb = new StringBuilder();
    for (String word : str.split(" ")) {
      if (sb.length() + word.length() > length) {
        break;
      } else {
        sb.append(word).append(" ");
      }
    }
    return sb.toString().trim(); */
  }

  /**
   * Shiny Semiprimes: Brilliant Numbers
   * @see https://edabit.com/challenge/5Jw7K2fvuaAqRPPtJ
   * @param n
   * @return 주어진 n이 Brilliant Number인가. Brilliant Number란 1) 자기 자신은 소수가 아님 2) 자신의 약수 중 한 소수의 제곱값이 자기 자신인 수 3) 자신의 약수 중 두 소수의 곱이 자기 자신이되 그 두 소수는 같은 자리수를 가진 경우 
   */
  public static boolean isBrilliant(int n) {
    /* if (Helper.isPrime(n)) {
      return false;
    } */
    // 위의 코드 필요없음. n이 소수라면 아래 이중 for문의 if문 조건을 충족하지 못함.

    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      if (n % i == 0 && Helper.isPrime(i)) {
        list.add(i);
      }
    }
    for (int i = 0; i < list.size(); i++) {
      for (int j = 0; j < list.size(); j++) {
        if (list.get(i) * list.get(j) == n
            && String.valueOf(list.get(i)).length() == String.valueOf(list.get(j)).length()) {
          return true;
        }
      }
    }
    return false;
  }

  /**
   * Correct Inequality Signs
   * @see https://edabit.com/challenge/vtW558tXEYFQGv27S
   * @param str
   * @return 부등호식이 옳은 식인가. correctSigns("13 > 44 > 33 > 1") ➞ false. correctSigns("1 < 2 < 6 < 9 > 3") ➞ true
   */
  public static boolean correctSigns(String str) {

    // 추가한 테스트(test 8, 부등호가 혼합되어 있고 정답이 false인 경우) 통과 안 됨
    // 코드 수정 못하겠음. 아마 틀린 로직 같음
    /* if (str.contains("<") && !str.contains(">")) {
      String[] numStrArr = str.replace(" ", "").split("<");
      for (int i = 0; i < numStrArr.length - 1; i++) {
        if (Integer.parseInt(numStrArr[i]) >= Integer.parseInt(numStrArr[i + 1])) {
          return false;
        }
      }
    }
    if (str.contains(">") && !str.contains("<")) {
      String[] numStrArr = str.replace(" ", "").split(">");
      for (int i = 0; i < numStrArr.length - 1; i++) {
        if (Integer.parseInt(numStrArr[i]) <= Integer.parseInt(numStrArr[i + 1])) {
          return false;
        }
      }
    }
    return true; */

    // Other Solution
    String[] numStrArr = str.split(" ");
    for (int i = 0; i < numStrArr.length - 2; i += 2) {
      if (numStrArr[i + 1].equals(">")) {
        if (Integer.parseInt(numStrArr[i]) <= Integer.parseInt(numStrArr[i + 2])) {
          return false;
        }
      } else {
        if (Integer.parseInt(numStrArr[i]) >= Integer.parseInt(numStrArr[i + 2])) {
          return false;
        }
      }
    }
    return true;
  }

  /**
   * Minimum Swaps to Alternate a Binary String
   * @see https://edabit.com/challenge/P2aqoBtZj6GCsdFsY
   * @param str
   * @return 0과 1로 이루어진 문자열을 0과 1이 교차되는 문자열로 만드는 데에 문자를 바꾸는 최소한의 횟수 리턴. 1) 서로 자리 바꿈이 아니라 0을 1로, 또는 1을 0으로 바꿈을 의미 2) 0으로 시작하든 1로 시작하는 상관없음. minSwaps("010010111") ➞ 4 // Two possible conversions: // 1. "101010101" (4 swaps) //   2. "010101010" (5 swaps)
   */
  public static int minSwaps(String str) {
    /* int[] swapCnt = new int[2];
    for (int i = 0; i < str.length(); i += 2) {
      if (str.charAt(i) == '1') {
        swapCnt[0]++;
      }
    }
    for (int i = 1; i < str.length(); i += 2) {
      if (str.charAt(i) == '0') {
        swapCnt[0]++;
      }
    }
    for (int i = 0; i < str.length(); i += 2) {
      if (str.charAt(i) == '0') {
        swapCnt[1]++;
      }
    }
    for (int i = 1; i < str.length(); i += 2) {
      if (str.charAt(i) == '1') {
        swapCnt[1]++;
      }
    }
    return swapCnt[0] < swapCnt[1] ? swapCnt[0] : swapCnt[1]; */

    // Other Solution
    return Math.min(countSwaps(str, '1'), countSwaps(str, '0'));
  }

  private static int countSwaps(String str, char bit) {
    int cnt = 0;
    for (char ch : str.toCharArray()) {
      if (ch != bit) {
        cnt++;
      }
      bit = bit == '1' ? '0' : '1';
    }
    return cnt;
  }

  /**
   * A Periodic Series
   * @see https://edabit.com/challenge/oXXBnHjXLAHKcvqXN
   * @param str
   * @return Periodic Series의 길이를 리턴. 
   * 1) 정수를 나타내는 문자열에서 정수의 각 자리의 수를 합하여 문자열의 뒤에 붙임
   * 2) 붙인 문자열에서 붙인 길이만큼 문자열의 앞을 자름
   * 3) 이런식으로 하여 전에 나왔던 문자열이 다시 나올 때까지 반복할 때 이 배열의 길이를 리턴
   * "124", "247", "713", "311", "115", "157", "713", "311" .. // 전에 나왔던 "713"이 다시 나오기까지 이전의 길이
   */
  public static int periodic(String str) {
    Set<String> set = new HashSet<>();
    set.add(str);
    while (true) {
      StringBuilder sb = new StringBuilder(str);
      str = sb.append(getDigitSum(str)).substring(getDigitSum(str).length());
      if (set.contains(str)) {
        break;
      }
      set.add(str);
    }
    return set.size();
  }

  private static String getDigitSum(String str) {
    int strInt = Integer.parseInt(str);
    int sum = 0;
    while (strInt != 0) {
      sum += strInt % 10;
      strInt /= 10;
    }
    return String.valueOf(sum);
  }

  /**
   * Working 9 to 5
   * @see https://edabit.com/challenge/phxxGdTJraPEQmKdq
   * @param arr
   * @return 근무시간에 따른 임금 리턴. 배열로 주어지는 매개변수는 {근무시작시간, 근무종료시간, 시간당 임금, 정규시간 외 근무 임금 배율}, 정규 근무 시간은 9시부터 17시
   */
  public static String overTime(double[] arr) {

    /* double regularWorkTime = 0;
    if (arr[0] <= 17 && arr[1] <= 17) {
      regularWorkTime = arr[1] - arr[0];
    } else if (arr[0] <= 17 && arr[1] > 17) {
      regularWorkTime = 17 - arr[0];
    }
    
    double extraWorkTime = 0;
    if (arr[0] > 17) {
      extraWorkTime = arr[1] - arr[0];
    } else if (arr[1] > 17) {
      extraWorkTime = arr[1] - 17;
    }
    return String.format("%s%.2f", "$", regularWorkTime * arr[2] + extraWorkTime * arr[2] * arr[3]); */

    // Other Solution
    double sum = 0.0;
    for (double i = arr[0]; i < arr[1]; i += 0.25) {
      if (i < 17) {
        sum += 0.25 * arr[2];
      } else if (i >= 17) {
        sum += 0.25 * arr[2] * arr[3];
      }
    }
    return String.format("$%.2f", sum);
  }

  /**
   * Replace Every Nth Instance of a Character
   * @see https://edabit.com/challenge/Yr2kTTb6zf5PNx6DE
   * @param txt
   * @param nth
   * @param oldChar
   * @param newChar
   * @return 주어진 문자열 txt에서 매 nth번째 oldChar를 newChar로 교체 후 리턴
   */
  public static String replaceNth(String txt, int nth, String oldChar, String newChar) {

    if (nth == 0) {
      return txt;
    }
    StringBuilder sb = new StringBuilder();
    int cnt = 0;
    for (int i = 0; i < txt.length(); i++) {
      if (txt.charAt(i) == oldChar.charAt(0)) {
        cnt++;
      }
      sb.append(txt.charAt(i));
      if (cnt == nth) {
        sb.deleteCharAt(sb.length() - 1);
        sb.append(newChar);
        // == sb.setCharAt(sb.length() - 1, newChar.charAt(0));
        // == sb.replace(sb.length() - 1, sb.length(), newChar);
        cnt = 0;
      }
    }
    return sb.toString();

    // Other Solution
    /* StringBuilder sb = new StringBuilder(txt);
    int count = 0;
    int lastIndex = 0;
    
    while (sb.indexOf(oldChar, lastIndex) != -1) {
      int oldCharIndex = sb.indexOf(oldChar, lastIndex);
      if (oldCharIndex == -1) {
        break;
      }
      lastIndex = oldCharIndex + 1;
      count++;
      if (count == nth) {
        sb.replace(oldCharIndex, oldCharIndex + 1, newChar);
        count = 0;
      }
    }
    return sb.toString(); */
  }

  /**
   * Balanced Words
   * @see https://edabit.com/challenge/NGnsMw8CG8gxEFW7w
   * @param word
   * @return 양쪽 문자의 합이 같은가
   */
  public static boolean balanced(String word) {
    int leftSideSum = 0;
    int rightSideSum = 0;
    for (int i = 0, j = word.length() - 1; i < word.length() / 2; i++, j--) {
      leftSideSum += word.charAt(i);
      rightSideSum += word.charAt(j);
    }
    return leftSideSum == rightSideSum;
  }
}