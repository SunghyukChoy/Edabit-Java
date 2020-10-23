package my.sunghyuk.programmers.coding_test_practice;

import java.util.Arrays;
import java.util.HashSet;
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
}
