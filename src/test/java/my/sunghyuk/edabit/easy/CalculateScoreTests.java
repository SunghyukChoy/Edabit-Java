package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class CalculateScoreTests {
	@Test
	public void test1() {
		assertThat(EasyChallenge.calculateScores("AAB"), is(new int[]{2, 1, 0}));
	}

	@Test
	public void test2() {
		assertThat(EasyChallenge.calculateScores("ABC"), is(new int[]{1, 1, 1}));            
	}

	@Test
	public void test3() {
		assertThat(EasyChallenge.calculateScores("ABCBACC"), is(new int[]{2, 2, 3}));            
	}

	@Test
	public void test4() {
		assertThat(EasyChallenge.calculateScores("CCBBBB"), is(new int[]{0, 4, 2}));            
	}

	@Test
	public void test5() {
		assertThat(EasyChallenge.calculateScores("CCAABBAABBCC"), is(new int[]{4, 4, 4}));            
	}

	@Test
	public void test6() {
		assertThat(EasyChallenge.calculateScores("A"), is(new int[]{1, 0, 0}));            
	}

	@Test
	public void test7() {
		assertThat(EasyChallenge.calculateScores(""), is(new int[]{0, 0, 0}));            
	}

	@Test
	public void test8() {
		assertThat(EasyChallenge.calculateScores("ACCCA"), is(new int[]{2, 0, 3}));            
	}
}