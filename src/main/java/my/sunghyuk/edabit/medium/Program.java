package my.sunghyuk.edabit.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
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
    Iterator<Integer> iterator = set.iterator();
    int i = 0;
    while (iterator.hasNext()) {
      uniqueArr[i] = iterator.next();
      // System.out.println(iterator.next());
      // 배열에 들어가는 요소와 출력문에서의 요소는 다른 요소임. 
      // .next()로 요소 호출 시마다 다음 요소가 호출됨
      // 들어가는 요소 확인하고 싶으면 변수 선언해서 확인할 것.
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
}