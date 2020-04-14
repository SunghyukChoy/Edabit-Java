package my.sunghyuk.edabit;

/**
 * Challenge
 */
public class Challenge {

	/**
	 * Check point 1 : Logic Check point 2 : 어디까지 나눠야 하나
	 * 
	 * @param num
	 * @return
	 */
	public static boolean isPrimeByChoi(int num) {
		boolean flag = true;
		if (num == 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
				break;

			} else if (num % num == 0) {
				flag = true;
			}
		}
		return flag;
	}

	public static boolean isPrime(int num) {
		if (num == 1)
			return false;

		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	/**
	 * Title : 문제이름 Link : https://edabit.com/challenge/gdRGePvnZDfQGDS8g
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static boolean isEqual(int num1, int num2) {
		return num1 == num2;
	}

	public static int howManySeconds(int hours) {
		return hours * 3600;
	}

	/*
	 * title : The 3 Programmers Problem link :
	 * https://edabit.com/challenge/akHQKSkHT26TuA7Ka
	 */

	// 첫 답안 제출.
	/*
	 * public static int programmers(int one, int two, int three) { int maxNum = 0;
	 * int minNum = 0;
	 * 
	 * if (one >= two && one >= three) { maxNum = one; if (two >= three) { minNum =
	 * three; } else { minNum = two; } } else if (two >= one && two >= three) {
	 * maxNum = two; if (one >= three) { minNum = three; } else { minNum = one; } }
	 * else if (three >= one && three >= two) { maxNum = three; if (one >= two) {
	 * minNum = two; } else { minNum = one; } } return maxNum - minNum; }
	 */

	// 두 번째 제출 답안
	public static int programmers(int one, int two, int three) {

		int[] arr = new int[] { one, two, three };
		int maxNum = Integer.MIN_VALUE;
		// 0으로 초기화 시 매개변수 값으로 음수를 받게 되면 최대값은 0으로 출력될 수 있음.
		// 정수형 값 중 제일 작은 값 : Integer.MIN_VALUE;
		// 일종의 공식. 최대값을 구하는 변수의 초기값 Integer.MIN_VALUE;
		// maxNum = arr[0]으로 초기화 할 수도 있음.
		int minNum = Integer.MAX_VALUE;
		// 0으로 초기화 시 매개변수 값이 0보다 크면 최소값은 0으로 출력될 수 있음.
		// 정수형 값 중 제일 큰 값 : Integer.MAX.VALUE;
		// 일종의 공식. 최소값을 구하는 변수의 초기값 Integer.MAX_VALUE;
		// minNum = arr[0]으로 초기화 할 수도 있음.
		for (int i = 0; i < arr.length; i++) {
			// for(int i = 1; i < arr.length; i++). maxNum, minNum을 arr[0]으로 초기화 시 시작 index
			// 바꿔줌.
			maxNum = Math.max(maxNum, arr[i]);
			minNum = Math.min(minNum, arr[i]);
		}
		return maxNum - minNum;
	}

	// by Seon
	/*
	 * public static int programmers(int... arr) { // ... : 가변인자. 전달 받는 매겨 변수의 개수 유동적. 
	 * int maxNum = Integer.MIN_VALUE;
	 *  int minNum = Integer.MAX_VALUE;
	 *  for(int i = 0; i < arr.length; i++) {
	 * 		maxNum = Math.max(maxNum, arr[i]);
	 * 		minNum = Math.min(minNum, arr[i]);
	 *  }
	 *  	return maxNum - minNum;
	 *  }
	 */
		
	 // 미완성본 다시 생각해 볼 것.
	/* public static int equal(int a, int b, int c) {
		boolean aEqualB = (a == b) ? true : false;
		boolean aEqualC = (a == c) ? true : false;
		boolean bEqaulC = (b == c) ? true : false;

		
		int result = 0;
		if(aEqualB || aEqualC) {
			if(aEqualC || aEqualB) {
				result = 3;
			} else {
				result = 2;
			}
		}
		if(bEqaulC) {
			result = 2;
		}
		return result;
	} */

	 // by Seon
	public static int equal(int a, int b, int c) {
		int equalCount = a == b ? 2 : 0;
		
		if (equalCount == 2 && b == c) {
			 equalCount = 3;
		} else if (equalCount == 0 && b == c) {
			 equalCount = 2;
		} else if (equalCount == 0 && a == c) {
			 equalCount = 2;
		}
		return equalCount;
  }
  
  /*
	 * title : Repeating Letters N Times
   * link : https://edabit.com/challenge/HDk4PC9w6KPS3X25W
	*/  
  public static String repeat(String str, int n) {
		// 문자열의 길이만큼 돌림
		// n만큼 문자 반복함
    String repeatWord = "";
    for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < n; j++) {
				repeatWord += str.charAt(i);
			}
    }
    return repeatWord;    
	}

	/*
	 * title : Basic Calculator
   * link : https://edabit.com/challenge/gyfsGx7KrGLscxFrD
	*/ 

	/* public static int calculator(int num1, char operator, int num2) {
		int result = 0;
		if(operator == '+') {
			result = num1 + num2;
		} else if(operator == '-') {
			result = num1 - num2;			
		} else if(operator == '*') {
			result = num1 * num2;
		} else if(operator == '/') {
			if(num2 == 0) {
				result = 0;
			} else {
				result = num1 / num2;
			}
		}
		return result;
	} */

	public static int calculator(int num1, char operator, int num2) {
		switch(operator) {
			case '+' : return num1 + num2;
			case '-' : return num1 - num2;
			case '*' : return num1 * num2;			
			case '/' : return (num2 != 0) ? num1 / num2 : 0;
		}
		return 0;		// 잘못된 operator 입력 시 0으로 리턴.
	}
	
	/*
	 * title : How Many Vowels?
   * link : https://edabit.com/challenge/GBKphScsmDi9ek3ra
	*/ 

	public static int getVowelsCount(String str) {
		int vowelsCount = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				vowelsCount++;
			}
		}   
    return vowelsCount;
	} 
	
	/* public static int getVowelsCount(String str) {
		char[] vowels = {'a','e','i','o','u'};
		int vowelsCount = 0;

		for (int i = 0; i < str.length(); i++) {
			
				
			
		}
	} */
	
}