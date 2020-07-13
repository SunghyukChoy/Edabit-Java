package my.sunghyuk.edabit.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class Program {

  private Program() {
  }

  /**
   * Alphabet Soup
   * 
   * @see https://edabit.com/challenge/2zKtCWQM2rSxMQqLX
   * @param s
   * @return
   */
  public static String alphabetSoup(String s) {
    /**
     * 1. 알파벳순으로 정렬
     */
    char[] sArray = s.toCharArray();
    Arrays.sort(sArray);

    return String.valueOf(sArray);
  }

  public static String alphabetSoupOtherSol(String s) {
    String[] letters = s.split("");
    Arrays.sort(letters);
    return String.join("", letters);
  }

  /**
  * Array of Multiples
  * 매개변수 num의 배수를 갖고, 길이는 매개변수 length인 배열 리턴
  * 
  * @see https://edabit.com/challenge/rzpucPyoyEtXPo2BG
  * @param num
  * @param length
  * @return
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
   * 배열 요소의 합. 재귀함수로 풀기
   * @see https://edabit.com/challenge/hf2THAoQRQbAx2jc9
   * @param arr
   * @return
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
   * 배열 요소 값들의 평균 구하기. 소수점 아래 2자리까지
   * @see https://edabit.com/challenge/W64jA8hmGCmjbR7Fb
   * @param nums
   * @return
   */
  public static double mean(int[] nums) {
    return Double.valueOf(String.format("%.2f", (double) Arrays.stream(nums).sum() / nums.length));

    // Other Solution
    // return Math.round(Arrays.stream(nums).summaryStatistics().getAverage() * 100) / 100.0;
  }

  /**
   * Pi to N Decimal Places
   * Pi 값을 소수점 아래 num 자리수로 리턴
   * @see https://edabit.com/challenge/MX8ikyoCnDWr33saY
   * @param num
   * @return
   */
  public static double myPi(int num) {
    String format = "%." + num + "f";
    return Double.parseDouble(String.format(format, Math.PI));
    // Other Solution
    // return Math.round(Math.PI * Math.pow(10, num)) / Math.pow(10, num);
  }

  /**
   * Purge and Organize
   * 
   * 배열의 요소들을 중복 없이, 오름차순으로 정렬된 배열로 리턴
   * @see https://edabit.com/challenge/kgMghy3omychqLnXv
   * @param nums
   * @return
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
   * 문자열 거꾸로 출력. 재귀함수로 풀기
   * @see https://edabit.com/challenge/zSqXDoWS8PuhbbPrL
   * @param str
   * @return
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
   * 배열의 수 중 1 ~ 10(연속적인 수) 사이의 없어진 수 리턴
   * @see https://edabit.com/challenge/GJh9FraKutcnHoruX
   * @param nums
   * @return
   */
  public static int missingNum(int[] nums) {
    // 1부터 10까지의 합 - 배열의 합 = 없어진 값
    // return 55 - Arrays.stream(nums).sum();

    // Other Solution
    Arrays.sort(nums);
    int sumConsecutiveNum = 0;
    for (int i = nums[0]; i <= nums[nums.length - 1]; i++) {
      sumConsecutiveNum += i;
    }
    return sumConsecutiveNum - Arrays.stream(nums).sum();
  }
}