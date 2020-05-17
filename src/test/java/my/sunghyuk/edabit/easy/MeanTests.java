package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class MeanTests {
	@Test
  public void test1() {
  	assertThat(EasyChallenge.mean(666), is(6));
	}
	
	@Test
  public void test2() {
  	assertThat(EasyChallenge.mean(80), is(4));
	}
	
	@Test
  public void test3() {
  	assertThat(EasyChallenge.mean(789), is(8));
	}
	
	@Test
  public void test4() {
  	assertThat(EasyChallenge.mean(417), is(4));
	}

	@Test
  public void test5() {
  	assertThat(EasyChallenge.mean(1357), is(4));
	}
	
	@Test
  public void test6() {
  	assertThat(EasyChallenge.mean(42), is(3));
	}
	
	@Test
  public void test7() {
  	assertThat(EasyChallenge.mean(12345), is(3));
	}
}