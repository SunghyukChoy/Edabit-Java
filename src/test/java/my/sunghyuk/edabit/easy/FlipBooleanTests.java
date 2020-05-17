package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FlipBooleanTests {
	@Test 
	public void test1() {
	assertEquals(true, Challenge.flipBoolean(false));
	}
	
	@Test 
	public void test2() {
	assertEquals(false, Challenge.flipBoolean(true));
	}
}