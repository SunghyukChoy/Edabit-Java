package my.sunghyuk.edabit.easy;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.StringTokenizer;

import my.sunghyuk.edabit.Helper;

/**
 * Challenge
 */
public class Challenge {

	/**
	 * Check if a Number is Prime
	 * num이 소수인가. 숫자 1은 소수에서 제외
	 * @see https://edabit.com/challenge/ePj2zup56kZrRbhDX
	 * @param num
	 * @return
	 */
	public static boolean isPrime(int num) {
		/* boolean flag = true;
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
		return flag; */

		// Other Solution
		if (num == 1) {
			return false;
		}

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
	 * 세 개의 수 중 가장 큰 값 - 가장 작은 값 리턴
	 * @see https://edabit.com/challenge/akHQKSkHT26TuA7Ka
	 * @param one
	 * @param two
	 * @param three
	 * @return
	 */
	public static int programmers(int one, int two, int three) {
		/* int maxNum = 0;
		int minNum = 0;
		
		if (one >= two && one >= three) {
			maxNum = one;
			if (two >= three) {
				minNum = three;
			} else {
				minNum = two;
			}
		} else if (two >= one && two >= three) {
			maxNum = two;
			if (one >= three) {
				minNum = three;
			} else {
				minNum = one;
			}
		} else if (three >= one && three >= two) {
			maxNum = three;
			if (one >= two) {
				minNum = two;
			} else {
				minNum = one;
			}
		}
		return maxNum - minNum; */

		// Other Solution
		/* int[] arr = new int[] { one, two, three };
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
		return maxNum - minNum; */

		// Other Solution
		/* int[] arr = { one, two, three };
		Arrays.sort(arr); // 오름차순으로 정렬. 값이 뒤로 갈수록 커짐.
		return arr[2] - arr[0]; */

		// Other Solution
		int min = Math.min(one, Math.min(two, three));
		int max = Math.max(one, Math.max(two, three));
		return max - min;
		// return Math.max(one, Math.max(two, three)) - Math.min(one, Math.min(two, three));
	}

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

	/**
	 * Equality of 3 Values
	 * 세 개의 수 중 같은 수의 개수 리턴
	 * @see https://edabit.com/challenge/nfc7H9CQFqJp54uEh
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int equal(int a, int b, int c) {
		/* boolean aEqualB = a == b;
		boolean aEqualC = a == c;
		boolean bEqaulC = b == c;
		
		if (aEqualB && bEqaulC) {
			return 3;
		}
		if (aEqualC && bEqaulC) {
			return 3;
		}
		if (aEqualB && !aEqualC) {
			return 2;
		}
		if (aEqualC && !bEqaulC) {
			return 2;
		}
		return 0; */

		// Other Solution
		/* int equalCount = a == b ? 2 : 0;
		
		if (equalCount == 2 && b == c) {
			equalCount = 3;
		} else if (equalCount == 0 && b == c) {
			equalCount = 2;
		} else if (equalCount == 0 && a == c) {
			equalCount = 2;
		}
		return equalCount; */

		// Other Solution
		/* HashSet<Integer> equals = new HashSet<>();
		
		equals.add(a);
		equals.add(b);
		equals.add(c);
		
		if (equals.size() == 1) {
			return 3;
		} else if (equals.size() == 2) {
			return 2;
		} else {
			return 0;
		} */

		// Other Solution
		if (a == b && b == c) {
			return 3;
		}
		if (a == b || a == c || b == c) {
			return 2;
			// 위의 조건식에서 두 개의 식이 참인 경우 3을 리턴하므로 이 식에서는 참인 식은 1개밖에 나올 수 없음.
		}
		return 0;
	}

	/**
	 * Repeating Letters N Times
	 * 문자열 str에서 각 문자를 n번 반복
	 * @see https://edabit.com/challenge/HDk4PC9w6KPS3X25W
	 * @param str
	 * @param n
	 * @return
	 */
	public static String repeat(String str, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < n; j++) {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}

	/**
	 * Basic Calculator
	 * 주어진 num1, num2를 operator를 이용하여 계산
	 * @see https://edabit.com/challenge/gyfsGx7KrGLscxFrD
	 * @param num1
	 * @param operator
	 * @param num2
	 * @return
	 */
	public static int calculator(int num1, char operator, int num2) {
		/* int result = 0;
		if (operator == '+') {
			result = num1 + num2;
		} else if (operator == '-') {
			result = num1 - num2;
		} else if (operator == '*') {
			result = num1 * num2;
		} else if (operator == '/') {
			if (num2 == 0) {
				result = 0;
			} else {
				result = num1 / num2;
			}
		}
		return result; */

		// Other Solution
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
	 * 문자열에 있는 모음 개수 리턴
	 * @see https://edabit.com/challenge/GBKphScsmDi9ek3ra
	 * @param str
	 * @return
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

		// Other Solution
		/* char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		int vowelsCount = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (str.charAt(i) == vowels[j]) {
					vowelsCount++;
				}
			}
		}
		return vowelsCount; */

		// Other Solution
		// return str.replaceAll("[^aeiouAEIOU]", "").length();

		// Other Solution
		/* int vowelsCount = 0;
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					vowelsCount++; // case들이 같은 값을 갖는다면 한 줄로 써줌. case 조건절에 break.
					break;
				default: // 모음이 아닌 경우
					break;
			}
		}
		return vowelsCount; */
	}

	/**
	 * Scoring System
	 * A, B, C 각 문자의 갯수를 배열 형태로 리턴. "ABBACCCCAC" -> [3, 2, 5] 리턴
	 * @see https://edabit.com/challenge/FRtmuYD26pcQWFR7k
	 * @param str
	 * @return
	 */
	private static final int INDEX_OF_A = 0;
	private static final int INDEX_OF_B = 1;
	private static final int INDEX_OF_C = 2;

	public static int[] calculateScores(String str) {
		/* int aCount = 0;
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
		// 자료형이 기본형인 경우 call by value
		// 자료형이 클래스형인 경우 call by ref.
		return result; */

		// Other Solution
		/* int[] result = { 0, 0, 0 };
		
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
		return result; */

		// Other Solution
		return new int[] { str.replaceAll("[^A]", "").length(), str.replaceAll("[^B]", "").length(),
				str.replaceAll("[^C]", "").length() };
	}

	/**
	 * Reverse the Order of a String
	 * 문자열을 거꾸로 출력
	 * @see https://edabit.com/challenge/5gPCp7v7iDWZvb4YQ
	 * @param str
	 * @return
	 */
	public static String reverse(final String str) {
		// str을 char 하나씩 뽑아 배열로 저장 # 필요없음
		// char[] words = str.toCharArray(); // 문자열을 char 배열로 저장하는 방법

		/* String reversedWord = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedWord += str.charAt(i);
		}
		// for (int i = 0; i < str.length(); i++) {
		// 	reversedWord += str.charAt(str.length() - i - 1);
		// }
		return reversedWord; */

		// Other Solution
		/* StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			buffer.append(str.charAt(str.length() - i - 1));
		}
		return buffer.toString(); // <-- 이 시점에 String 형으로 메모리로 할당되서 사용 가능 */

		// Other Solution
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}

	/**
	 * Shapes With N Sides
	 * 배열에서 n번째 문자열 리턴
	 * @see https://edabit.com/challenge/odJPfYRD3kSpE45Jf
	 * @param n
	 * @return
	 */
	public static String nSidedShape(int n) {
		String[] result = { "circle", "semi-circle", "triangle", "square", "pentagon", "hexagon", "heptagon", "octagon",
				"nonagon", "decagon" };
		return result[n - 1];
	}

	/**
	 * Hashes and Pluses
	 * 문자열 s에서 #와 +의 개수를 정수 배열로 리턴
	 * @see https://edabit.com/challenge/s8RHRY9hfmvYMuaeC
	 * @param s
	 * @return
	 */
	public static int[] hashPlusCount(String s) {
		/* int hashCount = 0;
		int plusCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '#') {
				hashCount++;
			} else if (s.charAt(i) == '+') {
				plusCount++;
			}
		}
		int[] result = { hashCount, plusCount };
		return result; */

		// Other Solution
		/* int[] hashAndPlus = new int[2];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '#') {
				hashAndPlus[0]++;
			} else if (s.charAt(i) == '+') {
				hashAndPlus[1]++;
			}
		}
		return hashAndPlus; */

		// Other Solution
		return new int[] { s.replaceAll("[^#]", "").length(), s.replaceAll("[^\\+]", "").length() };
	}

	/**
	 * Special Arrays
	 * 정수 배열에서 짝수 인덱스의 요소가 짝수이면서 홀수 인덱스의 요소가 홀수이면 true, 아니면 false
	 * 인덱스 0은 짝수 인덱스.
	 * @see https://edabit.com/challenge/YmeiRhzaiR3MCPBiT
	 * @param arr
	 * @return
	 */
	private static boolean isEvenIndexIsEven(int[] arr) {
		// 배열에서 짝수 인덱스 요소의 값이 짝수인지 검사하는 메서드
		for (int i = 0; i < arr.length; i += 2) {
			if (arr[i] % 2 != 0) {
				return false;
			}
		}
		return true;
	}

	private static boolean isOddIndexIsOdd(int[] arr) {
		// 배열에서 홀수 인덱스 요소의 값이 홀수인지 검사하는 메서드
		for (int i = 1; i < arr.length; i += 2) {
			if (arr[i] % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isSpecialArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (Helper.isEven(i) && Helper.isOdd(arr[i])) { // 인덱스가 짝수이면서 요소의 값은 홀수인 경우
				return false;
			} else if (Helper.isOdd(i) && Helper.isEven(arr[i])) {// 인덱스가 홀수이면서 요소의 값은 짝수인 경우
				return false;
			}
		}
		return true;

		// Other Solution
		// return isEvenIndexIsEven(arr) && isOddIndexIsOdd(arr);
	}

	/**
	 * Valid Zip Code
	 * 올바른 우편번호인가 검사. 1) 문자열은 숫자로만 구성 2) 공백이 있으면 안 됨. 3) 문자열은 5글자
	 * @see https://edabit.com/challenge/SmKPaHy5uY2gMk9na
	 * @param zip
	 * @return
	 */
	// 메시지 출력 메서드
	/* public static String getErrorMessage(String zip) {
		String message = "";
		if (Helper.hasBlank(zip)) {
			message += "문자열에 공백이 있습니다.\n";
		}
		if (Helper.hasNonNumber(zip)) {
			message += "문자열에 숫자가 아닌 문자가 있습니다.\n";
		}
		if (zip.length() != 5) {
			message += "문자열이 5자리가 아닙니다.\n";
		}
		return message;
	} */
	public static boolean isValid(String zip) {
		// 오답
		/* try {
			int zipNum = Integer.parseInt(zip);
			// 문자열을 정수로 변환.
			// zip 문자열에 숫자가 아닌 문자 존재 시 NumberFormatException 에러 발생
		
			if (zip.length() != 5) {
				return false;
			}
		
			if (!(zipNum >= 10000 && zipNum <= 99999)) {
				// 문자열이 "06609"인 경우 (test case 9번의 경우) 유효한 우편번호이지만
				// parseInt() 시에 6609를 반환하게 되고 현재의 if절의 조건에 따라 return false를 하게 됨.
				// 즉 try-catch 구문에서 parseInt()를 사용한 유효성 검사는 틀린 로직.
				return false;
			}
		
			return true; // 위의 경우들에 해당하지 않으면 true
		
		} catch (NumberFormatException e) { // zip 문자열에 문자가 존재한 경우
			return false; */

		// 유효성 검사를 하는 일반적인 형태, 방법
		// 조건을 하나씩 적용하여 조건에 따라 return 값 설정
		if (Helper.hasNonNumber(zip)) {
			return false;
		}
		if (zip.length() != 5) {
			return false;
		}
		return true; // 위의 경우가 아닐 때 true 리턴

		// Other Solution		
		// return zip.matches("\\d{5}");	
		// return zip.matches("[0-9]{5}");
	}

	/**
	 * Vowel Replacer
	 * str 문자열에서 모음을 ch 문자로.
	 * @see https://edabit.com/challenge/iW7rtor54mbFQ2RrZ
	 * @param str
	 * @param ch
	 * @return
	 */
	public static String replaceVowels(String str, char ch) {
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (Helper.isVowel(charArray[i])) {
				charArray[i] = ch;
			}
		}
		// return String.valueOf(charArray); // char 배열을 문자열로 반환
		return new String(charArray); // char 배열을 문자열로 반환

		// Other Solution
		// return str.replaceAll("[aeiou]", String.valueOf(ch));
	}

	/**
	 * Capture the Rook
	 * 1. 각 요소의 같은 인덱스를 비교.
	 * 2. 요소의 첫번째 인덱스(문자)가 같거나 두번째 인덱스(숫자)가 같으면 true
	 * @see https://edabit.com/challenge/rYD9NTBmNhaPM6wx2
	 * @param rooks
	 * @return
	 */
	public static boolean canCapture(String[] rooks) {
		if (rooks[0].charAt(0) == rooks[1].charAt(0) || rooks[0].charAt(1) == rooks[1].charAt(1)) {
			return true;
		}
		return false;
	}

	/**
	 * Check if String Ending Matches Second String
	 * str1이 str2의 문자열로 끝나는가
	 * @see https://edabit.com/challenge/PZnwXraqBPYv7w4Sm
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean checkEnding(String str1, String str2) {
		return str1.endsWith(str2);

		// Other Solution
		/* for (int i = str2.length() - 1, j = str1.length() - 1; i >= 0; i--, j--) {
			if(str2.charAt(i) != str1.charAt(j)) {
				return false;
			}
		}
		return true; */

		// Other Solution
		// return str2.equals(str1.substring(str1.length() - str2.length()));
	}

	/**
	 * Spaces Between Each Character
	 * str의 각 문자 사이에 공백 넣기
	 * @see https://edabit.com/challenge/ryEdPW2eqyngyWayy
	 * @param str
	 * @return
	 */
	public static String spaceMeOut(String str) {
		/* char[] characters = str.toCharArray();
		String spaceWord = "";		
		for (int i = 1; i < characters.length; i++) {
			spaceWord += characters[i - 1] + " ";
		}
		spaceWord = spaceWord + str.charAt(str.length() - 1);
		return spaceWord; */

		// Other Solution
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			sb.append(str.charAt(i)).append(" ");
		}
		return sb.toString().trim();

		// Other Solution
		// return str.replace("", " ").trim();
	}

	/**
	 * Difference of Max and Min Numbers in Array
	 * 배열에서 가장 큰 수와 가장 작은 수의 차 리턴
	 * @see https://edabit.com/challenge/hymPkXdhmDQLe87QT
	 * @param arr
	 * @return
	 */
	public static int differenceMaxMin(int[] arr) {
		/* int maxValue = Integer.MIN_VALUE;
		int minValue = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= maxValue) {
				maxValue = arr[i];
			}
			if (arr[i] <= minValue) {
				minValue = arr[i];
			}
		}
		return maxValue - minValue; */

		// Other Solution
		Arrays.sort(arr);
		return arr[arr.length - 1] - arr[0];
	}

	/**
	 * Double Letters
	 * 문자열에 연속되는 두 개의 문자가 있으면 return true; otherwise false;
	 * @see https://edabit.com/challenge/EaWY5d2pYBckrkAnS
	 * @param word
	 * @return
	 */
	public static boolean doubleLetters(String word) {
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
	 * 1부터 num까지의 짝수를 배열로 리턴. num까지 짝수가 없으면 비어있는 배열로 리턴
	 * @see https://edabit.com/challenge/jwXx478haGbZpRCWQ
	 * @param num
	 * @return
	 */
	public static int[] findEvenNums(int num) {
		int[] evenArr = new int[num / 2];
		for (int i = 1, j = 0; i <= num; i++) {
			if (i % 2 == 0) {
				evenArr[j] = i;
				j++;
			}
		}
		return evenArr;

		// Other Solution
		/* List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= num; i++) {
			if (Helper.isEven(i)) {
				list.add(i);
			}
		}
		int[] evenArr = new int[list.size()];
		int i = 0;
		for (int even : list) {
			evenArr[i] = even;
			i++;
		}
		return evenArr; */
	}

	/**
	 * Triangular Number Sequence
	 * 삼각수 : 1, 3, 6, 10, 15... 순으로 나가는 수. 각 항은 이전 항의 +2, +3, +4, +5...의 값을 가짐
	 * n번째 항의 값 리턴
	 * @see https://edabit.com/challenge/4kEHkvobTA4i6AQRE
	 * @param n
	 * @return
	 */
	public static int triangle(int n) {
		// 1, 3, 6, 10, 15....
		// 1항의 값은 1, 2항의 값은 3, 1항에서 2항으로 : 1항의 값 + 현재 항의 수 + 1
		// 2항의 값은 3, 3항의 값은 6, 2항에서 3항으로 : 2항의 값 + 현재 항의 수 + 1
		// 3항의 값은 6, 4항의 값은 10, 3항에서 4항으로: 3항의 값 + 현재 항의 수 + 1
		// n-1항의 값 x, n항의 값 y, n-1항에서 n항으로 : n-1항의 값 + (n-1) + 1
		// 현재 항의 수 : 현재 항이 몇 번째 항인가

		int triangularNum = 1; // 첫 번째 삼각수
		for (int i = 1; i < n; i++) {
			// i : 항의 수. 1항부터 시작하여 n-1항까지.
			triangularNum = triangularNum + i + 1;
			// n항의 삼각수 = n-1의 삼각수 + (n-1) + 1;
		}
		return triangularNum;

	}

	/**
	 * Return the Middle Character(s) of a String
	 * 문자열의 가운데 문자 출력. 가운데 문자가 2개면 2개, 1개면 1개 출력
	 * @see https://edabit.com/challenge/NrMGhrarTfpYSbr84
	 * @param word
	 * @return
	 */
	public static String getMiddle(String word) {
		/* if (word.length() % 2 == 0) {
			return String.valueOf(word.charAt((word.length() / 2) - 1)) + String.valueOf(word.charAt(word.length() / 2));
		}
		return String.valueOf(word.charAt((word.length() - 1) / 2)); */

		// Other Solution
		while (true) {
			if (word.length() == 2) {
				return word;
			}
			if (word.length() == 1) {
				return word;
			}
			word = word.substring(1, word.length() - 1);
		}
	}

	/**
	 * Nth Smallest Element
	 * arr 배열에서 n번째로 작은 수 출력. n이 배열의 길이보다 클 켱우 return -1
	 * @see https://edabit.com/challenge/zgBjnxQw9MHTBHLED
	 * @param arr
	 * @param n
	 * @return
	 */
	public static int nthSmallest(int[] arr, int n) {
		if (arr.length < n) {
			return -1;
		}
		Arrays.parallelSort(arr);
		// parallelSort() : 배열의 크기가 크고 요소의 순서가 들쑥날쑥하다면 sort()보다 빠름.
		return arr[n - 1];
	}

	/**
	 * Say "Hello" Say "Bye"
	 * num이 1이면 Hello, 0이면 Bye. 인사말 + name. name의 첫문자는 대문자로
	 * @see https://edabit.com/challenge/zFccarRuia5zq4rhP
	 * @param name
	 * @param num
	 * @return
	 */
	public static String sayHelloBye(String name, int num) {
		String greeting = (num == 1) ? "Hello" : "Bye";
		char firstCh = Character.toUpperCase(name.charAt(0));
		// char 타입은 기본 자료형. 클래스에 접근하여 메서드 사용.
		// int -> Integer, boolean -> Boolean .....
		String upperCaseName = firstCh + name.substring(1, name.length());
		return greeting + " " + upperCaseName;
	}

	/**
	 * Is the Average of All Elements a Whole Number?
	 * 배열의 평균값이 정수이면 true. 실수이면 false 
	 * @see https://edabit.com/challenge/yk7GqGcCpFgQrk8fH
	 * @param arr
	 * @return
	 */
	public static boolean isAvgWhole(int[] arr) {
		/* int arrSum = 0;
		for (int i = 0; i < arr.length; i++) {
			arrSum += arr[i];
		}
		double doubleAvg = (double) arrSum / arr.length;
		// (double) arrSum / arr.length; != (double) (arrSum / arr.length);
		// int 타입의 값들을 먼저 연산하고 double로 캐스팅 하면 연산 과정에서 소수점 값들이 반올림 되어 실제는 실수 타입의 값들이 정수로 변환됨. 여기서 오차 발생.
		// double 타입의 변수에 값을 담기 위해선 연산하려는 값들 중 하나를 담을 변수의 타입과 같게 캐스팅 하여 값의 유실을 막을 수 있음. 두 피연산자 중 하나만 캐스팅 하면 나머지 하나는 자동으로 캐스팅 됨.
		// 타입이 다른 수를 연산할 때 범위가 더 큰 타입으로 캐스팅 됨.
		// arr.length의 타입이 double로 캐스팅
		// int, double --> double
		// long, double --> double
		// float, double --> double
		
		int IntAvg = (int) doubleAvg;
		
		return doubleAvg - IntAvg == 0;
		// 연산 결과의 실제 값이 정수로 변환한 값보다 크다면 실제의 값은 실수 타입이 맞음. 그렇지 않고 두 값이 같다면 실제 값은 처음부터 정수임. */

		// Other Solution
		return Arrays.stream(arr).sum() % arr.length == 0;
	}

	/**
	 * Return the Index of the First Vowel
	 * 첫 번째 모음 인덱스 번호 출력
	 * @see https://edabit.com/challenge/MsJzAHPmmmcwF4iCr
	 * @param str
	 * @return
	 */
	public static int firstVowel(String str) {
		/* char[] vowels = new char[] { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (str.charAt(i) == vowels[j]) {
					return i;
				}
			}
		}
		return -1;
		// if문의 조건에 부합하지 않는 경우에도 return이 필요하므로 return 작성.
		// 인덱스가 가질 수 없는 숫자인 -1로 작성하였음.. */

		// Other Solution
		/* String vowels = "aeiou";
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (vowels.indexOf(str.charAt(i)) != -1) {
				return i;
			}
		}
		return -1; */

		for (int i = 0; i < str.length(); i++) {
			if (Helper.isVowel(str.charAt(i))) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Re-Form the Word
	 * 문자열 두 개 붙이기. left의 첫문자는 대문자로
	 * @see https://edabit.com/challenge/R3PnRquBPADEqDxZg
	 * @param left
	 * @param right
	 * @return
	 */
	public static String getWord(String left, String right) {
		String leftUpperCase = Character.toUpperCase(left.charAt(0)) + left.substring(1, left.length());
		return leftUpperCase + right;
	}

	/**
	 * Index Shuffle
	 * 짝수 번째 인덱스와 홀수 번째 인덱스 문자끼리 묶어서 짝수 인덱스 문자 + 홀수 인덱스 문자. 0은 짝수 취급.
	 * @see https://edabit.com/challenge/BZzAm9KXuB993p35r
	 * @param str
	 * @return
	 */
	public static String indexShuffle(String str) {
		StringBuilder evenSb = new StringBuilder();
		StringBuilder oddSb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				evenSb.append(str.charAt(i));
			} else {
				oddSb.append(str.charAt(i));
			}
		}
		return evenSb.toString() + oddSb.toString();
	}

	/**
	 * Between Words
	 * 알파벳순으로 정렬 시 word가 first와 last 사이에 오면 true; otherwise false;
	 * @see https://edabit.com/challenge/YjeGKZwXsdCo3sr7a
	 * @param first
	 * @param last
	 * @param word
	 * @return
	 */
	public static boolean isBetween(String first, String last, String word) {
		/* String[] sortByAlphabet = new String[] { first, last, word };
		Arrays.sort(sortByAlphabet); // 배열을 오름차순으로 정렬
		return sortByAlphabet[1].equals(word); */

		// Other Solution
		return first.compareTo(word) < 0 && last.compareTo(word) > 0;
	}

	/**
	 * Palindrome?
	 * 문자열의 첫문자와 끝문자가 같으면 true, 다르면 false;
	 * @see https://edabit.com/challenge/cwLnTvxpBX5espEgs
	 * @param str
	 * @return
	 */
	public static boolean checkPalindrome(String str) {
		return str.charAt(0) == str.charAt(str.length() - 1);
	}

	/**
	 * Join Two Portions of a Path
	 * 두 문자열 합치기. 중간에 /는 하나만. /가 없으면 추가. 중복되면 하나만.
	 * if-only문만 사용해서 푸는 것 피하기
	 * @see https://edabit.com/challenge/CDuD3xGtWRhnFzAP2
	 * @param portion1
	 * @param portion2
	 * @return
	 */
	public static String joinPath(String portion1, String portion2) {
		// return portion1.replaceAll("[/]", "") + "/" + portion2.replaceAll("[/]", "");

		//Other Solution
		return String.join("/", portion1.replace("/", ""), portion2.replace("/", ""));
	}

	/**
	 * Index Multiplier
	 * 배열의 각 값과 인덱스 번호를 곱한 후 총합 리턴
	 * @see https://edabit.com/challenge/YMLm3DpuZXHFDAnou
	 * @param arr
	 * @return
	 */
	public static int indexMultiplier(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += (arr[i] * i);
		}
		return sum;
	}

	/**
	 * Concatenating Two Integer Arrays
	 * 두 배열 합치기. 순서는 원래의 순서 유지. arr1 + arr2 형태
	 * @see https://edabit.com/challenge/E2WdAPmgNJnbL5RvF
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public static int[] concat(int[] arr1, int[] arr2) {
		int[] concatArray = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, concatArray, 0, arr1.length);
		System.out.println(Arrays.toString(concatArray));
		// 배열의 요소를 출력하는 방법.
		System.arraycopy(arr2, 0, concatArray, arr1.length, arr2.length);
		// System.arraycopy(원본, 복사할 값을 보낼 원본의 시작 인덱스, 사본, 복사할 값을 받을 사본 시작 인덱스, 복사할 원본의 요소 갯수);
		return concatArray;

		// Other Solution
		/* int[] concatArr = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			concatArr[i] = arr1[i];
		}
		for (int j = 0; j < arr2.length; j++) {
			concatArr[j + arr1.length] = arr2[j];
		}
		return concatArr; */

		// Other Solution
		// return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
	}

	/**
	 * Find the Smallest and Biggest Numbers
	 * 배열에서 가장 작은 수와 가장 큰 수 출력 return {가장 작은 수, 가장 큰 수}
	 * @see https://edabit.com/challenge/J4Yop3GjeZELWeoqT
	 * @param arr
	 * @return
	 */
	public static double[] minMax(double[] arr) {
		double minValue = Double.MAX_VALUE;
		double maxValue = Double.NEGATIVE_INFINITY;
		// MIN_VALUE는 가장 작지 않다... 말이랑 안맞는 자바의 좋은 예
		// Double의 범위에서 가장 작은 값.
		for (int i = 0; i < arr.length; i++) {
			minValue = Math.min(minValue, arr[i]);
			maxValue = Math.max(maxValue, arr[i]);
		}
		return new double[] { minValue, maxValue };
	}

	/**
	 * Amplify the Multiples of Four
	 * num의 길이를 갖는 배열 생성. 배열의 값들은 1,2,3,4... 오름차순. 4로 나뉘는 수는 그 요소x10의 값.
	 * @see https://edabit.com/challenge/XD6bQFpCZWiAMPanQ
	 * @param num
	 * @return
	 */
	public static int[] amplify(int num) {
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
	 * num이 좌우반전해도 같은 숫자이면 true, 아니면 false. 12321 -> true, 12345 -> false.
	 * @see https://edabit.com/challenge/gzjQoZY6mYRBwDv2Q
	 * @param num
	 * @return
	 */
	public static boolean isSymmetrical(int num) {
		/* String numStr = String.valueOf(num);
		for (int i = 0; i < numStr.length() / 2; i++) {
			char firstIndex = numStr.charAt(i);
			char lastIndex = numStr.charAt(numStr.length() - i - 1);
			if (firstIndex != lastIndex) {
				return false;
			}
		}
		return true; */

		// Other Solution
		// num = 12321 divider = 10000 (10^4)
		// num = 232 divider = 100 (10^2)
		// num = 3 END
		int numLength = Helper.getNumLength(num);
		while (num > 10) {
			int divider = Helper.getPowValue(10, numLength - 1);
			int firstIndex = num / divider; // 앞에 숫자 빼오기
			int lastIndex = num % 10; // 뒤에 숫자 빼오기
			// num을 num의 길이를 갖는 10의 제곱수로 나누면 몫을 얻을 수 있고 몫은 numd의 맨 앞자리를 의미.
			// num의 제곱수 = 10^num의 길이 - 1
			// num을 10으로 나눈 후 남는 나머지는 맨 뒷자리를 의미
			if (firstIndex != lastIndex) {
				return false;
			}
			num -= divider * firstIndex; // num에서 맨 앞자리를 떼낸 num. 2321 = 12321 - (10000 * 1)
			num /= 10; // num에서 맨 뒷자리를 떼낸 num. 232 = 2321 / 10
			numLength -= 2; // num에서 앞뒷자리를 떼냈으므로 제곱수를 만들기 위한 numLength 값 다시 대입
		}
		return true;

		// Other Solution
		/* String numStr = String.valueOf(num);
		StringBuilder sb = new StringBuilder(numStr);
		return sb.reverse().toString().equals(numStr); */
	}

	/**
	 * Transforming Words into Binary Strings
	 * 1. a부터 m까지의 문자는 "0" 출력. n부터 z까지의 문자는 "1" 출력
	 * @see https://edabit.com/challenge/jwzMsyo2tbgn2KbGQ
	 * @param str
	 * @return
	 */
	public static String convertBinary(String str) {
		return str.replaceAll("[a-mA-M]", "0").replaceAll("[n-zN-Z]", "1");

		// Other Solution
		/* str = str.toLowerCase();
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
		return sb.toString(); */
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
		int length = a == 0 ? 1 : 0; // a가 0인 경우 길이는 1. 아니면 0으로 초기화
		int sumRemainder = 0;
		// # 숫자를 10으로 나누면서 나머지들을 더함.
		// # 나눈 횟수는 숫자의 길이가 됨.
		// # 몫이 0이 아닌 동안 반복
		while (a != 0) {
			sumRemainder += a % 10;
			a /= 10;
			length++;
		}
		return sumRemainder / length;
	}

	/**
	 * Strange Pair
	 * 1. 첫번째 문자열의 첫번째 문자와 두번째 문자열의 마지막 문자가 같으면 true
	 * 2. 첫번째 문자열의 마지막 문자와 두번째 문자열의 첫번째 문자가 같으면 true
	 * 3. 위의 두 조건 모두 만족 시 true 리턴, 아니면 false
	 * @see https://edabit.com/challenge/RSbXRKoom6ED9Xe9i
	 * @param s1
	 * @param s2
	 * @return
	 */
	private static boolean isSameCaseOne(String s1, String s2) {
		return s1.charAt(0) == s2.charAt(s2.length() - 1);
	}

	private static boolean isSameCaseTwo(String s1, String s2) {
		return s1.charAt(s1.length() - 1) == s2.charAt(0);
	}

	public static boolean isStrangePair(String s1, String s2) {
		/* if (s1.length() == 0 && s2.length() == 0) {
			return true;
		} else if (s1.length() == 0 || s2.length() == 0) {
			return false;
		}
		// 위의 if문에서 조건식의 실행 순서를 바꾸면 오답 나옴
		// || 연산자는 두 조건 모두 참인 경우 조건문이 실행되므로 위에서 false를 반환함.
		// 두 문자열의 길이가 모두 0인 경우에 false를 반환해버림.
		// && : 두 조건 모두 참일 경우에만 참 반환
		// || : 두 조건 모두 거짓일 경우에만 거짓 반환
		return isSameCaseOne(s1, s2) && isSameCaseTwo(s1, s2); */

		// Other Solution
		if (s1.length() == 0 || s2.length() == 0) {
			return s1.length() == 0 && s2.length() == 0;
		}
		return s1.charAt(0) == s2.charAt(s2.length() - 1) && s2.charAt(0) == s1.charAt(s1.length() - 1);
	}

	/**
	 * Halve and Halve Again
	 * 1. a가 몇 번이나 반으로 나눠지는가. 2. 나눈 값이 b보다 큰 동안만. 3. 1000, 3 ➞ 8
	 * (1000 -> 500 -> 250 -> 125 -> 62.5 -> 31.25 -> 15.625 -> 7.8125 -> 3.90625
	 * @see https://edabit.com/challenge/FQPo8iZ8vuPEj2dKB
	 * @param a
	 * @param b
	 * @return
	 */
	public static int halveCount(int a, int b) {
		int halCount = 0;
		double x = a;

		while (true) {
			x /= 2;
			if (x <= b) { // count++ 하기 전 b보다 큰지 검사
				break;
			} else {
				halCount++;
			}
		}
		return halCount;
	}

	/**
	 * Clear the Fog
	 * str에서 f.o.g 제거. str에 f.o.g가 없으면 "It's a clear day!" 출력.
	 * @see https://edabit.com/challenge/SSiwbDE337QvJ9FCZ
	 * @param str
	 * @return
	 */
	public static String clearFog(String str) {
		String[] strArr = str.split("");
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].equals("f") || strArr[i].equals("o") || strArr[i].equals("g")) {
				strArr[i] = "";
			}
		}
		return str.length() == String.join("", strArr).length() ? "It's a clear day!" : String.join("", strArr);

		// Other Solution
		// return str.contains("fog") ? str.replaceAll("[fog]", "") : "It's a clear day!";

		// Other Soluion
		/* List<String> list = new ArrayList<>();
		for (Character ch : str.toCharArray()) {
			if (ch != 'f' && ch != 'o' && ch != 'g') {
				list.add(String.valueOf(ch));
			}
		}
		return str.length() == list.size() ? "It's a clear day!" : String.join("", list); */
	}

	/**
	 * Power of Two
	 * num이 2의 거듭제곱수인가? (2^n제곱인가)
	 * @see https://edabit.com/challenge/7LAsTPRvRH8sX6vD5
	 * @param num
	 * @return
	 */
	public static boolean powerOfTwo(final int num) {
		/* int pow = 1;
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
		} */

		// Other Solution
		int copyNum = num;
		while (copyNum != 1) {
			if (copyNum % 2 != 0) {
				return false;
			}
			copyNum = copyNum / 2;
		}
		return true;

		// Other Solution
		/* int pow = 1;
		int i = 0;
		while (pow <= num) {
			pow = (int) Math.pow(2, i);
			++i;
			if (pow == num) {
				return true;
			}
		}
		return false; */
	}

	/**
	 * Hiding the Card Number
	 * 문자열 마지막 4자리 빼고 *로 변환
	 * @see https://edabit.com/challenge/8ZFob4Juk8jzHMAHA
	 * @param card
	 * @return
	 */
	public static String cardHide(String card) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < card.length(); i++) {
			sb.append(card.length() - 4 > i ? "*" : card.charAt(i));
		}
		return sb.toString();

		// Other Solutioin
		// return card.replaceAll(".(?=.{4})", "*");
		// x(?=y) : 'y'가 뒤따라오는 x. 
		// .(?=.{4}) : 아무 문자나 4개가 뒤따라오는'(?=.{4})' 아무 문자 '.'
	}

	/**
	 * Get the File Extension
	 * 파일명의 확장자 리턴. {"index.html", "main.css"} -> {"html", "css"} 리턴
	 * @see https://edabit.com/challenge/ENNmwseEab73TMoBc
	 * @param arr
	 * @return
	 */
	public static String[] getExtension(String[] arr) {
		/* String[] extension = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			extension[i] = arr[i].split("\\.")[1];
			// 각 요소를 .을 기준으로 나눈 뒤 뒤의 요소만 배열에 저장
			// split(".") -> 안 됨. split("[.]") -> 됨. split("\\.") -> 됨.
		}
		return extension; */

		// Other Solution
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].substring(arr[i].indexOf(".") + 1);
		}
		return arr;

		// Other Solution
		/* String ext[] = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			String pattern = "^.+[.]";
			// 아무 문자 하나 이상으로 시작하는 "."
			// "abc.", "a.", "sadfasdfasdfasdf." 등을 의미
			ext[i] = arr[i].replaceAll(pattern, "");
		}
		return ext; */
	}

	/**
	 * GCD of Two Numbers
	 * n1과 n2의 최대공약수 구하기
	 * @see https://edabit.com/challenge/jrh488nh4CyDmwMre
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static int gcd(int n1, int n2) {
		/* int gcd = Integer.MIN_VALUE;
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
		return gcd; */

		// Other Solution
		/* int gcd = Integer.MIN_VALUE;
		for (int tmpCommonDivisor = 1; tmpCommonDivisor <= Math.min(n1, n2); tmpCommonDivisor++) {
			if (n1 % tmpCommonDivisor == 0 && n2 % tmpCommonDivisor == 0) {
				if (gcd < tmpCommonDivisor) { // 공약수가 이전의 최대공약수보다 크다면
					gcd = tmpCommonDivisor; // 공약수를 최대공약수에 대입.
				}
			}
		}
		return gcd; */

		// Other Solution
		int i = n1 < n2 ? n1 : n2; // i(최대공약수)를 둘 중 더 작은 값으로 초기화 하고
		while (!(n1 % i == 0 && n2 % i == 0)) { // i가 n1, n2 둘 다 나누어지는 경우가 아니라면
			i--; // i값 감소. 위의 조건을 만족하는 i값이 나오지 않으면 while문 반복. 반복하면서 i 값 중 가장 큰 값을 찾음.
		}
		return i; // while문의 조건을 만족하지 않는 경우(i로 n1, n2를 모두 나눌 수 있는 경우) i값 리턴

		// Other Solution
		// return (n2 == 0) ? n1 : gcd(n2, n1 % n2);

		// Other Solution
		/* if (n2 != 0) {
			return gcd(n2, n1 % n2);
		} else {
			return n1;
		} */
	}

	/**
	 * Reverse an Array
	 * 배열을 반대로 출력
	 * @see https://edabit.com/challenge/j5mm8HjTZGZagrnz8
	 * @param arr
	 * @return
	 */
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
	 * 두 자리의 수 num의 앞,뒷자리 수를 바꾸었을 때, 원래의 num이 자리를 바꾼 num 이상이면 true 아니면 false
	 * num = 39, reverseNum = 93 -> false. num = 99, reverseNum = 99 -> true;
	 * @see https://edabit.com/challenge/Jr7ueGQMEthBFYpB6
	 * @param num
	 * @return
	 */
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
		int reverseNum = Integer.parseInt(reverseNumStr);
		return num >= reverseNum;

		// Other Solution
		/* int dig1 = num % 10;
		int dig2 = num / 10;
		return dig2 >= dig1; */
	}

	/**
	 * Grab the City
	 * 문자열에서 도시 이름 출력. 도시 이름은 [] 안에 들어감. 도시 이름이 들어간 [] 은 문자열 맨 마지막에만 옴.
	 * @see https://edabit.com/challenge/NgyZdeFBWJcBGXxjq
	 * @param str
	 * @return
	 */
	public static String grabCity(String str) {
		// 문자열을 쪼갠 후 맨 마지막 요소만 출력, 마지막 요소에서 [] 제거
		/* String[] strArr = str.split("\\[");
		String city = strArr[strArr.length - 1];
		city = city.replaceAll("[\\]]", "");
		// 특수문자 제거 표현식. 제거하려는 특수문자 앞에 \\ 붙여 사용.
		return city; */

		// Other Solution
		return str.substring(str.lastIndexOf('[') + 1, str.lastIndexOf(']'));
	}

	/**
	 * Letters Only
	 * 문자열에서 특수문자, 숫자 제외한 문자만 리턴
	 * @see https://edabit.com/challenge/HPcr7REWMLTosoXME
	 * @param str
	 * @return
	 */
	public static String lettersOnly(String str) {
		return str.replaceAll("[^a-zA-Z]", "");

		// Other Solution
		/* StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString(); */
	}

	/**
	 * Convert a Number to Base 2
	 * decimal을 2진수로 리턴. 문자열로 리턴. 리턴값은 1024 이상일 수 없음. && 연산자는 유용하게 쓰일 수 있다.
	 * @see https://edabit.com/challenge/xH7uvX2MoH8e85aYS
	 * @param decimal
	 * @return
	 */
	public static String binary(int decimal) {
		StringBuilder binaryStr = new StringBuilder();
		StringBuilder remainderStr = new StringBuilder();

		if (decimal == 0) { // 아래의 while문 실행되지 않으므로 그대로 "0" 리턴.
			return "0";
		}
		while (decimal != 0) {
			remainderStr.append(String.valueOf(decimal % 2));
			decimal = decimal / 2;
		}
		for (int i = remainderStr.length() - 1; i >= 0; i--) {
			binaryStr.append(remainderStr.charAt(i));
		}
		return binaryStr.toString();

		// Other Solution
		// return Integer.toBinaryString(decimal);
	}

	/**
	 * Valid Variable Names
	 * variable이 올바른 변수명인가 리턴
	 * 변수명은 항상 문자로 시작해야 함. 
	 * variable이 숫자나 특수문자로 시작하거나, _ 이외의 특수문자를 포함하거나 공백이 있거나 -> false 리턴
	 * @see https://edabit.com/challenge/6gDTBRgZKpotCsgib
	 * @param variable
	 * @return
	 */
	public static boolean variableValid(String variable) {
		/* // 공백을 포함하는 경우
		for (int i = 0; i < variable.length(); i++) {
			if (variable.charAt(i) == ' ') {
				return false;
			}
		}
		// _를 제외한 특수문자를 포함하는 경우
		if (variable.matches("^[^a-zA-Z_].*")) {
			// 정규표현식
			// [^a-zA-Z] -> a~z, A~Z가 아닌 경우
			// ^[~] -> ~로 시작하는 경우
			// ^[^a-zA-Z_] -> a~z, A~Z, _가 아닌 경우(특수 문자, 숫자)로 시작하는 경우
			// . -> 임의의 단일 문자
			// [~]* ~ 문자가 0개에서 n개까지
			return false;
		}
		return true; */

		// Other Solution
		return variable.matches("^[a-zA-Z_][a-zA-Z0-9_]*$");
		// 정규표현식
		// [~]$ -> ~로 종료되는 경우
		// ^[~][~~]$ -> 시작하는 문자의 패턴[~], 종료하는 문자의 패턴[~~]
		// ^[a-zA-Z_][a-zA-Z0-9_]*$ -> [a-zA-Z_]로 시작하면서, 그 다음 문자가 [a-zA-Z0-9_]인 경우이고
		// 0개에서 n개일 수 있고 [a-zA-Z0-9]인 경우로 끝남.
	}

	/**
	 * Solving Exponential Equations With Logarithms
	 * b는 a의 몇 제곱인가?
	 * @see https://edabit.com/challenge/oB67n674gwdTi33P4
	 * @param a
	 * @param b
	 * @return
	 */
	public static int solveForExp(int a, int b) {
		// b가 a로 pow번 나누어지면 b는 a의 pow제곱
		// a = 2, b = 16; pow = 0일 때,
		// pow = 1, b = 8 // pow = 2, b = 4 // pow = 3, b = 2 // pow = 4, b = 1
		int pow = 0;
		while (b != 1) {
			b /= a;
			pow++;
		}
		return pow;

		// Other Solution
		// return (int) (Math.log(b) / Math.log(a));
	}

	/**
	 * Check if One Array can be Nested in Another
	 * arr1 배열의 값들이 arr2 배열 값들의 사이에 들어가는가.
	 * arr1 요소는 arr2 요소의 최소값보다 크고 최대값보다 작아야 함
	 * [1, 2, 3, 4], [0, 6]) ➞ true, [9, 9, 8], [8, 9]) ➞ false
	 * @see https://edabit.com/challenge/xkD7RBBDiWuDHTiXE
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public static boolean canNest(int[] arr1, int[] arr2) {
		/* Arrays.sort(arr2); // 오름차순 정렬. 뒤로 갈수록 값이 커짐
		int minRange = arr2[0];
		int maxRange = arr2[arr2.length - 1];
		for (int i = 0; i < arr1.length; i++) {
			if (minRange >= arr1[i] || maxRange <= arr1[i]) {
				// 미만의 반대는 초과가 아니라 이상. x가 10보다 작아야 할 때 그 반대는 10을 포함한 10 이상의 값.
				// 초과의 반대는 미만이 아니라 이하. x가 10보다 커야 할 때 그 반대는 10을 포함한 10 이하의 값.
				// 두 가지 조건 중 하나라도 참이면 참, 두 조건 모두 참이면 참 -> return false
				// 주 조건 모두 거짓이면 거짓 -> for 문 탈출. return true
				return false;
				// 참, 거짓을 구할 때 더 많은 경우가 나오는 것들을 반복물을 통해 구함
				// 본 문제의 경우 두 조건이 모두 참이어서 참을 반환하는 것보다 하나라도 참이어서 참을 반환하는 경우가 많으므로 그러한 경우들을 반복문을 통해 찾음.
			}
		}
		return true; */

		// Other Solution
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if (arr1[0] > arr2[0] && arr1[arr1.length - 1] < arr2[arr2.length - 1]) {
			return true;
		}
		return false;
	}

	/**
	 * Stripping a Sentence Down
	 * 문자열 str에서 문자열 chars의 문자를 제거한 문자열 리턴
	 * ("the quick brown fox jumps over the lazy dog", "aeiou") ➞ "th qck brwn fx jmps vr th lzy dg"
	 * @see https://edabit.com/challenge/EiGazR6eGXHMx3hTy
	 * @param str
	 * @param chars
	 * @return
	 */
	public static String stripSentence(String str, String chars) {
		// chars의 각 문자와 str의 각 문자를 비교하여 같으면 ""로 대체
		// str = "loop and condition";
		// chars = "ond";

		// 오답
		/* for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < chars.length(); j++) {
				if (str.charAt(i) == chars.charAt(j)) {
					str = str.replaceAll(str.charAt(i) + "", "");
					// 변환이 되는 대상을 ""(공백)으로 변환하면 문자열의 길이가 달라지고
					// 초기에 할당되었던 인덱스가 바뀜에 따라 검사를 거치지 않고 누락되는 문자들이 발생함(원래의 있던 자리에서 앞으로 당겨지게 됨에 따라	검사를 거치지 않게 됨)
					// 이중 for문 사용 시 변환의 대상을 바깥 for문에 두지 말 것
				}
			}
		} */

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

		// Other Solution
		// chars = "[" + chars + "]";
		// return str.replaceAll(chars, "");

		// return str.replaceAll("[" + chars + "]", "");
	}

	/**
	 * Alternating Ones and Zeroes
	 * 주어진 0과 1을 가지고 하나씩 교차하면서 다시 적을 수 있으면 true 아니면 false
	 * 0001111 ➞ true. Can make: 1010101 // 010001 ➞ false
	 * @see https://edabit.com/challenge/D7PZ7rcKGRiCvcm7C
	 * @param str
	 * @return
	 */
	public static boolean canAlternate(String str) {
		/* int zeroCnt = 0;
		int oneCnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0') {
				zeroCnt++;
			} else if (str.charAt(i) == '1') {
				oneCnt++;
			}
		}
		return Math.abs(zeroCnt - oneCnt) == 1 || Math.abs(zeroCnt - oneCnt) == 0; */

		// Other Solution
		/* long zeroCnt = str.chars().filter(ch -> ch == '0').count();
		long oneCnt = str.chars().filter(ch -> ch == '1').count();
		return zeroCnt - oneCnt >= -1 && zeroCnt - oneCnt <= 1; */

		// Other Solution
		int zeros = str.replace("1", "").length();
		int ones = str.replace("0", "").length();
		return Math.abs(zeros - ones) <= 1;
	}

	/**
	 * Semantic Versioning
	 * 문자열에서 세 숫자는 각 Major, Minor, Patch의 수를 의미. 각 숫자 리턴	 
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

	/**
	 * Fix the Spacing 
	 * 불필요한 공백 다 지우기
	 * @see https://edabit.com/challenge/LJh54oryEc3tkagzD
	 * @param sentence
	 * @return
	 */
	public static String correctSpacing(String sentence) {
		/* String[] splitedWords = sentence.split(" ");
		// Arrays.toString(splitedWords) = [, A, , glittering, , gem, , , , , is, , , ,
		// not, , , enough.] 등의 결과 출력
		// 쉼표 사이들의 공백은 " "이 아니라 각 요소들을 구분하기 위한 공백임...쉼표 사이에 값이 없는 것들임. ""을 의미.
		String correctSpace = "";
		for (int i = 0; i < splitedWords.length; i++) {
			if (!(splitedWords[i].equals(" ")) && splitedWords[i].length() != 0) {
				// 요소가 " "이 아니거나 요소의 길이가 0이 아닌 경우(요소는 있으나 값이 없는 경우)
				// == 문자열을 포함하는 경우
				String word = " " + splitedWords[i];
				// 앞 문자열과 뒷 문자열에 공백을 만들어 줌.
				correctSpace += word;
			}
		}		
		return correctSpace.substring(1);
		// 문자열의 맨 앞에 붙은 공백 제거하기 위해 인덱스 1번 문자열부터 출력
		// substring 사용 시 시작 인덱스만 입력하면 끝 인덱스 넣지 않아도 문자열 마지막까지 출력
		// 문자 하나하나 붙일 때 반복문 사용하지 말고 substring 사용할 것. */

		// Other Solution
		/* while (sentence.contains("  ")) {
			 sentence = sentence.replace("  ", " ");
		}
		return sentence.trim(); */

		// Other Solution
		// return sentence.replaceAll("[ ]+", " ").trim();

		// Other Solution
		/* StringTokenizer tokenizer = new StringTokenizer(sentence, " ");
		StringBuilder sb = new StringBuilder();
		while (tokenizer.hasMoreTokens()) {
			sb.append(tokenizer.nextToken());
			if (tokenizer.hasMoreTokens())
				sb.append(" ");
		}
		return sb.toString(); */

		// Other Solution
		return sentence.replaceAll("[ ]+", " ").trim();
	}

	/**
	 * The Fibonacci Number
	 * 피보나치 수열에서 a번째 수의 값 구하기. 수열은 1로 시작함 
	 * @see https://edabit.com/challenge/t3NThQjrcbjhiF5zt
	 * @param a
	 * @return
	 */
	public static int Fibonacci(int a) {
		// 피보나치 수열 : 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 .....
		// f(0) = 1;	
		// f(1) = 1;
		// f(2) = 2;	f(0) + f(1)
		// f(3) = 3;	f(1) + f(2)

		return a == 0 || a == 1 ? 1 : Fibonacci(a - 2) + Fibonacci(a - 1);
	}

	/**
	 * Same ASCII? 1. 각 문자열의 문자들이 갖는 아스키 코드값의 합이 갖은가
	 * 
	 * @see https://edabit.com/challenge/P4sy69B7cqggNmtmm
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean sameAscii(String a, String b) {
		/* int sumAsciiA = 0;
		int sumAsciiB = 0;
		for (int i = 0; i < a.length(); i++) {
			sumAsciiA += a.charAt(i);
		}
		for (int i = 0; i < b.length(); i++) {
			sumAsciiB += b.charAt(i);
		}
		return sumAsciiA == sumAsciiB; */

		// Other Solution
		// return getSum(a) == getSum(b);

		// Other Solution
		return a.chars().sum() == b.chars().sum();
	}

	private static int getSum(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += s.charAt(i);
		}
		return sum;
	}

	/**
	 * Move Capital Letters to the Front
	 * 문자열에서 대문자는 문자열의 앞으로 보내기
	 * 문자의 원래 순서 지킬 것. 첫 번째 대문자는 문자열의 첫 번째, 두 번째는 두 번째..	 
	 * @see https://edabit.com/challenge/vs7xj6PwALtfpjkmX
	 * @param str
	 * @return
	 */
	public static String capToFront(String str) {
		// 아스키코드 값으로 대소문자 구분해서 문자열 만든 후 붙이기

		/* String upperWord = "";
		String lowerWord = "";
		for (int i = 0; i < str.length(); i++) {
			int asciiVal = str.charAt(i);
			if (asciiVal >= 65 && asciiVal <= 90) {
				upperWord += str.charAt(i);
			} else if (asciiVal >= 97 && asciiVal <= 122) {
				lowerWord += str.charAt(i);
			}
		}
		return upperWord + lowerWord; */

		// Other Solution
		/* StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				sb.append(str.charAt(i));
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString(); */

		// Other Solution
		return str.replaceAll("[a-z]", "") + str.replaceAll("[A-Z]", "");
		// str.replaceAll("[a-z]", "") : 문자열의 소문자를 모두 제거. 대문자만 남음.
		// str.replaceAll("[a-z]", "") : 문자열의 대문자를 모두 제거. 소문자만 남음.
	}

	/**
	 * Format Number with Comma(s) Separating Thousands
	 * 숫자를 천 단위로 끊어서 문자열로 출력 formatNum(100000) ➞ "100,000". formatNum(20) ➞ "20"
	 * @see https://edabit.com/challenge/BN7hYwzFACGoDZux7
	 * @param num
	 * @return
	 */
	public static String numFormat(int num) {

		/* String numStr = String.valueOf(num); // num을 문자열로 변환
		if (numStr.length() < 4) {
			return numStr;
		}
		String reverseNumStr = "";
		int count = 0; // for문 실행 횟수. == 문자 하나씩 추가되는 횟수.
		
		// 틀린 for문. 길이를 조건식으로 사용하는데 길이 조작하지 말 것.
		// for (int i = numStr.length() - 1; i >= 0; i--) {
		// 	if (revNumStr.length() != 0 && revNumStr.length() % 3 == 0) {
		// 		revNumStr = revNumStr + ',';
		// 	}
		// 	revNumStr += numStr.charAt(i);
		// }
		
		for (int i = numStr.length() - 1; i >= 0; i--) { // 문자열을 거꾸로 저장하면서
			reverseNumStr += numStr.charAt(i);
			count++;
			if (count % 3 == 0) { // 천 단위마다. 문자 3개 찍은 후
				reverseNumStr = reverseNumStr + ","; // 콤마 추가
			}
		}
		
		String formatNum = "";
		for (int i = reverseNumStr.length() - 1; i >= 0; i--) { // 문자열을 다시 거꾸로 저장 == 원래 순서
			formatNum += reverseNumStr.charAt(i);
		}
		return formatNum; */

		// Other Solution
		/* String numStr = String.valueOf(num);
		String formatNum = "";
		
		for (int i = numStr.length() - 1, cnt = 1; i >= 0; i--, cnt++) {
			// for문 조건식에 인덱스 아닌 다른 변수 추가 가능.
			// cnt는 for문 안에서만 사용되므로 for문 안에서 선언
			formatNum = (cnt % 3 == 0 ? "," : "") + numStr.charAt(i) + formatNum;
			// 조건식이 하나인 조건문( a or b) 삼항연산자로 수정
			
			// formatNum += numStr.charAt(i);
			// 문자를 정순으로 저장 (왼쪽에서 오른쪽으로)
			// numStr="abcd"라면 formatNum = "abcd" 순
			// formatNum = numStr.charAt(i) + formatNum;
			// 문자를 역순으로 저장 (오른쪽에서 왼쪽으로)
			// numStr="abcd"라면 formatNum = "dcba" 순
			// 현재 인덱스의 문자가 문자열 맨 앞에 오고 뒤에 그 전의 문자열들을 붙임.
		}
		return formatNum; */

		// Other Solution
		String numStr = String.valueOf(num);
		StringBuilder sb = new StringBuilder();

		while (true) {
			if (numStr.length() >= 4) {
				sb.insert(0, numStr.substring(numStr.length() - 3, numStr.length())).insert(0, ",");
				// .insert(삽입할 위치(인덱스), 삽입할 대상)
				numStr = numStr.substring(0, numStr.length() - 3);
			}
			if (numStr.length() < 4) {
				sb.insert(0, numStr);
				break;
			}
		}
		return sb.toString();

		// Other Solution
		// return String.format("%,d", num);
		// return new DecimalFormat(",###").format(num);
		// return (NumberFormat.getNumberInstance(Locale.US).format(num));

		// Other Solution
		/* String formatStr = "";
		int strLength = String.valueOf(num).length();
		for (int i = 0; i < strLength; i++) {
			if ((strLength - i) % 3 == 0)
				formatStr += ",";
			formatStr += Integer.toString(num).charAt(i);
		}
		return formatStr; */

		// Other Solution
		/* StringBuilder sb = new StringBuilder();
		do {
			int digit3 = num % 1000;
			num /= 1000;
			String format = num == 0 ? "%d" : "%03d";
			String strDigit3 = String.format(format, digit3);
			sb.insert(0, (num == 0 ? "" : ",") + strDigit3);
		} while (num > 0);
		return sb.toString(); */
	}

	/**
	 * One Button Messaging Device
	 * 1. 문자열에서 문자 'a'는 버튼을 한 번 눌러야 함. 'b'는 버튼 두 번, 'e'는 다섯 번....
	 * 문자열이 "abde"라면 12번 눌러야 함. 문자열 msg는 버튼을 몇 번 눌러야 하는가. 공백 무시. 
	 * @see https://edabit.com/challenge/CCRmCv3huDnBsqmR7
	 * @param msg
	 * @return
	 */
	public static int howManyTimes(String msg) {

		/* int times = 0;
		for (int i = 0; i < msg.length(); i++) {
			for (int j = 'a'; j <= msg.charAt(i); j++) {
				times++;
				// 기존 변수 cnt 삭제. cnt가 곧 times
			}
		}
		return times; */

		// Other Solution
		int times = 0;
		for (int i = 0; i < msg.length(); i++) {
			times += getCharactersValue(msg.charAt(i));
		}
		return times;

		// Other Solution
		/* if (msg.length() == 0) {
			return 0;
		}
		return ((int) msg.charAt(0)) - 96 + howManyTimes(msg.substring(1));
		// (int) msg.charAt(0) : 0번 인덱스 문자의 아스키코드 값
		// (int) msg.charAt(0) - 96 : 문자가 갖는 버튼 횟수.
		// a의 아스키코드 값은 97이므로 -96 해주면 누르는 버튼 횟수가 나옴.
		// howManyTimes(msg.substring(1)) : 0번 인덱스를 제외한 나머지 문자들 다시 메소드 돌림 */
	}

	private static int getCharactersValue(char ch) {
		// 의미 전달이 확실한 메소드명으로 수정
		return ch - 'a' + 1;
		// 문자의 길이만큼 반복문 돌릴 필요 없이 각 문자가 갖는 수의 규칙을 수식으로 표현하여 값 리턴
	}

	/**
	 * Fraction Greater Than One
	 * 문자열의 숫자를 계산했을 때 1보다 크냐 frac > 1
	 * @see https://edabit.com/challenge/tgcyRZECD5tqHvTWi
	 * @param frac
	 * @return
	 */
	public static boolean greaterThanOne(String frac) {

		String[] fracArray = frac.split("\\/");
		return Double.parseDouble(fracArray[0]) / Double.parseDouble(fracArray[1]) > 1;
		// return Integer.parseInt(fracArray[0]) / Integer.parseInt(fracArray[1]) > 1;
		// parseInt() 사용 시 정수형을 리턴하므로 1.x의 값들을 1로 리턴함.

		// Other Solution
		/* String[] fracs = frac.split("/");
		return Integer.parseInt(fracs[0]) > Integer.parseInt(fracs[1]); */
	}

	/**
	 * How Many Decimal Places?
	 * 소수점 이하 자릿수 리턴. 소수점 이하 자리가 없다면 0 리턴
	 * @see https://edabit.com/challenge/kQZH2EDsn7LYvXk9S
	 * @param num
	 * @return
	 */
	public static int getDecimalPlaces(String num) {
		// 소수점 이하 자리가 없다 == 정수 == 소수점 없음
		// == 구분자로 나뉘지 않는다 == 배열 값은 한 개만 가진다
		String[] numArr = num.split("\\.");
		// 구분자로 나누어지지 않는 문자열은 그 문자열 자체로 배열에 저장됨.
		return numArr.length == 1 ? 0 : numArr[1].length();

		// Other Solution
		// return num.contains(".") ? (num.length() - (num.indexOf(".") + 1)) : 0;
		// indexOf(str) : str의 인덱스 번호 리턴. 문자가 존재하지 않으면 -1 리턴
		// (num.indexOf(".") + 1) : .까지의 길이.
	}

	/**
	 * Even or Odd Number of Factors
	 * num의 약수 갯수가 짝수인가 홀수인가 "even", "odd" 리턴
	 * @see https://edabit.com/challenge/N3ZBDe99aq8Piar8n
	 * @param num
	 * @return
	 */
	public static String factorGroup(int num) {
		/* double rootNum = Math.sqrt(num);
		return rootNum == (int) rootNum ? "odd" : "even"; */

		// Other Solution
		// return Math.sqrt(num) % 1 == 0 ? "odd" : "even";

		// Other Solution
		int rootNum = (int) Math.sqrt(num);
		return rootNum * rootNum == num ? "odd" : "even";
	}

	/**
	 * Is the Word an Isogram?
	 * 문자열에 중복되는 문자가 있는가. 중복되면 false 리턴. 대소문자 무시
	 * @see https://edabit.com/challenge/AYQPBDjDbrrvJtjjc
	 * @param str
	 * @return
	 */
	public static boolean isIsogram(String str) {
		/* str = str.toLowerCase();
		for (int i = 0; i < str.length() - 1; i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true; */

		// Other Solution
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < str.length(); ++i) {
			if (!set.add(Character.toLowerCase(str.charAt(i)))) {
				// .add()의 리턴 타입 boolean. 문자가 중복되어 저장되지 않는다면 false 리턴.
				return false;
			}
		}
		return true;

		// Other Solution
		// return (int) str.toLowerCase().chars().distinct().count() == str.length();
	}

	/**
	 * Increment to Top
	 * 값이 제일 큰 요소까지 증가량의 합 리턴
	 * @see https://edabit.com/challenge/HtruskPio7ricRvuG
	 * @param arr
	 * @return
	 */
	public static int incrementToTop(int[] arr) {
		Arrays.sort(arr);
		int increment = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j < arr.length - 1; j++) {
				increment += (arr[j + 1] - arr[j]);
			}
		}
		return increment;
	}

	/**
	 * Secret Society
	 * 배열의 각 요소에서 첫 문자만 딴 뒤 알파벳순으로 정렬한 문자열 리턴
	 * @see https://edabit.com/challenge/zr7BBJbeYikNBN2hf
	 * @param friends
	 * @return
	 */
	public static String societyName(String[] friends) {

		Arrays.sort(friends);
		String secret = "";
		for (int i = 0; i < friends.length; i++) {
			secret += friends[i].charAt(0);
		}
		return secret;
	}

	/**
	 * Maximum Possible Total
	 * 배열에는 10개의 숫자만 주어짐. 10개의 숫자 중 큰 5개의 숫자를 더해서 리턴
	 * @see https://edabit.com/challenge/TM5f33Mpu52m2jcat
	 * @param nums
	 * @return
	 */
	public static int maxTotal(int[] nums) {
		Arrays.sort(nums);
		int total = 0;
		for (int i = nums.length - 5; i < nums.length; i++) {
			total += nums[i];
		}
		return total;
	}

	/**
	 * Stretched Words	 
	 * 중복되는 글자 제거해기 tttiiiiiiiiitlllleee -> title 리턴
	 * "passing", "lottery" 같은 경우는 문제에 포함하지 않음.
	 * @see https://edabit.com/challenge/vENakDEYEDKFGPSEb
	 * @param word
	 * @return
	 */
	public static String unstretch(String word) {
		/* StringBuilder sb = new StringBuilder(" "); 
		// " " : word의 문자와 sb의 마지막 문자를 비교하기 위해 임의로 넣은 초기 문자
		for (int i = 0; i < word.length(); i++) {
			if (sb.charAt(sb.length() - 1) != word.charAt(i)) {
				sb.append(word.charAt(i));
			}
		}
		return sb.toString().trim(); */

		// Other Solution
		StringBuilder sb = new StringBuilder(String.valueOf(word.charAt(0)));
		// StringBuilder 객체 생성 시 파라미터로 String 타입이 들어가야 함.
		for (int i = 1; i < word.length(); i++) {
			if (word.charAt(i) != word.charAt(i - 1)) {
				sb.append(word.charAt(i));
			}
		}
		return sb.toString();

		// Other Solution
		// return word.replaceAll("([a-zA-Z])\\1+", "$1");
	}

	/**
	 * Check if the Same Case
	 * 단어의 모든 문자가 같은 Case인가.
	 * @see https://edabit.com/challenge/kADGssuyM6vTEwS8p
	 * @param str
	 * @return
	 */
	public static boolean sameCase(String str) {

		/* boolean firstCharUpperCase = Character.isUpperCase(str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			if (firstCharUpperCase && Character.isLowerCase(str.charAt(i))
					|| !firstCharUpperCase && Character.isUpperCase(str.charAt(i))) {
				return false;
			}
		}
		return true; */

		// Other Solution
		return str.toUpperCase().equals(str) || str.toLowerCase().equals(str);
	}

	/**
	 * Factor Chain
	 * 배열이 약수의 연속으로 이어지는가. i-1번째의 요소가 i번째의 약수인가
	 * 
	 * @see https://edabit.com/challenge/SvptD77rYQJgjDvZY
	 * @param arr
	 * @return
	 */
	public static boolean factorChain(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] % arr[(i - 1)] != 0) {
				return false;
			}
		}
		return true;

		// List<Integer> list = new ArrayList<>();
		// for (int num : arr) {
		// 	list.add(num);
		// }

		// for (int i = 1; i < list.size(); i++) {
		// 	if (list.get(i) % list.get(i - 1) != 0) {
		// 		return false;
		// 	}
		// }
		// return true;
	}

	/**
	 * Automorphic Numbers
	 * n의 제곱수 끝자리에 n을 포함하는가
	 * ex) 5*5 = 25 25의 끝자리에 5를 포함하므로 true. 76*76 = 5776 -> true
	 * 
	 * @see https://edabit.com/challenge/GobCTBruAvA3ZDr4J
	 * @param n
	 * @return
	 */
	public static boolean isAutomorphic(int n) {
		// 방법 1.
		String nStr = String.valueOf(n);
		String nsqStr = String.valueOf((long) Math.pow(n, 2));
		// n^2의 범위가 int형을 벗어날 수 있으므로 long으로 형변환
		return nStr.matches(nsqStr.substring(nsqStr.length() - nStr.length()));

		// 방법 2.
		// return nsqStr.endsWith(nStr);
	}

	/**
	 * The Reverser!
	 * 문자열 거꾸로 출력하되 대문자는 소문자로, 소문자는 대문자로 바꿔서
	 * 
	 * @see https://edabit.com/challenge/gPWZDe6rciBzYdz3B
	 * @param text
	 * @return
	 */
	public static String theReverser(String text) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < text.length(); i++) {
			if (Character.isUpperCase(text.charAt(i))) {
				sb.append(Character.toLowerCase(text.charAt(i)));
			} else if (Character.isLowerCase(text.charAt(i))) {
				sb.append(Character.toUpperCase(text.charAt(i)));
			} else {
				sb.append(text.charAt(i));
			}
		}
		return sb.reverse().toString();
	}

	/**
	 * The Collatz Conjecture
	 * 1. n이 짝수이면 n = n / 2, n이 홀수이면 n = n*3 + 1
	 * 2. n이 1이 되기까지 몇 번 계싼해야 하는가
	 * 콜라츠 추측이라고 함...
	 * @see https://edabit.com/challenge/8s2jBHWKXCrT5oQ63
	 * @param n
	 * @return
	 */
	public static int collatzConjecture(int n) {

		int count = 0;
		while (n != 1) {
			n = n % 2 == 0 ? n / 2 : n * 3 + 1;
			count++;
		}
		return count;

		// Other Solution
		// return n < 2 ? 0 : 1 + collatzConjecture(n % 2 == 0 ? n / 2 : n * 3 + 1);
		// n이 4라면 return 1 + collatzConjecture(2)
		//   							  1 + 1 + collatzConjecture(1)
		// 								  1 + 1 + 0
		// return 2;
	}

	/**
	 * Total Volume
	 * 각각의 일차원 요소들의 값들끼리 곱한 후 그 일차원 요소들의 곱한 값들끼리의 합 리턴
	 * ([2, 3, 2], [6, 6, 7], [1, 2, 1]) ➞ 266
	 * (2 x 3 x 2) + (6 x 6 x 7) + (1 x 2 x 1) = 12 + 252 + 2 = 266.
	 * 일차원 배열의 길이는 3. 이차원 배열의 길이는 최소 1.
	 * @see https://edabit.com/challenge/ibJLbwfkTbP9229Kt
	 * @param part
	 * @return
	 */
	public static int totalVolume(int[][] part) {
		int multiplySum = 1;
		int sumOfMultipleSum = 0;
		for (int[] oneDemensionArr : part) { // 이차원 배열에서 일차원 배열 하나씩 꺼내옴
			for (int value : oneDemensionArr) { // 일차원 배열에서 요소 하나씩 꺼내옴
				multiplySum *= value;
			}
			sumOfMultipleSum += multiplySum; // 일차원 배열 요소끼리 곱의 결과를 합 변수에 저장하고
			multiplySum = 1;
			// 일차원에서 요소가 다 나온 후 multiplySum 변수 다시 초기화. 미 초기화 시 값을 그대로 가지고 다음 일차원 요소의 값과 곱함.
		}
		return sumOfMultipleSum;

		// Other Solution
		/* int result = 0;
		for (int[] parts : part) {
			result += parts[0] * parts[1] * parts[2];
		}
		return result; */
	}

	/**
	 * Any Prime Number in Range
	 * 두 수의 범위 안에 소수가 있는가
	 * @see https://edabit.com/challenge/NjJ9gGNPGaQGxTxCc
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static boolean primeNumberInRange(int n1, int n2) {
		for (int i = n1; i <= n2; i++) {
			if (Helper.isPrime(i)) {
				return true;
			}
		}
		return false;
	}
}