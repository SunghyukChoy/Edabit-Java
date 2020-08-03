package my.sunghyuk.edabit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

  private static int calculateGugudan(int i, int j) {
    return (i + 1) * (j + 1);
  }

  public static void main(String[] ar) {

    // int a = 4 / 10;
    // System.out.println(a);

    // String empty = "";
    // System.out.println("empty의 길이 = " + empty.length());
    // System.out.println("==============================");
    // String reg = "ofofofggofchickenggoff";
    // reg = reg.replaceAll("[`f`o`g]", "");
    // System.out.println(reg);
    // System.out.println("==============================");
    // String[] example = { "index.html", "main.css" };
    // String[] ex = example[0].split("[.]");
    // String ex2 = ex[1];
    // System.out.println(Arrays.toString(ex));
    // System.out.println(ex2);
    // System.out.println("==============================");
    // int num = 12;
    // String strNum = String.valueOf(num);
    // strNum = strNum + 50;
    // System.out.println(strNum);
    // System.out.println("==============================");
    // String auto = "automation";
    // boolean autoB = auto.startsWith("auto");
    // System.out.println(autoB);
    // boolean autoBool = auto.endsWith("tio");
    // System.out.println(autoBool);
    // System.out.println("==============================");
    // System.out.println();
    // String str = "This is last index of example";
    // int index = str.lastIndexOf("of");
    // System.out.println(index);
    // String num = "12345";
    // String reverseNum = "";
    // for (int i = num.length() - 1; i >= 0; i--) {

    // reverseNum += num.charAt(i);
    // }
    // System.out.println(reverseNum);

    // int a = 0 / 2;
    // int ra = 0 % 2;
    // System.out.println(a);
    // System.out.println(ra);

    // int i, j;
    // int max = 9;

    // for (i = 0; i < max; i++) {
    // for (j = 0; j < max; j++) {
    // int gugudan = calculateGugudan(i, j);
    // System.out.printf("%d x %d = %d\n", i + 1, j + 1, gugudan);
    // }
    // System.out.println("=================");
    // }

    // [7, 3, 5, 1]
    // LOOP START
    // 1-1. [3, 7, 5, 1]
    // 1-2. [3, 5, 7, 1]
    // 1-3. [3, 5, 1, 7]
    // 2-1. [3, 5, 1, 7]
    // 2-2. [3, 1, 5, 7]
    // 3-1. [1, 3, 5, 7]
    // END

    // int[] test = { 7, 3, 5, 1 };

    // for (int i = 0; i < test.length; i++) {
    //   for (int j = 0; j < test.length - 1 - i; j++) {
    //     if (test[j] > test[j + 1]) {
    //       int tmp = test[j];
    //       test[j] = test[j + 1];
    //       test[j + 1] = tmp;
    //     }
    //   }
    // }

    // Arrays.sort(test);
    /* Integer[] test = { 7, 3, 5, 1 };
    List<Integer> list = Arrays.asList(7, 3, 5, 1);
    
    List<Integer> list2 = Arrays.asList(test);
    
    for (Integer item : list) {
      System.out.println(item);
    }
    
    for (Integer item : list2) {
      System.out.println(item);
    } */

    int prime = 751;
    System.out.println(prime + " 이전 소수 : " + Helper.getPreviousPrime(prime));
    System.out.println(prime + " 다음 소수 : " + Helper.getNextPrime(prime));
  }
}