package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class SocietyNameTests {

  @Test
  public void test1() {
    assertThat(Challenge.societyName(new String[] { "Adam", "Sarah", "Malcolm" }), is("AMS"));
  }

  @Test
  public void test2() {
    assertThat(Challenge.societyName(new String[] { "Phoebe", "Chandler", "Rachel", "Ross", "Monica", "Joey" }),
        is("CJMPRR"));
  }

  @Test
  public void test3() {
    assertThat(Challenge.societyName(new String[] { "Harry", "Newt", "Luna", "Cho" }), is("CHLN"));
  }

  @Test
  public void test4() {
    assertThat(Challenge.societyName(new String[] { "Sherlock", "Irene", "John" }), is("IJS"));
  }

  @Test
  public void test5() {
    assertThat(Challenge.societyName(new String[] { "Sheldon", "Amy", "Penny", "Howard", "Raj" }), is("AHPRS"));
  }

}