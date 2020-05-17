package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class FormatPhoneNumberTests {
	@Test
	public void test1() {
		assertThat(EasyProgram.formatPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}), is("(123) 456-7890"));
	}
	
	@Test
	public void test2() {
		assertThat(EasyProgram.formatPhoneNumber(new int[]{5, 1, 9, 5, 5, 5, 4, 4, 6, 8}), is("(519) 555-4468"));
	}
	
	@Test
	public void test3() {
		assertThat(EasyProgram.formatPhoneNumber(new int[]{3, 4, 5, 5, 0, 1, 2, 5, 2, 7}), is("(345) 501-2527"));
	}
	
	@Test
	public void test4() {
		assertThat(EasyProgram.formatPhoneNumber(new int[]{6, 6, 2, 5, 8, 8, 7, 0, 4, 3}), is("(662) 588-7043"));
	}
	
	@Test
	public void test5() {
		assertThat(EasyProgram.formatPhoneNumber(new int[]{5, 1, 0, 2, 6, 6, 3, 5, 8, 3}), is("(510) 266-3583"));
	}
	
	@Test
	public void test6() {
		assertThat(EasyProgram.formatPhoneNumber(new int[]{4, 9, 7, 8, 8, 9, 1, 0, 1, 5}), is("(497) 889-1015"));
	}
	
	@Test
	public void test7() {
		assertThat(EasyProgram.formatPhoneNumber(new int[]{6, 1, 9, 4, 7, 2, 8, 0, 7, 4}), is("(619) 472-8074"));
	}
	
	@Test
	public void test8() {
		assertThat(EasyProgram.formatPhoneNumber(new int[]{7, 7, 3, 7, 8, 3, 6, 0, 8, 7}), is("(773) 783-6087"));
	}
	
	@Test
	public void test9() {
		assertThat(EasyProgram.formatPhoneNumber(new int[]{9, 5, 3, 1, 3, 7, 4, 0, 0, 1}), is("(953) 137-4001"));
	}
	
	@Test
	public void test10() {
		assertThat(EasyProgram.formatPhoneNumber(new int[]{2, 2, 6, 4, 0, 4, 4, 2, 9, 2}), is("(226) 404-4292"));
	}
}