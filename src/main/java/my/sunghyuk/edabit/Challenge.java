package my.sunghyuk.edabit;

import java.util.Arrays;

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
	 * 문제이름
	 * 
	 * @see https://edabit.com/challenge/gdRGePvnZDfQGDS8g
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

	/**
	 * The 3 Programmers Problem
	 * 
	 * @see https://edabit.com/challenge/akHQKSkHT26TuA7Ka
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
	 * public static int programmers(int... arr) { // ... : 가변인자. 전달 받는 매겨 변수의 개수
	 * 유동적. int maxNum = Integer.MIN_VALUE; int minNum = Integer.MAX_VALUE; for(int
	 * i = 0; i < arr.length; i++) { maxNum = Math.max(maxNum, arr[i]); minNum =
	 * Math.min(minNum, arr[i]); } return maxNum - minNum; }
	 */

	// 미완성본 다시 생각해 볼 것.
	/*
	 * public static int equal(int a, int b, int c) { boolean aEqualB = (a == b) ?
	 * true : false; boolean aEqualC = (a == c) ? true : false; boolean bEqaulC = (b
	 * == c) ? true : false;
	 * 
	 * 
	 * int result = 0; if(aEqualB || aEqualC) { if(aEqualC || aEqualB) { result = 3;
	 * } else { result = 2; } } if(bEqaulC) { result = 2; } return result; }
	 */

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

	/**
	 * Repeating Letters N Times
	 * 
	 * @see https://edabit.com/challenge/HDk4PC9w6KPS3X25W
	 * @param str
	 * @param n
	 * @return
	 */
	public static String repeat(String str, int n) {
		// 문자열의 길이만큼 돌림
		// n만큼 문자 반복함
		String repeatWord = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < n; j++) {
				repeatWord += str.charAt(i);
			}
		}
		return repeatWord;
	}

	/**
	 * Basic Calculator
	 * 
	 * @see https://edabit.com/challenge/gyfsGx7KrGLscxFrD
	 */

	/*
	 * public static int calculator(int num1, char operator, int num2) { int result
	 * = 0; if(operator == '+') { result = num1 + num2; } else if(operator == '-') {
	 * result = num1 - num2; } else if(operator == '*') { result = num1 * num2; }
	 * else if(operator == '/') { if(num2 == 0) { result = 0; } else { result = num1
	 * / num2; } } return result; }
	 */

	public static int calculator(int num1, char operator, int num2) {
		switch (operator) {
			case '+':
				return num1 + num2;
			case '-':
				return num1 - num2;
			case '*':
				return num1 * num2;
			case '/':
				return (num2 != 0) ? num1 / num2 : 0;
		}
		return 0; // 잘못된 operator 입력 시 0으로 리턴.
	}

	/**
	 * How Many Vowels?
	 * 
	 * @see https://edabit.com/challenge/GBKphScsmDi9ek3ra
	 */

	public static int getVowelsCount(String str) {
		int vowelsCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vowelsCount++;
			}
		}
		return vowelsCount;
	}

	/*
	 * 다시 풀어볼 것. 위의 if문의 반복되는 부분을 배열 이용해서 해결해 보기 public static int
	 * getVowelsCount(String str) { char[] vowels = {'a','e','i','o','u'}; int
	 * vowelsCount = 0; * for (int i = 0; i < str.length(); i++) {
	 * 
	 * 
	 * 
	 * } }
	 */

	/**
	 * Scoring System
	 * 
	 * @see https://edabit.com/challenge/FRtmuYD26pcQWFR7k
	 */

	public static int[] calculateScores(String str) {
		// 문재 갯수를 정수로 리턴
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A') {
				aCount++;
			} else if (str.charAt(i) == 'B') {
				bCount++;
			} else if (str.charAt(i) == 'C') {
				cCount++;
			}
		}

		int[] result = { aCount, bCount, cCount };
		// call by value로 값 '0' 복사.
		// 자료형이 기본형인 경우 call by value
		// 자료형이 클래스형인 경우 call by ref.
		return result;
	}

	private static final int INDEX_OF_A = 0;
	private static final int INDEX_OF_B = 1;
	private static final int INDEX_OF_C = 2;

	public static int[] calculateScoresDevelop(String str) {
		int[] result = { 0, 0, 0 };

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			switch (ch) {
				case 'A':
					result[INDEX_OF_A]++;
					break;
				case 'B':
					result[INDEX_OF_B]++;
					break;
				case 'C':
					result[INDEX_OF_C]++;
					break;
				default:
					break;
			}
		}
		return result;
	}

	/*
	 * Reverse the Order of a String link :
	 * https://edabit.com/challenge/5gPCp7v7iDWZvb4YQ
	 */

	public static String reverse(final String str) {
		// str을 char 하나씩 뽑아 배열로 저장 # 필요없음
		// char[] words = str.toCharArray(); // 문자열을 char 배열로 저장하는 방법

		// 그 배열을 역순으로 출력
		String reverse = "";

		// #1 방법 // example : str = Hello World!
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		// #2 방법
		for (int i = 0; i < str.length(); i++) {
			reverse += str.charAt(str.length() - i - 1);
		}

		// #2-1 방법 : StringBuffer
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			buffer.append(str.charAt(str.length() - i - 1));
		}

		return buffer.toString(); // <-- 이 시점에 String 형으로 메모리로 할당되서 사용 가능

		// #3 방법
		// StringBuffer bufReverse = new StringBuffer(str);
		// return bufReverse.reverse().toString();
	}

	public static void exampleImmutable() {
		// 번외
		// StringBuffer, StringBuilder

		// 불변객체 : Immutable Object => String, LocalDateTime : 대표적인 불변객체
		String x = "1234";
		x += "567"; // 1234567
		x += "777";
		x += "888";
		// 문자열 추가할 때마다 메모리 할당, 메모리 해제 작업 반복. 문자열이 길어질수록 자원 소모 심해짐.

		// char[]
		/*
		 * 
		 * [ String x ] #12 <-- memory address <-- Release(메모리 해제) : Garbage Collector 가
		 * 회수 index 0 1 2 3 memory value [1][2][3][4] + [5][6][7] // wrong. 기존 주소가 갖고 있던
		 * 값에 추가하는 것 아님.
		 * 
		 * // x에 문자열 추가 시 #12 메모리 해제 #223 // 메모리 할당 다시. 새로운 주소. index 0 1 2 3 4 5 6
		 * memory value [1][2][3][4][5][6][7]
		 * 
		 * // StringBuffer, StringBuilder 클래스 객체는 메모리를 다시 할당하지 않고도 문자열 추가 가능.
		 */
	}

	/**
	 * Shapes With N Sides
	 * 
	 * @see https://edabit.com/challenge/odJPfYRD3kSpE45Jf
	 */
	public static String nSidedShape(int n) {
		String[] result = { "circle", "semi-circle", "triangle", "square", "pentagon", "hexagon", "heptagon", "octagon",
				"nonagon", "decagon" };
		return result[n - 1];
	}

	/**
	 * Hashes and Pluses
	 * 
	 * @see https://edabit.com/challenge/s8RHRY9hfmvYMuaeC
	 */
	public static int[] hashPlusCount(String s) {
		int hashCount = 0;
		int plusCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '#') {
				hashCount++;
			} else if (s.charAt(i) == '+') {
				plusCount++;
			}
		}
		int[] result = { hashCount, plusCount };
		return result;
	}

	/**
	 * Special Arrays
	 * 
	 * @see https://edabit.com/challenge/YmeiRhzaiR3MCPBiT
	 * @param arr
	 * @return all element are special (boolean)
	 */
	public static boolean isSpecialArray(int[] arr) {
		// 배열의 짝수 인덱스 == 짝수 && 홀수 인덱스 == 홀수 return true
		// otherwise return false. 인덱스 0은 짝수 인덱스.

		/*
		 * boolean evenFlag, oddFlag;
		 * 
		 * for (int i = 0; i < arr.length; i++) { if (arr[i] % 2 == 0) { evenFlag =
		 * true; i++; } else if (arr[i] % 2 != 0) { evenFlag = false; i++; } }
		 * 
		 * return isEven(arr) && isOdd(arr);
		 */

		for (int i = 0; i < arr.length; i++) {
			if (isEven(i) && !isEven(arr[i])) { // if index is even and element is not even
				return false;
			} else if (isOdd(i) && !isOdd(arr[i])) { // if index is odd and element is not odd
				return false;
			}
		}

		return true;
	}

	private static boolean isEven(int value) {
		return value % 2 == 0;
	}

	private static boolean isOdd(int value) {
		return !isEven(value);
	}

	private static boolean isEven(int[] arr) {

		for (int i = 0; i < arr.length; i += 2) {
			if (arr[i] % 2 != 0) {
				return false;
			}
		}
		return true;
	}

	private static boolean isOdd(int[] arr) {

		for (int i = 1; i < arr.length; i += 2) {
			if (arr[i] % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Valid Zip Code
	 * 
	 * @see https://edabit.com/challenge/SmKPaHy5uY2gMk9na
	 * @param zip
	 * @return
	 */
	public static boolean isValid(String zip) {
		// 1. 문자열이 다 숫자인가?
		// 2. 공백이 있는가?
		// 3. 5자리인가?
		// 문자열 zip이 다섯자리의 숫자인가 return true; otherwise return false;
		try { // zip 문자열에 숫자가 아닌 문자 존재 시 NumberFormatException 에러 발생
			int zipNum = Integer.parseInt(zip); // 문자열을 정수로 변환.

			// if (!(zipNum >= 10000 && zipNum <= 99999)) {
			// "06636"의 경우 "6636"과 구분 불가.
			// return false;
			// }
			if (zip.length() != 5) { // 문자열의 길이가 5가 아니면 false return
				return false;
			}
			return true; // 위의 경우들에 해당하지 않으면 true

		} catch (NumberFormatException e) {
			return false;
		}
	}

	// 유효성 검사를 하는 일반적인 형태, 방법
	// 조건을 하나씩 적용하여 조건에 따라 return 값 설정
	public static boolean isValidation(String zip) {

		if (isAnyNotNumberCharacter(zip))
			return false;

		if (isAnyEmptySpaceCharacter(zip))
			return false;

		if (zip.length() != 5)
			return false;

		return true; // 위의 경우가 아닐 때 true 리턴
	}

	private static boolean isAnyEmptySpaceCharacter(String zip) {
		// TODO: 구현 필요 -> 문자들에 공백(" ")이 존재하는가
		return true;
	}

	private static boolean isAnyNotNumberCharacter(String zip) {
		// TODO: 구현 필요 -> 문자열이 숫자가 아닌게 존재하는가
		return true;
	}

	// 메시지 출력 메서드
	public static String isValidationStr(String zip) {

		String message = "";

		if (isAnyEmptySpaceCharacter(zip))
			message += "문자열이 다 숫자가 아닙니다.\n";

		if (isAnyNotNumberCharacter(zip))
			message += "문자열에 공백이 있습니다.\n";

		if (zip.length() != 5)
			message += "문자열이 5자리가 아닙니다.\n";

		return message;
	}

	/**
	 * Vowel Replacer
	 * 
	 * @see https://edabit.com/challenge/iW7rtor54mbFQ2RrZ
	 * @param str
	 * @param ch
	 * @return
	 */
	public static String replaceVowels(String str, char ch) {
		// str 문자열에서 모음을 ch 문자로.

		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (isVowel(charArray[i])) {
				charArray[i] = ch;
			}
		}
		// String result = "";
		// for (int i = 0; i < charArray.length; i++) {
		// result += charArray[i];
		// }
		// return result;

		return new String(charArray); // char 배열을 문자열로 반환
	}

	private static boolean isVowel(char ch) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for (int i = 0; i < vowels.length; i++) {
			if (vowels[i] == ch)
				return true;
		}
		return false;
	}

	/**
	 * Capture the Rook
	 * 
	 * @see https://edabit.com/challenge/rYD9NTBmNhaPM6wx2
	 * @param rooks
	 * @return
	 */
	public static boolean canCapture(String[] rooks) {
		// 1. 배열의 0번과 1번 인덱스의 문자열을 비교
		// 2. 문자열의 첫번째 문자(문자)가 같거나 두번째 문자(숫자)가 같으면 true
		// 3. otherwise false

		if (rooks[0].charAt(0) == rooks[1].charAt(0) || rooks[0].charAt(1) == rooks[1].charAt(1)) {
			return true;
		}
		return false;
	}

	/**
	 * Check if String Ending Matches Second String
	 * 
	 * @see https://edabit.com/challenge/PZnwXraqBPYv7w4Sm
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean checkEnding(String str1, String str2) {
		// 1. str1과 str2의 마지막 문자가 같으면 true. otherwise false
		if (str1.charAt(str1.length() - 1) == str2.charAt(str2.length() - 1)) {
			return true;
		}
		return false;
	}

	/**
	 * Spaces Between Each Character
	 * 
	 * @see https://edabit.com/challenge/ryEdPW2eqyngyWayy
	 * @param str
	 * @return
	 */
	public static String spaceMeOut(String str) {
		// str 문자열 사이에 공백 넣기
		char[] characters = str.toCharArray();
		String spaceWord = "";

		for (int i = 1; i < characters.length; i++) {
			spaceWord += characters[i - 1] + " ";
		}
		spaceWord = spaceWord + str.charAt(str.length() - 1);
		return spaceWord;
	}

	/**
	 * Difference of Max and Min Numbers in Array
	 * 
	 * @see https://edabit.com/challenge/hymPkXdhmDQLe87QT
	 * @param arr
	 * @return
	 */
	public static int differenceMaxMin(int[] arr) {
		int maxValue = Integer.MIN_VALUE;
		int minValue = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= maxValue) {
				maxValue = arr[i];
			}
			if (arr[i] <= minValue) {
				minValue = arr[i];
			}
		}
		return maxValue - minValue;

		// 이거 왜 안 되는지 모르겠음..
		// int maxValue = arr[0];
		// int minValue = arr[0];
		// for (int i = 1; i < arr.length; i++) {
		// if (arr[i] >= arr[i - 1]) {
		// maxValue = arr[i];
		// }
		// if (arr[i] <= arr[i - 1]) {
		// minValue = arr[i];
		// } else {
		// minValue = arr[0];
		// }
		// }
		// System.out.println(maxValue);
		// System.out.println(minValue);
		// return maxValue - minValue;
	}

	/**
	 * Double Letters
	 * 
	 * @see https://edabit.com/challenge/EaWY5d2pYBckrkAnS
	 * @param word
	 * @return
	 */
	public static boolean doubleLetters(String word) {
		// 문자열에 중복되는 문자가 있으면 return true; otherwise false;
		char[] charArray = word.toCharArray();
		for (int i = 1; i < charArray.length; i++) {
			if (charArray[i] == charArray[i - 1]) {
				return true;
			}
		}
		return false;
	}

	/************** 다시 풀 것 ********************************/
	// 모르겠다.. 근본없는 문법...
	/**
	 * Even Number Generator
	 * 
	 * @see https://edabit.com/challenge/jwXx478haGbZpRCWQ
	 * @param num
	 * @return
	 */
	public static int[] findEvenNums(int num) {
		// 1부터 num까지의 짝수를 배열로 리턴
		// num까지 짝수가 없으면 비어있는 배열로 리턴
		int[] evenArray = new int[] {};
		if (num == 1) {
			return evenArray;
		}

		// num : 2 --> value : 2
		// num : 3 --> value : 2
		// num : 4 --> value : 2, 4
		// num : 5 --> value : 2, 4
		// num : 6 --> value : 2, 4, 6

		for (int i = 1; i < (int) (num / 2); i++) {
			evenArray[i] = i * 2;
		}
		evenArray[0] = 2;
		return evenArray;
	}

	/************** 다시 풀 것 ********************************/
	/**
	 * Triangular Number Sequence
	 * 
	 * @see https://edabit.com/challenge/4kEHkvobTA4i6AQRE
	 * @param n
	 * @return
	 */
	public static int triangle(int n) {
		// 1. 0번쨰 인덱스 값 : 1
		// 2. 0번째 인덱스부터 2,3,4,5,6... 더해서 n번쨰 인덱스 값 구하기
		// 3. {1, 3, 6, 10, 15, 21.....} 순
		int result = 0;
		int addValue = 0;

		return 0;
	}

	/**
	 * Name Greeting!
	 * 
	 * @see https://edabit.com/challenge/JAtN6KLtahAkmT3n3
	 */
	public static String helloName(String name) {
		return "Hello " + name + "!";
	}

	/**
	 * Divides Evenly
	 * 
	 * @see https://edabit.com/challenge/dLXXzJ5hkLAzkyDCm
	 * @param a
	 * @param b
	 * @return
	 */

	public static boolean dividesEvenly(int a, int b) {
		if (a % b == 0) {
			return true;
		}
		return false;
	}

	/**
	 * Return the Middle Character(s) of a String
	 * 
	 * @see https://edabit.com/challenge/NrMGhrarTfpYSbr84
	 * @param word
	 * @return
	 */
	// 원시적인 방법으로 풀음..
	public static String getMiddle(String word) {
		// 1. 문자열의 가운데 문자 출력
		// 2. 문자열의 길이가 짝수면 가운데 문자 2개 출력
		// 3. 문자열의 길이가 홀수면 가운데 문자 1개 출력
		String middleCharacter = "";

		if (word.length() % 2 == 0) {
			middleCharacter = "" + word.charAt((word.length() / 2) - 1) + word.charAt(word.length() / 2);
		} else if (word.length() % 2 != 0) {
			middleCharacter = "" + word.charAt((word.length() - 1) / 2);
		}
		return middleCharacter;
	}

	/************** 다시 풀 것 ********************************/
	/**
	 * Nth Smallest Element
	 * 
	 * @see https://edabit.com/challenge/zgBjnxQw9MHTBHLED
	 * @param arr
	 * @param n
	 * @return
	 */
	// 배열 버블 정렬 몰라서 메서드 씀.
	// import java.util.Arrays; 제출 시 추가
	public static int nthSmallest(int[] arr, int n) {
		// 1. arr 배열에서 n번째로 작은 수 출력
		// 2. n이 배열의 길이보다 클 켱우 return -1
		try {
			Arrays.parallelSort(arr);
			return arr[n - 1];
		} catch (Exception e) {
			return -1;
		}
	}

	/**
	 * Say "Hello" Say "Bye"
	 * 
	 * @see https://edabit.com/challenge/zFccarRuia5zq4rhP
	 * @param name
	 * @param num
	 * @return
	 */
	public static String sayHelloBye(String name, int num) {
		// num이 1이면 Hello 0이면 Bye
		// 인사말 + name. name의 첫문자는 대문자로
		String HelloBye = (num == 1) ? "Hello" : "Bye";
		char firstCh = Character.toUpperCase(name.charAt(0));
		// char 타입은 기본 자료형. 클래스에 접근하여 메서드 사용.
		// int -> Integer, boolean -> Boolean .....
		String upperCaseName = firstCh + name.substring(1, name.length());

		return HelloBye + " " + upperCaseName;
	}

	/**
	 * Is the Average of All Elements a Whole Number?
	 * 
	 * @see https://edabit.com/challenge/yk7GqGcCpFgQrk8fH
	 * @param arr
	 * @return
	 */
	public static boolean isAvgWhole(int[] arr) {
		// 배열의 평균값이 정수이면 true. 실수이면 false
		int arrSum = 0;
		for (int i = 0; i < arr.length; i++) {
			arrSum += arr[i];
		}
		double avg = (double) arrSum / arr.length;
		// 캐스팅 없이 연산 시 결과로 int 값이 나오기 때문에 그 값을 double 타입의 변수에 담아도 .00 값으로 담기게 됨.

		// 타입이 다른 수를 연산할 때 범위가 더 큰 타입으로 캐스팅 됨.
		// arr.length의 타입이 double로 캐스팅
		// int, double --> double
		// long, double --> double
		// float, double --> double

		int avgInt = (int) avg;
		// if(avg - avgInt > 0) {
		// return false;
		// }
		// return true;

		return avg - avgInt == 0;
	}

	/**
	 * Return the Index of the First Vowel
	 * 
	 * @see https://edabit.com/challenge/MsJzAHPmmmcwF4iCr
	 * @param str
	 * @return
	 */
	public static int firstVowel(String str) {
		// 첫 번째 모음 인덱스 번호 출력
		char[] vowels = new char[] { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (str.charAt(i) == vowels[j]) {
					return i;
				}
			}
		}
		return -1; // if문의 조건에 부합하지 않는 경우에도 return이 필요하므로 return 작성.
	}

	/**
	 * Re-Form the Word
	 * 
	 * @see https://edabit.com/challenge/R3PnRquBPADEqDxZg
	 * @param left
	 * @param right
	 * @return
	 */
	public static String getWord(String left, String right) {
		// 문자열 두 개 붙이기. left의 첫문자는 대문자로
		String leftUpperCase = Character.toUpperCase(left.charAt(0)) + left.substring(1, left.length());
		return leftUpperCase + right;
	}

	/**
	 * Index Shuffle
	 * 
	 * @see https://edabit.com/challenge/BZzAm9KXuB993p35r
	 * @param str
	 * @return
	 */
	public static String indexShuffle(String str) {
		// 짝수 번째 인덱스와 홀수 번째 인덱스 문자끼리 묶어서 리턴. 0은 짝수 취급.
		String evenString = "";
		String oddString = "";

		for (int i = 0; i < str.length(); i = i + 2) {
			evenString += str.charAt(i);
		}

		for (int i = 1; i < str.length(); i = i + 2) {
			oddString += str.charAt(i);
		}

		return evenString + oddString;
	}

	/**
	 * Between Words
	 * 
	 * @see https://edabit.com/challenge/YjeGKZwXsdCo3sr7a
	 * @param first
	 * @param last
	 * @param word
	 * @return
	 */
	public static boolean isBetween(String first, String last, String word) {
		// 알파벳순으로 정렬 시 word가 first와 last 사이에 오면 true; otherwise false;
		String[] sortByAlphabet = new String[] { first, last, word };
		Arrays.sort(sortByAlphabet);	// 배열을 오름차순으로 정렬
		return sortByAlphabet[1] == word;
	}

	/**
	 * Palindrome?
	 * 
	 * @see https://edabit.com/challenge/cwLnTvxpBX5espEgs
	 * @param str
	 * @return
	 */
	public static boolean checkPalindrome(String str) {
		// 문자열의 첫문자와 끝문자가 같으면 true, 다르면 false;
		return str.charAt(0) == str.charAt(str.length()-1);
	}
}