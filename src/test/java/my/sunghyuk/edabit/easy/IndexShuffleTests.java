package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IndexShuffleTests {
	@Test 
	public void test1() {
		assertEquals("acebdf", EasyChallenge.indexShuffle("abcdef"));
	}
	
	@Test 
	public void test2() {
		assertEquals("aaaabbbb", EasyChallenge.indexShuffle("abababab"));
	}
	
	@Test 
	public void test3() {
		assertEquals("i a  euiu atwsabatfldy", EasyChallenge.indexShuffle("it was a beautiful day"));
	}
	
	@Test 
	public void test4() {
		assertEquals("myeab", EasyChallenge.indexShuffle("maybe"));
	}
	
	@Test 
	public void test5() {
		assertEquals("hldyoia", EasyChallenge.indexShuffle("holiday"));
	}
}