package my.sunghyuk.edabit.very_hard;

public class Program {
  private Program() {

  }

  /********************아직 못 품 ********************/
  /**
   * Recursion: Integer Digits Count
   * @see https://edabit.com/challenge/dreQhsnZJ7HGtsts5
   * @param n
   * @return 정수의 자릿수 리턴. 
   */
  public static int count(int n) {
    return n != 0 ? 1 + count(n / 10) : 0;
  }
}
