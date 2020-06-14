package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class CapMeTests {
	@Test
	public void test1() {
		assertThat(Program.capMe(new String[]{"mavis", "senaida", "letty"}), is(new String[]{"Mavis", "Senaida", "Letty"}));
	}
	
	@Test
	public void test2() {
		assertThat(Program.capMe(new String[]{"samuel", "MABELLE", "letitia", "meridith"}), is(new String[]{"Samuel", "Mabelle", "Letitia", "Meridith"}));
	}
	
	@Test
	public void test3() {
		assertThat(Program.capMe(new String[]{"Slyvia", "Kristal", "Sharilyn", "Calista"}), is(new String[]{"Slyvia", "Kristal", "Sharilyn", "Calista"}));
	}
	
	@Test
	public void test4() {
		assertThat(Program.capMe(new String[]{"krisTopher", "olIva", "herminiA"}), is(new String[]{"Kristopher", "Oliva", "Herminia"}));
	}
	
	@Test
	public void test5() {
		assertThat(Program.capMe(new String[]{"luke", "marsha", "stanford"}), is(new String[]{"Luke", "Marsha", "Stanford"}));
	}
	
	@Test
	public void test6() {
		assertThat(Program.capMe(new String[]{"kara"}), is(new String[]{"Kara"}));
	}
	
	@Test
	public void test7() {
		assertThat(Program.capMe(new String[]{"mARIANN", "jOI", "gEORGEANN"}), is(new String[]{"Mariann", "Joi", "Georgeann"}));
	}
}