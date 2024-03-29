package my.sunghyuk.edabit.medium;

import java.io.Console;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

import my.sunghyuk.edabit.Helper;

public class Challenge {
  /**
   * Algorithms II: The Euclidean Algorithm
   * @see : https://edabit.com/challenge/HmicQW4LMYyNHXRzT Function Recursive 
   * @param a
   * @param b
   * @return
   */
  public static int euclidean(int a, int b) {
    // Ensure that "a" >= "b". If "a" < "b", swap them.
    if (a < b) {
      int c = b;
      b = a;
      a = c;
    }
    // Find the remainder. Divide "a" by "b" and set "r" as the remainder.
    int r = a % b;
    // Is "r" zero? If so terminate the function and return "b" (the second number).
    if (r == 0)
      return b;
    // Set "a" = "b" and "b" = "r" and start the algorithm over again.
    return euclidean(b, r);
  }

  /**
   * Valid Hex Code
   * 
   * @see https://edabit.com/challenge/9zBJYnBekqAo52zEp
   * @param str
   * @return 1. 문자열은 #으로 시작 2. 그 뒤에 문자들은 0~9,a~f 까지 3. #제외 6글자인가
   */
  public static boolean isValidHexCode(String str) {
    /**
     * Java String 클래스에서 제공되는 정규표현식 관련 메서드
     * 1. boolean matches(String regex);
     * 2. String replaceAll(String regex, String replacement);
     * 3. String replaceFirst(String regex, String replacement);
     * 4. String split(String regex);
     */
    /* if (str.length() != 7) {
      return false;
    }
    if (str.charAt(0) != '#') {
      return false;
    }
    for (int i = 1; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (!((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F'))) {
        return false;
      }
    }
    return true; */

    // Other Solution
    return str.matches("^#[\\da-fA-F]{6}");
    // ^# : #으로 시작하고
    // [\\da-fA-F] : \\d : 0에서 9, a에서 f, A에서 F까지
    // {6} : 앞 조건식의 문자가 6개
  }

  /**
   * Filter Repeating Character Strings
   * @see https://edabit.com/challenge/tunTJAdBeLgc8s4ap
   * @param arr
   * @return 배열의 요소 중 문자가 반복되는 요소만 배열로 리턴. 요소의 길이가 1이라면 그대로 리턴
   */
  public static String[] identicalFilter(String[] arr) {
    List<String> list = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      list.add(arr[i]);
      // list.addAll(Arrays.asList(arr));
      // 컬렉션에 배열 요소 넣는 메소드. 

      for (int j = 1; j < arr[i].length(); j++) {
        if (arr[i].charAt(0) != arr[i].charAt(j)) {
          list.remove(arr[i]);
        }
      }
    }
    String[] filterArr = list.toArray(new String[0]);
    // .toArray(배열 객체[배열의 길이])
    // 컬렉션을 배열로 변환하는 메소드. 컬렉션의 크기 > 지정한 배열의 길이 -> 컬렉션의 크기로 저장되고,
    // 지정한 배열의 길이 > 컬렉션의 크기 -> 지정한 배열의 길이로 배열 생성, 비어있는 인덱스에는 null 저장
    return filterArr;

    // Other Solution
    /*  String result = "";
    for (String str : arr) { // str은 배열의 각 요소      
      if (str.replaceAll("" + str.charAt(0), "").length() == 0) {
        // 문자열의 첫 문자와 같은 문자를 모두 제거했을 때 길이가 0이라면
        // == 첫 문자와 다른 문자가 같다면
        result += str + " "; // 그 문자를 결과 문자열에 더함
      }
    }
    return result.length() == 0 ? new String[] {} : result.split(" "); */

    // Other Solution
    /* ArrayList<String> arrList = new ArrayList<>();
    for (String i : arr) {
      if (i.matches("(\\w)\\1*"))
        arrList.add(i);
    }
    return arrList.toArray(new String[arrList.size()]); */
  }

  /**
   * How Many Solutions Does This Quadratic Have?
   * @see https://edabit.com/challenge/Rs23pTNpM6k5M2ThH
   * @param a
   * @param b
   * @param c
   * @return (매개변수로 주어지는 a,b,c) ax^2 + bx + c에서 x의 값은 몇 개인가.
   */
  public static int solutions(int a, int b, int c) {
    // 근의 개수 구하는 공식. b^2-4ac > 0 -> 2, // == 0 -> 1, // < 0 -> 0    
    if ((int) Math.pow(b, 2) - 4 * a * c > 0) {
      return 2;
    } else if ((int) Math.pow(b, 2) - 4 * a * c == 0) {
      return 1;
    } else {
      return 0;
    }
  }

  /**
   * Perfect Square Patch
   * @see https://edabit.com/challenge/7Tb7qMDQHtz3xpydd
   * @param n
   * @return n x n 이차원 배열 만들기  ex : {{3, 3, 3}, {3, 3, 3}, {3, 3, 3}}
   */
  public static int[][] squarePatch(int n) {

    /*  int[][] squareArr = new int[n][n];
    // new int[이차원배열 길이(그 일차원 배열을 몇개 갖고 있느냐)][일차원배열 길이(일차원 배열 요소의 수)]
    for (int i = 0; i < n; i++) { // 바깥 배열. 이차원 배열
      for (int j = 0; j < n; j++) { // 안쪽 배열. 일차원 배열
        squareArr[i][j] = n;
      }
    }
    return squareArr; */

    // Other Solution
    /* return Stream.generate(() -> n).limit(n)
        .map(size -> Stream.generate(() -> size).limit(size).mapToInt(Integer::intValue).toArray())
        .toArray(int[][]::new); */

    // Other Solution
    int[][] result = new int[n][n];
    for (int[] is : result) {
      Arrays.fill(is, n);
    }
    return result;
  }

  private enum Rps {
    PAPER, SCISSORS, ROCK
  }

  /**
   * Simulate the Game "Rock, Paper, Scissors"
   * @see https://edabit.com/challenge/3S8XppR6Yf5mXPxij
   * @param s1
   * @param s2
   * @return 가위 바위 보, 승자 리턴
   */
  public static String rps(String s1, String s2) {
    /* if (s1.equals("rock")) {
      switch (s2) {
        case "paper":
          return "Player 2 wins";
        case "scissors":
          return "Player 1 wins";
        default:
          return "TIE";
      }
    }
    if (s1.equals("scissors")) {
      switch (s2) {
        case "paper":
          return "Player 1 wins";
        case "rock":
          return "Player 2 wins";
        default:
          return "TIE";
      }
    }
    if (s1.equals("paper")) {
      switch (s2) {
        case "rock":
          return "Player 1 wins";
        case "scissors":
          return "Player 2 wins";
        default:
          return "TIE";
      }
    }
    return ""; */

    // Other Solution
    /* int p1 = Rps.valueOf(s1.toUpperCase()).ordinal();
    int p2 = Rps.valueOf(s2.toUpperCase()).ordinal();
    return (p1 == p2) ? "TIE"
        : (p1 - p2 == 1 || p1 - p2 == 1 - Rps.values().length) ? "Player 1 wins" : "Player 2 wins"; */

    // Other Solution
    /* Map<String, String> rules = new HashMap<>();
    rules.put("rock", "scissors");
    rules.put("paper", "rock");
    rules.put("scissors", "paper");
    if (s1.equals(s2)) {
      return "TIE";
    }
    return String.format("Player %d wins", rules.get(s1).equals(s2) ? 1 : 2); */

    // Other Solution
    if (s1.equals(s2)) {
      return "TIE";
    } else if ((s1.equals("rock") && s2.equals("scissors")) || (s1.equals("scissors") && s2.equals("paper"))
        || (s1.equals("paper") && s2.equals("rock"))) {
      return "Player 1 wins";
    } else {
      return "Player 2 wins";
    }

  }

  /**
   * The Empty Square Sequence
   * @see https://edabit.com/challenge/3GvRKZPF2NRPz3DgQ
   * @param step
   * @return
   * 주어지는 step은 사각형 한 변 길이의 반. step이 1이라면 사각형은 2 x 2의 크기를 가짐
   * 2 x 2 크기의 사각형은 4칸으로 나뉘어져 있고 각 칸에는 점이 하나씩 들어감
   * step = 2일 때 사각형의 크기는 4 x 4이고 점은 2 x 2에 찍힌 점에서 모서리 방향으로 하나씩 더 찍힘
   * 즉 한 단계씩 진행할 때마다 4개의 점이 더 찍힘. 그 외의 점이 찍히지 않는 칸은 empty square라고 함.
   * step이 n일 때 empty square의 갯수 리턴
   */
  public static int emptySq(int step) {
    // int area; // 사각형의 넓이. == 칸의 갯수
    // int dot = 4;
    // int emptySquare;

    // step 1 : area = 4; dot = 4; empty = 0;
    // step 2 : area = 16; dot = 8; empty = 8;
    // step 3 : area = 36; dot = 12; empty = 24;
    // step 4 : area = 64; dot = 16; empty = 48;
    // step n : area = n*2 * n*2 dot = 4n empty = area - 4n;

    return (int) Math.pow(step * 2, 2) - 4 * step;
  }

  /**
   * Count the Number of Duplicate Characters
   * @see https://edabit.com/challenge/zmbR8SKveCgJ6KB5G
   * @param str
   * @return 중복되는 문자 갯수(중복 횟수) 리턴, 공백도 문자로 포함   
   */
  public static int duplicates(String str) {
    char[] chArr = str.toCharArray();
    Set<Character> set = new HashSet<>();
    for (Character character : chArr) {
      set.add(character);
    }
    return str.length() - set.size();

    // Other Solution
    // int counter = 0;
    // int n = str.length();
    // for (int i = 0; i < n - 1; i++) {
    //   for (int j = i + 1; j < n; j++) {
    //     if (str.charAt(i) == str.charAt(j)) {
    //       counter++;
    //       break;
    //     }
    //   }
    // }
    // return counter;
  }

  /**
   * Change Every Letter to the Next Letter
   * @see https://edabit.com/challenge/2Cbbs3pvH2gCMZMsg
   * @param word
   * @return 문자를 다음 알파벳순의 문자로 바꾸기 bye -> czf. 문자열에 z는 없음.
   */
  public static String move(String word) {

    int[] charAscii = word.chars().toArray(); // 문자열의 문자들을 정수형 배열(ascii값 배열)로 변환
    String moveStr = "";
    for (int i = 0; i < charAscii.length; i++) {
      char moveCh = (char) (charAscii[i] + 1); // 아스키 값을 그냥 형변환 해주면 아스키 값에 해당하는 문자 출력됨...
      moveStr += moveCh;
    }
    return moveStr;
  }

  /**
   * Pages in a Book
   * 책의 각 페이지에는 해당하는 쪽의 숫자가 있고 total은 그 쪽의 숫자를 더한 값을 의미함
   * 책이 6 페이지의 책이라면 total = 1 + ... + 6 = 21이 됨.
   * 주어진 total이 25라면 false를 반환해야함. 나올 수 없는 total이므로 (21 + 7 = 28)
   * 단순히 숫자를 더해서 푸는 것보다 효율적인 방법 생각해보기
   * @see https://edabit.com/challenge/kZZDAMCjekgBdWgJy
   * @param total
   * @return
   */
  public static boolean pagesInBook(int total) {
    /*  int sum = 0;
    int page = 1;
    // while (true) {
    //   sum += page;
    //   page++;
    //   if (sum == total) {
    //     return true;
    //   } else if (sum > total) {
    //     return false;
    //   }
    // }
    while (sum < total) {
      sum += page;
      page++;
    }
    return sum == total; */

    // Other Solution
    return (Math.sqrt(1 + 8 * total) - 1) / 2.0 % 1 == 0; // 이게 뭔데...
  }

  /**
   * GCD and LCM ( Part 1)
   * 최대 공약수 리턴
   * @see https://edabit.com/challenge/FsgEcZdjC4BYG9gLj
   * @param a
   * @param b
   * @return
   */
  public static int gcd(int a, int b) {

    int smallerNum = b >= a ? a : b;
    int gcd = 1;
    for (int i = smallerNum; i > 0; i--) {
      if (a % i == 0 && b % i == 0) {
        gcd = i;
        break;
      }
    }
    return gcd;

    // Other Solution
    /*   if (b == 0) {
      return a;
    } else {
      return gcd(b, a % b);
    } */
  }

  /**
   * Rectangle in Circle
   * 직사각형의 너비(w)와 높이(h). 원의 반지름(radius). 직사각형이 원 안에 들어가는가
   * @see https://edabit.com/challenge/XFhvhZhfA7TfPk87D
   * @param w
   * @param h
   * @param radius
   * @return
   */
  public static boolean rectangleInCircle(int w, int h, int radius) {
    // Other Solution
    return Math.pow(w, 2) + Math.pow(h, 2) <= Math.pow(2 * radius, 2); // 이게 뭔데..
  }

  /**
   * Magic Date
   * "d m yyyy" 형식의 문자열 str에서 d * m 했을 때 나오는 수가 yyyy의 마지막 1또는 2 또는 3 자리와 일치하는가
   * @see https://edabit.com/challenge/g7dRyiCi5dpKxuFRa
   * @param str
   * @return
   */
  public static boolean magic(String str) {
    String[] strArr = str.split(" ");
    // int day = Integer.parseInt(strArr[0]);
    // int month = Integer.parseInt(strArr[1]);
    // String dm = String.valueOf(day * month);
    return strArr[2].endsWith(String.valueOf(Integer.parseInt(strArr[0]) * Integer.parseInt(strArr[1])));
  }

  /**
   * Find the Second Occurrence of "zip" in a String
   * 문자열에서 "zip"이란 단어가 두 번째 등장하는 위치(인덱스) 리턴
   * 다시 등장하지 않으면 -1 리턴. Zip != zip
   * @see https://edabit.com/challenge/px8DTp5gTmojeBLve
   * @param str
   * @return
   */
  public static int findZip(String str) {

    int secondZip;
    for (int i = 0; i < str.length() - 2; i++) {
      if (str.charAt(i) == 'z' && str.charAt(i + 1) == 'i' && str.charAt(i + 2) == 'p') {
        for (int j = i + 3; j < str.length() - 2; j++) { // 첫 zip 찾고 그 시점에서 두 번쨰 zip 찾는 반복문 시작
          if (str.charAt(j) == 'z' && str.charAt(j + 1) == 'i' && str.charAt(j + 2) == 'p') {
            secondZip = j;
            return secondZip; // 두 번째 zip 찾은 시점에 바로 리턴
          }
        }
      }
    }
    return -1;

    // Other Solution
    /* int pos1 = str.indexOf("zip");
    	int pos2 = str.indexOf("zip", pos1 + 1);
    	return pos2; */
  }

  /**
   * Factorize a Number
   * num의 약수들을 배열로 리턴
   * @see https://edabit.com/challenge/G9tAPeGEhR8r2DkH5
   * @param num
   * @return
   */
  public static int[] factorize(int num) {
    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        list.add(i);
      }
    }
    int[] factors = new int[list.size()];
    int i = 0;
    for (int factor : list) {
      factors[i] = factor;
      i++;
    }
    return factors;

    // Other Solution
    // return IntStream.range(1, num + 1).filter(n -> num % n == 0).toArray();
  }

  /**
   * Reverse the Number
   * 정수 n을 거꾸로된 문자열로 출력.
   * 음수는 양수 값으로 리턴, 나눗셈에 관련된 연산자를 사용해서 풀 것
   * @see https://edabit.com/challenge/tiyPFonvAJ8e6H9jS
   * @param n
   * @return
   */
  public static String rev(int n) {
    n = Math.abs(n);
    String reverseNum = "";
    int remainder;
    while (n != 0) {
      remainder = n % 10;
      n = n / 10;
      reverseNum += String.valueOf(remainder);
    }
    return reverseNum;

    // Other Solution
    // return new StringBuilder(Math.abs(n) + "").reverse().toString();
  }

  /**
   * Same Number of Unique Elements
   * 두 배열의 중복되지 않는 요소의 수가 같은가
   * 
   * @see https://edabit.com/challenge/u4YLReJ9Q3vAYJkCm
   * @param a1
   * @param a2
   * @return
   */
  public static boolean same(int[] a1, int[] a2) {
    Set<Integer> setA1 = getSetCollection(a1);
    Set<Integer> setA2 = getSetCollection(a2);
    return setA1.size() == setA2.size();
  }

  private static Set<Integer> getSetCollection(int[] arr) {
    Set<Integer> set = new HashSet<>();
    for (Integer i : arr) {
      set.add(i);
    }
    return set;

    // Other Solution
    // return Arrays.stream(a1).distinct().count() == Arrays.stream(a2).distinct().count();
  }

  /**
   * State Names and Abbreviations
   * type에 따라 arr에서 요소를 분류하여 배열로 리턴
   * type이 full이라면 주(state)의 full name 그대로를 배열로 리턴
   * type이 abb라면 주의 축약형을 배열로 리턴
   * 
   * @see https://edabit.com/challenge/3mCJ3idbMqueRTa7b
   * @param arr
   * @param type
   * @return
   */
  public static String[] filterStateNames(String[] arr, String type) {
    // 축약형의 이름은 모두 대문자로 이루어져 있음.
    List<String> fullNameList = new ArrayList<>();
    List<String> abbreviationList = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      if (arr[i].replaceAll("[A-Z]", "").length() == 0) {
        abbreviationList.add(arr[i]);
      } else {
        fullNameList.add(arr[i]);
      }
    }

    // String[] abbreviationArr = abbreviationList.toArray(new String[0]);
    // String[] fullNameArr = fullNameList.toArray(new String[0]);
    return type.equals("abb") ? abbreviationList.toArray(new String[0]) : fullNameList.toArray(new String[0]);

    // Other Solution
    /* int abbreviationLength = 0;
    int fullNameLength = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].replaceAll("[A-Z]", "").length() == 0) {
        abbreviationLength++;
      } else {
        fullNameLength++;
      }
    }
    
    String[] abbreviationArr = new String[abbreviationLength];
    String[] fullNameArr = new String[fullNameLength];
    for (int i = 0, abbreviationIndex = 0, fullNameIndex = 0; i < arr.length; i++) {
      if (arr[i].replaceAll("[A-Z]", "").length() == 0) {
        abbreviationArr[abbreviationIndex] = arr[i];
        abbreviationIndex++;
      } else {
        fullNameArr[fullNameIndex] = arr[i];
        fullNameIndex++;
      }
    }
    return type.equals("abb") ? abbreviationArr : fullNameArr; */

    // Other Solution
    /* return Arrays.stream(arr).filter(name -> "full".equals(type) ? name.length() > 2 : name.length() == 2)
        .toArray(String[]::new); */
  }

  /**
   * Perfect Number
   * num이 perfect number인가?
   * perfect number : 자기 자신을 제외한 약수들의 합이 자신이 나오는 수.
   * 1 + 2 + 3 = 6 true 리턴. 1 + 2 + 4 + 7 + 14 = 28 true 리턴.
   * @see https://edabit.com/challenge/vXYP24qRoQQijc834
   * @param num
   * @return
   */
  public static boolean checkPerfect(int num) {
    int sumFactors = 0;
    for (int i = 1; i < num; i++) {
      if (num % i == 0) {
        sumFactors += i;
      }
    }
    return sumFactors == num;
  }

  /**
   * Capital Split
   * 카멜 케이스로 된 문자열에 공백 넣고 대문자를 소문자로 바꾸기
   * @see https://edabit.com/challenge/Xbrab5yY9zaknqDjQ
   * @param txt
   * @return
   */
  public static String capSpace(String txt) {
    /* String addSpace = "";
    for (int i = 0; i < txt.length(); i++) {
      if (txt.charAt(i) < 'a') {
        addSpace += " ";
      }
      addSpace += txt.charAt(i);
    }
    return addSpace.toLowerCase(); */

    // Other Solution    
    return txt.replaceAll("[A-Z]", " $0").toLowerCase();
    // A에서 Z까지의 문자를 공백 넣고 매칭되는 문자열로 변환
    // $0 : 매칭된 전체 문자열
  }

  /**
   * Is This a Right Angled Triangle?
   * 세 변의 길이가 주어졌을 때 삼각형이 이루어지는가
   * 삼각형이 되기 위한 조건 1) 피타고라스 정리 2) 가장 긴 변 < 나머지 두 변 길이의 합
   * 본 문제에서는 피타고라스의 정리를 만족하는 문제만 나옴.
   * @see https://edabit.com/challenge/q3hu6xr7eqBB3EKaB
   * @param x
   * @param y
   * @param z
   * @return
   */
  public static boolean rightTriangle(int x, int y, int z) {
    /* int[] lengthOfSides = new int[] { x, y, z };
    Arrays.sort(lengthOfSides);
    for (int side : lengthOfSides) {
      if (side <= 0) {
        return false;
      }
    }
    return Math.pow(lengthOfSides[0], 2) + Math.pow(lengthOfSides[1], 2) == Math.pow(lengthOfSides[2], 2); */

    // Other Solution
    if (x <= 0 || y <= 0 || z <= 0) {
      return false;
    }

    int max = Math.max(Math.max(x, y), z);
    int min = Math.min(Math.min(x, y), z);
    // int median = Math.min(Math.max(x, y), (Math.max(y, z)));
    // 3 개의 작은 2개 값 중에 더 큰 값. 혹은 큰 2개의 값 중에 더 작은 값
    // 하지만 안 됨.. 만약 애초에 y가 제일 큰 수였다면? 중갑값을 y로 리턴함.
    int median = x + y + z - max - min;
    // 세 수를 더한 후 최댓값, 최솟값을 빼면 중간값 남음..

    return Math.pow(min, 2) + Math.pow(median, 2) == Math.pow(max, 2);
  }

  /**
   * Oddish vs. Evenish
   * 각 자리의 수를 더해서 짝수면 "Evenish", 홀수면 "Oddish"리턴
   * @see https://edabit.com/challenge/r2csEmtFvoa3tDWB4
   * @param num
   * @return
   */
  public static String oddishOrEvenish(int num) {
    int sumDigit = 0;
    while (num > 0) {
      sumDigit += num % 10;
      num = num / 10;
    }
    return sumDigit % 2 == 0 ? "Evenish" : "Oddish";

    // Other Solution
    /* return ("" + num).chars().map(cp -> Character.getNumericValue(cp)).sum() % 2 == 0 ? "Evenish" : "Oddish"; */
  }

  /**
   * Quadratic Equation
   * @see https://edabit.com/challenge/sBRPyEAjBfWKsnTaZ
   * @param a
   * @param b
   * @param c
   * @return
   */
  public static int quadraticEquation(int a, int b, int c) {
    // Other Solution
    int x1 = (-b + (int) Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    int x2 = (-b - (int) Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    return (x1 < 0) ? x2 : x1;
  }

  /**
   * Reverse the Case
   * 문자열의 대문자를 소문자로, 소문자를 대문자로 변환
   * @see https://edabit.com/challenge/fCkawrffCeWEH5xja
   * @param str
   * @return
   */
  public static String reverseCase(String str) {
    /*  StringBuilder reverseCaseStr = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
        reverseCaseStr.append(Character.toLowerCase(str.charAt(i)));
      } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
        reverseCaseStr.append(Character.toUpperCase(str.charAt(i)));
      } else {
        reverseCaseStr.append(str.charAt(i));
      }
    }
    return reverseCaseStr.toString(); // StringBuilder 타입을 String 타입으로. */

    // Other Solution
    char[] charArr = str.toCharArray();
    String reverseCaseStr = "";
    for (char ch : charArr) {
      if (Character.isUpperCase(ch)) {
        reverseCaseStr += Character.toLowerCase(ch);
      } else if (Character.isLowerCase(ch)) {
        reverseCaseStr += Character.toUpperCase(ch);
      } else {
        reverseCaseStr += ch;
      }
    }
    return reverseCaseStr;
  }

  /**
   * Convert to Hex
   * 
   * @see https://edabit.com/challenge/ijNrhCjfS2ZMtNkXS
   * @param str
   * @return
   */
  public static String toHex(String str) {
    StringBuilder toHexStr = new StringBuilder(Integer.toHexString((int) str.charAt(0)));
    // (int) str.chatAt() : 문자열의 문자 아스키값 출력
    // .toHexString() : 정수를 16진수 문자열로 출력
    for (int i = 1; i < str.length(); i++) {
      toHexStr.append(" " + Integer.toHexString((int) str.charAt(i)));
    }
    return toHexStr.toString();

    // Other Solution
    // return str.chars().mapToObj(Integer::toHexString).collect(Collectors.joining(" "));
  }

  /**
   * Functioninator 8000
   * 문자열 inv가 자음으로 끝나는 경우 문자열에 inator를 붙이고 모음으로 끝나는 경우 -inator를 붙임
   * 그 다음 만든 문자열에 원래 문자열의 길이 + 000의 숫자를 붙임.
   * inatorInator("EvilClone") ➞ "EvilClone-inator 9000"
   * @see https://edabit.com/challenge/ynzo3DeHCmAXLtpwe
   * @param inv
   * @return
   */
  public static String inatorInator(String inv) {
    /* String inatorStr = "";
    if (String.valueOf(inv.charAt(inv.length() - 1)).matches("[aeiouAEIOU]")) {
      inatorStr = inv + "-inator";
    } else { // String.valueOf(inv.charAt(inv.length() - 1)).matches("[^aeiouAEIOU]")
      inatorStr = inv + "inator";
    }
    return inatorStr + " " + inv.length() + "000"; */

    // Other Solution    
    int length = inv.length();
    if ("aeiouAEIOU".contains(inv.substring(length - 1))) {
      // 마지막 문자가 aeiouAEIOU를 포함하느냐는 표현 대신에 aeiouAEIOU가 마지막 문자를 표함하느냐라고 표현
      inv += "-";
    }
    return inv + "inator " + length + "000";
  }

  /**
   * Pandigital Numbers
   * Pandigital Number : 한 번이라도 0에서 9까지의 숫자를 포함하는 숫자
   * num이 Pandigital Number인가?
   * @see https://edabit.com/challenge/WHuKTT4wm6vnr8o3n
   * @param num
   * @return
   */
  public static boolean isPandigital(long num) {
    String numStr = String.valueOf(num);
    Set<Character> set = new HashSet<>();
    for (int i = 0; i < numStr.length(); i++) {
      set.add(numStr.charAt(i));
    }
    return set.size() == 10;

    // Other Solution
    /* HashSet set = new HashSet();
    for (char c : Long.toString(num).toCharArray()) {
      set.add(c);
    }
    return set.size() == 10; */
  }

  /**
   * Odds vs. Evens
   * 주어진 숫자에서 각 자리가 홀수인 것과 짝수인 수를 각각 더하여 더 큰 값을 문자열("even", "odd")로 리턴
   * 같으면 "eqaul" 리턴
   * @see https://edabit.com/challenge/nC9oD566JRp9cnth9
   * @param num
   * @return
   */
  public static String oddsVsEvens(int num) {
    int evenSum = 0;
    int oddSum = 0;
    while (num != 0) {
      if ((num % 10) % 2 == 0) {
        evenSum += num % 10;
        num = num / 10;
      } else {
        oddSum += num % 10;
        num = num / 10;
      }
    }
    return evenSum > oddSum ? "even" : evenSum == oddSum ? "equal" : "odd";

    // Other Solution
    /* String numStr = String.valueOf(num);
    int evenSum = 0;
    int oddSum = 0;
    for (int i = 0; i < numStr.length(); i++) {
      if (Integer.parseInt(String.valueOf(numStr.charAt(i))) % 2 == 0) {
        evenSum += Integer.parseInt(String.valueOf(numStr.charAt(i)));
      } else {
        oddSum += Integer.parseInt(String.valueOf(numStr.charAt(i)));
      }
    }
    // return evenSum > oddSum ? "even" : evenSum == oddSum ? "equal" : "odd";
    if (evenSum > oddSum) {
      return "even";
    } else if (oddSum > evenSum) {
      return "odd";
    } else {
      return "equal";
    } */
  }

  /**
   * Sum of Digits Between Two Numbers
   * 두 숫자 사이의 모든 수의 각 자리 수의 합 리턴
   * a = 19, b = 22라면 (1 + 9) + (2 + 0) + (2 + 1) + (2 + 2) = 19
   * @see https://edabit.com/challenge/Sj3pLPPLpnF8DNGQD
   * @param a
   * @param b
   * @return
   */
  public static int sumDigits(int a, int b) {
    // 
    /* int[] rangeNum = new int[Math.abs(b - a) + 1];
    for (int i = 0, value = Math.min(a, b); i < rangeNum.length; i++, value++) {
      rangeNum[i] = value;
    }
    int sumDigit = 0;
    for (int i = 0; i < rangeNum.length; i++) {
      while (rangeNum[i] != 0) {
        sumDigit += rangeNum[i] % 10;
        rangeNum[i] = rangeNum[i] / 10;
      }
    }
    return sumDigit; */

    // Other Solution
    int sumDigit = 0;
    int minNum = Math.min(a, b);
    int maxNum = Math.max(a, b);
    while (minNum <= maxNum) {
      int num = minNum;
      while (num != 0) {
        sumDigit += num % 10;
        num = num / 10;
      }
      minNum++;
    }
    return sumDigit;

    // Other Solution
    // 추가한 테스트 케이스 6번, 7번 (a가 b보다 더 큰 경우)에는 안 맞는 답.
    // return IntStream.rangeClosed(a, b).map(n -> sumNumDigits(n)).sum();
  }

  /* private static int sumNumDigits(int n) {
    return ("" + (int) Math.abs(n)).chars().map(cp -> Character.getNumericValue(cp)).sum();
  } */

  /**
   * GCD and LCM (Part 2)
   * 최소 공배수 리턴. 더 쉽게 풀기 위해 GCD를 이용할 수도 있음.
   * @see https://edabit.com/challenge/5oJXKYGnG5hqbaaxK
   * @param a
   * @param b
   * @return
   */
  public static int lcm(int a, int b) {
    // 최소공배수 : 더 큰 수의 배수 중에 수와 더 작은 수의 배수 중에 수가 처음으로 일치하는 수
    /* int biggerNum = Math.max(a, b);
    int smallerNum = Math.min(a, b);
    int biggerNumMultiple;
    int smallerNumMultiple;
    int i = 1;
    while (true) {
      biggerNumMultiple = biggerNum * i;
      for (int j = 1; j <= biggerNum; j++) {
        // 최소공배수는 두 수의 곱보다 커질 수 없으므로 j의 범위를 더 큰 수까지만으로 한정
        smallerNumMultiple = smallerNum * j;
        if (biggerNumMultiple == smallerNumMultiple) {
          return smallerNumMultiple;
        }
      }
      i++;
    } */

    // Other Solution
    /* for (int i = a;; i += a) { // i는 a의 배수. for문에서 범위 한정 없어도 됨.
      if (i % b == 0) // a의 배수(i)가 b로 나뉜다는 것은 a의 배수와 b의 1배수가 같다는 뜻. 즉 최소공배수
        return i;
    } */

    // Other Solution
    return (a * b) / gcd(a, b);
  }

  /**
   * Return the Sum of the Two Smallest Numbers
   * 배열에서 양수의 값들 중 가장 작은 2개 값의 합 리턴
   * @see https://edabit.com/challenge/u7prkNxFxqartAfiG
   * @param arr
   * @return
   */
  public static int sumTwoSmallestNums(int[] arr) {
    /* Arrays.sort(arr);
    List<Integer> positiveNums = new ArrayList<>();
    for (Integer num : arr) {
      if (num > 0) {
        positiveNums.add(num);
      }
    }
    return positiveNums.get(0) + positiveNums.get(1); */

    // Other Solution
    Arrays.sort(arr);
    int sum = 0;
    for (int i = 0, plusTimes = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        sum += arr[i];
        plusTimes++;
      }
      if (plusTimes == 2) {
        break;
      }
    }
    return sum;

    // Other Solution
    /* int[] posNums = Arrays.stream(arr).filter(n -> n > 0).sorted().toArray();
    return (posNums.length >= 2) ? posNums[0] + posNums[1] : 0; */
  }

  /**
   * Compounding Letters
   * 첫 번째 문자는 한 번 반복, 두 번째 문자는 두 번 반복.."-"로 연결. 첫 문자는 대문자
   * "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
   * @see https://edabit.com/challenge/tgjFboGwDEHY4Wn5S   
   * @param str
   * @return
   */
  public static String accum(String str) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      for (int j = 0; j <= i; j++) {
        if (j == 0) {
          sb.append(Character.toUpperCase(str.charAt(i)));
        } else {
          sb.append(Character.toLowerCase(str.charAt(i)));
        }
      }
      if (i != str.length() - 1) {
        sb.append("-");
      }
    }
    return sb.toString();

    // Other Solution
    /* String result = str.substring(0, 1).toUpperCase();    
    for (int i = 1; i < str.length(); i++) {
      String process = str.substring(i, i + 1).toLowerCase();
      result += "-" + process.toUpperCase() + new String(new char[i]).replace("\0", process);
    }
    return result; */
  }

  /**
   * Convert String to camelCase
   * 문자열을 카멜 케이스로 변환
   * "the-stealth-warrior" ➞ "theStealthWarrior"
   * "The_Stealth_Warrior" ➞ "TheStealthWarrior"
   * @see https://edabit.com/challenge/sF6Lm5LQsy6u2ZKeZ
   * @param str
   * @return
   */
  public static String toCamelCase(String str) {
    /* StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      if (String.valueOf(str.charAt(i)).equals("-") || String.valueOf(str.charAt(i)).equals("_")) {
        str = str.replace(str.charAt(i + 1), Character.toUpperCase(str.charAt(i + 1)));
      }
      sb.append(str.charAt(i));
    }
    return sb.toString().replaceAll("[-_]", ""); */

    // Other Solution
    String[] words = str.split("[-_]");
    StringBuilder sb = new StringBuilder(words[0]);
    for (int i = 1; i < words.length; i++) {
      sb.append(Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1));
    }
    return sb.toString();

    // Other Solution
    /* String[] strs = str.split("[_-]");
    String camelized = IntStream.range(1, strs.length)
    .mapToObj(i -> Character.toUpperCase(strs[i].charAt(0)) + strs[i].substring(1)).collect(Collectors.joining());
    return strs[0] + camelized; */
  }

  /**
   * Find the Largest Numbers in a Group of Arrays
   * 각 일차원 배열에서 가장 큰 값 하나씩을 뽑아 배열로 리턴
   * @see https://edabit.com/challenge/QLz5aGfChHhndKWMv
   * @param arr
   * @return
   */
  public static double[] findLargestNums(double[][] arr) {
    /* double[] largestNums = new double[arr.length];
    // arr.length : 이차원 배열의 길이(일차원 배열의 개수)
    for (int i = 0; i < arr.length; i++) {
      double largestNum = Double.NEGATIVE_INFINITY;
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] >= largestNum) {
          largestNum = arr[i][j];
        }
      }
      largestNums[i] = largestNum;
    }
    return largestNums; */

    // Other Solution
    // return Arrays.stream(arr).mapToDouble(sa -> Arrays.stream(sa).max().orElse(0)).toArray();

    // Other Solution
    double[] largestNums = new double[arr.length];
    for (int i = 0; i < arr.length; i++) {
      Arrays.sort(arr[i]);
      largestNums[i] = arr[i][arr[i].length - 1];
    }
    return largestNums;
  }

  /**
   * Same Parity?
   * Same Parity : num의 각 자리 합과 num 자신이 둘 다 짝수 혹은 둘 다 홀수인 수
   * @see https://edabit.com/challenge/auwAWq4MXmXFwWrHf
   * @param copyNum
   * @return
   */
  public static boolean parityAnalysis(int num) {
    /* int sumDigit = 0;
    int copyNum = num;
    // 조작되는 값을 담을 변수 선언. 그냥 num으로 조작하면 리턴 조건문에서 num은 원래의 num이 아님..
    while (copyNum != 0) {
      sumDigit += copyNum % 10;
      copyNum = copyNum / 10;
    }
    return (sumDigit % 2 == 0 && num % 2 == 0) || (sumDigit % 2 != 0 && num % 2 != 0); */

    // Other Soluion
    return (num % 2) == String.valueOf(num).chars().sum() % 2;
    // 2로 나누었을 때 나머지가 같으면(0이면 둘 다 짝수, 1이면 둘 다 홀수) same parity.
  }

  /**
   * Solve a Linear Equation
   * 일차방정식에서 x 값 구하기.
   * @see https://edabit.com/challenge/4DKpZPfSgyEx dwirC
   * @param equation
   * @return
   */
  public static int solveEquation(String equation) {
    // ax + b = c 에서 x = c + b*(-1);
    equation = equation.replaceAll("[ ]", "");
    String[] values = equation.split("[x\\+\\=]");
    return Integer.parseInt(values[values.length - 1]) + Integer.parseInt(values[values.length - 2]) * -1;

    // Other Solution
    /* String[] arr = equation.split(" ");
    String sign = arr[1];
    if (sign.equals("+")) {
      return Integer.parseInt(arr[4]) - Integer.parseInt(arr[2]);
    } else {
      return Integer.parseInt(arr[4]) + Integer.parseInt(arr[2]);
    } */
  }

  /**
   * Sum of Missing Numbers
   * 배열에서 중간에 없어진 수들의 합 구하기. 배열의 가장 큰 값과 작은 값은 배열 안에 있음.
   * @see https://edabit.com/challenge/NYq5PTgKa6C97qdLw
   * @param arr
   * @return
   */
  public static int sumMissing(int[] arr) {
    /* Arrays.sort(arr);
    int sumConsecutiveNum = 0;
    for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {
      sumConsecutiveNum += i;
    }
    return sumConsecutiveNum - Arrays.stream(arr).sum(); */

    // Other Solution
    Arrays.sort(arr);
    int sumConsecutiveNum = IntStream.range(arr[0], arr[arr.length - 1] + 1).sum();
    return sumConsecutiveNum - Arrays.stream(arr).sum();
  }

  /**
   * Word Nests
   * word는 nest에 몇 겹으로 쌓여있냐.
   * "code", "cocodccococodededeodeede") ➞ 5
   * "code", "co cod c co co code de de ode e de") ➞ 5. 중간에 code 외에 다른 문자들로 5겹으로 쌓임.
   * @see https://edabit.com/challenge/nXkhpafB9e5c7fNcg
   * @param word
   * @param nest
   * @return
   */
  public static int wordNest(String word, String nest) {
    // 한 번 쌓임 : nest 길이는 word 길이의 2배
    // 두 번 쌓임 : nest 길이는 word 길이의 3배
    // 쌓인 횟수 : (nest 길이 / word 길이) - 1
    // return (nest.length() / word.length()) - 1;

    // Other Solution
    nest = nest.replaceAll(word, "");
    return nest.length() / word.length();
  }

  /**
   * Capitalize the Last Letter
   * 각 단어에서 마지막 문자만 대문자로. 나머지 문자는 그대로.
   * "My Name Is Edabit" ➞ "MY NamE IS EdabiT"
   * @see https://edabit.com/challenge/CYm9fzo63bQNbWfnN
   * @param str
   * @return
   */
  public static String capLast(String str) {
    /* String[] words = str.split(" ");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
      for (int j = 0; j < words[i].length() - 1; j++) { // 각 단어에서 마지막 문자 빼고 sb에 넣음
        sb.append(words[i].charAt(j));
      }
    
      sb.append(Character.toUpperCase(words[i].charAt(words[i].length() - 1)));
      // 각 단어의 마지막 문자를 대문자로 변환 후 넣음
      if (i != words.length - 1) {
        // 마지막 단어 전까지만 공백 넣음. 조건문 없으면 결과물 + " " 형태로 출력됨.
        sb.append(" ");
      }
    }
    return sb.toString(); */

    // Other Solution
    String[] words = str.split(" ");
    StringBuilder sb = new StringBuilder();
    for (String string : words) {
      sb.append(string.substring(0, string.length() - 1)).append(string.toUpperCase().charAt(string.length() - 1))
          .append(" ");
    }
    return sb.toString().trim();
  }

  /**
   * First N Vowels
   * 문자열에서 모음 처음 n개까지 리턴. 문자열의 모음 개수보다 n이 크면 "invalid" 리턴.
   * @see https://edabit.com/challenge/ev5oH5FSzb9oF6skT
   * @param str
   * @param n
   * @return
   */
  public static String firstNVowels(String str, int n) {
    str = str.replaceAll("[^aeiou]", "");
    return str.length() < n ? "invalid" : str.substring(0, n);
  }

  /**
   * Longest Sequence of Consecutive Zeroes
   * 0과 1로 이루어진 문자열에서 0이 가장 길게 연속되는 부분을 문자열로 리턴
   * @see https://edabit.com/challenge/Stu2gesXeETdxxGBY
   * @param str
   * @return
   */
  public static String longestZero(String str) {
    String[] zeroStr = str.split("[^0]");
    String longestZero = "";
    for (String string : zeroStr) {
      if (string.length() >= longestZero.length()) {
        longestZero = string;
      }
    }
    return longestZero;
  }

  /**
   * Broken Keyboard
   * str1을 입력하려고 했는데 str2이 입력됨. 원래 입력하려던 문자를 배열로 리턴
   * findBrokenKeys("starry night", "starrq light") ➞ ["y", "n"]
   * 배열은 출현순, 잘못된 문자 하나만 입력, 소문자로
   * @see https://edabit.com/challenge/6THnWXvQrhRrEErtb
   * @param str1
   * @param str2
   * @return
   */
  public static String[] findBrokenKeys(String str1, String str2) {
    Set<String> brokenKeySet = new LinkedHashSet<>();
    for (int i = 0; i < str1.length(); i++) {
      if (str1.charAt(i) != str2.charAt(i)) {
        brokenKeySet.add(String.valueOf(str1.charAt(i)));
      }
    }
    return brokenKeySet.toArray(new String[brokenKeySet.size()]);

    // Other Solution
    /* return IntStream.range(0, str1.length()).filter(i -> str1.charAt(i) != str2.charAt(i))
        .mapToObj(i -> "" + str1.charAt(i)).distinct().toArray(String[]::new); */
  }

  /**
   * Birthday Cake
   * 나이와 이름에 맞춰 케이크 모양 문자열 배열 리턴
   * {age} Happy Birthday {name}! {age}
   * 나이에 따라 # 또는 *로 입력. # : 짝수. * : 홀수.
   * "##############################",
   * "# 10 Happy Birthday Jack! 10 #",
   * "##############################"   * 
   * @see https://edabit.com/challenge/diiEDD4JQyysFR7zh
   * @param name
   * @param age
   * @return
   */
  // "# 10 Happy Birthday Jack! 10 #"
  public static String[] getBirthdayCake(String name, int age) {
    String specialCh = age % 2 == 0 ? "#" : "*";
    String middleStr = specialCh + " " + age + " Happy Birthday " + name + "! " + age + " " + specialCh;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < middleStr.length(); i++) {
      sb.append(specialCh);
    }
    return new String[] { sb.toString(), middleStr, sb.toString() };

    // Other Solution
    /* String specialCh = age % 2 == 0 ? "#" : "*";
    String format = String.format("%s %d Happy Birthday %s! %d %s", specialCh, age, name, age, specialCh);
    String header = IntStream.range(0, format.length()).mapToObj(i -> specialCh).collect(Collectors.joining());
    return new String[] { header, format, header }; */
  }

  /**
   * Next Prime
   * num 다음에 오는 소수 리턴, num이 소수라면 num리턴
   * @see https://edabit.com/challenge/vYQogxrcQBEMr7y3F
   * @param num
   * @return
   */
  public static int nextPrime(int num) {
    // num이 소수인지 검사 :
    // 소수가 아니면 num + 1 해서 검사
    // 조건문을 통과하면 num은 소수
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return nextPrime(num + 1);
      }
    }
    return num;
  }

  /**
   * Smallest N Digit Number
   * value의 배수 중에 digits 자리수를 갖는 가장 작은 배수
   * smallest(5, 12) ➞ 10008
   * @see https://edabit.com/challenge/a5onNYqzuKiGjWMQu
   * @param digits
   * @param value
   * @return
   */
  public static int smallest(int digits, int value) {
    int i = 1;
    while (true) {
      int multiple = value * i;
      if (multiple >= Math.pow(10, digits - 1)) {
        return multiple;
      }
      i++;
    }

    // Other Solution    
    // return (int) Math.ceil(Math.pow(10, digits - 1) / value) * value;
  }

  /**
   * Palindromic Dates
   * Palindromic Dates : 아래의 두 조건을 모두 만족하는 날짜
   * 1) dd/mm/yyyy 와 mm/dd/yyyy 이 같은 날짜. dd와 mm이 같은 날짜.
   * 2) 일월과 년도가 거울을 보듯 대칭이 되는 날짜. 
   * ex) 02/02/2020, 12/02/2021, 12/12/2121 등
   * @see https://edabit.com/challenge/EatQ3W5eg39FmvGAf
   * @param date
   * @return
   */
  public static boolean palindromicDate(String date) {
    String[] dateArr = date.split("\\/");
    if (!dateArr[0].equals((dateArr[1]))) { // 내용을 비교하기 위해 equals() 메소드를 사용해야 함.
      return false;
    }
    StringBuilder sb = new StringBuilder(dateArr[0] + dateArr[1]);
    if (!sb.reverse().toString().equals(dateArr[2])) {
      return false;
    }
    return true;
  }

  /**
   * Reversing a Binary String
   * 10진수를 2진수로 바꾼 후 그 2진수의 역순을 10진수로 출력
   * reversedBinaryInteger(10) ➞ 5 // 10 = 1010 -> 0101 = 5
   * @see https://edabit.com/challenge/yPQ26h7KYpqsftRPY
   * @param n
   * @return
   */
  public static int reversedBinaryInteger(int n) {
    /* String binaryStr = Integer.toBinaryString(n); // 문자열을 2진수로 변환
    StringBuilder sb = new StringBuilder(binaryStr).reverse();
    return Integer.valueOf(sb.toString(), 2); // 2진수인 문자열을 10진수로 변환. 리턴 타입 Integer */

    // Other Solutioin
    return Integer.parseInt(new StringBuilder(Integer.toBinaryString(n)).reverse().toString(), 2);
    // 리턴 타입 int
  }

  /**
   * Substituting the The
   * 문장에서 the를 a/an으로 바꾸기. 다음 단어가 모음으로 시작하면 an으로 바꾸기.
   * @see https://edabit.com/challenge/2rJAhXLRaRB3gjwaC
   * @param str
   * @return
   */
  public static String replaceThe(String str) {
    String[] words = str.split(" ");
    for (int i = 0; i < words.length; i++) {
      if (words[i].equals("the") && isVowel(words[i + 1].charAt(0))) {
        words[i] = "an";
      } else if (words[i].equals("the") && !isVowel(words[i + 1].charAt(0))) {
        words[i] = "a";
      }
    }
    return String.join(" ", words);
  }

  private static boolean isVowel(char ch) {
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Smooth Sentences
   * Smooth Sentences : 문장에서 단어의 마지막 문자와 다음 단어의 첫 문자가 같은 문장.
   * @see https://edabit.com/challenge/FtoNXq7DTCAiZ3z9T
   * @param sentence
   * @return
   */
  public static boolean isSmooth(String sentence) {
    sentence = sentence.toLowerCase();
    String[] words = sentence.split(" ");
    for (int i = 0; i < words.length - 1; i++) {
      if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) {
        return false;
      }
    }
    return true;
  }

  /**
   * Narcissistic Numbers
   * 153 ➞ 3 digits ➞ 1³ + 5³ + 3³ = 1 + 125 + 27 = 153 ➞ Narcissistic
   * 84 ➞ 2 digits ➞ 8² + 4² = 64 + 16 = 80 ➞ Not narcissistic
   * @see https://edabit.com/challenge/qPtcAMm4RhBmGG7XE
   * @param num
   * @return
   */
  public static boolean isNarcissistic(int num) {
    int sumDigit = 0;
    int copyNum = num;
    while (copyNum != 0) {
      sumDigit += Math.pow(copyNum % 10, String.valueOf(num).length());
      copyNum = copyNum / 10;
    }
    return num == sumDigit;
  }

  /**
   * Perfect or Amicable?
   * perfect number (완전수) : 자기 자신을 제외한 양의 약수를 더했을 때 자기 자신이 되는 양의 정수를 말한다.
   * amicable number (친화수) : 두 수의 쌍에서 어느 한 수의 진약수를 모두 더하면 다른 수가 되는 수를 말한다.
   * ex) 220과 284. 220의 진약수는 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110로 모두 더하면 284가 된다. 반대로  284의 모든 진약수 1, 2, 4, 71, 142를 모두 더하면 220이 된다.
   * 주어진 num이 perfect number면 "Perfect", amicable number면 "Amicable", 둘 다 아니면 "Neither" 리턴
   * @see https://edabit.com/challenge/qY9s6qK4WpbPBxQES
   * @param num
   * @return
   */
  public static String numType(int num) {
    int sumFactors = 0;
    for (int i = 1; i < num; i++) {
      if (num % i == 0) {
        sumFactors += i;
      }
    }
    if (sumFactors == num) {
      return "Perfect";
    }
    // 이 sumFactors(num 약수들의 합)가 다른 수(쌍을 이루는 친화수 중 하나)의 약수의 합이고 다른 수의 약수의 합이 num이면 Amicable
    int otherAmicableNum = sumFactors; // 다른 수는 num 약수들의 합이면서
    int otherSumFactors = 0;
    for (int i = 1; i < otherAmicableNum; i++) {
      if (otherAmicableNum % i == 0) {
        otherSumFactors += i;
      }
    }
    if (otherSumFactors == num) { // 그 다른 수 약수들의 합이 num이면 
      return "Amicable";
    }
    return "Neither";
  }

  /**
   * Moran Numbers
   * Harshad Number : 각 자리 값의 합으로 나누어지는 수 ex) 132 -> 132 / (1 + 3 + 2) 
   * Moran Number : 각 자리 값의 합으로 나누었을 때 몫으로 소수를 내놓는 수 
   * ex) 133 -> 133 / (1 + 3 + 3) = 19. 19는 소수.
   * 주어진 수에 따라 "M","H", 둘 다 아니면 "Neither" 리턴. Moran number는 Harshad number의 부분집합으로 Moran number 먼저 테스트 후 리턴. 그 다음 Harshad number(non-Moran) 리턴
   * @see https://edabit.com/challenge/iLwdf4yJjrSv9Pg25
   * @param n
   * @return
   */
  private static boolean isPrime(int num) {
    if (num < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static String moran(int n) {
    int sumDigits = 0;
    int copyNum = n;
    while (copyNum != 0) {
      sumDigits += copyNum % 10;
      copyNum = copyNum / 10;
    }
    int yield = n / sumDigits; // 몫
    if (isPrime(yield)) {
      return "M";
    }
    if (n % sumDigits == 0) {
      return "H";
    }
    return "Neither";
  }

  /**
   * Check if a String is a Mathematical Expression
   * 문자열이 수학식의 형태가 맞는지 확인. 수학 기호는 +, -, *, /, %. 두 개의 수는 0 ~ 9.
   * @see https://edabit.com/challenge/FTWQaZdMqYph5umsu
   * @param expr
   * @return
   */
  public static boolean mathExpr(String expr) {
    // return expr.replaceAll("\\s", "").matches("[0-9][\\+\\-*/%][0-9]");
    // 문자열에서 공백 제거 후 정규표현식과 비교
    // "[0-9][+-*/%][0-9]"는 틀림.
    // Other Solution
    return expr.matches("\\d+\\s?[\\+\\*/%-]\\s?\\d+");
  }

  /**
   * C*ns*r*d Str*ngs
   * str은 원래의 문자열에서 모음이 *로 가려진 상태, vowels는 가려진 모음들. 원래 문자열로 돌리기
   * "Wh*r* d*d my v*w*ls g*?", "eeioeo" ➞ "Where did my vowels go?"
   * @see https://edabit.com/challenge/jt6TWkTcYdWcRXbds
   * @param str
   * @param vowels
   * @return
   */
  public static String uncensor(String str, String vowels) {
    /* StringBuilder sb = new StringBuilder();
    for (int i = 0, j = 0; i < str.length(); i++) {
      if (str.charAt(i) != '*') {
        sb.append(str.charAt(i));
      } else {
        sb.append(vowels.charAt(j));
        j++;
      }
    }
    return sb.toString(); */

    // Other Solution
    for (String vowel : vowels.split("")) {
      str = str.replaceFirst("[*]", vowel);
      // str에서 정규식에 해당하는 첫 번째 문자를 vowel로 바꾸고 다시 str에 저장함.
      // vowel이 하나씩 나올 때마다 저장된 str을 다시 변환 후 저장. 반복.
    }
    return str;
  }

  /**
   * Pentagonal Number
   * step = 1일 때 dot = 1, step = 2일 때, 점 하나를 중심으로 오각형 모양의 점 찍힘, 그 다음 스텝에서도 오각형 모양으로 점이 찍히고 모서리 점들 사이에도 점들이 찍힘. 웹 페이지에서 그림 직접 확인.
   * num 단계에서의 점 개수 리턴
   * @see https://edabit.com/challenge/H6eTNH6NW36MHqkjb
   * @param num
   * @return
   */
  public static int pentagonal(int num) {
    // step = 1, dot = 1
    // ste= = 2, dot = 6 (1 + 5)  F(1) + step * 5 - 5
    // step = 3, dot = 16 (6 + 10)
    // step = 4, dot = 31 (16 + 15) F(num - 1) + num * 5 - 5 // F(num - 1) + 5 * (num - 1)
    int dot = 1;
    int step = 1;
    while (num != step) {
      step++;
      dot += step * 5 - 5;
    }
    return dot;

    // Other Solution
    // return (num == 1) ? 1 : 5 * (num - 1) + pentagonal(num - 1);
  }

  /**
   * Kaprekar Numbers
   * Kaprekar Numbers : 주어진 수 n을 제곱해서 제곱수의 자리수에 따라 left, right로 쪼갬. 그 그 쪼갠 두 수를 더했을 때 다시 n이 나오는 수.
   * 제곱수가 한 자리 숫자라면 left : 0 right : 제곱수.
   * 제곱수의 자리수가 홀수라면 left가 right보다 한 자리 작은 수로.
   * isKaprekar(297) ➞ true  // n² = "88209" // Left + Right = 88 + 209 = 297 ➞ 297 == 297
   * @see https://edabit.com/challenge/M9eXE68jj9pxvmiuj
   * @param n
   * @return
   */
  public static boolean isKaprekar(int n) {
    long squareNum = (long) Math.pow(n, 2);
    String squareNumStr = String.valueOf(squareNum);
    String leftNum = squareNumStr.length() == 1 ? "0" : squareNumStr.substring(0, squareNumStr.length() / 2);
    String rightNum = squareNumStr.length() == 1 ? squareNumStr : squareNumStr.substring(squareNumStr.length() / 2);
    return Integer.parseInt(leftNum) + Integer.parseInt(rightNum) == n;
  }

  /**
   * One Plus One
   * 문자열로 된 수식 풀기. 문자열로 리턴. 기호는 +, -만, 수는 0, 1, 2만.
   * wordedMath("zero Plus one") ➞ "One"
   * @see https://edabit.com/challenge/yLjnDk7bJ3GYeSX9f
   * @param expr
   * @return
   */
  public static String wordedMath(String expr) {
    /* expr = expr.toLowerCase();
    String[] words = expr.split(" ");
    int firstNum;
    int secondNum;
    if (words[0].equals("zero")) {
      firstNum = 0;
    } else if (words[0].equals("one")) {
      firstNum = 1;
    } else {
      firstNum = 2;
    }
    
    if (words[2].equals("zero")) {
      secondNum = 0;
    } else if (words[2].equals("one")) {
      secondNum = 1;
    } else {
      secondNum = 2;
    }
    
    int result;
    if (words[1].equals("plus")) {
      result = firstNum + secondNum;
    } else {
      result = firstNum - secondNum;
    }
    
    if (result == 0) {
      return "Zero";
    } else if (result == 1) {
      return "One";
    } else {
      return "Two";
    } */

    // Other Solution
    /* expr = expr.toLowerCase();
    expr = expr.replace("one", "1");
    expr = expr.replace("zero", "0");
    expr = expr.replace("two", "2");
    String[] parts = expr.split("plus|minus");
    int n1 = Integer.parseInt(parts[0].trim());
    int n2 = Integer.parseInt(parts[1].trim());
    
    int res = expr.contains("plus") ? n1 + n2 : n1 - n2;
    
    switch (res) {
      case 1:
        return "One";
      case 2:
        return "Two";
      default:
        return "Zero";
    } */

    // Other Solution
    /* String[] words = expr.toLowerCase().split(" ");
    int n1 = words[0].equals("zero") ? 0 : words[0].equals("one") ? 1 : 2;
    int n2 = words[2].equals("zero") ? 0 : words[2].equals("one") ? 1 : 2;
    int res = words[1].equals("plus") ? n1 + n2 : n1 - n2;
    return res == 0 ? "Zero" : res == 1 ? "One" : "Two"; */

    // Other Solution
    /* expr = expr.toLowerCase();
    String[] words = expr.split(" ");
    Map<String, Integer> strToInt = new HashMap<>(); // 문자열로 숫자를 가져오기 위한 map
    strToInt.put("zero", 0);
    strToInt.put("one", 1);
    strToInt.put("two", 2);
    
    Map<Integer, String> intToStr = new HashMap<>(); // 숫자로 문자열을 가져오기 위한 map
    intToStr.put(0, "Zero");
    intToStr.put(1, "One");
    intToStr.put(2, "Two");
    intToStr.put(3, "Three");
    intToStr.put(4, "Four");
    
    if (words[1].equalsIgnoreCase("minus")) {
      int result = strToInt.get(words[0]) - strToInt.get(words[2]);
      // key를 넣고 value를 가져옴.
      return intToStr.get(result);
    } else {
      int result = strToInt.get(words[0]) + strToInt.get(words[2]);
      return intToStr.get(result);
    } */

    // Other Solution
    String[] words = expr.toLowerCase().split("\\s");
    String[] result = { "Zero", "One", "Two" };
    Map<String, Integer> map = new HashMap<>();
    map.put("zero", 0);
    map.put("one", 1);
    map.put("two", 2);
    if (words[1].equals("plus")) {
      return result[map.get(words[0]) + map.get(words[2])];
    } else {
      return result[map.get(words[0]) - map.get(words[2])];
    }
  }

  /**
   * Reverse Coding Challenge #2
   * // 3 ➞ 21 // 9 ➞ 2221 // 17 ➞ 22221 // 24 ➞ 22228
   * 위의 결과를 보고 num을 넣었을 때 결과값 리턴
   * @see https://edabit.com/challenge/crZ8ADEeMticeNjBo
   * @param num
   * @return
   */
  public static int mysteryFunc2(int num) {
    // num ➞ 2^n + 나머지 값. 2^n은 num보다 클 수 없음. 나머지 값은 num - 2^n.
    // 2^n ➞ 2를 n번 나열.
    int squareOfTwo = 1;
    int i = 0;
    while (squareOfTwo <= num) {
      squareOfTwo = (int) Math.pow(2, i);
      if (squareOfTwo >= num) {
        squareOfTwo = squareOfTwo / 2;
        break;
      }
      i++;
    }
    StringBuilder sb = new StringBuilder();
    for (int j = squareOfTwo; j > 1; j = j / 2) {
      sb.append("2");
    }
    sb.append(String.valueOf(num - squareOfTwo));
    return Integer.parseInt(sb.toString());
  }

  /**
   * Converting One Binary String to Another
   * s1에서 s2가 되기 위해 0과 1의 스왑(자리를 바꿈)해야 하는 횟수 출력.
   * minSwaps("110011", "010111") ➞ 1
   * // s1에서 s2가 되기 위해 0번 인덱스와 3번 인덱스를 스왑 해주면 됨.(스왑 횟수 : 1)
   * 두 문자열의 길이는 같음. 0과 1의 개수는 변하지 않음. 스왑하려는 0과 1은 인접하지 않아도 됨.
   * @see https://edabit.com/challenge/bzgkfePPbHyAyTdN3
   * @param s1
   * @param s2
   * @return
   */
  public static int minSwaps(String s1, String s2) {
    // 문자가 2개 다를 때마다 스왑 한 번 일어남.
    int count = 0;
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) != s2.charAt(i)) {
        count++;
      }
    }
    return count / 2;
  }

  /**
   * Double Character Swap
   * @see https://edabit.com/challenge/n2haqkZN529Rr67vg
   * 문자열 str에서 문자 c1과 c2를 서로 바꾼 문자열 출력
   * doubleSwap("random w#rds writt&n h&r&", '#', '&') ➞ "random w&rds writt#n h#r#"
   * @param str
   * @param c1
   * @param c2
   * @return
   */
  public static String doubleSwap(String str, char c1, char c2) {
    /* List<Integer> c1IndexList = new ArrayList<>();
    List<Integer> c2IndexList = new ArrayList<>();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == c1) {
        c1IndexList.add(i);
      } else if (str.charAt(i) == c2) {
        c2IndexList.add(i);
      }
    }
    char[] charArr = str.toCharArray();
    for (Integer index : c1IndexList) {
      charArr[index] = c2;
    }
    for (Integer index : c2IndexList) {
      charArr[index] = c1;
    }
    return String.valueOf(charArr); */

    // Other Solution
    char[] charArr = str.toCharArray();
    for (int i = 0; i < charArr.length; i++) {
      if (charArr[i] == c1) {
        charArr[i] = c2;
      } else if (charArr[i] == c2) {
        charArr[i] = c1;
      }
    }
    return String.valueOf(charArr);
  }

  /**
   * Return the Sum of Two Numbers (on the Moon)
   * number1과 number2의 각 자리에서 더 큰 수롤 뽑아 정수로 리턴. 자릿수가 달라 비어있는 자리는 0으로 간주
   * 1  3  4  +    5  4  = 1  5  4   //  1 > 0 | 5 > 3 | 4 == 4
   * @see https://edabit.com/challenge/zSjd2EbBzBCuMjgrr
   * @param number1
   * @param number2
   * @return
   */
  public static int lunarSum(int number1, int number2) {
    /* int maxNum = Math.max(number1, number2);
    int minNum = Math.min(number1, number2);
    int maxNumDigit;
    int minNumDigit;
    StringBuilder sb = new StringBuilder();
    while (maxNum != 0) {
      maxNumDigit = maxNum % 10;
      maxNum = maxNum / 10;
      minNumDigit = minNum % 10;
      minNum = minNum / 10;
      sb.append(String.valueOf(Math.max(maxNumDigit, minNumDigit)));
    }
    return Integer.parseInt(sb.reverse().toString()); */

    // Other Solution
    /* int maxLength = Math.max(String.valueOf(number1).length(), String.valueOf(number2).length());
    String num1Str = String.format("%0" + maxLength + "d", number1);
    String num2Str = String.format("%0" + maxLength + "d", number2);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < maxLength; i++) {
      if (num1Str.charAt(i) >= num2Str.charAt(i)) { // 정수의 값이 더 크면 아스키 값도 더 큼
        sb.append(num1Str.charAt(i));
      } else {
        sb.append(num2Str.charAt(i));
      }
    }
    return Integer.parseInt(sb.toString()); */

    // Other Solution
    String numStr = "";
    while (number1 > 0 || number2 > 0) {
      // 둘 중 하나의 조건이라도 만족하면 while문 계속 실행
      // 즉 더 큰 수가 0보다 크지 않을 때까지 계속 실행
      numStr = String.valueOf(Math.max(number1 % 10, number2 % 10)) + numStr;
      number1 /= 10;
      number2 /= 10;
    }
    return Integer.parseInt(numStr);
  }

  /**
   * Numbers in Strings
   * 문자열 배열에서 숫자가 포함된 문자열만 배열로 리턴. 정규식 쓰지 않고 풀기
   * ["this is a test", "test1"] ➞ ["test1"]
   * @see https://edabit.com/challenge/KGhmvXpF6iK8mAqgj
   * @param arr
   * @return
   */
  public static String[] numInStr(String[] arr) {
    List<String> list = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length(); j++) {
        if (Character.isDigit(arr[i].charAt(j))) { // 또는 아스키 값으로 비교
          list.add(arr[i]);
          break;
        }
      }
    }
    return list.toArray(new String[list.size()]);

    // Other Solution
    /* ArrayList<String> results = new ArrayList<>();
    for (String s : arr) {
      if (s.matches(".*\\d+.*"))
      // .* : 아무 문자나 0 ~ n 개. \\d+ : 숫자 한 개 이상
        results.add(s);
    }
    return results.toArray(new String[results.size()]); */
  }

  /**
   * Replace Letters With Position In Alphabet
   * 문자열의 각 문자를 해당하는 숫자로 바꿔서 출력. 대소문자는 같은 값을 가짐. 문자가 아닌 것 무시.
   * a = 1, b = 2, c = 3....
   * "The river stole the gods." ➞ "20 8 5 18 9 22 5 18 19 20 15 12 5 20 8 5 7 15 4 19"
   * @see https://edabit.com/challenge/Djo98NonxGxvDgPde
   * @param str
   * @return
   */
  private static String getMatchingNumStr(int num) {
    num = num - 96;
    return String.valueOf(num);
  }

  private static HashMap<Character, Integer> getAlphabetMap() {
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < alphabet.length(); i++) {
      map.put(alphabet.charAt(i), i + 1);
      // map.put('a', 1), map.put('b', 2), map.put('c', 3)....map 컬렉션 생성
    }
    return map;
  }

  public static String alphabetIndex(String str) {
    str = str.toLowerCase();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      if (Character.isLetter(str.charAt(i))) {
        // sb.append(getMatchingNumStr(str.charAt(i)) + " ");
        sb.append(str.charAt(i) - 96).append(" ");
      }
    }
    return sb.toString().trim();

    // Other Solution
    /* HashMap<Character, Integer> alphabetMap = getAlphabetMap();
    StringBuilder sb = new StringBuilder();
    char[] arr = str.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
    for (int i = 0; i < arr.length; i++) {
      for (Map.Entry<Character, Integer> pair : alphabetMap.entrySet()) {
        if (arr[i] == pair.getKey()) { // 문자열의 각 문자와 Map 객체의 key와 비교
          if (i == arr.length - 1) { // 마지막 문자에는 " " 안 넣음.
            sb.append(pair.getValue());
          } else {
            sb.append(pair.getValue()).append(" ");
          }
        }
      }
    }
    return sb.toString(); */

    // Other Solution
    /* String alphabet = "abcdefghijklmnopqrstuvwxyz";
    StringBuilder sb = new StringBuilder();
    for (char ch : str.toLowerCase().toCharArray()) {
      if (Character.isAlphabetic(ch)) {
        sb.append(alphabet.indexOf(ch) + 1).append(" ");
        // alphabet.indexOf(ch) + 1 : 리턴 타입 int. 정수를 넣어도 문자열로 바뀌어서 들어감.
      }
    }
    return sb.toString().trim(); */
  }

  /**
   * What's the Missing Letter?
   * 문자열 str은 알파벳을 순서대로 나열한 것 중에 일부. 이 문자열에서 없어진 문자 리턴
   * "abdefg" ➞ "c". 없어진 문자가 없으면 No Missing Letter 리턴.
   * @see https://edabit.com/challenge/sRC7wLW7g6gw24Muq
   * @param str
   * @return
   */
  public static String missingLetter(String str) {
    /* StringBuilder sb = new StringBuilder();
    for (char i = str.charAt(0); i <= str.charAt(str.length() - 1); i = (char) (i + 1)) {
      sb.append(i);
    }
    for (int i = 0; i < sb.length(); i++) {
      if (sb.charAt(i) != str.charAt(i)) {
        return String.valueOf(sb.charAt(i));
      }
    }
    return "No Missing Letter"; */

    // Other Solution
    for (int i = 0; i < str.length() - 1; i++) {
      if (str.charAt(i + 1) - str.charAt(i) != 1) {
        return String.valueOf((char) (str.charAt(i) + 1));
      }
    }
    return "No Missing Letter";
  }

  private static boolean compareWord(String w1, String w2) {

    // 1. 문장의 단어 길이순 비교
    if (w1.length() > w2.length()) {
      return true;
    }

    System.out.printf("%s vs %s = %d%n", w1, w2, w1.compareTo(w2));
    // 2. 단어의 길이가 같다면 알파벳 순으로 정렬
    if (w1.length() == w2.length() && w1.compareTo(w2) > 0) {
      return true;
    }

    return false;
  }

  /**
  * Sort by Length
  * 문장을 단어의 길이순으로 정렬하여 리턴. 단어의 길이가 같다면 알바펫 순으로 정렬. 문장부호도 문자로 포함
  * "Have a wonderful day" ➞ "a day Have wonderful"
  * @see https://edabit.com/challenge/6RStzK9uub9vHDt53
  * @param str
  * @return
  */
  public static String sortByLength(String str) {
    String[] words = str.split(" ");

    for (int i = 0; i < words.length - 1; i++) {
      for (int j = 0; j < words.length - i - 1; j++) {
        String w1 = words[j];
        String w2 = words[j + 1];

        if (compareWord(w1, w2)) {
          String tmp = w2;
          words[j + 1] = w1;
          words[j] = tmp;
        }
      }
    }

    // System.out.println("배열 생성 초기값 : " + Arrays.toString(words));
    // Arrays.sort(words);

    // System.out.println("배열 알파벳순 정렬 : " + Arrays.toString(words));

    // List<String> list = new ArrayList<>();
    // System.out.println("list 사이즈 : " + list.size());
    // System.out.println("words 길이 : " + words.length);

    // for (int length = 1;; length++) {
    //   for (int i = 0; i < words.length; i++) {
    //     if (words[i].length() == length) {
    //       list.add(words[i]);
    //     }
    //   }
    //   if (list.size() == words.length) {
    //     break;
    //   }
    // }
    // StringBuilder sb = new StringBuilder();
    // for (String word : list) {
    //   System.out.println("list에서 나온 word : " + word);
    //   sb.append(word + " ");
    // }
    // System.out.println("sb.toString() : " + sb.toString());
    // return sb.toString().trim();

    return String.join(" ", words);
  }

  /**
   * War of Numbers
   * 배열의 요소 중 홀수들의 합과 짝수들의 합의 차 리턴
   * @see https://edabit.com/challenge/7fHsizQrTLXsPWMyH
   * @param numbers
   * @return
   */
  public static int warOfNumbers(int[] numbers) {
    int oddSum = 0;
    int evenSum = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0) {
        evenSum += numbers[i];
      } else {
        oddSum += numbers[i];
      }
    }
    return Math.abs(evenSum - oddSum);

    // Other Solution
    /* int evenSum = Arrays.stream(numbers).filter(x -> x % 2 == 0).sum();
    int oddSum = Arrays.stream(numbers).filter(x -> x % 2 != 0).sum();
    return Math.abs(evenSum - oddSum); */
  }

  /**
   * Apocalyptic Numbers
   * 2^number의 값에서 666부분이 들어가는 횟수에 따라 문자열 리턴
   * 0번 : Safe 1번 : Single 2번 : Double 3번 이상 : Triple
   * @see https://edabit.com/challenge/ujzBDWymfJ9fzSnfH
   * @param number
   * @return
   */
  public static String isApocalyptic(int number) {
    // Other Solution
    String[] results = { "", "Safe", "Single", "Double", "Triple" };
    int size = new BigInteger("2").pow(number).toString().split("666").length;
    return results[size];

    // Other Solution
    /* String numStr = new BigInteger("2").pow(number).toString();
    int length = numStr.length();
    int count = (length - numStr.replace("666", "").length()) / 3;
    switch (count) {
      case 1:
        return "Single";
      case 2:
        return "Double";
      case 3:
        return "Triple";
      default:
        return "Safe"; 
    } */
  }

  /**
   * The Karaca's Encryption Algorithm
   * 1) 문자열 word를 거꾸로 출력
   * 2) 그 문자열에서 모음을 해당하는 숫자로 변환 (a, e, i, o, u를 각각 0, 1, 2, 2, 3으로 변환)
   * 3) 그 문자열 끝에 "aca" 붙임.
   * encrypt("burak") ➞ "k0r3baca"
   * @see https://edabit.com/challenge/SmL32HnRnmsCqGC5g
   * @param word
   * @return
   */
  public static String encrypt(String word) {
    /* char[] charArr = word.toCharArray();
    for (int i = 0; i < charArr.length; i++) {
      if (Helper.isVowel(charArr[i])) {
        charArr[i] = vowelToNumChar(charArr[i]);
      }
    }
    return new StringBuilder(String.valueOf(charArr)).reverse().append("aca").toString(); */

    // Other Solution
    /* Map<String, String> map = new HashMap<>();
    map.put("a", "0");
    map.put("e", "1");
    map.put("i", "2");
    map.put("o", "2");
    map.put("u", "3");
    
    StringBuilder sb = new StringBuilder();
    for (int i = word.length() - 1; i >= 0; i--) {
      if (Helper.isVowel(word.charAt(i))) {
        sb.append(map.get(String.valueOf(word.charAt(i))));
      } else {
        sb.append(word.charAt(i));
      }
    }
    return sb.append("aca").toString(); */

    // Other Solution
    String newWord = new StringBuilder(word).reverse().toString();
    newWord = newWord.replace("a", "0").replace("e", "1").replace("i", "2").replace("o", "2").replace("u", "3");
    return newWord.concat("aca");
  }

  private static char vowelToNumChar(char ch) {
    switch (ch) {
      case 'a':
        return '0';
      case 'e':
        return '1';
      case 'u':
        return '3';
      default:
        return '2';
    }
  }

  /**
   * Count a Specific Digit
   * min에서 시작하여 max로 끝나는 수열에서 숫자 digit이 등장하는 횟수 리턴
   * digitOccurrences(51, 55, 5) ➞ 6   // [51, 52, 53, 54, 55] : 5 occurs 6 times
   * @see https://edabit.com/challenge/DPyBbBDqziAdo9DRJ
   * @param min
   * @param max
   * @param digit
   * @return
   */
  public static int digitOccurrences(int min, int max, int digit) {
    StringBuilder sb = new StringBuilder();
    for (int i = min; i <= max; i++) {
      sb.append(String.valueOf(i));
    }
    String nonDigit = sb.toString().replace(String.valueOf(digit), "");
    return sb.length() - nonDigit.length();

    // Other Solution
    /* StringBuilder sb = new StringBuilder();
    for (int i = min; i <= max; i++) {
      sb.append(String.valueOf(i));
    }
    int cnt = 0;
    for (int i = 0; i < sb.length(); i++) {
      if (String.valueOf(sb.charAt(i)).equals(String.valueOf(digit))) {
        cnt++;
      }
    }
    return cnt; */
  }

  /**
   * Censor Words Longer Than Four Characters
   * 문자열 str에서 4글자가 넘는 단어는 *로 변환
   * "aaaa aaaaa 1234 12345" ➞ "aaaa ***** 1234 *****"
   * @see https://edabit.com/challenge/xix4GjLCpXmetXGca
   * @param str
   * @return
   */
  public static String censor(String str) {
    String[] words = str.split(" ");
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() > 4) {
        words[i] = words[i].replaceAll(".", "*");
      }
    }
    return String.join(" ", words);
  }

  /**
   * Count Palindrome Numbers in a Range
   * Palindromes : 문자열의 처음과 끝이 거울을 보듯 대칭되는 문자열. 범위 안의 palindrome 개수 리턴.
   * @see https://edabit.com/challenge/cAyse5aq4n4MagmYA
   * @param num1
   * @param num2
   * @return
   */
  public static int countPalindromes(int num1, int num2) {
    int cnt = 0;
    for (int i = num1; i <= num2; i++) {
      if (Helper.isPalindrome(String.valueOf(i))) {
        cnt++;
      }
    }
    return cnt;

    // Other Solution
    /* int cnt = 0;
    while (num1 <= num2) {
      int copyNum1 = num1;
      int reverseNum = 0;
    
      while (copyNum1 != 0) {
        reverseNum = (reverseNum * 10) + (copyNum1 % 10);
        copyNum1 /= 10;
        // 숫자를 역순으로 출력. 값이 12321라면
        // reverseNum = (reverseNum * 10) + (copyNum1 % 10);
        // 0 = 0 + 1 copyNum1 = 1232
        // 12 = 10 + 2 copyNum1 = 123
        // 123 = 120 + 3 copyNum1 = 12
        // 1232 = 1230 + 2 copyNum1 = 1
        // 12321 = 12320 + 1 copyNum1 = 0
      }
      if (reverseNum == num1) {
        cnt++;
      }
      num1++;
    }
    return cnt; */
  }

  /**
   * Counting Adverbs
   * 문장에서 부사(-ly로 끝나는 단어) 개수 리턴
   * @see https://edabit.com/challenge/ZrsjThqzcwJYT95PQ
   * @param sentence
   * @return
   */
  public static int countAdverbs(String sentence) {
    /* String[] words = sentence.replaceAll("[^a-zA-Z\\s]", "").split(" ");
    int cnt = 0;
    for (String word : words) {
      if (word.endsWith("ly")) {
        cnt++;
      }
    }
    return cnt; */

    // Other Solution
    // String[] words = sentence.trim().split("\\p{Punct}?\\s");
    String[] words = sentence.split(" ");
    int count = 0;
    for (int i = 0; i < words.length; i++) {
      if (words[i].matches("\\w+ly\\p{Punct}?")) {
        count++;
        // \\w+ : [0-9a-zA-Z_] 문자 1개 이상
        // p{Punct}? : 키보드로 입력 가능한 특수문자 0개 이상
      }
    }
    return count;
  }

  /**
   * Split a String Based on Vowels and Consonants
   * 문자열에서 모음을 문자열의 앞으로, 자음은 그 뒤에 붙임. 특수문자, 공백은 자음 취급
   * split("What's the time?") ➞ "aeieWht's th tm?"
   * @see https://edabit.com/challenge/jfRHGwHMZcnzZm9JL
   * @param str
   * @return
   */
  public static String split(String str) {
    /* String nonVowel = str.replaceAll("[aeiou]", "");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      if (Helper.isVowel(str.charAt(i))) {
        sb.append(str.charAt(i));
      }
    }
    return String.valueOf(sb.append(nonVowel)); */

    // Other Solution
    // String vowel = str.replaceAll("[^aeiou]", "");
    // String nonVowel = str.replaceAll("[aeiou]", "");
    return str.replaceAll("[^aeiou]", "") + str.replaceAll("[aeiou]", "");
  }

  /**
   * Instant JAZZ
   * 문자열 배열 요소에 "7" 붙여서 출력. 이미 붙어있는 문자열이라면 그대로 출력.
   * @see https://edabit.com/challenge/r7JegKpMpntfDyy6D
   * @param arr
   * @return
   */
  public static String[] jazzify(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (!arr[i].endsWith("7")) {
        arr[i] += "7";
      }
    }
    return arr;
  }

  /**
   * Primal Strength
   * 주어진 소수와 이전 소수의 차, 주어진 소수와 다음 소수의 차가 같으면 "Balanced"
   * 주어진 소수와 이전 소수의 차, 주어진 소수와 다음 소수의 차에서 후자의 경우가 더 크면 "Weak"
   * 주어진 소수와 이전 소수의 차, 주어진 소수와 다음 소수의 차에서 전자의 경우가 더 크면 "Strong"
   * @see https://edabit.com/challenge/ted7T8hrioompcZAn
   * @param n
   * @return
   */
  public static String primalStrength(int n) {

    /* if (Helper.getNextPrime(n) - n > n - Helper.getPreviousPrime(n)) {
      return "Weak";
    }
    if (Helper.getNextPrime(n) - n < n - Helper.getPreviousPrime(n)) {
      return "Strong";
    }
    return "Balanced"; */

    // Other Solution
    /* for (int nextNum = n + 1, previousNum = n - 1; true; previousNum--, nextNum++) {
      if (Helper.isPrime(nextNum) && Helper.isPrime(previousNum)) {
        // 두 조건이 모두 참인 경우 == 두 소수 모두 같은 거리에 있음
        return "Balanced";
      } else if (Helper.isPrime(nextNum) && !Helper.isPrime(previousNum)) {
        // 다음 수가 소수이고 이전 수는 소수가 아닌 경우 == 다음 소수가 더 가까운 거리에 있음
        return "Strong";
      } else if (!Helper.isPrime(nextNum) && Helper.isPrime(previousNum)) {
        // 다음 수가 소수가 아니고 이전 수는 소수인 경우 == 이전 소수가 더 가까운 거리에 있음
        return "Weak";
      }
    } */

    // Other Solution
    int nextPrime = n + 1;
    int previousPrime = n - 1;
    while (!Helper.isPrime(nextPrime)) {
      nextPrime++;
    }
    while (!Helper.isPrime(previousPrime)) {
      previousPrime--;
    }
    return (nextPrime - n > n - previousPrime) ? "Weak" : (n - previousPrime > nextPrime - n) ? "Strong" : "Balanced";
  }

  /**
   * Find the Primorial
   * n번째 소수까지 곱한 값 리턴
   * @see https://edabit.com/challenge/Tyzp6S67dtXPAAQan
   * @param n
   * @return
   */
  public static int primorial(int n) {
    int multiplyPrimes = 1;
    int multiplyCnt = 0;
    int num = 1;
    while (multiplyCnt != n) {
      if (Helper.isPrime(num)) {
        multiplyPrimes *= num;
        multiplyCnt++;
      }
      num++;
    }
    return multiplyPrimes;
  }

  /**
   * Is a String Stretched?
   * str1은 str2의 Stretched String인가. Stretched String은 str2의 각 문자가 같은 개수로 반복된 문자열.
   * ("pppaaannndddaaa", "panda") ➞ true. ("sssshhiipp", "ship") ➞ false
   * @see https://edabit.com/challenge/Cqemt6ySdA883Td2F
   * @param str1
   * @param str2
   * @return
   */
  public static boolean isStretched(String str1, String str2) {

    // 오답. 문자의 정확한 반복횟수를 알아야 함.
    /* if (str2.length() == 1) {
      return true;
    }
    
    int firstCharRepeatCount = 0;
    int secondCharRepeatCount = 0;
    
    for (int i = 0; i < str1.length();i++) {
      if (str1.charAt(i) == str2.charAt(0)) {
        firstCharRepeatCount++;
      } else if (str1.charAt(i) == str2.charAt(1)) {
        secondCharRepeatCount++;
      } else {
        break;
      }
    }
    if (firstCharRepeatCount != secondCharRepeatCount) {
      return false;
    }    
    return isStretched(str1.substring(firstCharRepeatCount), str2.substring(1)); */

    // Other Solution
    /* int i = 0;
    while (str1.charAt(i) == str1.charAt(++i));
    String removeRepeat = str1.replaceAll("([\\w]){" + i + "}", "$1");    
    return removeRepeat.equals(str2); */

    // Other Solution    
    int firstCharRepeatCount = 1;
    int i = 0;

    // 첫 번째 문자의 반복 횟수를 구함
    while (str1.charAt(i) == str1.charAt(i + 1)) {
      firstCharRepeatCount++;
      i++;
    }

    // str2의 첫번째 문자의 반복 횟수를 구하고 str1이 그 반복 횟수만큼 진행되지 않으면 false를 반환하는 로직.
    // 반복 횟수가 일정하다면 str2.charAt(j) == str1.charAt(str2.charAt(j)가 시작되어야할 인덱스 ~ 반복 종료되는 인덱스)임.
    for (int j = 1; j < str2.length(); j++) {
      for (int k = 0; k < firstCharRepeatCount; k++) {
        // k = str1에서 반복되는 문자의 인덱스

        //      012345678   v는 if에서 체크하는 부분
        // str1 pppaaannn   str2  pan
        // j=0  vvv               v
        // j=1     vvv             v
        // j=2        vvv           v
        if (str2.charAt(j) != str1.charAt(j * firstCharRepeatCount + k)) {
          // 첫 번째 문자의 반복 횟수가 3이라고 가정했을 때
          // str2.charAt(1) == str1.charAt(3), str1.charAt(4), str1.charAt(5) 이어야 stretched string임
          return false;
        }
      }
    }

    if (str2.length() * firstCharRepeatCount < str1.length()) {
      return false;
    }
    // str1의 길이 >  (str2 * 일정한 반복 횟수) 는 str1이 Stretched String이 아님을 의미.

    return true;
  }

  /**
   * Persistence
   * 정수 num의 각 자리의 값을 곱했을 때 num보다 작은 수를 반환함. 반환된 수를 다시 똑같은 과정을 거쳐서 계속해서 작아지는 값을 구할 때, 한 자리수가 되는 값이 나오기까지의 step을 리턴
   * persistence(347) ➞ 3 // 3*4*7 = 84. 8*4 = 32. 3*2 = 6. 6이 나오기까지 3 step.
   * @see https://edabit.com/challenge/4JMgg8Fbmb3qnzS8B
   * @param num
   * @return
   */
  public static int persistence(long num) {
    // 나머지값끼리 곱함. 곱한 값을 담을 변수. 그 과정을 거치면 step++. (num > multiplyDigit). 그 multiplyDigit을 다시 돌림. 조작하는 값에 multiplyDigit 대입. 조작하는 값이 한 자리면 break.
    /* int step = 0;
    
    while (num >= 10) {
      long multiplyDigit = 1;
      // 나머지값들끼리 곱하고 난 뒤 다음 단계로 넘어갈 때 다시 초기화.
      // 큰 수를 조작하므로 long으로 선언
      while (num != 0) {
        multiplyDigit *= num % 10;
        num /= 10;
      }
      step++;
      num = multiplyDigit;
    }
    return step; */

    int step = 0;
    long multiplyDigit = 1;
    while (num >= 10) {
      multiplyDigit = Helper.getMultiplyDigit(num);
      step++;
      num = multiplyDigit;
    }
    return step;
  }

  /**
   * String Flips
   * 1 )매개변수 spec이 "word"이면 str 문장을 이루는 단어의 순서는 유지하면서 단어의 문자들을 역순으로,
   * 2) 매개변수 spec이 "sentence"이면 str 문장을 이루는 단어의 순서는 역순, 단어를 이루는 문자들은 그대로
   * @see https://edabit.com/challenge/uemLKqbbbfqvwB8ke
   * @param str
   * @param spec
   * @return
   */
  public static String flip(String str, String spec) {
    String[] wordsArr = str.split(" ");

    if (spec.equals("word")) {
      StringBuilder sb = new StringBuilder();
      for (String word : wordsArr) {
        sb.append(new StringBuilder(word).reverse().toString()).append(" ");
      }
      return sb.toString().trim();
    }

    StringBuilder sb = new StringBuilder();
    for (int i = wordsArr.length - 1; i >= 0; --i) {
      sb.append(wordsArr[i]).append(" ");
    }
    return sb.toString().trim();
  }

  /**
   * Letter Distance
   * 두 문자열에서 같은 자리에 있는 문자들의 차를 구한 후 그 차들의 합을 리턴
   * 두 문자열의 길이가 다르다면 길이의 차도 위의 결과에 더하여 리턴
   * 대문자 존재할 수 있음.
   * @see https://edabit.com/challenge/Wr5YbkQakb6qh8Gax
   * @param str1
   * @param str2
   * @return
   */
  public static int letterDistance(String str1, String str2) {
    int distanceSum = 0;
    for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
      if (str1.charAt(i) != str2.charAt(i)) {
        distanceSum += Math.abs(str1.charAt(i) - str2.charAt(i));
      }
    }
    return distanceSum + Math.abs(str1.length() - str2.length());
  }

  /**
   * Combinations
   * 주어진 num은 각 그룹의 아이템 개수. 이 아이템들을 나열할 수 있는 방법의 수 리턴
   * @see https://edabit.com/challenge/wp3vZEmhEgCY42WAZ
   * @param num
   * @return
   */
  public static int combinations(int... num) {
    // type... : 가변인자. 매개변수를 불러오는 방법은 배열과 똑같음.
    int multiplyNums = 1;
    for (int i = 0; i < num.length; i++) {
      if (num[i] != 0) {
        multiplyNums *= num[i];
      }
    }
    return multiplyNums;
  }

  /**
   * Remove Trailing and Leading Zeros
   * 문자열로 주어진 숫자에서 숫자 앞의 0과 소수점 아래의 의미 없는 0 제거
   * @see https://edabit.com/challenge/mc6KcMGkrSWP88dGu
   * @param n
   * @return
   */
  public static String removeLeadingTrailing(String n) {
    // 정수 처리
    if (!n.contains(".")) {
      return String.valueOf(Integer.parseInt(n));
    }

    String[] numParts = n.split("\\.");
    numParts[0] = String.valueOf(Integer.parseInt(numParts[0]));
    // 소수점 위의 수를 정수로 변환

    int zeroCnt = 0;
    for (int i = numParts[1].length() - 1; i >= 0; i--) { // 소수점 아래 잘라낼 0 개수 구하기
      if (numParts[1].charAt(i) == '0') {
        zeroCnt++;
      } else {
        break;
      }
    }
    int lengthOfPartsOne = numParts[1].length() - zeroCnt;
    // 소수점 아래 의미없는 0을 잘라낸 후 갖는 길이
    numParts[1] = numParts[1].substring(0, lengthOfPartsOne);

    if (numParts[1].equals("")) {
      return numParts[0];
    } else {
      return String.join(".", numParts);
    }

    // Other Solution
    // return new BigDecimal(n).stripTrailingZeros().toPlainString();
    // stripTrailingZeros() : 소수점 아래에서 오른쪽의 0을 제거한 값 리턴
    // toPlainString() : 전달받은 값을 지수 표현 없이 리턴.

    // Other Solution
    /* String[] numParts = n.split("\\.");
    if (numParts.length == 1) {
      return String.valueOf(Integer.parseInt(n));
    }
    
    numParts[1] = "." + numParts[1];
    String belowPoint = numParts[1].replace("0", " ").trim().replace(" ", "0").trim();
    // numParts[1].replace("0", " ").trim() : 소수점 아래 모든 0을 공백으로 바꾼 후 문자열의 앞,뒤 공백을 잘라냄
    // numParts[1].replace("0", " ").trim().replace(" ", "0").trim() :
    // 그 문자열에서 소수점과 0이 아닌 숫자 사이에 있던 공백을 다시 0으로 바꿈
    
    int abovePoint = Integer.parseInt(numParts[0]);
    return String.valueOf(abovePoint) + (belowPoint.length() > 1 ? belowPoint : "");
    // 소수점 아래의 길이가 2 이상이라면 (.x) abovePoint + belowPoint */

    // Other Solution
    /* while (n.length() > 0 && n.charAt(0) == '0') {
      n = n.substring(1);
      // 문자열의 첫 번째 문자가 0이면 잘라냄
    }
    if (n.length() == 0) {
      return "0";
      // 그렇게 잘라내서 길이가 0이되면 그 문자는 "0"
    }
    if (n.charAt(0) == '.') {
      n = "0" + n;
      // 그렇게 잘라내서 소수점을 만나면 n = 0 + .xxxxx
    }
    if (n.indexOf('.') < 0) {
      return n;
      // 문자열 앞의 0들을 잘라내고 그 문자가 정수의 형태이면 그대로 리턴
    }
    while (n.length() > 0 && n.charAt(n.length() - 1) == '0') {
      n = n.substring(0, n.length() - 1);
      // 문자열 뒤의 0들을 잘라냄
    }
    if (n.charAt(n.length() - 1) == '.')
      n = n.substring(0, n.length() - 1);
    // 문자열 마지막 문자가 "."이면 잘라낸 후 리턴
    return n; */
  }

  /**
   * Words With Duplicate Letters
   * 문장의 각각의 단에에서 중복 문자가 있으면 false, 아니면 true 리턴. 대소문자 무시
   * @see https://edabit.com/challenge/mdJmXLuw8dLxxdGLc
   * @param phrase
   * @return
   */
  public static boolean noDuplicateLetters(String phrase) {
    String[] wordArr = phrase.toLowerCase().split(" ");
    for (int i = 0; i < wordArr.length; i++) {
      Set<Character> set = new HashSet<>();
      for (int j = 0; j < wordArr[i].length(); j++) {
        set.add(wordArr[i].charAt(j));
      }
      if (wordArr[i].length() != set.size()) {
        return false;
      }
    }
    return true;

    // Other Solution
    /* String[] wordArr = phrase.toLowerCase().split(" ");
    for (int i = 0; i < wordArr.length; i++) {
      for (int j = 0; j < wordArr[i].length(); j++) {
        for (int k = j + 1; k < wordArr[i].length(); k++) {
          if (wordArr[i].charAt(j) == wordArr[i].charAt(k)) {
            return false;
          }
        }
      }
    }
    return true; */

    // Other Solution
    /* String[] wordArr = phrase.toLowerCase().split(" ");
    for (int i = 0; i < wordArr.length; i++) {
      if (wordArr[i].chars().distinct().count() != wordArr[i].length()) {
        return false;
      }
    }
    return true; */

    // Other Solution
    /* String[] wordArr = phrase.toLowerCase().split(" ");
    for (int i = 0; i < wordArr.length; i++) {
      char[] charArr = wordArr[i].toCharArray();
      Arrays.sort(charArr);
      for (int j = 0; j < charArr.length - 1; j++) {
        if (charArr[j] == charArr[j + 1]) {
          return false;
        }
      }
    }
    return true; */

    // Other Solution
    /* String[] wordArr = phrase.toLowerCase().split(" ");
    for (int i = 0; i < wordArr.length; i++) {
      for (int j = 0; j < wordArr[i].length(); j++) {
        if (wordArr[i].indexOf(wordArr[i].charAt(j), j + 1) != -1) {
          return false;
        }
      }
    }
    return true; */
  }

  /**
   * Repeat the Shorter String
   * str1과 str2의 문자열 중 더 짧은 문자열을 더 긴 문자열의 길이만큼 반복함
   * @param str1
   * @param str2
   * @return
   */
  public static String lengthen(String str1, String str2) {
    String shorterStr = str1.length() < str2.length() ? str1 : str2;
    String longerStr = str1.length() > str2.length() ? str1 : str2;
    StringBuilder sb = new StringBuilder();

    while (sb.length() < longerStr.length()) {
      for (int i = 0; i < shorterStr.length(); i++) {
        sb.append(shorterStr.charAt(i));
        if (sb.length() == longerStr.length()) {
          break;
        }
      }
    }
    return sb.toString();
  }

  /**
   * Longest Common Ending
   * str1과 str2에이 가장 길게 공통되는 부분 리턴. 문자열의 끝부분에 있음
   * @see https://edabit.com/challenge/8yxthmRQsNu86PBy3
   * @param str1
   * @param str2
   * @return
   */
  public static String longestCommonEnding(String str1, String str2) {
    String shorterStr = str1.length() < str2.length() ? str1 : str2;
    // String longerStr = str1.length() > str2.length() ? str1 : str2;
    // 두 문자열의 길이가 같은 경우 shorterStr, longerStr 모두 str1이 됨.
    String longerStr = shorterStr.equals(str1) ? str2 : str1;
    StringBuilder sb = new StringBuilder();

    for (int i = shorterStr.length() - 1, j = longerStr.length() - 1; i >= 0; i--, j--) {
      if (shorterStr.charAt(i) == longerStr.charAt(j)) {
        sb.append(shorterStr.charAt(i));
      } else {
        break;
      }
    }
    return sb.reverse().toString();
  }

  /**
   * Remix the String
   * 정수 배열의 요소는 문자열의 각 문자 인덱스를 의미함. 인덱스를 오름차순으로 했을 때 문자열 리턴
   * remix("abcd", [0, 3, 1, 2]) ➞ "acdb"
   * @see https://edabit.com/challenge/zRjZb4NXtfMjGAMGb
   * @param str
   * @param arr
   * @return
   */
  public static String remix(String str, int[] arr) {
    Map<Integer, Character> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      map.put(arr[i], str.charAt(i));
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      sb.append(map.get(i));
    }
    return sb.toString();

    // Other Solution
    /* ArrayList<Integer> list = new ArrayList<>();
    for (int num : arr) {
      list.add(num);
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr.length; i++)
      sb.append(str.charAt(list.indexOf(i)));
    return sb.toString(); */

    // Other Solution
    /* StringBuilder remixedStr = new StringBuilder(str);
    for (int i = 0; i < str.length(); i++) {
      remixedStr.setCharAt(arr[i], str.charAt(i));
    }
    return remixedStr.toString(); */

    // Other Solution
    /* char[] chars = new char[arr.length];
    for (int i = 0; i < arr.length; i++) {
      chars[arr[i]] = str.charAt(i);
    }
    return new String(chars); */
  }

  /**
   * White Spaces Between Lower and Uppercase Letters
   * 카멜 케이스 문자열을 공백 넣어서 바꾸기. 대소문자 유지
   * @see https://edabit.com/challenge/j7qh4xZNvLddnx4Gy
   * @param s
   * @return
   */
  public static String insertWhitespace(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length() - 1; i++) {
      if (Character.isLowerCase(s.charAt(i)) && Character.isUpperCase(s.charAt(i + 1))) {
        sb.append(s.charAt(i)).append(" ");
      } else {
        sb.append(s.charAt(i));
      }
    }
    sb.append(s.charAt(s.length() - 1));
    return sb.toString().trim();

    // Other Solution
    // return s.replaceAll("(?<=[a-z])(?=[A-Z])", " ");
    // return s.replaceAll("([A-Z])", " $1").trim();
  }

  /**
   * Common Divisor of Array
   * 배열 요소들의 최대공약수 리턴
   * @see https://edabit.com/challenge/tLmBirspM5N35xxuC
   * @param array
   * @return
   */
  public static int gcdOfArray(int[] array) {
    Arrays.sort(array);
    int commonDivisor = array[0];
    while (true) {
      int gcd = commonDivisor;
      for (int i = 0; i < array.length; i++) {
        if (array[i] % commonDivisor != 0) {
          commonDivisor--;
          break;
        }
      }
      if (gcd == commonDivisor) {
        return gcd;
      }
    }
  }

  /**
   * Reverse Coding Challenge #6
   * @see https://edabit.com/challenge/XgFuNXpXAENpZiDaw
   * @param num
   * @return 예시의 input과 output을 보고 적절한 메서드 만들기
   * mysteryFunc(152) ➞ 10. mysteryFunc(832) ➞ 48. mysteryFunc(19) ➞ 9. mysteryFunc(133) ➞ 9
   */
  public static int mysteryFunc6(int num) {
    // 매개변수 num의 각 자리의 수를 곱하면 output.
    int result = 1;
    while (num != 0) {
      result *= num % 10;
      num /= 10;
    }
    return result;
  }

  /**
   * Swap X and Y Coordinates
   * @see https://edabit.com/challenge/u8tkvqrMSqJetmNcz
   * @param str
   * @return 좌표를 나타내는 "(x1, y1), (x2, y2)" 문자열에서 x좌표와 y좌료를 서로 바꾸기
   */
  public static String swapXY(String str) {

    String[] words = str.split(",");
    for (int i = 0; i < words.length; i++) {
      words[i] = words[i].replaceAll("[()]", "").trim();
    }
    /* StringBuilder sb = new StringBuilder();
    sb.append("(" + words[1] + ", " + words[0] + "), (" + words[3] + ", " + words[2] + ")");
    return sb.toString(); */
    return String.format("(%s, %s), (%s, %s)", words[1], words[0], words[3], words[2]);

    // Other Solution
    // return str.replaceAll("\\(([\\d\\-]+), ([\\d\\-]+)\\)", "($2, $1)");
  }

  /**
   * Power Ranger
   * @see https://edabit.com/challenge/LzW7RxkLFFWphQWiK
   * @param power
   * @param min
   * @param max
   * @return 주어진 매개변수 min부터 max까지의 범위에 들어가는 x의 power승의 개수는 몇 개인가. powerRanger(3, 1, 27) ➞ 3 // 3 cubes (n^3) lie between 1 and 27, 1 (1^3), 8 (2^3) and 27 (3^3)
   */
  public static int powerRanger(int power, int min, int max) {
    int cnt = 0;
    int i = 1;
    while ((int) (Math.pow(i, power)) <= max) {
      if ((int) (Math.pow(i, power)) >= min) {
        cnt++;
      }
      i++;
    }
    return cnt;

    // Other Solution
    // return 1 + (int) Math.floor(Math.pow(max, 1.0 / power)) - (int) Math.ceil(Math.pow(min, 1.0 / power));
  }

  /**
   * 3D Visual Block Sequence
   * @see https://edabit.com/challenge/JnGKayBeHJFDQ2oiu
   * @param step
   * @return 각 step에서의 block 개수가 다음과 같을 때 매개변수 step의 block 개수 리턴. step = 0 block = 0 / step = 1 block = 5 / step = 2 block = 12 / step = 3 block = 20 / step = 4 block = 29 / step = 5 block = 39 / ...
   */
  public static int blocks(int step) {
    // quadratic sequence : 이차 수열(계차 수열). 공차의 값이 일정하게 늘어나는 수열
    // f(0) = 0;
    // f(1) = 5;
    // f(2) = f(1) + d + dd; // 12 // d = 7, dd = 0
    // f(3) = f(2) + d + dd; // 20 // d = 7, dd = 1
    // f(4) = f(3) + d + dd; // 29 // d = 7, dd = 2
    if (step == 0) {
      return 0;
    }
    if (step == 1) {
      return 5;
    }

    return blocks(step - 1) + 7 + (step - 2);
  }

  /**
   * The Nth Term of the Sequence
   * @see https://edabit.com/challenge/HhExSRj4aXHxTQEgG
   * @param n
   * @return 각 항의 값은 다음과 같을 때 n 번째 항의 값 구하기 n = 0, val = 1 / n = 1, val = 2 / n = 2, val = 6 / n = 3, val = 13 / n = 4, val = 23 / n = 5, val = 36 / n = 6, val = 52 /
   */
  public static int seq(int n) {
    // n = 0, val = 1 /
    // n = 1, val = 2 /         d = 4, dd = 3
    // n = 2, val = 6 /  f(1) + 4
    // n = 3, val = 13 / f(2) + 4 + dd
    // n = 4, val = 23 / f(3) + 4 + dd * 2
    // n = 5, val = 36 / f(4) + 4 + dd * 3
    // n = 6, val = 52 / 
    //                   f(n-1) + 4 + dd(n-2)
    if (n == 0) {
      return 1;
    }
    if (n == 1) {
      return 2;
    }
    return seq(n - 1) + 4 + 3 * (n - 2);
  }

  /**
   * Return the End Letters of Numbers
   * @see https://edabit.com/challenge/9To632EycoudpkgHM
   * @param num
   * @return num과 num의 서수를 문자열로 리턴. 서수는 1st, 2nd, 3rd, 4th..를 의미
   */
  public static String returnTheEndOfNumber(int num) {
    /* String ordinal = "";
    switch (num % 10) {
      case 1:
        ordinal = "ST";
        break;
      case 2:
        ordinal = "ND";
        break;
      case 3:
        ordinal = "RD";
        break;    
      default:
        ordinal = "TH";
    }
    if (num % 100 >= 10 && num % 100 <= 20) {
      ordinal = "TH";
    }
    return String.format("%s-%s", String.valueOf(num), ordinal); */

    // Other Solution
    /* String numStr = String.valueOf(num);
    if (numStr.endsWith("11") || numStr.endsWith("12") || numStr.endsWith("13")) {
      return num + "-TH";
    } else if (numStr.endsWith("1")) {
      return num + "-ST";
    } else if (numStr.endsWith("2")) {
      return num + "-ND";
    } else if (numStr.endsWith("3")) {
      return num + "-RD";
    } else {
      return num + "-TH";
    } */

    // Other Solution
    int j = num % 10;
    int k = num % 100;
    if (j == 1 && k != 11) {
      return String.valueOf(num) + "-ST";
    }
    if (j == 2 && k != 12) {
      return String.valueOf(num) + "-ND";
    }
    if (j == 3 && k != 13) {
      return String.valueOf(num) + "-RD";
    }
    return String.valueOf(num) + "-TH";
  }

  /**
   * Remove Repeated Characters
   * @see https://edabit.com/challenge/mtrBW4w2Bkum4bGt5
   * @param str
   * @return 중복 문자 제거 후 리턴
   */
  public static String unrepeated(String str) {
    /* Set<Character> set = new LinkedHashSet<>();
    for (char ch : str.toCharArray()) {
      set.add(ch);
    }
    Iterator<Character> it = set.iterator();
    StringBuilder sb = new StringBuilder();
    while (it.hasNext()) {
      sb.append(it.next());
    }
    return sb.toString(); */

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      if (!sb.toString().contains(String.valueOf(str.charAt(i)))) {
        sb.append(str.charAt(i));
      }
    }
    return sb.toString();
  }

  /**
   * Histogram Function
   * https://edabit.com/challenge/YLwQGrA24g9TmiGXf   
   * @param arr
   * @param chr
   * @return 주어진 chr을 배열의 요소만큼 반복한 후 줄바꿈, 다시 요소만큼 반복한 문자열 리턴
   */
  public static String histogram(int[] arr, String chr) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i]; j++) {
        sb.append(chr);
      }
      sb.append("\n");
    }
    return sb.toString().trim();

    // Other Solution
    /* StringBuilder sb = new StringBuilder();
    for (int n : arr) {
      sb.append(String.format("%0" + n + "d", 0).replace("0", chr) + "\n");
    }
    return sb.toString().trim(); */
  }

  /**
   * Length of Worm
   * @see https://edabit.com/challenge/5aGCby28ZfsSZr4cH
   * @param worm
   * @return 문자열 "-"의 길이 리턴, "-" 하나당 10 mm. "-" 이외의 문자가 있다면 "invalid" 리턴
   */
  public static String wormLength(String worm) {
    /* if (worm.isEmpty() || worm.replaceAll("[-]", "").length() > 0) {
      return "invalid";
    } */
    if (worm.isEmpty() || worm.split("-").length > 0) {
      return "invalid";
    }
    return String.format("%d mm.", worm.length() * 10);

    // Other Solution
    // return worm.matches("^[-]+$") ? worm.length() * 10 + " mm." : "invalid";
  }

  /**
   * Geometry 1: Length of Line Segment
   * @see https://edabit.com/challenge/XuhT6hazGTL9c4bwE
   * @param point
   * @return x,y 좌표가 주어졌을 때 두 점 사이의 거리 리턴
   */
  public static double lineLength(int[][] point) {
    return Math.sqrt(Math.pow(point[0][0] - point[1][0], 2) + Math.pow(point[0][1] - point[1][1], 2));
  }

  /**
   * You FAILEDPASSED the Exam
   * @see https://edabit.com/challenge/BxnxYJGQ9MMQn2EfR
   * @param userScore
   * @param passScore
   * @return 시험 점수와 통과 점수가 주어졌을 때 결과에 따른 문자열 출력
   */
  public static String gradePercentage(String userScore, String passScore) {
    String result = "";
    if (Integer.parseInt(userScore.substring(0, userScore.length() - 1)) >= Integer
        .parseInt(passScore.substring(0, passScore.length() - 1))) {
      result = "PASSED";
    }
    if (Integer.parseInt(userScore.substring(0, userScore.length() - 1)) < Integer
        .parseInt(passScore.substring(0, passScore.length() - 1))) {
      result = "FAILED";
    }
    return String.format("You %s the Exam", result);
  }

  /**
   * Print Grid
   * @see https://edabit.com/challenge/v9YKCBnGLJh8ZobKj
   * @param rows
   * @param cols
   * @return 행과 열의 수가 주어졌을 때 정수 1부터 시작하는 행렬 문자열 만들기
   */
  public static String printGrid(int rows, int cols) {

    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= rows; i++) {
      for (int j = 0, num = i; j < cols; j++, num += rows) {
        sb.append(num);
        if (j != cols - 1) {
          sb.append(", ");
        }
      }
      sb.append("\n");
    }
    return sb.toString().trim();
  }

  /**
   * Meme Sum :)
   * @see https://edabit.com/challenge/4HRk9MkZm4wNR6PZJ
   * @param a
   * @param b
   * @return 각 자리의 수를 더한 값을 숫자 올림 없이 그 자리에 다시 써서 리턴. memeSum(122, 81) ➞ 1103. // 1+0 = 1, 2+8 = 10, 2+1 = 3. // 122 + 81 = 1103
   */
  public static int memeSum(int a, int b) {
    StringBuilder sb = new StringBuilder();
    while (true) {
      sb.insert(0, a % 10 + b % 10);
      a /= 10;
      b /= 10;
      if (a == 0 && b == 0) {
        break;
      }
    }
    return Integer.parseInt(sb.toString());
  }

  /**
   * Highest Digit
   * @param n
   * @return 주어진 정수에서 가장 큰 digit 리턴.
   */
  public static int highestDigit(int n) {
    int digit;
    int highestDigit = n % 10;
    n /= 10;
    while (n != 0) {
      digit = n % 10;
      n /= 10;
      if (digit > highestDigit) {
        highestDigit = digit;
      }
    }
    return highestDigit;
  }
}