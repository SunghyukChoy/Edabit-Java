package my.sunghyuk.edabit.hard;

import java.lang.reflect.Array;
import java.util.ArrayList;
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
  public static boolean canBuild(String[] arr) {

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
  public static boolean canBuild(String str1, String str2) {
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
}