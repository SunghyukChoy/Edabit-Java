package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LettersOnlyTests {
  @Test
  public void test1() {
    assertEquals("Aladdin", Challenge.lettersOnly(",1|2))A^1<[_)?^]l[a`3+%!d@8-0_0d.*}i@&n?="));
  }
	
	@Test
  public void test2() {
    assertEquals("Up", Challenge.lettersOnly("^U)6$22>8p)."));
  }
	
	@Test
  public void test3() {
    assertEquals("Inception", Challenge.lettersOnly("I5n!449+c@e*}@@1]p{2@`,~t:i0o%n<3%8"));
  }
	
	@Test
  public void test4() {
    assertEquals("Psycho", Challenge.lettersOnly("!)P[s9)69}yc3+?1]+33>3ho"));
  }
	
	@Test
  public void test5() {
    assertEquals("Goodfellas", Challenge.lettersOnly(":~;G{o}o{+524<df~:>}e24{l8:_l]a:?@]%s7"));
  }
	
	@Test
  public void test6() {
    assertEquals("Shrek", Challenge.lettersOnly("&&S~]@8>1-0!h#r),80<_>!}|e>_k:"));
  }
	
	@Test
  public void test7() {
    assertEquals("Gladiator", Challenge.lettersOnly(")^/|,!!09]=/1<G2?`=[l{a}d9]^i7a0|t6_o2*r"));
  }
	
	@Test
  public void test8() {
    assertEquals("Vertigo", Challenge.lettersOnly("]8;]V9e{=0r!.5t>i<^_g4o5~"));
  }
	
	@Test
  public void test9() {
    assertEquals("Batman", Challenge.lettersOnly("%%)??B#>/_4a#,;t8|m8675a(n"));
  }
	
	@Test
  public void test10() {
    assertEquals("Halloween", Challenge.lettersOnly("97H^)~a8567ll*o?6%)w63e37e<n?@="));
  }
}