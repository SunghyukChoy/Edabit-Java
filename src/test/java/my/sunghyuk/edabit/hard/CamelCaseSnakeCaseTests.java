package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CamelCaseSnakeCaseTests {

  @Test
  public void test1() {
    assertEquals("edabit", Challenge.toCamelCase("edabit"));
  }

  @Test
  public void test2() {
    assertEquals("helloEdabit", Challenge.toCamelCase("hello_edabit"));
  }

  @Test
  public void test3() {
    assertEquals("isModalOpen", Challenge.toCamelCase("is_modal_open"));
  }

  @Test
  public void test4() {
    assertEquals("getBackgroundColor", Challenge.toCamelCase("get_background_color"));
  }

  @Test
  public void test5() {
    assertEquals("isLoading", Challenge.toCamelCase("is_loading"));
  }

  @Test
  public void test6() {
    assertEquals("x", Challenge.toCamelCase("x"));
  }

  @Test
  public void test7() {
    assertEquals("edabit", Challenge.toSnakeCase("edabit"));
  }

  @Test
  public void test8() {
    assertEquals("hello_edabit", Challenge.toSnakeCase("helloEdabit"));
  }

  @Test
  public void test9() {
    assertEquals("is_modal_open", Challenge.toSnakeCase("isModalOpen"));
  }

  @Test
  public void test10() {
    assertEquals("get_background_color", Challenge.toSnakeCase("getBackgroundColor"));
  }

  @Test
  public void test11() {
    assertEquals("is_loading", Challenge.toSnakeCase("isLoading"));
  }

  @Test
  public void test12() {
    assertEquals("x", Challenge.toSnakeCase("x"));
  }
}
