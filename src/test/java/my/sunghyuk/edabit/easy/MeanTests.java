package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class MeanTests {
	@Test
  public void test1() {
  	assertThat(Challenge.mean(666), is(6));
	}
	
	@Test
  public void test2() {
  	assertThat(Challenge.mean(80), is(4));
	}
	
	@Test
  public void test3() {
  	assertThat(Challenge.mean(789), is(8));
	}
	
	@Test
  public void test4() {
  	assertThat(Challenge.mean(417), is(4));
	}

	@Test
  public void test5() {
  	assertThat(Challenge.mean(1357), is(4));
	}
	
	@Test
  public void test6() {
  	assertThat(Challenge.mean(42), is(3));
	}
	
	@Test
  public void test7() {
  	assertThat(Challenge.mean(12345), is(3));
	}

	@Test
  public void test8() {
  	assertThat(Challenge.mean(0), is(0));
	}
}