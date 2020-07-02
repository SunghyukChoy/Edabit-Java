package my.sunghyuk.edabit;

import java.lang.reflect.Array;
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
    System.out.println("==============================================");

    // Arrays.copyOf(원본 배열, 생성할 배열의 길이), Arrays.copyOfRange(원본배열, 시작인덱스, 종료인덱스)
    int[] copyOfTest = new int[] { 1, 2, 3, 4, 5 };
    int[] copyArr = Arrays.copyOf(copyOfTest, copyOfTest.length);
    System.out.println(Arrays.toString(copyArr)); // {1, 2, 3, 4, 5}
    int[] rangeCopyArr = Arrays.copyOfRange(copyOfTest, 1, copyOfTest.length);
    // 인덱스 1부터 4까지 (copyOfTest.length = 5)
    System.out.println(Arrays.toString(rangeCopyArr)); // {2, 3, 4, 5}
    System.out.println("==============================================");

    //String.format("%.nf", 변환할 값)
    double pie = 3.14159265358979;
    System.out.println((String.format("%.2f", pie))); // 3.14
    System.out.println((String.format("%.3f", pie))); // 3.142
    // Math.round(변환할 값)
    int roundNum = Math.round(10.45f); // 소수점 첫째 자리에서 반올림 하여 정수로 리턴
    System.out.println(roundNum);
    System.out.println(Math.round(pie * 100) / 100.0); // 3.14
    System.out.println(Math.round(pie * 1000) / 1000.0); // 3.142
    // Math.round() : 소수점 아래 0 절삭, String.format() : 절삭하지 않음.
  }
}
