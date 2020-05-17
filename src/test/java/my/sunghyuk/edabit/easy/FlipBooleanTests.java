package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FlipBooleanTests {
	@Test 
	public void test1() {
	assertEquals(true, EasyChallenge.flipBoolean(false));
	}
	
	@Test 
	public void test2() {
	assertEquals(false, EasyChallenge.flipBoolean(true));
	}
}