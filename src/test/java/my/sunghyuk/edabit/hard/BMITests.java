package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BMITests {
  @Test
  public void test1() {
    assertEquals("18.4 Underweight", Challenge.BMI("53.3 kilos", "1.7 meters"));
  }

  @Test
  public void test2() {
    assertEquals("30.0 Obesity", Challenge.BMI("76.8 kilos", "1.6 meters"));
  }

  @Test
  public void test3() {
    assertEquals("18.5 Normal weight", Challenge.BMI("53.5 kilos", "1.7 meters"));
  }

  @Test
  public void test4() {
    assertEquals("20.4 Normal weight", Challenge.BMI("155 pounds", "73 inches"));
  }

  @Test
  public void test5() {
    assertEquals("25.1 Overweight", Challenge.BMI("175 pounds", "70 inches"));
  }
}
