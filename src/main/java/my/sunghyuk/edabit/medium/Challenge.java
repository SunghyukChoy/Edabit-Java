package my.sunghyuk.edabit.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Challenge {
  /**
   * Algorithms II: The Euclidean Algorithm
   * 
   * @see : https://edabit.com/challenge/HmicQW4LMYyNHXRzT Function Recursive 에 관한
   *      문제
   * 
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
   * @return
   */
  public static boolean isValidHexCode(String str) {
    /**
     * 1. 문자열은 #으로 시작 
     * 2. 그 뒤에 문자들은 0~9,a~f 까지 
     * 3. #제외 6글자
     */
    /**
     * Java String 클래스에서 제공되는 정규표현식 관련 메서드
     * 1. boolean matches(String regex);
     * 2. String replaceAll(String regex, String replacement);
     * 3. String replaceFirst(String regex, String replacement);
     * 4. String split(String regex);
     */

    // // 3.
    // if (str.length() != 7) {
    //   return false;
    // }

    // // 1.
    // if (str.charAt(0) != '#') {
    //   return false;
    // }

    // // 2.
    // for (int i = 1; i < str.length(); i++) {
    //   char ch = str.charAt(i);

    //   if (!((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F'))) {
    //     return false;
    //   }

    // }

    // return true;   

    // ^# : #으로 시작하고
    // [\\da-fA-F] : \\d : 0에서 9, a에서 f, A에서 F까지
    // {6} : 앞 조건식의 문자가 6개
    return str.matches("^#[\\da-fA-F]{6}");
  }

  /**
   * Filter Repeating Character Strings   
   * 배열의 요소 중 문자가 반복되는 요소만 배열로 리턴
   * 요소의 길이가 1이라면 그대로 리턴    
   * @see https://edabit.com/challenge/tunTJAdBeLgc8s4ap
   * @param arr
   * @return
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
   * (매개변수로 주어지는 a,b,c) ax^2 + bx + c에서 x의 값은 몇 개인가.
   * 
   * @see https://edabit.com/challenge/Rs23pTNpM6k5M2ThH
   * @param a
   * @param b
   * @param c
   * @return
   */
  public static int solutions(int a, int b, int c) {
    // 근의 개수 구하는 공식. b^2-4ac > 0 -> 2, // == 0 -> 1, // < 0 -> 0
    // 문제 의도 모르겠음. 참고할 만한 다른 답안 없음.
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
   * n x n 이차원 배열 만들기  ex : {{3, 3, 3}, {3, 3, 3}, {3, 3, 3}}
   * 
   * @see https://edabit.com/challenge/7Tb7qMDQHtz3xpydd
   * @param n
   * @return
   */
  public static int[][] squarePatch(int n) {
    // My Solution
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
   * 가위바위보 게임
   * @see https://edabit.com/challenge/3S8XppR6Yf5mXPxij
   * @param s1
   * @param s2
   * @return
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
   * 주어지는 step은 사각형 한 변 길이의 반. step이 1이라면 사각형은 2 x 2의 크기를 가짐
   * 2 x 2 크기의 사각형은 4칸으로 나뉘어져 있고 각 칸에는 점이 하나씩 들어감
   * step = 2일 때 사각형의 크기는 4 x 4이고 점은 2 x 2에 찍힌 점에서 모서리 방향으로 하나씩 더 찍힘
   * 즉 한 단계씩 진행할 때마다 4개의 점이 더 찍힘. 그 외의 점이 찍히지 않는 칸은 empty square라고 함.
   * step이 n일 때 empty square의 갯수 리턴
   * 
   * @see https://edabit.com/challenge/3GvRKZPF2NRPz3DgQ
   * @param step
   * @return
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
   * 중복되는 문자 갯수(중복 횟수) 리턴, 공백도 문자로 포함   
   * @see https://edabit.com/challenge/zmbR8SKveCgJ6KB5G
   * @param str
   * @return
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
   * 문자를 다음 알파벳순의 문자로 바꾸기 bye -> czf. 문자열에 z는 없음.
   * @see https://edabit.com/challenge/2Cbbs3pvH2gCMZMsg
   * @param word
   * @return
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
      // 마지막 문자가 aeiouAEIOU 대신에 aeiouAEIOU가 마지막 문자를 표현하느냐라고 표현
      inv += "-";
    }
    return inv + "inator " + length + "000";
  }
}