package my.sunghyuk.edabit;

/**
 * Hello world!
 *
 */
public class App {

    public static class IntegerHelper {

        private IntegerHelper() {}

        public static boolean isPrimeNumber(int value) {
            if (value < 2)
                return false;

            double sqrt = Math.sqrt(value);
            for (int i = 2; i <= sqrt; i++)
            {
                if (value % i == 0)
                    return false;
            }

            return true;
        }

        public static boolean isOdd(int value) {
            return value % 2 != 0;
        }

        public static boolean isEven(int value) {
            return !isOdd(value);
        }
    }

    public static void main(String[] args) {

        Integer val = Integer.valueOf(99);

        if (IntegerHelper.isPrimeNumber(val)) {
            // TODO
        }

        if (IntegerHelper.isEven(val)) {

        }
        /*
         * 정수만큼 별 찍는 로직 final String FULL_STAR = "★"; final String FULL_EMPTY_STAR =
         * "☆"; final String HALF_STAR = "별 반개";
         * 
         * 
         * int rate = 7; System.out.println("expected : ★★★별 반개☆");
         * 
         * System.out.print("actual : "); for (int i = 0; i < 10; i += 2) { int val =
         * (rate - i - 2); if(val >= 0) { System.out.print(FULL_STAR); } else if(val < 0
         * && val == -1){ System.out.print(HALF_STAR); } else {
         * System.out.print(FULL_EMPTY_STAR); } }
         */

        /*
         * int a = 0; int b = 5; System.out.println(a/b);
         */

        /*
         * String word = "abcde"; System.out.println(word.charAt(word.length()-1) +
         * word.substring(1, word.length()-1) + word.charAt(0));
         */

        /*
         * String num = "123a"; int parseint = Integer.parseInt(num);
         * System.out.println(parseint);
         */

        /*
         * String word = "Apple"; System.out.println(word.length());
         * System.out.println(word.substring(0, word.length()));
         */

        // double sqnum = Math.sqrt(100.0);
        // System.out.println(sqnum);

        

        /* int num = 43211234;

        // call
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            boolean result = isSymmetricalWithString(num);
        }
        long end = System.currentTimeMillis();
        printElapsedTime(start, end);

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            boolean result = isSymmetricalWithInteger(num);
        }
        end = System.currentTimeMillis();
        printElapsedTime(start, end); 
        */
        
        // System.out.println(Double.MIN_VALUE < -99999999);
        // System.out.println(Double.NEGATIVE_INFINITY < -99999999);
        // System.out.println(Double.MIN_NORMAL < -99999999);
        // System.out.println(Double.MIN_EXPONENT < -99999999);

        String str = "##112ab233z";
        str = str.replaceAll("([^0-9]+)([0-9]+)([^0-9]+)([0-9]+)([^0-9]+)", "$1$4$3$2$5");
        System.out.println(str);
        // System.out.println(str.matches("^#+.*[a-z]$"));
    }

    private static void printElapsedTime(long start, long end) {
        System.out.println("걸린 시간(초): " + (end - start));
    }

    static boolean isSymmetricalWithString(int num) {
        String numText = String.valueOf(num);

        for (int i = 0; i < numText.length() / 2; i++) {
            char firstIndex = numText.charAt(i);
            char lastIndex = numText.charAt(numText.length() - (i + 1));

            if (firstIndex != lastIndex) {
                return false;
            }
        }

        return true;
    }

    static boolean isSymmetricalWithInteger(int num) {
        int len = calculateIntegerLength(num);
		while (num > 10) {
            //int divider = (int) Math.pow(10, len - 1);
            int divider = calculatePow(10, len - 1);
			int firstIndex = num / divider; // 앞에 숫자 빼오기
			int lastIndex = num % 10; // 뒤에 숫자 빼오기

			if (firstIndex != lastIndex) {
				return false;
			}
			
			num -= divider * firstIndex;
			num /= 10;
			len -= 2;
		}

		return true;
    }

    private static int calculatePow(int m, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= m;
        }
        return result;
    }

    /**
     * 숫자의 길이를 리턴한다.
     * 
     * @param num
     * @return
     */
	private static int calculateIntegerLength(int num) {
		int len = 0;

		while (num != 0) {
			len++;
			num /= 10; // len = 1, 12 / len = 2, 1 / len = 3, 0 /
		}

		return len;
    }
    
    
}
