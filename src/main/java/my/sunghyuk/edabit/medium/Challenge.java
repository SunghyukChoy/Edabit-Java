package my.sunghyuk.edabit.medium;

public class Challenge {
  /**
   * Algorithms II: The Euclidean Algorithm
   * @see : https://edabit.com/challenge/HmicQW4LMYyNHXRzT
   * Function Recursive 에 관한 문제
   * 
   * @param a
   * @param b
   * @return
   */
  public static int euclidean(int a, int b) {
    // Ensure that "a" >= "b". If "a" < "b", swap them.
    if (a < b) {
      int c = b;
      b = a;
      a = c;
    }

    // Find the remainder. Divide "a" by "b" and set "r" as the remainder.
    int r = a % b;

    // Is "r" zero? If so terminate the function and return "b" (the second number).
    if (r == 0)
      return b;

    // Set "a" = "b" and "b" = "r" and start the algorithm over again.
    return euclidean(b, r);
	}
}