package my.sunghyuk.edabit.medium;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class FilterStateNamesTests {
  @Test
  public void test1() {
    assertThat(Challenge.filterStateNames(new String[] { "Arizona", "CA", "NY", "Nevada" }, "abb"),
        is(new String[] { "CA", "NY" }));
  }

  @Test
  public void test2() {
    assertThat(Challenge.filterStateNames(new String[] { "Arizona", "CA", "NY", "Nevada" }, "full"),
        is(new String[] { "Arizona", "Nevada" }));
  }

  @Test
  public void test3() {
    assertThat(Challenge.filterStateNames(new String[] { "MT", "NJ", "TX", "ID", "IL" }, "abb"),
        is(new String[] { "MT", "NJ", "TX", "ID", "IL" }));
  }

  @Test
  public void test4() {
    assertThat(Challenge.filterStateNames(new String[] { "MT", "NJ", "TX", "ID", "IL" }, "full"), is(new String[] {}));
  }

  @Test
  public void test5() {
    assertThat(Challenge.filterStateNames(new String[] { "Montana", "FL" }, "abb"), is(new String[] { "FL" }));
  }

  @Test
  public void test6() {
    assertThat(Challenge.filterStateNames(new String[] { "Montana", "FL" }, "full"), is(new String[] { "Montana" }));
  }
}