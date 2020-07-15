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

    System.out.println("==============================================");
    // .indexOf("찾을 문자열")  .indexOf("찾을 문자열", 시작 인덱스)
    // .lastIndexOf("찾을 문자열")  .lastIndexOf("찾을 문자열", 시작 인덱스)
    String indexOfTest = "Hello world";
    System.out.println(indexOfTest.indexOf("z")); // -1
    // 찾는 문자열이 없는 경우 -1 리턴
    System.out.println(indexOfTest.indexOf("o")); // 4
    System.out.println(indexOfTest.indexOf("o", 5)); // 7
    // 시작점 미입력 시 0번부터 시작
    // 시작점을 바꾼다고 하여 indexOfTest의 인덱스가 바뀌지는 않음. 원래의 인덱스 출력
    System.out.println(indexOfTest.lastIndexOf("z")); // -1
    System.out.println(indexOfTest.lastIndexOf("o")); // 7
    System.out.println(indexOfTest.lastIndexOf("o", 5)); // 4
    // 뒤에서부터 찾기 시작하지만 반환하는 인덱스는 원래의 인덱스 번호
    // 즉 왼쪽에서 몇 번째 위치하는지를 인덱스로 반환. 시작 인덱스 또한 원래의 인덱스 번호 기준
    System.out.println("==============================================");
    // Integer.toHexString(). 10진수를 16진수로 변환하는 방법
    System.out.printf("%02X%n", 255); // FF
    System.out.printf("%02x%n", 255); // ff
    System.out.printf("%X%n", 10); // A
    // %X : 16진수를 대문자로 // %x : 16진수를 소문자로
    // %02X : 2자리 16진수 값을 대문자로, 16진수 값이 1자리이면 앞에 0을 붙임 // %n : 개행
    String hexStr = String.format("%02X%n", 10);
    System.out.print(hexStr); // 0A
    System.out.println(Integer.toHexString(255)); // ff
    System.out.println(Integer.toHexString(255).toUpperCase()); // FF
    System.out.println(Integer.toHexString(10).toUpperCase()); // A
    System.out.println("==============================================");
    // Math.ceil(), Math.floor(), Math.round()
    System.out.println(Math.ceil(Math.PI)); // 올림 // 4.0
    System.out.println(Math.floor(3.7564)); // 내림 // 3.0
    System.out.println(Math.round(3.7564)); // 반올림 // 소수점 버림  // 4
    System.out.println(Math.round(3.1234)); // 반올림 // 소수점 버림  // 3
  }
}
