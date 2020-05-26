package my.sunghyuk.edabit;

import java.util.Arrays;

public class Test {
  public static void main(String[] ar) {
    /*
     * int a = 4/ 10; System.out.println(a);
     */
    String empty = "";
    System.out.println("empty의 길이 = " + empty.length());
    String reg = "ofofofggofchickenggoff";
    reg = reg.replaceAll("[`f`o`g]", "");
    System.out.println(reg);
    String[] example = {"index.html", "main.css"};
    String[] ex = example[0].split("[.]");
    String ex2 = ex[1];
    System.out.println(Arrays.toString(ex));
    System.out.println(ex2);
  }
}