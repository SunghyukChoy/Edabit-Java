package my.sunghyuk.edabit;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        /* 정수만큼 별 찍는 로직
        final String FULL_STAR = "★";
        final String FULL_EMPTY_STAR = "☆";
        final String HALF_STAR = "별 반개";
        

        int rate = 7;
        System.out.println("expected : ★★★별 반개☆");

        System.out.print("actual : ");
        for (int i = 0; i < 10; i += 2) {
            int val = (rate - i - 2);
            if(val >= 0) {
                System.out.print(FULL_STAR);
            } else if(val < 0 && val == -1){
                System.out.print(HALF_STAR);
            } else {
                System.out.print(FULL_EMPTY_STAR);
            }
        } 
        */

        int a = 0;
        int b = 5;
        System.out.println(a/b);
    }
}
