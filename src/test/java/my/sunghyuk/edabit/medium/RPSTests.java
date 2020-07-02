package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RPSTests {

  @Test
  public void test1() {
    assertEquals("Player 2 wins", Challenge.rps("rock", "paper"));
  }

  @Test
  public void test2() {
    assertEquals("Player 1 wins", Challenge.rps("paper", "rock"));
  }

  @Test
  public void test3() {
    assertEquals("Player 2 wins", Challenge.rps("paper", "scissors"));
  }

  @Test
  public void test4() {
    assertEquals("TIE", Challenge.rps("scissors", "scissors"));
  }

  @Test
  public void test5() {
    assertEquals("Player 1 wins", Challenge.rps("scissors", "paper"));
  }
}
