package my.sunghyuk.edabit;

import java.util.Arrays;

public class Note {
  public static void main(String[] ar) {
    // Arrays.fill(배열, 배열을 채울 값)
    int[][] arr = new int[3][5];
    for (int[] row : arr) {
      // int[] row : 2차원 배열 요소(1차원 배열)를 하나씩 가져와 담을 변수 선언
      Arrays.fill(row, 20);
      // 그 1차원 배열을 20으로 채움.

      Arrays.fill(row, 2, 4, 50);
      // Arrays.fill(배열, 시작인덱스, 종료인덱스, 배열을 채울 값)
      // 지정한 배열의 2,3 인덱스를 지정된 값으로 채움.
    }
    for (int[] row : arr) {
      System.out.println(Arrays.toString(row));
    }
    // [20, 20, 50, 50, 20]
    // [20, 20, 50, 50, 20]
    // [20, 20, 50, 50, 20]

  }
}
