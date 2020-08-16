package my.sunghyuk.edabit;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class Note {
  public static void main(String[] ar) {
    // Arrays.fill(배열, 배열을 채울 값)
    int[][] arr = new int[3][5];
    for (int[] row : arr) {
      // int[] row : 2차원 배열 요소(1차원 배열)를 하나씩 가져와 담을 변수 선언
      Arrays.fill(row, 20);
      // 그 1차원 배열을 20으로 채움.

      Arrays.fill(row, 2, 4, 50);
      // Arrays.fill(배열, 시작인덱스, 종료인덱스, 배열을 채울 값)
      // 지정한 배열의 2,3 인덱스를 지정된 값으로 채움.
    }
    for (int[] row : arr) {
      System.out.println(Arrays.toString(row));
    }
    // [20, 20, 50, 50, 20]
    // [20, 20, 50, 50, 20]
    // [20, 20, 50, 50, 20]
    System.out.println("==============================================");

    // Arrays.copyOf(원본 배열, 생성할 배열의 길이), Arrays.copyOfRange(원본배열, 시작인덱스, 종료인덱스)
    int[] copyOfTest = new int[] { 1, 2, 3, 4, 5 };
    int[] copyArr = Arrays.copyOf(copyOfTest, copyOfTest.length);
    System.out.println(Arrays.toString(copyArr)); // {1, 2, 3, 4, 5}
    int[] rangeCopyArr = Arrays.copyOfRange(copyOfTest, 1, copyOfTest.length);
    // 인덱스 1부터 4까지 (copyOfTest.length = 5)
    System.out.println(Arrays.toString(rangeCopyArr)); // {2, 3, 4, 5}
    System.out.println("==============================================");

    //String.format("%.nf", 변환할 값(실수)), String.format("%자릿수d, 변환할 값(정수))
    double pie = 3.14159265358979;
    System.out.println(String.format("%.2f", pie)); // 3.14
    System.out.println(String.format("%.3f", pie)); // 3.142
    System.out.println(String.format("%010d", 12345)); // 0000012345 10자리 수. 앞을 0으로 채움
    System.out.println(String.format("%10d", 12345)); //      12345 앞을 공백으로 채움.
    // Math.round(변환할 값)
    int roundNum = Math.round(10.45f); // 소수점 첫째 자리에서 반올림 하여 정수로 리턴
    System.out.println(roundNum);
    System.out.println(Math.round(pie * 100) / 100.0); // 3.14
    System.out.println(Math.round(pie * 1000) / 1000.0); // 3.142
    // Math.round() : 소수점 아래 0 절삭, String.format() : 절삭하지 않음.

    System.out.println("==============================================");
    // .indexOf("찾을 문자열")  .indexOf("찾을 문자열", 시작 인덱스)
    // .lastIndexOf("찾을 문자열")  .lastIndexOf("찾을 문자열", 시작 인덱스)
    String indexOfTest = "Hello world";
    System.out.println(indexOfTest.indexOf("z")); // -1
    // 찾는 문자열이 없는 경우 -1 리턴
    System.out.println(indexOfTest.indexOf("o")); // 4
    System.out.println(indexOfTest.indexOf("o", 5)); // 7
    // 시작점 미입력 시 0번부터 시작
    // 시작점을 바꾼다고 하여 indexOfTest의 인덱스가 바뀌지는 않음. 원래의 인덱스 출력
    System.out.println(indexOfTest.lastIndexOf("z")); // -1
    System.out.println(indexOfTest.lastIndexOf("o")); // 7
    System.out.println(indexOfTest.lastIndexOf("o", 5)); // 4
    // 뒤에서부터 찾기 시작하지만 반환하는 인덱스는 원래의 인덱스 번호
    // 즉 왼쪽에서 몇 번째 위치하는지를 인덱스로 반환. 시작 인덱스 또한 원래의 인덱스 번호 기준
    System.out.println("==============================================");
    // Integer.toHexString(). 10진수를 16진수로 변환하는 방법
    System.out.printf("%02X%n", 255); // FF
    System.out.printf("%02x%n", 255); // ff
    System.out.printf("%X%n", 10); // A
    // %X : 16진수를 대문자로 // %x : 16진수를 소문자로
    // %02X : 2자리 16진수 값을 대문자로, 16진수 값이 1자리이면 앞에 0을 붙임 // %n : 개행
    String hexStr = String.format("%02X%n", 10);
    System.out.print(hexStr); // 0A
    System.out.println(Integer.toHexString(255)); // ff
    System.out.println(Integer.toHexString(255).toUpperCase()); // FF
    System.out.println(Integer.toHexString(10).toUpperCase()); // A
    System.out.println("==============================================");
    // Math.ceil(), Math.floor(), Math.round()
    System.out.println(Math.ceil(Math.PI)); // 올림 // 4.0
    System.out.println(Math.floor(3.7564)); // 내림 // 3.0
    System.out.println(Math.round(3.7564)); // 반올림 // 소수점 버림  // 4
    System.out.println(Math.round(3.1234)); // 반올림 // 소수점 버림  // 3
    System.out.println("==============================================");
    // .equal()과 == 비교
    // == :
    // - 항등 연산자이다.
    // - 참조 비교 (주소 비교) : 두 객체가 같은 메모리 공간을 가리키는지 확인한다.
    // - 모든 기본 유형(Privitive types)에 대해 적용할 수 있다.
    // - 객체 유형(Object type)에 대해서도 적용할 수 있다.
    // 이 때, 넘어온 객체 유형 간에 호환성이 있어야 한다 (부모-자식 관계, 동일한 유형)
    // .equals() : 
    // - 객체 비교 메서드이다.
    // - 내용 비교 : 두 객체의 값이 같은지 확인한다. 즉 문자열의 데이터/내용을 기반으로 비교한다.
    // - 기본 유형에 대해서는 적용할 수 없다.    
    String equalTest1 = "equal";
    String equalTest2 = equalTest1;
    String equalTest3 = new String("equal");
    String equalTest4 = new String("equal");
    // eqaulTest1, 3, 4는 각각 다른 주소를 갖는 다른 객체.
    System.out.println(equalTest1 == equalTest2); // true. 주소값 같음
    System.out.println(equalTest1.equals(equalTest2)); // true. 값 같음
    System.out.println(equalTest1.equals(equalTest3)); // true. 값 같음
    System.out.println(equalTest1 == equalTest4); // false. 주소값 다름.
    System.out.println(equalTest3 == equalTest4); // false. 주소값 다름.

    String[] strArr = new String[3]; // 배열은 참조형 변수 (객체를 가리키는 주소값을 가짐)
    strArr[0] = "Java";
    strArr[1] = "Java";
    strArr[2] = new String("Java");
    System.out.println(strArr[1] == strArr[2]); // false. 주소값 다름.
    System.out.println(strArr[0] == strArr[1]);
    // true. 다른 주소값을 가져 false를 반환할 것 같지만 JVM의 판단 하에 true를 반환함..더 알아볼 것... 
    System.out.println("==============================================");
    // Integer.toBinaryString(10진수), Integer.toOctalString(10진수), Integer.toHexString(10진수)
    // 10진수 숫자를 각각 2진수, 8진수, 16진수 String으로 변환하는 메소드
    System.out.println(Integer.toBinaryString(2)); // 10
    System.out.println(Integer.toOctalString(8)); // 10
    System.out.println(Integer.toHexString(16)); // 10
    // Integer.valueOf("문자열", 넣는 문자열의 진수);
    // 각각의 진수값을 10진수 Integer로 변환
    System.out.println(Integer.valueOf("11", 2)); // 3
    System.out.println(Integer.valueOf("20", 8)); // 16
    System.out.println(Integer.valueOf("10", 16)); // 16
    // Integer.valueOf("문자열", 넣는 문자열의 진수);
    // 각각의 진수값을 10진수 int로 변환
    System.out.println(Integer.parseInt("11", 2)); // 3
    System.out.println(Integer.parseInt("20", 8)); // 16
    System.out.println(Integer.parseInt("10", 16)); // 16
    System.out.println("==============================================");
    String replaceTest = "Uno. Dos. Tres.";
    // replaceTest.replace(CharSequence target, CharSequence replacement)
    // CharSequence 객체는 String 객체를 상속하는 객체이므로 다형성에 의해 String 객체를 인자로 주어도 됨.
    System.out.println(replaceTest.replace("Uno", "One")); // One. Dos. Tres.    
    // replaceTest.replace(oldChar, newChar)
    System.out.println(replaceTest.replace('o', 'x')); // "Unx. Dxs. Tres."
    // replaceTest.replaceAll(regex, replacement)
    System.out.println(replaceTest.replaceAll("[.]", "/")); // "Uno/ Dos/ Tres/"
    System.out.println(replaceTest.replaceAll(".", "/")); // "///////////////"
    System.out.println(replaceTest.replace(".", "/")); // "Uno/ Dos/ Tres/"
    // replace()와 replaceAll()의 차이점은 인자값의 타입이 문자열이냐 정규식이냐의 차이.
    // replaceAll() 메소드에서 인자값으로 "."을 넣으면 정규식으로 인식하여 정규식에 해당하는 문자들을 바꿀 문자로 바꿈. 정규식에서 .은 모든 문자(any character)를 의미하므로 위의 출력문에서 해당하는 문자들을 "/"로 바꿈.
    // replaceTest.replaceFirst(regex, replacement)
    System.out.println(replaceTest.replaceFirst("[.]", "/")); // "Uno/ Dos. Tres."
    // 정규식에 해당하는 첫 번째 문자만 바꿀 문자로 바꿈.    

    System.out.println("==============================================");
    // BigInteger 객체 생성 방법 세 가지
    BigInteger two = new BigInteger("2"); // 문자열로 생성
    BigInteger bi = new BigInteger("FFFF", 16); // n진수의 문자열로 생성
    BigInteger biNum = BigInteger.valueOf(1234567890); // 숫자로 생성
    // BigInger 기본 상수
    BigInteger zero = BigInteger.ZERO;
    BigInteger one = BigInteger.ONE;
    BigInteger ten = BigInteger.TEN;
    // 기본 사칙 연산
    // .add(), .subtract(), .multiply(), .divide(), .remainder()
    BigInteger addResult = two.add(BigInteger.valueOf(10));
    System.out.println(addResult); // 12
    // toString() : 문자열로 변환
    String addResultStr = addResult.toString();
    System.out.println(addResultStr); // "12"
    // 기본 타입으로 변환
    // .intValue(), .longValue(), .floatValue(), .doubleValue()
    int intValue = biNum.intValue();
    System.out.println(intValue); // 1234567890

    System.out.println("==============================================");
    // 소수점을 저장할 수 있는 가장 크기가 큰 타입인 double은 소수점의 정밀도에 있어 한계가 있어 값이 유실될 수 있다. BigDecimal은 Java 언어에서 숫자를 정밀하게 저장하고 표현할 수 있는 유일한 방법이다.

    // BigDecimal 객체 생성 방법 세 가지
    BigDecimal bdNum1 = new BigDecimal(0.01);
    // double 타입의 값으로 그대로 초기화 하면 이진수의 근사치를 가지에 되어 예상과 다른 값이 나올 수 있다
    // 0.01000000000000000020816681711721685132943093776702880859375
    BigDecimal bdNum2 = new BigDecimal("0.01"); // 문자열로 초기화 하면 정상 인식
    BigDecimal bdNum3 = BigDecimal.valueOf(0.01); // 정상 인식

    // BigDecimal 비교 연산
    // == : 주소 비교. equals() : 값 비교
    BigDecimal a = new BigDecimal("2.01");
    BigDecimal b = new BigDecimal("2.010");
    System.out.println(a == b); // false
    System.out.println(a.equals(b)); // false. 소수점 맨 끝자리까지 완전히 동일해야 true.
    System.out.println(a.compareTo(b)); // 0
    // compareTo() : 값 비교. 같으면 0, 작으면 -1, 크면 1 리턴

    // BigDecimal 사직 연산
    BigDecimal c = new BigDecimal("10.000");
    BigDecimal d = new BigDecimal("7.00");
    System.out.println(c.add(d)); // 17.000
    System.out.println(c.subtract(d)); // 3.000
    System.out.println(c.multiply(d)); // 70.00000
    System.out.println(c.divide(d, 3)); // 1.428
    System.out.println(c.divide(d, 4)); // 1.429
    // c.divide(d)는 1.4285714285714285714285714285714.... 무한소수로 에러 발생
    // c.divde(d, n) : n은 반올림 자리값.
    // divide() 메서드는 나중에 더 알아볼 것...

    System.out.println("==============================================");
    // char 배열을 String으로 변환
    char[] charArr = new char[] { 'h', 'e', 'l', 'l', 'o' };
    System.out.println(String.valueOf(charArr)); // hello
    System.out.println(new String(charArr)); // hello
    System.out.println(String.copyValueOf(charArr)); // hello

    System.out.println("==============================================");
    // 불변객체 : Immutable Object => String, LocalDateTime : 대표적인 불변객체
    String x = "1234";
    x += "567"; // 1234567
    x += "777";
    x += "888";
    // 문자열 추가할 때마다 메모리 할당, 메모리 해제 작업 반복. 문자열이 길어질수록 자원 소모 심해짐.
    /*     
     * [ String x ] #12 <-- memory address <-- Release(메모리 해제) : Garbage Collector 가 회수
     * memory value [1][2][3][4] + [5][6][7] // wrong. 기존 주소가 갖고 있던 값에 추가하는 것 아님.
     * x에 문자열 추가 시 #12 메모리 해제 #223 // 메모리 할당 다시. 새로운 주소 memory value [1][2][3][4][5][6][7]
     * StringBuffer, StringBuilder 클래스 객체는 메모리를 다시 할당하지 않고도 문자열 추가 가능.
     */

    System.out.println("==============================================");
    // compareTo() 숫자 비교
    Integer compareToTestNum = 10;
    System.out.println(compareToTestNum.compareTo(20)); // -1
    // 현재 객체가 인자 객체보다 작으면 -1 리턴
    System.out.println(compareToTestNum.compareTo(10)); // 0
    // 현재 객체가 인자 객체와 같으면 0 리턴
    System.out.println(compareToTestNum.compareTo(0)); // 1
    // 현재 객체가 인자 객체보다 크면 1 리턴

    // System.out.println(compareToTestNum.compareTo(10.0));  // 컴파일 에러
    // 같은 타입의 객체끼리만 비교할 수 있음. Integer는 Integer, Double은 Double, Float은 Float..
    Double compareToTestNum2 = 10.0;
    System.out.println(compareToTestNum2.compareTo(20.0)); // -1

    // 참조형 타입의 객체를 사용하지 않고도 비교할 수 있음.
    int compareToTestNum3 = 10;
    int compareToTestNum4 = 20;
    System.out.println(Integer.compare(compareToTestNum3, compareToTestNum4)); // -1
    // Integer.compare(x, y)에서 x가 더 작으면 -1, 같으면 0, 더 크면 1 리턴
    System.out.println(Double.compare(20.0, 20.00)); // 0

    // compareTo() 문자열 비교
    // 현재 객체와 인자 객체를 첫 번째 문자부터 비교
    // 1) 같은 인덱스의 문자가 다르다면 두 문자의 아스키값 차를 리턴.
    // 2) 같은 인덱스끼리의 비교가 끝난 뒤 길이가 다르다면 길이의 차를 리턴
    String compareToTestStr = "abcd";
    System.out.println(compareToTestStr.compareTo("abcd")); // 0
    // 현재 객체가 인자 객체와 같은 경우 0 리턴
    System.out.println(compareToTestStr.compareTo("ab")); // 2
    System.out.println(compareToTestStr.compareTo("a")); // 3
    System.out.println(compareToTestStr.compareTo("abcdefgh")); // -4
    System.out.println("".compareTo(compareToTestStr)); // -4
    // 각 인덱스의 문자 같음, 길이가 다른 경우. 둘의 길이 차이를 리턴
    // 두 객체 중 길이가 0인 문자열이 있다면 둘의 길이 차이를 리턴
    // 현재 객체의 길이 - 인자 객체의 길이 리턴

    System.out.println(compareToTestStr.compareTo("bcde")); // -1
    System.out.println(compareToTestStr.compareTo("cdz")); // -2
    System.out.println(compareToTestStr.compareTo("wxyz")); // -22
    System.out.println(compareToTestStr.compareTo("zcd")); // -25
    System.out.println(compareToTestStr.compareTo("abce")); // -1
    System.out.println(compareToTestStr.compareTo("abcefghijk")); // -1
    // 각 인덱스의 문자가 다름. 서로 다른 문자의 아스키값 차이를 리턴
    // 현재 객체의 다른 문자 아스키값 - 인자 객체의 다른 문자 아스키값 리턴    
    System.out.println(compareToTestStr.compareTo("ABCD")); // 32
    // 대소문자가 다른 경우 다른 문자
    System.out.println(compareToTestStr.compareToIgnoreCase("ABCD")); // 0
    // 대소문자 무시 메서드    
  }
}