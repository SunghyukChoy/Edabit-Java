package my.sunghyuk.edabit.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
}