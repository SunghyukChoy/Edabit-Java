package my.sunghyuk.edabit.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {

  private Program() {
  }

  /**
   * Alphabet Soup
   * @see https://edabit.com/challenge/2zKtCWQM2rSxMQqLX
   * @param s
   * @return 알파벳순으로 정렬
   */
  public static String alphabetSoup(String s) {

    char[] sArray = s.toCharArray();
    Arrays.sort(sArray);

    return String.valueOf(sArray);
    // return String.join("", sArray);
  }

  /**
  * Array of Multiples
  * @see https://edabit.com/challenge/rzpucPyoyEtXPo2BG
  * @param num
  * @param length
  * @return 매개변수 num의 배수를 갖고, 길이는 매개변수 length인 배열 리턴
  */
  public static int[] arrayOfMultiples(int num, int length) {
    int[] multiplesArr = new int[length];

    for (int i = 0; i < length; i++) {
      multiplesArr[i] = num * (i + 1);
    }
    return multiplesArr;
  }

  /**
   * Recursion: Array Sum
   * @see https://edabit.com/challenge/hf2THAoQRQbAx2jc9
   * @param arr
   * @return 배열 요소의 합. 재귀함수로 풀기
   */
  public static int sum(int[] arr) {
    // return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
    // return arr[0] + arr.length == 0 ? 0 : sum(Arrays.copyOfRange(arr, 1, arr.length));
    // 둘 다 틀림. ArrayIndexOutOfBoundsException: 0 에러. 배열의 길이가 0인 경우 0번 인덱스를 찾을 수 없기 때문
    return arr.length == 0 ? 0 : sum(Arrays.copyOfRange(arr, 1, arr.length)) + arr[0];

    // Other Solution
    // return Arrays.stream(arr).sum();
  }

  /**
   * Calculate the Mean
   * @see https://edabit.com/challenge/W64jA8hmGCmjbR7Fb
   * @param nums
   * @return 배열 요소 값들의 평균 구하기. 소수점 아래 2자리까지
   */
  public static double mean(int[] nums) {
    return Double.valueOf(String.format("%.2f", (double) Arrays.stream(nums).sum() / nums.length));

    // Other Solution
    // return Math.round(Arrays.stream(nums).summaryStatistics().getAverage() * 100) / 100.0;
  }

  /**
   * Pi to N Decimal Places   
   * @see https://edabit.com/challenge/MX8ikyoCnDWr33saY
   * @param num
   * @return Pi 값을 소수점 아래 num 자리수로 리턴
   */
  public static double myPi(int num) {
    String format = "%." + num + "f";
    return Double.parseDouble(String.format(format, Math.PI));
    // Other Solution
    // return Math.round(Math.PI * Math.pow(10, num)) / Math.pow(10, num);
  }

  /**
   * Purge and Organize
   * @see https://edabit.com/challenge/kgMghy3omychqLnXv
   * @param nums
   * @return 배열의 요소들을 중복 없이, 오름차순으로 정렬된 배열로 리턴
   */
  public static int[] uniqueSort(int[] nums) {
    // Arrays.sort(nums); // HashSet()으로 객체 생성 시 원래의 배열 정렬할 필요 없음. 컬렉션에 담으면서 순서 유지 안 됨. LinkedHashSet()으로 객체 생성 시에는 순서 유지 가능.  
    Set<Integer> set = new HashSet<>();
    for (Integer num : nums) {
      set.add(num);
    }
    int[] uniqueArr = new int[set.size()];
    // Iterator<Integer> iterator = set.iterator();
    int i = 0;
    /*  while (iterator.hasNext()) {
      uniqueArr[i] = iterator.next();
      // System.out.println(iterator.next());
      // 배열에 들어가는 요소와 출력문에서의 요소는 다른 요소임. 
      // .next()로 요소 호출 시마다 다음 요소가 호출됨
      // 들어가는 요소 확인하고 싶으면 변수 선언해서 확인할 것.
      i++;
    } */
    for (int uniqueNum : set) {
      uniqueArr[i] = uniqueNum;
      i++;
    }
    Arrays.sort(uniqueArr);
    return uniqueArr;

    // Other Solution
    // return java.util.Arrays.stream(nums).distinct().sorted().toArray();    
  }

  /**
   * Recursion: Reverse a String
   * @see https://edabit.com/challenge/zSqXDoWS8PuhbbPrL
   * @param str
   * @return 문자열 거꾸로 출력. 재귀함수로 풀기
   */
  public static String reverse(String str) {
    return str.length() == 0 ? "" : str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
  }

  /**
   * Recursion: Count Vowels
   * 문자열에서 모음 개수 리턴. 재귀함수로 풀기
   * @see https://edabit.com/challenge/DtTdXqwFQYTf6ZE3J
   * @param str
   * @return
   */
  public static int countVowels(String str) {
    int count = 0;
    if (str.isEmpty()) {
      return 0;
    }
    if (String.valueOf(str.charAt(0)).matches("[aeiou]")) {
      count++;
    }

    return count + countVowels(str.substring(1));
  }

  /**
   * Remove Duplicates from an Array
   * 배열의 순서는 유지하면서 종복 요소 제거
   * @see https://edabit.com/challenge/KESQCRf5mJd7x6Rfh
   * @param nums
   * @return
   */
  public static int[] removeDups(int[] nums) {
    Set<Integer> set = new LinkedHashSet<>();
    for (Integer num : nums) {
      set.add(num);
    }
    int[] removeDupArr = new int[set.size()];
    Iterator<Integer> iterator = set.iterator();
    int i = 0;
    while (iterator.hasNext()) {
      removeDupArr[i] = iterator.next();
      i++;
    }
    return removeDupArr;

    // Other Solutions
    // return Arrays.stream(nums).boxed().mapToInt(Integer::intValue).distinct().toArray();
    // return IntStream.of(nums).distinct().toArray();
  }

  public static String[] removeDups(String[] str) {
    Set<String> set = new LinkedHashSet<>();
    for (String string : str) {
      set.add(string);
    }
    return set.toArray(new String[0]);

    // Other Solution
    // return Arrays.asList(str).stream().distinct().toArray(String[]::new);
  }

  /**
   * Eliminate Odd Numbers within an Array
   * 홀수를 제거한 배열 리턴. 원래의 배열 순서 유지
   * @see https://edabit.com/challenge/A7mDjLb7DZL5bk8oz
   * @param nums
   * @return
   */
  public static int[] noOdds(int[] nums) {
    List<Integer> list = new ArrayList<>();
    for (Integer num : nums) {
      if (num % 2 == 0) {
        list.add(num);
      }
    }
    int[] evenArr = new int[list.size()];
    int i = 0;
    for (int evenNum : list) {
      evenArr[i] = evenNum;
      i++;
    }
    return evenArr;

    // Other Solution
    /* int evenArrLength = 0;
    for (int num : nums) {
      if (num % 2 == 0) {
        evenArrLength++;
      }
    }
    int[] evenArr = new int[evenArrLength];
    int i = 0;
    for (int num : nums) {
      if (num % 2 == 0) {
        evenArr[i] = num;
        i++;
      }
    }
    return evenArr; */

    // Other Solution
    // return Arrays.stream(nums).filter(n -> n % 2 == 0).toArray();
  }

  /**
   * Return the Highest and Lowest Numbers
   * 숫자로 이루어진 문자열에서 가장 큰 수와 작은 수를 "highst lowest" 문자열 형태로 리턴.
   * 배열 요소가 하나면 같은 값으로 리턴
   * @see https://edabit.com/challenge/iaCSbqngin2AXriyB
   * @param s
   * @return
   */
  public static String highLow(String s) {
    String[] sArr = s.split(" ");
    int[] sNumArr = new int[sArr.length];
    for (int i = 0; i < sArr.length; i++) {
      sNumArr[i] = Integer.parseInt(sArr[i]);
    }
    Arrays.sort(sNumArr);
    return String.valueOf(sNumArr[sNumArr.length - 1] + " " + sNumArr[0]);

    // Other Solution
    /* String[] sArr = s.split(" ");
    int highestNum = Integer.MIN_VALUE;
    int lowestNum = Integer.MAX_VALUE;
    for (String str : sArr) {
      if (Integer.parseInt(str) > highestNum) {
        highestNum = Integer.parseInt(str);
      }
      if (Integer.parseInt(str) < lowestNum) {
        lowestNum = Integer.parseInt(str);
      }
    }
    return String.valueOf(highestNum) + " " + String.valueOf(lowestNum); */
  }

  /**
   * Is the Number a Prime?
   * 주어진 수가 소수인가. 문제에서 1은 소수로 포함하지 않음.
   * 홀수는 짝수로 나누어질 수 없음.
   * @see https://edabit.com/challenge/GXpmy3RRpxH2EwiT6
   * @param num
   * @return
   */
  public static boolean isPrime(int num) {
    if (num == 1) { // 1은 소수에서 제외
      return false;
    }
    if (num == 2) { // 짝수이지만 2는 소수
      return true;
    }
    if (num % 2 == 0) { // 짝수인 경우 (2로 나누어지므로 소수가 아님)
      return false;
    }
    for (int i = 3; i <= Math.sqrt(num); i = i + 2) { // 홀수 중에 소수가 아닌 경우 
      // x가 어떤 수로 나뉜다는 것은 x^2 또한 어떤 수로 나뉜다는 뜻이므로 x^2까지 연산할 필요 없음
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  /**
   * Return the Objects Keys and Values
   * Entry 객체에서 value들만 배열로 리턴
   * @see https://edabit.com/challenge/7eoAWhG46SrA3tvLK
   * @param dict
   * @return
   */
  public static String[] getValues(Map<String, String> dict) {
    return dict.values().toArray(new String[0]);

    // Other Solution
    /* Set<String> keySet = dict.keySet(); // Map.Entry 객체에서 key를 가저와 Set 컬렉션으로 저장
    Iterator<String> keyIterator = keySet.iterator(); // Iterator 객체 생성
    List<String> values = new ArrayList<>(); // value들을 담을 변수 생성. 같은 value 중복 저장 가능
    while (keyIterator.hasNext()) {
      values.add(dict.get(keyIterator.next()));
      // keyIterator.next() : key를 하나씩 꺼내옴.
      // dict.get(key) : key로 value를 얻음.
    }
    return values.toArray(new String[0]); */

    // Other Solution
    /* Set<Map.Entry<String, String>> entrySet = dict.entrySet();
    // Map.Entry 객체를 Set 컬렉션에 저장 (Iterator 돌리기 위한..)
    Iterator<Map.Entry<String, String>> entryIterator = entrySet.iterator(); // Iterator 객체 생성
    List<String> values = new ArrayList<>();  // value들을 담을 변수 생성. 같은 value 중복 저장 가능
    while (entryIterator.hasNext()) {
      Map.Entry<String, String> entry = entryIterator.next(); // Map.Entry 객체 하나씩 가져옴
      values.add(entry.getValue()); 
      // entry.getValue() : Map.Entry 객체에서 value를 얻음.
    }
    return values.toArray(new String[0]); */
  }

  /**
   * Find the Missing Number
   * 배열의 수 중 1 ~ 10 사이의 없어진 수 리턴
   * @see https://edabit.com/challenge/GJh9FraKutcnHoruX
   * @param nums
   * @return
   */
  public static int missingNum(int[] nums) {
    // 1부터 10까지의 합 - 배열의 합 = 없어진 값
    return 55 - Arrays.stream(nums).sum();
  }

  /**
   * Positive Count / Negative Sum
   * 배열에서 양수 개수와 음수의 합을 배열로 리턴 [양수 개수, 음수들의 합]
   * @see https://edabit.com/challenge/n7kbvMp5zHRmRbFQF
   * @param input
   * @return
   */
  public static int[] countPositivesSumNegatives(int[] input) {
    if (input != null) { // input == null 이라는 조건을 전제로 코드를 짜면 틀림.. 왜...?
      int[] countPositivesSumNegatives = new int[2];
      for (int num : input) {
        if (num > 0) {
          countPositivesSumNegatives[0]++;
        } else if (num < 0) {
          countPositivesSumNegatives[1] += num;
        }
      }
      return input.length == 0 ? new int[] {} : countPositivesSumNegatives;
    } else {
      return new int[] {};
    }
  }

  /**
   * Reverse the Order of Words with Five Letters or More
   * 문장에서 단어의 문자가 5개 이상인 것만 거꾸로 바꿔서 출력.
   * "This is a typical sentence." ➞ "This is a lacipyt .ecnetnes"
   * @see https://edabit.com/challenge/aG8byPZcEj9yLKxA3
   * @param s
   * @return
   */
  public static String reverseFiveLettersWord(String s) {
    String[] words = s.split(" ");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() < 5) {
        sb.append(words[i] + " ");
      } else {
        // sb.append(getReverseStr(words[i]) + " ");
        sb.append(new StringBuilder(words[i]).reverse() + " ");
      }
    }
    return sb.toString().trim();
  }

  private static String getReverseStr(String str) {
    StringBuilder sb = new StringBuilder();
    for (int i = str.length() - 1; i >= 0; i--) {
      sb.append(str.charAt(i));
    }
    return sb.toString();
  }

  /**
   * Basic E-Mail Validation
   * abc@abc.com 문자열이 올바른 이메일 형식을 갖는가. 정규식 사용하지 않고 풀기
   * 1) 문자열은 반드시 하나의 @를 포함하여야 함
   * 2) 문자열은 만드시 하나 이상의 .을 포함하여야 함
   * 3) 문자열은 반드시 @ 앞에 하나 이상의 문자를 갖고 있어야 함
   * 4) @과 .은 반드시 적절한 위치에 있어야 함. (.은 @ 뒤에 위치)
   * @see https://edabit.com/challenge/7r4Hz8MvJq4sbHhXB
   * @param s
   * @return
   */
  public static boolean validateEmail(String s) {
    int atCnt = 0;
    int dotCnt = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '@') {
        atCnt++;
      } else if (s.charAt(i) == '.') {
        dotCnt++;
      }
    }
    // s.indexOf('@') > s.lastIndexOf('.') - 2 : adsfadsfasd@a.com의 형식 검사
    // 삼항 연산자에서 조건식이 true일 때 false를 반환하는 식 : !(조건식)으로 수정.
    return !(atCnt != 1 || dotCnt < 1 || s.charAt(0) == '@' || s.indexOf('@') > s.lastIndexOf('.') - 2);

    /* Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(s); // 입력 캐릭터 시퀀스에서 패턴을 찾는 Matcher 객체 생성
    return matcher.matches(); // 입력된 캐릭터 시퀀스에서 특정 패턴을 찾음.
    // .matches() : 주어진 문자열 전체가 특정 패턴과 일치하는가를 판단한다. 
    // .find() : 주어진 문자열에서 특정 패턴을 찾아낸다. */
  }

  private static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]+$",
      Pattern.CASE_INSENSITIVE);
  // 정규표현식으로부터 패턴을 만든다. Pattern.CASE_INSENSITIVE : 대소문자 구분하지 않음.

  /**
   * Number of Boomerangs
   * 정수 배열에서 한 요소를 중심으로 양쪽의 요소가 같은 값인가. 그러한 배열은 몇 개인가
   * 가운데 요소의 값과 양쪽 요소의 값은 달라야 함.
   * [3, 7, 3, 2, 1, 5, 1, 2, 2, -2, 2] 은 [3, 7, 3], [1, 5, 1], [2, -2, 2] 3개
   * [1, 7, 1, 7, 1, 7, 1] 은 [1, 7, 1], [7, 1, 7], [1, 7, 1], [7, 1, 7], [7, 1, 7] 5개
   * @see https://edabit.com/challenge/WzE2id9w5mNfXozKL
   * @param arr
   * @return
   */
  public static int countBoomerangs(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length - 2; i++) {
      if (arr[i] == arr[i + 2] && arr[i] != arr[i + 1]) {
        count++;
      }
    }
    return count;
  }

  /**
   * Check for Anagrams
   * Anagram : 단어나 문장을 구성하고 있는 문자의 순서를 바꾸어 다른 단어나 문장을 만드는 놀이. 대소문자 무시   
   * @see https://edabit.com/challenge/yeewrR3MB9PZprwPT
   * @param s1
   * @param s2
   * @return
   */
  public static boolean isAnagram(String s1, String s2) {
    // s1, s2 둘 다 공통된 문자를 같은 개수 갖고 있어야 함.
    char[] s1CharArr = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
    char[] s2CharArr = s2.replaceAll("\\s", "").toLowerCase().toCharArray();
    Arrays.sort(s1CharArr);
    Arrays.sort(s2CharArr);
    /* for (int i = 0; i < s1CharArr.length; i++) {
      if (s1CharArr[i] != s2CharArr[i]) {
        return false;
      }
    }
    return true; */

    // Other Solution
    return Arrays.equals(s1CharArr, s2CharArr);
  }

  /**
   * Recursion: String Palindromes
   * Palindromes : 문자열의 처음과 끝이 거울을 보듯 대칭되는 문자열
   * isPalindrome("abcba") ➞ true
   * @see https://edabit.com/challenge/99k6HcWYvvbZirkDW
   * @param str
   * @return
   */
  public static boolean isPalindrome(String str) {
    if (str.length() < 2) {
      return true;
    }
    return str.charAt(0) == str.charAt(str.length() - 1) ? isPalindrome(str.substring(1, str.length() - 1)) : false;

    // Other Solution
    /* for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        return false;
      }
    }
    return true; */
  }

  /**
   * Recursion: Length of a String
   * 문자열의 길이를 리턴. 
   * @see https://edabit.com/challenge/dGK2bxcojgLzbEZjp
   * @param str
   * @return
   */
  public static int length(String str) {
    // return str.length() == 0 ? 0 : 1 + length(str.substring(1));
    return str.equals("") ? 0 : 1 + length(str.substring(1));
  }

  /**
   * Sum of an Array of Times
   * "시:분:초"의 문자열을 갖는 배열에서 각 요소의 시, 분, 초를 더한 배열 리턴
   * timeSum(["5:39:42", "10:02:08", "8:26:33"]) ➞ [24, 8, 23]
   * @see https://edabit.com/challenge/g7mkKpAtZZ7mnuFQX
   * @param s
   * @return
   */
  public static int[] timeSum(String[] s) {
    /* int hourSum = 0;
    int minuteSum = 0;
    int secondSum = 0;
    for (int i = 0; i < s.length; i++) {
      String[] timeArr = s[i].split(":");
      hourSum += Integer.parseInt(timeArr[0]);
      minuteSum += Integer.parseInt(timeArr[1]);
      secondSum += Integer.parseInt(timeArr[2]);
    }
    while (minuteSum > 60 || secondSum > 60) {
      if (secondSum > 60) {
        minuteSum++;
        secondSum -= 60;
      }
      if (minuteSum > 60) {
        hourSum++;
        minuteSum -= 60;
      }
    }
    return new int[] { hourSum, minuteSum, secondSum }; */

    // Other Solution
    int[] timeArr = new int[3];
    for (String str : s) {
      timeArr[2] += Integer.parseInt(str.split(":")[2]);
      timeArr[1] += Integer.parseInt(str.split(":")[1]) + timeArr[2] / 60;
      timeArr[2] %= 60;
      timeArr[0] += Integer.parseInt(str.split(":")[0]) + timeArr[1] / 60;
      timeArr[1] %= 60;
    }
    return timeArr;
  }

  /**
   * Wurst Is Better
   * 해당하는 문자열을 "Wurst"로 바꾸기
   * @see https://edabit.com/challenge/o9nESkofDnfXJ5m7a
   * @param s
   * @return
   */
  public static String wurstIsBetter(String s) {
    return s.replaceAll("(?i)Kielbasa|Chorizo|Moronga|Salami|Sausage|Andouille|Naem|Merguez|Gurka|Snorkers|Pepperoni",
        "Wurst");
    // (?i) : 정규식. 대소문자 구별하지 않음.
  }

  /**
   * Sort Numbers in Descending Order
   * 정수 num 자릿수의 숫자들을 내림차순 수로 리턴
   * @see https://edabit.com/challenge/JfertgG5phtnvDNpD
   * @param num
   * @return
   */
  public static int sortDesc(final int num) {
    char[] numCharArr = String.valueOf(num).toCharArray();
    Arrays.sort(numCharArr);
    StringBuilder sb = new StringBuilder();
    for (int i = numCharArr.length - 1; i >= 0; i--) {
      sb.append(numCharArr[i]);
    }
    return Integer.parseInt(sb.toString());
  }

  /**
  * AlTeRnAtInG cApS
  * 문자열을 "대소대소대소" 형태로 리턴. 첫 문자는 대문자로 시작. 공백은 "대소대소" 조건에 포함하지 않음. 
  * alternatingCaps("OMG this website is awesome!") ➞ "OmG tHiS wEbSiTe Is AwEsOmE!"
  * @see https://edabit.com/challenge/9Y83kppxQeMbvtDtF
  * @param s
  * @return
  */
  public static String alternatingCaps(String s) {
    StringBuilder sb = new StringBuilder();
    int idx = 0;
    for (int i = 0; i < s.length(); i++) {
      if (!Character.isLetter(s.charAt(i))) {
        sb.append(s.charAt(i));
        continue;
      }
      idx++; // 공백 등을 제외한 알파벳만 관리하는 인덱스
      sb.append(idx % 2 != 0 ? Character.toUpperCase(s.charAt(i)) : Character.toLowerCase(s.charAt(i)));
    }
    return sb.toString();
  }

  /**
   * Is the Input Factorial of an Integer?
   * 주어진 정수 n이 팩토리얼 숫자인가. 24 = 4 * 3 * 2 * 1 true. 27 false
   * @param n
   * @return
   */
  public static boolean isFactorial(int n) {
    int factorialNum = 1;
    int i = 1;
    while (factorialNum < n) {
      factorialNum *= i;
      ++i;
    }
    return factorialNum == n;
  }

  /**
   * Return Only the Int
   * @see https://edabit.com/challenge/9k87o8Y4yNt3fvcfB
   * @param arr
   * @return Object 타입의 배열에서 정수인 요소만 배열로 리턴
   */
  public static int[] returnInts(Object[] arr) {
    List<Integer> list = new ArrayList<>();
    for (Object obj : arr) {
      if (obj instanceof Integer) {
        list.add((int) obj);
      }
    }
    int[] intsArr = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      intsArr[i] = list.get(i);
    }
    return intsArr;

    // Other Solution
    /* int[] intsArr = new int[arr.length];
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] instanceof Integer) {
        intsArr[j] = (Integer) arr[i];
        j++;
      }
    }
    return Arrays.copyOfRange(intsArr, 0, j); */
  }

  /**
   * Pythagorean Triplet
   * @see https://edabit.com/challenge/p3BhJuodwuhrNjQJ5
   * @param a
   * @param b
   * @param c
   * @return  주어진 세 수가 피타고라스의 정리를 만족하는가. 주어진 매개변수가 꼭 a,b < c 인 것은 아님.
   */
  public static boolean isTriplet(int a, int b, int c) {
    int[] nums = new int[] { a, b, c };
    Arrays.sort(nums);
    return nums[2] * nums[2] == nums[0] * nums[0] + nums[1] * nums[1];
  }
}