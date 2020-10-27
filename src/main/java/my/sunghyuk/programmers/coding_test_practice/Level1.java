package my.sunghyuk.programmers.coding_test_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Level1 {

  private Level1() {

  }

  /**
   * 두 개 뽑아서 더하기
   * @see https://programmers.co.kr/learn/courses/30/lessons/68644
   * @param numbers
   * @return
   */
  public int[] solution1(int[] numbers) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < numbers.length - 1; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        set.add(numbers[i] + numbers[j]);
      }
    }
    int[] answer = new int[set.size()];
    int i = 0;
    for (int num : set) {
      answer[i++] = num;
    }
    Arrays.sort(answer);
    return answer;
  }

  /**
   * K번째수
   * @see https://programmers.co.kr/learn/courses/30/lessons/42748
   * @param array
   * @param commands
   * @return
   */
  public int[] solution2(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];
    for (int i = 0; i < commands.length; i++) {
      int[] newArr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
      Arrays.sort(newArr);
      answer[i] = newArr[commands[i][2] - 1];
    }
    return answer;
  }

  /**
   * 가운데 글자 가져오기
   * @see https://programmers.co.kr/learn/courses/30/lessons/12903  
   * @param s
   * @return
   */
  public String solution3(String s) {
    return s.length() % 2 != 0 ? String.valueOf(s.charAt(s.length() / 2))
        : s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
  }

  /**
   * 같은 숫자는 싫어
   * @see https://programmers.co.kr/learn/courses/30/lessons/12906
   * @param arr
   * @return
   */
  public int[] solution4(int[] arr) {

    List<Integer> list = new ArrayList<>();
    list.add(arr[0]);
    for (int i = 1; i < arr.length; i++) {
      if (list.get(list.size() - 1) != arr[i]) {
        list.add(arr[i]);
      }
    }
    int[] noDuplicate = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      noDuplicate[i] = list.get(i);
    }
    return noDuplicate;
  }
}
