package my.sunghyuk.edabit;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class HelloNameTests {
	@Test
  public void test1() {
  	assertThat(Challenge.helloName("Gerald"), is("Hello Gerald!"));
	}
	
	@Test
  public void test2() {
  	assertThat(Challenge.helloName("Fatima"), is("Hello Fatima!"));
	}
	
	@Test
  public void test3() {
  	assertThat(Challenge.helloName("Ed"), is("Hello Ed!"));
	}
	
	@Test
  public void test4() {
  	assertThat(Challenge.helloName("Tiffany"), is("Hello Tiffany!"));
	}
}