package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class IsEmptyTests {
	@Test 
	public void test1() {
		assertThat(EasyChallenge.isEmpty(""), is(true));
	}
	
	@Test 
	public void test2() {
		assertThat(EasyChallenge.isEmpty(" "), is(false));
	}
	
	@Test 
	public void test3() {
		assertThat(EasyChallenge.isEmpty("            "), is(false));
	}
	
	@Test 
	public void test4() {
		assertThat(EasyChallenge.isEmpty("38215"), is(false));
	}
	
	@Test 
	public void test5() {
		assertThat(EasyChallenge.isEmpty("afjabsdf"), is(false));
	}
	
	@Test 
	public void test6() {
		assertThat(EasyChallenge.isEmpty("!?@&"), is(false));
	}
}