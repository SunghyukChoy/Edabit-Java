package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UncensorTests {

  @Test
  public void test1() {
    assertEquals("Where did my vowels go?", Challenge.uncensor("Wh*r* d*d my v*w*ls g*?", "eeioeo"));
  }

  @Test
  public void test2() {
    System.out.println("Works with no vowels.");
    assertEquals("abcd", Challenge.uncensor("abcd", ""));
  }

  @Test
  public void test3() {
    System.out.println("Works with uppercase.");
    assertEquals("UPPERCASE", Challenge.uncensor("*PP*RC*S*", "UEAE"));
  }

  @Test
  public void test4() {
    System.out.println("Works with * at the end");
    assertEquals("Cheese, Grommit -- cheese", Challenge.uncensor("Ch**s*, Gr*mm*t -- ch**s*", "eeeoieee"));
  }

  @Test
  public void test5() {
    System.out.println("Works with * at the start");
    assertEquals("Elephant", Challenge.uncensor("*l*ph*nt", "Eea"));
  }
}