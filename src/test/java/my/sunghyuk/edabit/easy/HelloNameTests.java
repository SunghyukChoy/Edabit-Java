package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class HelloNameTests {
	@Test
  public void test1() {
  	assertThat(EasyChallenge.helloName("Gerald"), is("Hello Gerald!"));
	}
	
	@Test
  public void test2() {
  	assertThat(EasyChallenge.helloName("Fatima"), is("Hello Fatima!"));
	}
	
	@Test
  public void test3() {
  	assertThat(EasyChallenge.helloName("Ed"), is("Hello Ed!"));
	}
	
	@Test
  public void test4() {
  	assertThat(EasyChallenge.helloName("Tiffany"), is("Hello Tiffany!"));
	}
}