package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class CanCaptureTests {
	@Test 
	public void test1() {
		assertThat(EasyChallenge.canCapture(new String[]{"A8", "E8"}), is(true));
	}
	
	@Test 
	public void test2() {
		assertThat(EasyChallenge.canCapture(new String[]{"A1", "B2"}), is(false));
	}
	
	@Test 
	public void test3() {
		assertThat(EasyChallenge.canCapture(new String[]{"H4", "H3"}), is(true));
	}
	
	@Test 
	public void test4() {
		assertThat(EasyChallenge.canCapture(new String[]{"F5", "C8"}), is(false));
	}
	
	@Test 
	public void test5() {
		assertThat(EasyChallenge.canCapture(new String[]{"G3", "G7"}), is(true));
	}
	
	@Test 
	public void test6() {
		assertThat(EasyChallenge.canCapture(new String[]{"B3", "B2"}), is(true));
	}
	
	@Test 
	public void test7() {
		assertThat(EasyChallenge.canCapture(new String[]{"F5", "B2"}), is(false));
	}
	
	@Test 
	public void test8() {
		assertThat(EasyChallenge.canCapture(new String[]{"H5", "C8"}), is(false));
	}
}