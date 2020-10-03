package my.sunghyuk.edabit.easy;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GetDrinkIDTests {
  @Test
  public void test1() {
    assertEquals(Program.getDrinkID("apple", "500ml"), "APP500");
  }

  @Test
  public void test2() {
    assertEquals(Program.getDrinkID("pineapple", "45ml"), "PIN45");
  }

  @Test
  public void test3() {
    assertEquals(Program.getDrinkID("orange", "750ml"), "ORA750");
  }

  @Test
  public void test4() {
    assertEquals(Program.getDrinkID("passion fruit", "1ml"), "PASFRU1");
  }

  @Test
  public void test5() {
    assertEquals(Program.getDrinkID("mango", "1000ml"), "MAN1000");
  }

  @Test
  public void test6() {
    assertEquals(Program.getDrinkID("very berry", "253ml"), "VERBER253");
  }

  @Test
  public void test7() {
    assertEquals(Program.getDrinkID("raspberry and lime", "350ml"), "RASANDLIM350");
  }
}
