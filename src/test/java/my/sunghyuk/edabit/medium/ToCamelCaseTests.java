package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ToCamelCaseTests {

  @Test
  public void test1() {
    assertEquals("theStealthWarrior", Challenge.toCamelCase("the_stealth_warrior"));
  }

  @Test
  public void test2() {
    assertEquals("TheStealthWarrior", Challenge.toCamelCase("The-Stealth-Warrior"));
  }

  @Test
  public void test3() {
    assertEquals("ABC", Challenge.toCamelCase("A-B-C"));
  }

  @Test
  public void test4() {
    assertEquals("", Challenge.toCamelCase(""));
  }
}