package my.sunghyuk.edabit.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Challenge
 */
public class Challenge {

	/**
	 * Check if a Number is Prime
	 * 
	 * @see https://edabit.com/challenge/ePj2zup56kZrRbhDX
	 * @param num
	 * @return
	 */
	public static boolean isPrimeByChoi(int num) {
		// 1. num이 소수이면 return true;
		// 2. 숫자 1은 소수에서 제외
		boolean flag = true;
		if (num == 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) { // num이 어떠한 숫자(i)로 나누어지면 소수가 아님.
				flag = false;
				break; // 어떠한 숫자에서 나누어저 false를 반환하면 더 이상 진행할 필요가 없으므로 break

			} else { // 자기 자신으로만 나누어지면 소수
				flag = true;
			}
		}
		return flag;
	}

	public static boolean isPrime(int num) {
		if (num == 1)
			return false;

		for (int i = 2; i <= Math.sqrt(num); i++) {
			// Math.sqrt(100.0) -> 10.0 반환 double 타입.
			// num이 100이라고 했을 때 100은 10의 제곱수(어떠한 수로 나뉘어짐)이고
			// 10이 어떠한 수(i)로 나누어 진다면 소수가 아님을 나타내므로
			// 굳이 100까지 연산할 필요 없음.
			if (num % i == 0)
				return false;
		}
		return true;
	}

	/**
	 * The 3 Programmers Problem
	 * 
	 * @see https://edabit.com/challenge/akHQKSkHT26TuA7Ka
	 * @param one
	 * @param two
	 * @param three
	 * @return
	 */

	// 첫 답안 제출.
	// public static int programmers(int one, int two, int three) {
	// int maxNum = 0;
	// int minNum = 0;

	// if (one >= two && one >= three) {
	// maxNum = one;
	// if (two >= three) {
	// minNum = three;
	// } else {
	// minNum = two;
	// }
	// } else if (two >= one && two >= three) {
	// maxNum = two;
	// if (one >= three) {
	// minNum = three;
	// } else {
	// minNum = one;
	// }
	// } else if (three >= one && three >= two) {
	// maxNum = three;
	// if (one >= two) {
	// minNum = two;
	// } else {
	// minNum = one;
	// }
	// }
	// return maxNum - minNum;
	// }

	// 두 번째 제출 답안
	public static int programmers(int one, int two, int three) {
		// 1. 세 수 중 가장 큰 수와 가장 작은 수의 차.

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
			// 인덱스 돌면서 maxNum, minNum과의 비교, 각각 더 큰 수와 작은 수 반환
		}
		return maxNum - minNum;
	}

	// by Seon
	public static int programmers(int... arr) {
		// ... : 가변인자. 전달 받는 매겨 변수의 개수 유동적.
		int maxNum = Integer.MIN_VALUE;
		int minNum = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			maxNum = Math.max(maxNum, arr[i]);
			minNum = Math.min(minNum, arr[i]);
		}
		return maxNum - minNum;
	}

	public static int programmersOtherSol1(int one, int two, int three) {
		int min = Math.min(one, Math.min(two, three));
		int max = Math.max(one, Math.max(two, three));
		return max - min;
		// return Math.max(one, Math.max(two, three)) - Math.min(one, Math.min(two,
		// three));
	}

	public static int programmerOtherSol2(int one, int two, int three) {
		int[] arr = { one, two, three };
		Arrays.sort(arr); // 오름차순으로 정렬. 값이 뒤로 갈수록 커짐.
		return arr[2] - arr[0];
	}

	/**
	 * Equality of 3 Values
	 * 
	 * @see https://edabit.com/challenge/nfc7H9CQFqJp54uEh
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	// public static int equal(int a, int b, int c) {
	// // 1. 몇 개의 수가 같은 숫자인가..
	// // 2. a,b 가 같으면 2 리턴, 같은 수가 없으면 0 리턴..

	// boolean aEqualB = (a == b) ? true : false;
	// boolean aEqualC = (a == c) ? true : false;
	// boolean bEqaulC = (b == c) ? true : false;

	// int result = 0;
	// if (aEqualB || aEqualC) {
	// if (aEqualC || aEqualB) {
	// result = 3;
	// } else {
	// result = 2;
	// }
	// }
	// if (bEqaulC) {
	// result = 2;
	// }
	// return result;
	// }

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

	public static int equalOtherSol(int a, int b, int c) {
		HashSet<Integer> equals = new HashSet<Integer>();

		equals.add(a);
		equals.add(b);
		equals.add(c);

		if (equals.size() == 1) {
			return 3;
		} else if (equals.size() == 2) {
			return 2;
		} else {
			return 0;
		}
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
		// 1. 문자열의 각 문자를 n번만큼 반복.
		String repeatWord = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < n; j++) {
				repeatWord += str.charAt(i);
			}
		}
		return repeatWord;
	}

	public static String repeatOtherSol(String str, int n) {
		String[] splitedWord = str.split("");
		StringBuilder builder = new StringBuilder();
		for (String ch : splitedWord) {
			for (int i = 0; i < n; i++) {
				builder.append(ch);
			}
		}
		return builder.toString();
	}

	/**
	 * Basic Calculator
	 * 
	 * @see https://edabit.com/challenge/gyfsGx7KrGLscxFrD
	 * @param num1
	 * @param operator
	 * @param num2
	 * @return
	 */
	// public static int calculator(int num1, char operator, int num2) {
	// int result = 0;
	// if (operator == '+') {
	// result = num1 + num2;
	// } else if (operator == '-') {
	// result = num1 - num2;
	// } else if (operator == '*') {
	// result = num1 * num2;
	// } else if (operator == '/') {
	// if (num2 == 0) {
	// result = 0;
	// } else {
	// result = num1 / num2;
	// }
	// }
	// return result;
	// }

	public static int calculator(int num1, char operator, int num2) {
		// 1. operator를 이용하여 num1과 num2 연산.
		switch (operator) {
			case '+':
				return num1 + num2;
			case '-':
				return num1 - num2;
			case '*':
				return num1 * num2;
			case '/':
				return (num2 != 0) ? num1 / num2 : 0;
			default:
				return 0;
		}
	}

	/**
	 * How Many Vowels?
	 * 
	 * @see https://edabit.com/challenge/GBKphScsmDi9ek3ra
	 * @param str
	 * @return
	 */
	public static int getVowelsCount2(String str) {
		// 1. 문자열에 있는 모음 갯수 리턴
		int vowelsCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vowelsCount++;
			}
		}
		return vowelsCount;
	}

	// 반복되는 부분 반복문 이용하여 풀어보기
	public static int getVowelsCount(String str) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		int vowelsCount = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (str.charAt(i) == vowels[j]) {
					vowelsCount++;
				}
			}
		}
		return vowelsCount;
	}

	public static int getVowelsCountOtherSol(String str) {
		return str.replaceAll("[^aeiouAEIOU]", "").length();
	}

	public static int getVowelsCountOtherSol2(String str) {
		int vowelsCount = 0;

		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					vowelsCount++;
					break;
				default:
					break;
			}
		}
		return vowelsCount;
	}

	/**
	 * Scoring System
	 * 
	 * @see https://edabit.com/challenge/FRtmuYD26pcQWFR7k
	 * @param str
	 * @return
	 */
	// 1. A, B, C 각 문자의 갯수를 배열 형태로 리턴, A는 배열의 0번, B는 1번, C는 2번 인덱스
	// 2. str = "ABBACCCCAC" -> [3, 2, 5] 리턴
	public static int[] calculateScores(String str) {

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

	public static int[] calculateScoresOtherSol(String s) {
		return new int[] { s.replaceAll("[^A]", "").length(), s.replaceAll("[^B]", "").length(),
				s.replaceAll("[^C]", "").length() };
	}

	/**
	 * Reverse the Order of a String
	 * 
	 * @see https://edabit.com/challenge/5gPCp7v7iDWZvb4YQ
	 * @param str
	 * @return
	 */
	// 1. 문자열을 반대로 출력.
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

	/**
	 * Even Number Generator
	 * 
	 * @see https://edabit.com/challenge/jwXx478haGbZpRCWQ
	 * @param num
	 * @return
	 */
	// 1부터 num까지의 짝수를 배열로 리턴
	// num까지 짝수가 없으면 비어있는 배열로 리턴
	public static int[] findEvenNums(int num) {

		// num : 2 --> value : 2
		// num : 3 --> value : 2
		// num : 4 --> value : 2, 4
		// num : 5 --> value : 2, 4
		// num : 6 --> value : 2, 4, 6

		int[] evens = new int[num / 2];
		// num이 1 이하라면 배열의 길이가 0이므로 빈 배열 리턴

		for (int i = 0; i < evens.length; i++) {
			evens[i] = (i + 1) * 2;
		}
		return evens;
	}

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
		// 4. 0 {1, 3, 6, 10, ...}

		// start value 'result' with 1
		int result = 1;

		// first loop add 2
		// add value to result
		// second loop add 3
		// add value to result
		// ..
		// n loop add n + 1
		// add value to result
		for (int i = 2; i < n + 1; i++) {
			result += i;
		}

		return result;

		// int result = 0;

		// for (int i = 0; i < n; i++) {
		// result += 1 + i;
		// }
		// return result;
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
		return -1;
		// if문의 조건에 부합하지 않는 경우에도 return이 필요하므로 return 작성.
		// 인덱스가 가질 수 없는 숫자인 -1로 작성하였음..

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
		Arrays.sort(sortByAlphabet); // 배열을 오름차순으로 정렬
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
		return str.charAt(0) == str.charAt(str.length() - 1);
	}

	/**
	 * Join Two Portions of a Path
	 * 
	 * @see https://edabit.com/challenge/CDuD3xGtWRhnFzAP2
	 * @param portion1
	 * @param portion2
	 * @return
	 */
	public static String joinPath(String portion1, String portion2) {
		// 두 문자열 합치기. 중간에 /는 하나만. /가 없으면 추가. 중복되면 하나만.
		// if-only문만 사용해서 푸는 것 피하기
		String revmoveSlash1 = portion1.replaceAll("[/]", "");
		String revmoveSlash2 = portion2.replaceAll("[/]", "");
		System.out.println(revmoveSlash1 + "/" + revmoveSlash2);
		return revmoveSlash1 + "/" + revmoveSlash2;
	}

	/**
	 * Index Multiplier
	 * 
	 * @see https://edabit.com/challenge/YMLm3DpuZXHFDAnou
	 * @param arr
	 * @return
	 */
	public static int indexMultiplier(int[] arr) {
		// 배열의 각 값과 인덱스 번호를 곱한 후 총합 리턴
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += (arr[i] * i);
		}
		return sum;
	}

	/**************** 다시 풀 것. for문 이용하여 다시 풀 것. */
	/**
	 * Concatenating Two Integer Arrays
	 * 
	 * @see https://edabit.com/challenge/E2WdAPmgNJnbL5RvF
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	// 1. 두 배열 합치기
	public static int[] concat(int[] arr1, int[] arr2) {

		int[] concatArray = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, concatArray, 0, arr1.length);
		System.out.println(Arrays.toString(concatArray));
		// 배열의 요소를 출력하는 방법.
		System.arraycopy(arr2, 0, concatArray, arr1.length, arr2.length);
		// System.arraycopy(원본, 복사할 값을 보낼 원본의 시작 인덱스, 사본, 복사할 값을 받을 사본 시작 인덱스, 복사할 원본의
		// 요소 갯수);
		return concatArray;
	}

	/**
	 * Find the Smallest and Biggest Numbers
	 * 
	 * @see https://edabit.com/challenge/J4Yop3GjeZELWeoqT
	 * @param arr
	 * @return
	 */
	// 1. 배열에서 가장 작은 수와 가장 큰 수 출력 return {가장 작은 수, 가장 큰 수}
	public static double[] minMax(double[] arr) {
		double minValue = Double.MAX_VALUE;
		double maxValue = Double.NEGATIVE_INFINITY;
		// MIN_VALUE는 가장 작지 않다... 말이랑 안맞는 자바의 좋은 예
		// Double의 범위에서 가장 작은 값.

		for (int i = 0; i < arr.length; i++) {
			minValue = Math.min(minValue, arr[i]);
			maxValue = Math.max(maxValue, arr[i]);

		}
		double[] minMaxArray = new double[] { minValue, maxValue };
		return minMaxArray;
	}

	/**
	 * Amplify the Multiples of Four
	 * 
	 * @see https://edabit.com/challenge/XD6bQFpCZWiAMPanQ
	 * @param num
	 * @return
	 */
	public static int[] amplify(int num) {
		// 1. num의 길이를 갖는 배열 생성
		// 2. 배열의 값들은 1,2,3,4... 오름차순
		// 3. 4의 배수는 4의 배수x10의 값.
		int[] ampNumbers = new int[num];
		for (int i = 0; i < num; i++) {
			ampNumbers[i] = i + 1;
			if (ampNumbers[i] % 4 == 0) {
				ampNumbers[i] = (i + 1) * 10;
			}
		}
		return ampNumbers;
	}

	/**
	 * Is the Number Symmetrical?
	 * 
	 * @see https://edabit.com/challenge/gzjQoZY6mYRBwDv2Q
	 * @param num
	 * @return
	 */
	public static boolean isSymmetrical(int num) {
		// 1. num이 좌우반전해도 같은 숫자이면 true, 아니면 false
		// `좌우반전`을 어떻게 컴퓨터가 알아들을 수 있는 로직으로 표현할거냐?
		//
		// 2. 12321 -> true, 12345 -> false.
		// String numText = String.valueOf(num);

		// for (int i = 0; i < numText.length() / 2; i++) {
		// char firstIndex = numText.charAt(i);
		// char lastIndex = numText.charAt(numText.length() - (i + 1));

		// if (firstIndex != lastIndex) {
		// return false;
		// }
		// }
		// return true;

		// num = 12321 divider = 10000 10 ^ 4
		// num = 232 divider = 100 10 ^ 2
		// num = 3 END

		// int len = String.valueOf(num).length(); // 1.

		// num = 3223 divider = 1000 10 ^ 3
		// num = 22 divider = 10 10 ^ 1
		// num = 2 END
		System.out.println("-----------------------");

		int len = calculateIntegerLength(num);
		while (num > 10) {
			int divider = calculatePow(10, len - 1);
			int firstIndex = num / divider; // 앞에 숫자 빼오기
			int lastIndex = num % 10; // 뒤에 숫자 빼오기

			System.out.printf("num=%d, divider=%d, len=%d, firstIndex=%d, lastIndex=%d\n", num, divider, len, firstIndex,
					lastIndex);

			if (firstIndex != lastIndex) {
				return false;
			}

			num -= divider * firstIndex;
			num /= 10;
			len -= 2;
		}

		return true;
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

	/**
	 * 제곱 숫자를 리턴한다, 형변환 이슈로 인한 속도 문제 해결
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	private static int calculatePow(int m, int n) {
		int result = 1;
		for (int i = 0; i < n; i++) {
			result *= m;
		}
		return result;
	}

	/**
	 * Transforming Words into Binary Strings
	 * 
	 * @see https://edabit.com/challenge/jwzMsyo2tbgn2KbGQ
	 * @param str
	 * @return
	 */
	// 1. a부터 m까지의 문자는 "0" 출력
	// 2. n부터 z까지의 문자는 "1" 출력
	public static String convertBinary(String str) {
		// str = str.toLowerCase(); // 소문자로 변환
		String toZero = str.replaceAll("[a-mA-M]", "0");
		String toOne = toZero.replaceAll("[n-zN-Z]", "1");

		return toOne;

		// return str.replaceAll("[a-mA-M]", "0").replaceAll("[n-zN-Z]", "1");
	}

	public static String convertBinaryOtherSol(String str) {
		str = str.toLowerCase();
		char[] strChar = str.toCharArray();

		for (int i = 0; i < strChar.length; i++) {

			if (strChar[i] >= 'a' && strChar[i] <= 'm') {
				strChar[i] = '0';
			} else {
				strChar[i] = '1';
			}

		}
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < strChar.length; i++) {
			sb.append(strChar[i]);
		}

		return sb.toString();
	}

	/**
	 * Find the Mean of All Digits
	 * 
	 * @see https://edabit.com/challenge/mvHZK6Dy3ZF8EFoG3
	 * @param a
	 * @return
	 */
	// 1. (각 자리 숫자의 합 / 숫자의 길이) 리턴
	// 2. 512 --> (5 + 1 + 2) / 3 --> 2 리턴
	public static int mean(int a) {

		int length = 0;
		// int quotient = a; // 몫
		// int remainder = 0; // 나머지
		int sumRemainder = 0;
		// # 숫자를 10으로 나누면서 나머지들을 더함.
		// # 나눈 횟수는 숫자의 길이가 됨.
		// # 몫이 0이 아닌 동안 반복

		// # 321의 몫과 나머지 -> 32 and 1, 3 and 2, 0 and 3
		// while(quotient != 0) {
		// remainder = a % 10; // 1, 2, 3
		// sumRemainder += remainder;
		// quotient = a / 10; // 32, 3, 0
		// a = quotient; // a = 32, a = 3, a = 0
		// length++; // 1, 2, 3
		// }

		while (a != 0) {
			sumRemainder += a % 10;
			a /= 10;

			length++;
		}

		return sumRemainder / length == 0 ? 1 : length;
	}

	/**
	 * Strange Pair
	 * 
	 * @see https://edabit.com/challenge/RSbXRKoom6ED9Xe9i
	 * @param s1
	 * @param s2
	 * @return
	 */
	// 1. 첫번째 문자열의 첫번째 문자와 두번째 문자열의 마지막 문자가 같으면 true
	// 2. 첫번째 문자열의 마지막 문자와 두번째 문자열의 첫번째 문자가 같으면 true
	// 3. 위의 두 조건 모두 만족 시 true 리턴, 아니면 false
	public static boolean isStrangePair(String s1, String s2) {

		if (s1.length() == 0 && s2.length() == 0) {
			return true;
		} else if (s1.length() == 0 || s2.length() == 0) {
			return false;
		}
		// 위의 if문에서 조건식의 실행 순서를 바꾸면 오답 나옴
		// || 연산자는 두 조건 모두 참인 경우 조건문이 실행되므로 위에서 false를 반환함.
		// 두 문자열의 길이가 모두 0인 경우에 false를 반환해버림..

		// && : 두 조건 모두 참일 경우에만 참 반환
		// || : 두 조건 모두 거짓일 경우에만 거짓 반환

		return isSameLetter_one(s1, s2) && isSameLetter_two(s1, s2);
	}

	private static boolean isSameLetter_one(String s1, String s2) {
		return s1.charAt(0) == s2.charAt(s2.length() - 1);
	}

	private static boolean isSameLetter_two(String s1, String s2) {
		return s1.charAt(s1.length() - 1) == s2.charAt(0);
	}

	public static boolean isStrangePairOtherSol(String s1, String s2) {
		if (s1.length() == 0 || s2.length() == 0) {
			return s1.length() == 0 && s2.length() == 0;
		}

		return s1.charAt(0) == s2.charAt(s2.length() - 1) && s2.charAt(0) == s1.charAt(s1.length() - 1);
	}

	/**
	 * Halve and Halve Again
	 * 
	 * @see https://edabit.com/challenge/FQPo8iZ8vuPEj2dKB
	 * @param a
	 * @param b
	 * @return
	 */
	public static int halveCount(int a, int b) {
		// 1. a가 몇 번이나 반으로 나눠지는가
		// 2. 나눈 값이 b보다 큰 동안만
		// 3. 1000, 3 ➞ 8
		// (1000 -> 500 -> 250 -> 125 -> 62.5 -> 31.25 -> 15.625 -> 7.8125 -> 3.90625

		int halCount = 0;
		double x = a;

		while (true) {
			x /= 2;
			if (x <= b)
				break;
			else
				halCount++;
		}
		return halCount;
	}

	/**
	 * Is the String Empty?
	 * 
	 * @see https://edabit.com/challenge/wr8zTBNNeLtspmLLT
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		return str.equals("") ? true : false;
	}

	/**
	 * Clear the Fog
	 * 
	 * @see https://edabit.com/challenge/SSiwbDE337QvJ9FCZ
	 * @param str
	 * @return
	 */
	// 1. str에서 f.o.g 제거
	// 2. str에 f.o.g가 없으면 "It's a clear day!" 출력.
	public static String clearFog(String str) {

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'f' || str.charAt(i) == 'o' || str.charAt(i) == 'g') {
				str = str.replaceAll("[`f`o`g]", "");
				return str;
			} else {
				return "It's a clear day!";
			}
		}
		return str;

		// # str의 각 문자와 문자 배열과 비교
		// # 비교해서 요소가 있으면 변환
		// # 없으면 클리어데이 리턴

		// char[] fog = { 'f', 'o', 'g' };
		// for (int i = 0; i < str.length(); i++) {
		// for (int j = 0; j < fog.length; j++) {
		// if (str.charAt(i) == fog[j]) {
		// str = str.replaceAll("[`f`o`g]", "");
		// } else {
		// return "It's a clear day!";
		// }
		// }
		// }
		// return str;
	}

	public static String clearFogOtherSol(String str) {
		return str.contains("fog") ? str.replaceAll("[fog]", "") : "It's a clear day!";
	}

	/**
	 * Power of Two
	 * 
	 * @see https://edabit.com/challenge/7LAsTPRvRH8sX6vD5
	 * @param num
	 * @return
	 */
	public static boolean powerOfTwo(final int num) {
		// 1. num이 2의 거듭제곱수인가? (2^n제곱인가)
		// num이 2의 제곱수인가 == num이 2의 제곱수로 나눠지는가
		// 1, 2, 4, 8, 16, 32, 64...
		// while and if

		int pow = 1;

		while (true) {
			if (pow == num) {
				return true;
				// 2의 제곱수(pow)가 num이랑 같으면 true
			} else if (pow < num) {
				pow *= 2;
				// pow를 2의 제곱수로 만드는 과정
			} else {
				return false;
				// pow가 num보다 커지면 2의 제곱수가 아니라는 뜻.
				// 위에서 2의 제곱수이면 true를 리턴했으므로..
			}
		}
	}

	/**
	 * Hiding the Card Number
	 * 
	 * @see https://edabit.com/challenge/8ZFob4Juk8jzHMAHA
	 * @param card
	 * @return
	 */
	public static String cardHide(String card) {
		// 1. 마지막 4자리 빼고 *로 변환
		String result = "";
		String hideNum = "";

		// for (int i = 0; i < card.length(); i++) {
		// result += card.length() - 4 > i ? "*" : card.charAt(i);
		// }

		for (int i = 0; i < card.length() - 4; i++) {
			hideNum += "*";
		}

		for (int i = card.length() - 4; i < card.length(); i++) {
			result += card.charAt(i);
		}

		return hideNum + result;
	}

	/**
	 * Get the File Extension
	 * 
	 * @see https://edabit.com/challenge/ENNmwseEab73TMoBc
	 * @param arr
	 * @return
	 */
	// 1. 파일명의 확장자 리턴
	// 2. {"index.html", "main.css"} -> {"html", "css"} 리턴
	public static String[] getExtension(String[] arr) {
		String[] extension = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			extension[i] = arr[i].split("\\.")[1];
			// 각 요소를 .을 기준으로 나눈 뒤 뒤의 요소만 배열에 저장
			// split(".") -> 안 됨. split("[.]") -> 됨. split("\\.") -> 됨.
		}
		return extension;
	}

	public static String[] getExtensionOtherSol1(String[] arr) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].substring(arr[i].indexOf(".") + 1);
		}

		return arr;
	}

	public static String[] getExtensionOtherSol2(String[] arr) {
		String ext[] = new String[arr.length];

		for (int i = 0; i < arr.length; i++) {
			String pattern = "^.+[.]";
			ext[i] = arr[i].replaceAll(pattern, "");
		}

		return ext;
	}

	/**
	 * GCD of Two Numbers
	 * 
	 * @see https://edabit.com/challenge/jrh488nh4CyDmwMre
	 * @param n1
	 * @param n2
	 * @return
	 */
	// 1. n1과 n2의 최대공약수 구하기
	public static int gcd(int n1, int n2) {

		int gcd = Integer.MIN_VALUE;
		// 최대공약수. 임의의 값. 최대공약수는 양수로 나올 것이기 때문에 나중에 바뀔 수 있는 음수 값으로 넣어줌.
		for (int commonDivisor = 1; commonDivisor <= Math.min(n1, n2); commonDivisor++) {
			if (n1 % commonDivisor == 0 && n2 % commonDivisor == 0) {
				gcd = commonDivisor;
				// return gcd;
				// 처음에 return을 for문 안에 넣어서 계속 오답 출력됨. 초기값인 1로 출력되었음.
				// i = 1일 떄 조건에 부합하므로 i가 gcd로 되었고 그대로 리턴이 됨.
				// return 밖으로 빼내고 for문이 계속 돌아 조건에 만족하는 최대값(최대공약수) 찾음.
			}
		}
		return gcd;
	}

	public static int gcdOtherSol1(int n1, int n2) {

		int gcd = Integer.MIN_VALUE;
		for (int tmpCommonDivisor = 1; tmpCommonDivisor <= Math.min(n1, n2); tmpCommonDivisor++) {
			if (n1 % tmpCommonDivisor == 0 && n2 % tmpCommonDivisor == 0) {
				if (gcd < tmpCommonDivisor) { // 공약수가 이전의 최대공약수보다 크다면
					gcd = tmpCommonDivisor; // 공약수를 최대공약수에 대입.
				}
			}
		}
		return gcd;
	}

	public static int gcdOtherSol2(int n1, int n2) {
		int i = n1 < n2 ? n1 : n2; // i(최대공약수)를 둘 중 더 작은 값으로 초기화 하고
		while (!(n1 % i == 0 && n2 % i == 0)) { // i가 n1, n2 둘 다 나누어지는 경우가 아니라면
			i--; // i값 감소. 위의 조건을 만족하는 i값이 나오지 않으면 while문 반복. 반복하면서 i 값 중 가장 큰 값을 찾음.
		}
		return i; // while문의 조건을 만족하지 않는 경우(i로 n1, n2를 모두 나눌 수 있는 경우) i값 리턴
	}

	// 이게 왜 되는지 수학이 이해가 안 됨.
	public static int gcdOtherSol3(int n1, int n2) {
		return (n2 == 0) ? n1 : gcdOtherSol3(n2, n1 % n2);
	}

	// 이게 왜 되는지 수학이 이해가 안 됨.
	public static int gcdOtherSol4(int num1, int num2) {
		if (num2 != 0) {
			return gcdOtherSol4(num2, num1 % num2);
		} else {
			return num1;
		}
	}

	/**
	 * Reverse an Array
	 * 
	 * @see https://edabit.com/challenge/j5mm8HjTZGZagrnz8
	 * @param arr
	 * @return
	 */
	// 1. 배열을 반대로 출력
	public static int[] reverse(int[] arr) {
		if (arr.length == 0) {
			return arr;
		}

		int[] reverseArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			reverseArray[i] = arr[arr.length - (i + 1)];
		}
		return reverseArray;
	}

	/**
	 * Largest Swap
	 * 
	 * @see https://edabit.com/challenge/Jr7ueGQMEthBFYpB6
	 * @param num
	 * @return
	 */
	// 1. 두 자리의 수 num의 앞,뒷자리 수를 바꾸었을 때,
	// 2. 원래의 num이 자리를 바꾼 num 이상이면 true 아니면 false
	// num = 39, reverseNum = 93 -> false
	// num = 99, reverseNum = 99 -> true;
	public static boolean largestSwap(int num) {

		String reverseNumStr = "";
		int remainder;
		int divisor = num;
		while (divisor != 0) {
			// num을 조작 시 while문이 끝난 후 n은 0이 되어버림.
			// 그래서 num과 같은 변수 divisor 생성.
			remainder = divisor % 10;
			divisor = divisor / 10;
			reverseNumStr += String.valueOf(remainder);
		}
		System.out.println("reverseNumStr = " + reverseNumStr);
		int reverseNum = Integer.parseInt(reverseNumStr);
		System.out.println("reverseNum = " + reverseNum);
		System.out.println("num = " + num + "reverseNum = " + reverseNum);
		return num >= reverseNum;
	}

	public static boolean largestSwapOtherSol1(int num) {
		int dig1 = num % 10;
		int dig2 = num / 10;
		return dig2 >= dig1;
	}

	public static boolean largestSwapOtherSol2(int num) {
		String numb = Integer.toString(num);
		String x = "" + numb.charAt(1) + numb.charAt(0);
		int f = Integer.parseInt(numb);
		int g = Integer.parseInt(x);
		if (f == g) {
			return true;
		}
		if (f > g) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Grab the City
	 * 
	 * @see https://edabit.com/challenge/NgyZdeFBWJcBGXxjq
	 * @param str
	 * @return
	 */
	// 1. 문자열에서 도시 이름 출력
	// 2. 도시 이름은 [] 안에 들어감.
	// 3. 도시 이름이 들어간 [] 은 문자열 맨 마지막에만 옴.
	public static String grabCity(String str) {
		// # 문자열을 쪼갠 후 맨 마지막 요소만 출력
		// # 마지막 요소에서 [] 제거

		String[] strArr = str.split("\\[");
		System.out.println(Arrays.toString(strArr));
		String city = strArr[strArr.length - 1];
		city = city.replaceAll("[\\]]", "");
		// 특수문자 제거 표현식. 제거하려는 특수문자 앞에 \\ 붙여 사용.

		return city;
	}

	public static String grabCityOtherSol(String str) {
		return str.substring(str.lastIndexOf('[') + 1, str.lastIndexOf(']'));
	}

	/**
	 * Letters Only
	 * 
	 * @see https://edabit.com/challenge/HPcr7REWMLTosoXME
	 * @param str
	 * @return
	 */
	// 1. 문자열에서 특수문자, 숫자 제외한 문자만 리턴
	public static String lettersOnly(String str) {

		return str.replaceAll("[^a-zA-Z]", "");
	}

	/**
	 * Convert a Number to Base 2
	 * 
	 * @see https://edabit.com/challenge/xH7uvX2MoH8e85aYS
	 * @param decimal
	 * @return
	 */
	// 1. decimal을 2진수로 리턴. 문자열로 리턴
	// 2. 리턴값은 1034 이상일 수 없음.
	// 3. && 연산자는 유용하게 쓰일 수 있다.
	public static String binary(int decimal) {

		String binaryStr = "";
		String remainderStr = "";

		if (decimal == 0) { // 아래의 while문 실행되지 않으므로 그대로 "0" 리턴.
			return "0";
		}

		while (decimal != 0) {
			remainderStr += String.valueOf(decimal % 2);
			decimal = decimal / 2;
		}

		for (int i = remainderStr.length() - 1; i >= 0; i--) {
			binaryStr += remainderStr.charAt(i);
		}

		return binaryStr;
	}

	public static String binaryOtherSol(int decimal) {
		return Integer.toBinaryString(decimal);
	}

	/**
	 * Valid Variable Names
	 * 
	 * @see https://edabit.com/challenge/6gDTBRgZKpotCsgib
	 * @param variable
	 * @return
	 */
	// 1. variable이 올바른 변수명인가 리턴
	// 2. 변수명은 항상 문자로 시작해야 함.
	// 3. variable이 숫자나 특수문자로 시작하거나, _ 이외의 특수문자를 포함하거나 공백이 있거나 -> false 리턴
	// 4. 그렇지 않으면 true 리턴
	public static boolean variableValid(String variable) {

		// # 공백을 포함하는 경우
		for (int i = 0; i < variable.length(); i++) {
			if (variable.charAt(i) == ' ') {
				return false;
			}
		}

		// # _를 제외한 특수문자를 포함하는 경우
		if (variable.matches("^[^a-zA-Z_].*")) {
			// [^a-zA-Z] -> a~z, A~Z가 아닌 경우
			// ^[~] -> ~로 시작하는 경우
			// ^[^a-zA-Z_] -> a~z, A~Z, _가 아닌 경우(특수 문자, 숫자)로 시작하는 경우
			// . -> 임의의 단일 문자
			// [~]* ~ 문자가 0개에서 n개까지
			return false;
		}

		return true;
	}

	public static boolean variableValidOtherSol(String variable) {
		return variable.matches("^[a-zA-Z_][a-zA-Z0-9_]*$");
		// [~]$ -> ~로 종료되는 경우
		// ^[~][~~]$ -> 시작하는 문자의 패턴[~], 종료하는 문자의 패턴[~~]
		// ^[a-zA-Z_][a-zA-Z0-9_]*$ -> [a-zA-Z_]로 시작하면서, 그 다음 문자가 [a-zA-Z0-9_]인 경우이고
		// 0개에서 n개일 수 있고 [a-zA-Z0-9]인 경우로 끝남.
	}

	/**
	 * Solving Exponential Equations With Logarithms
	 * 
	 * @see https://edabit.com/challenge/oB67n674gwdTi33P4
	 * @param a
	 * @param b
	 * @return
	 */
	// 1. b는 a의 몇 제곱인가?
	public static int solveForExp(int a, int b) {
		// # b가 a로 pow번 나누어지면 b는 a의 pow제곱
		// a = 2, b = 16; pow = 0;
		// pow = 1, b = 8 // 2, 4 // 3, 2 // 4, 1

		int pow = 0;
		while (b != 1) {
			b /= a;
			pow++;
		}

		return pow;
	}

	public static int solveForExpOtherSol(int a, int b) {
		return (int) (Math.log(b) / Math.log(a));
	}

	/**
	 * Check if One Array can be Nested in Another
	 * 
	 * @see https://edabit.com/challenge/xkD7RBBDiWuDHTiXE
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	// 1. arr1 배열의 값들이 arr2 배열 값들의 사이에 들어가는가
	// 2. [1, 2, 3, 4], [0, 6]) ➞ true
	// 2. [3, 1], [4, 0]) ➞ true
	// 2. [9, 9, 8], [8, 9]) ➞ false
	// 2. [1, 2, 3, 4], [2, 3]) ➞ false
	// # 배열 # 논리 연산자 # boolean # 범위
	public static boolean canNest(int[] arr1, int[] arr2) {
		// arr1의 값들은 arr2에서 작은 값과 큰 값의 범위에 들어가는가
		// arr2의 작은 값과 큰 값 구하기
		// arr1의 값들을 arr2의 값들과 크기 비교하기

		Arrays.sort(arr2);
		// 오름차순 정렬. 뒤로 갈수록 값이 커짐

		int minRange = arr2[0];
		int maxRange = arr2[arr2.length - 1];

		for (int i = 0; i < arr1.length; i++) {
			if (minRange >= arr1[i] || maxRange <= arr1[i]) {
				// 미만의 반대는 초과가 아니라 이상
				// 초과의 반대는 미만이 아니라 이하
				// 두 가지 조건 중 하나라도 참이면 참, 두 조건 모두 참이면 참 -> return false
				// 주 조건 모두 거짓이면 거짓 -> for 문 탈출. return true
				return false;

				// 참, 거짓을 구할 때 더 많은 경우가 나오는 것들을 반복물을 통해 구함
				// 본 문제의 경우 두 조건이 모두 참이어서 참을 반환하는 것보다 하나라도 참이어서 참을 반환하는 경우가 많으므로 그러한 경우들을 반복문을
				// 통해 찾음.
			}
		}
		return true;
	}

	/**
	 * Stripping a Sentence Down
	 * 
	 * @see https://edabit.com/challenge/EiGazR6eGXHMx3hTy
	 * @param str
	 * @param chars
	 * @return
	 */
	// 1. 문자열 str에서 문자열 chars의 문자를 제거한 문자열 리턴
	// 2. stripSentence("the quick brown fox jumps over the lazy dog", "aeiou") ➞
	// "th qck brwn fx jmps vr th lzy dg"
	// # 변환 # replaceAll # 이중 for문
	public static String stripSentence(String str, String chars) {
		// chars의 각 문자와 str의 각 문자를 비교하여 같으면 ""로 대체
		// str = "loop and condition";
		// chars = "ond";

		for (int i = 0; i < chars.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (chars.charAt(i) == str.charAt(j)) {
					str = str.replaceAll(str.charAt(j) + "", "");
					// str 문자열에서 해당하는 문자를 모두 ""로 변환한 뒤 str에 다시 저장

					// System.out.println("걸리는 인덱스 = " + "i =" + i + "\nj = " + j);
					// System.out.println(str);
				}
			}
		}
		return str;

		// 오답
		// for (int i = 0; i < str.length(); i++) {
		// for (int j = 0; j < chars.length(); j++) {
		// if (str.charAt(i) == chars.charAt(j)) {
		// str = str.replaceAll(str.charAt(i) + "", "");
		// // 변환이 되는 대상을 ""(공백)으로 변환하면 문자열의 길이가 달라지고
		// // 초기에 할당되었던 인덱스가 바뀜에 따라 검사를 거치지 않고 누락되는 문자들이 발생함(원래의 있던 자리에서 앞으로 당겨지게 됨에 따라
		// 검사를 거치지 않게 됨)
		// // 이중 for문 사용 시 변환의 대상을 바깥 for문에 두지 말 것
		// }
		// }
		// }
	}

	/**
	 * Alternating Ones and Zeroes 1. 주어진 0과 1을 가지고 하나씩 교차하면서 다시 적을 수 있으면 true 아니면
	 * false 2. 0001111 ➞ true. Can make: 1010101 // 010001 ➞ false
	 * 
	 * @see https://edabit.com/challenge/D7PZ7rcKGRiCvcm7C
	 * @param str
	 * @return
	 */

	public static boolean canAlternate(String str) {

		int zeroCnt = 0;
		int oneCnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0') {
				zeroCnt++;
			} else if (str.charAt(i) == '1') {
				oneCnt++;
			}
		}

		return Math.abs(zeroCnt - oneCnt) == 1 || Math.abs(zeroCnt - oneCnt) == 0;
	}

	public static boolean canAlternateOtherSol1(String str) {
		long zeroCnt = str.chars().filter(ch -> ch == '0').count();
		long oneCnt = str.chars().filter(ch -> ch == '1').count();

		return zeroCnt - oneCnt >= -1 && zeroCnt - oneCnt <= 1;
	}

	public static boolean canAlternateOtherSol2(String str) {
		int zeros = str.replace("1", "").length();
		int ones = str.replace("0", "").length();
		return Math.abs(zeros - ones) <= 1;
	}

	/**
	 * Semantic Versioning
	 *  1. 문자열에서 세 숫자는 각 Major, Minor, Patch의 수를 의미. 각 숫자 리턴
	 * 
	 * @see https://edabit.com/challenge/H4smHFuL5wn58imFK
	 * @param semver
	 * @return
	 */
	public static String retrieveMajor(String semver) {
		String[] numbers = semver.split("\\.");
		// "."으로 안 잘림. "\\."로 해야 잘림.
		System.out.println(Arrays.toString(numbers));
		return numbers[0];

	}

	public static String retrieveMinor(String semver) {
		String[] numbers = semver.split("\\.");
		return numbers[1];
	}

	public static String retrievePatch(String semver) {
		String[] numbers = semver.split("\\.");
		return numbers[2];
	}
}