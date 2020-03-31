package my.sunghyuk.edabit;

/**
 * Program
 */
public class Program {

  public static String doubleChar(String s) {
    String repeatCh = "";
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      repeatCh += ch + ch;
      // System.out.println(repeatCh);
    }

    return repeatCh;
  }

  public static int sumOf1To10() {

    int result = 0;
    for (int i = 1; i <= 10; i++) {
      result += i;
    }
    return result;
  }

  public static String nameShuffle(String s) {
      /*  */

      String[] words = s.split(" ");

      return words[1] + " " + words[0];
  }

  
}