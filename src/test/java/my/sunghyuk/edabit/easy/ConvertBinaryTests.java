package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConvertBinaryTests {
	@Test 
	public void test1() {
		assertEquals("01110", Challenge.convertBinary("house"));
	}
	
	@Test 
	public void test2() {
		assertEquals("0100000", Challenge.convertBinary("excLAIM"));
	}
	
	@Test 
	public void test3() {
		assertEquals("0111", Challenge.convertBinary("moon"));
	}
	
	@Test 
	public void test4() {
		assertEquals("0111", Challenge.convertBinary("MOOn"));
	}
	
	@Test 
	public void test5() {
		assertEquals("1111111111", Challenge.convertBinary("topsyTurvy"));
	}
}