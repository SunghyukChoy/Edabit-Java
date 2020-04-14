package my.sunghyuk.edabit;

/**
 * Program
 */
public class Program {

  public static String doubleChar(String s) {
    String repeatCh = "";
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      repeatCh += "" + ch + ch;
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

  /*
	 * title : Phone Number Formatting
	 * link : https://edabit.com/challenge/sPz2LcPZyAiBHRgwX
	 */
  public static String formatPhoneNumber(int[] nums) {
    String firstWord = "(";
    String secondWord = " ";
    String thirdWord = "-";
    

    for(int i = 0; i <= 2; i++) {
      firstWord += ("" + nums[i]);
                  // 숫자를 문자로 변환하는 방법.
    }
    firstWord = firstWord + ")";
    
    for(int i = 3; i <= 5; i++) {
      secondWord += ("" + nums[i]);
    }

    for (int i = 6; i <= 9; i++) {
      thirdWord += ("" + nums[i]);
    }

    return firstWord + secondWord + thirdWord;
  }  
  
  public static int length(String str) {
    return str.length();
            //.length 아닌 length() 메서드.    
  } 

  
}