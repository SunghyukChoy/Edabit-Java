package my.sunghyuk.programmers.coding_test_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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

  /***********************아직 못 품*******************************/
  /**
   * 모의고사
   * @see https://programmers.co.kr/learn/courses/30/lessons/42840
   * @param answers
   * @return
   */
  public int[] solution5(int[] answers) {
    int[] firstStudentPicks = new int[] { 1, 2, 3, 4, 5 };
    int[] secondStudentPicks = new int[] { 2, 1, 2, 3, 2, 4, 2, 5 };
    int[] thirdStudentPicks = new int[] { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

    int[] firstStudentAnswers = getStudentAnswers(answers.length, firstStudentPicks);
    int[] secondStudentAnswers = getStudentAnswers(answers.length, secondStudentPicks);
    int[] thirdStudentAnswers = getStudentAnswers(answers.length, thirdStudentPicks);

    int firstStudentCorrectAnswerCount = getCorrectAnswerCount(firstStudentAnswers, answers);
    int secondStudentCorrectAnswerCount = getCorrectAnswerCount(secondStudentAnswers, answers);
    int thirdStudentCorrectAnswerCount = getCorrectAnswerCount(thirdStudentAnswers, answers);

    return null;
  }

  private static int[] getStudentAnswers(int answersLength, int[] studentPicks) {
    int[] studentAnswers = new int[answersLength];
    for (int i = 0, j = 0; i < answersLength; i++, j++) {
      studentAnswers[i] = studentPicks[j];
      if (j == studentPicks.length - 1) {
        j = 0;
      }
    }
    return studentAnswers;
  }

  private static int getCorrectAnswerCount(int[] studentAnswers, int[] answers) {
    int correctAnswerCount = 0;
    for (int i = 0; i < answers.length; i++) {
      if (answers[i] == studentAnswers[i]) {
        correctAnswerCount++;
      }
    }
    return correctAnswerCount;
  }

  /***********************아직 못 품*******************************/
  /**
   * 완주하지 못한 선수
   * @see https://programmers.co.kr/learn/courses/30/lessons/42576
   * @param participant
   * @param completion
   * @return
   */
  public String solution6(String[] participant, String[] completion) {

    /* for (int i = 0; i < participant.length; i++) {
      for (int j = 0; j < completion.length; j++) {
        if (participant[i].equals(completion[j])) {
          participant[i] = "";
          completion[j] = "";
          break;
        }
      }
    }
    Arrays.sort(participant);
    return participant[participant.length - 1]; */

    String participnatStr = String.join(" ", participant);
    for (int i = 0; i < completion.length; i++) {
      if (participnatStr.contains(completion[i])) {
        participnatStr = participnatStr.substring(0, participnatStr.indexOf(completion[i]))
            + participnatStr.substring(participnatStr.indexOf(completion[i]) + completion[i].length());
      }
    }
    return participnatStr.trim();
  }
}