package my.sunghyuk.edabit;

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
  }
}