package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import java.util.GregorianCalendar;

public class TimeForMilkAndCookiesTests {
	@Test
	public void test1() {
		assertThat(Program.timeForMilkAndCookies(new GregorianCalendar(2013, 11, 24)), is(true));
	}
	
	@Test
	public void test2() {
		assertThat(Program.timeForMilkAndCookies(new GregorianCalendar(2013, 0, 23)), is(false));
	}
	
	@Test
	public void test3() {
		assertThat(Program.timeForMilkAndCookies(new GregorianCalendar(3000, 11, 24)), is(true));
	}
}