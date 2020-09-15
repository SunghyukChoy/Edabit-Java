package my.sunghyuk.edabit.hard;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
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
}