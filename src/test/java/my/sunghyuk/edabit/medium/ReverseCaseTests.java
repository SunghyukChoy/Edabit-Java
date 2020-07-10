package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReverseCaseTests {
  @Test
  public void test1() {
    assertEquals("hAPPY bIRTHDAY", Challenge.reverseCase("Happy Birthday"));
  }

  @Test
  public void test2() {
    assertEquals("many thanks", Challenge.reverseCase("MANY THANKS"));
  }

  @Test
  public void test3() {
    assertEquals("SpOnTaNeOuS", Challenge.reverseCase("sPoNtAnEoUs"));
  }

  @Test
  public void test4() {
    assertEquals("eXCELLENT, yOuR mAJESTY", Challenge.reverseCase("Excellent, YoUr Majesty"));
  }
}