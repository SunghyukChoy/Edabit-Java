package my.sunghyuk.edabit.medium;

/** 
 ====================================== 
 TestGen 2.3 for JUnit 4.13.0 		
 Test Case: Friend::isPotentialFriend 
 Timestamp: 11/7/2020 11:48:30 PM 
 --------------------------------------
 ® DARKKO 2020 © 
 ======================================
 **/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IsPotentialFriendTests {

  @Test
  public void test01() {
    assertEquals(true, Program.isPotentialFriend(new String[] { "sports", "music", "chess" },
        new String[] { "coding", "sports", "music" }));
  }

  @Test
  public void test02() {
    assertEquals(false, Program.isPotentialFriend(new String[] { "cycling", "technology", "reading" },
        new String[] { "dancing", "planes", "politics" }));
  }

  @Test
  public void test03() {
    assertEquals(false, Program.isPotentialFriend(new String[] { "history" },
        new String[] { "gaming", "drawing", "coding", "history" }));
  }

  @Test
  public void test04() {
    assertEquals(true, Program.isPotentialFriend(new String[] { "films" }, new String[] { "films" }));
  }

  @Test
  public void test05() {
    assertEquals(true, Program.isPotentialFriend(new String[] { "sports", "music", "chess" },
        new String[] { "coding", "music", "netflix", "chess" }));
  }

  @Test
  public void test06() {
    assertEquals(false, Program.isPotentialFriend(new String[] { "cycling", "technology", "drawing" },
        new String[] { "dancing", "drawing" }));
  }

  @Test
  public void test07() {
    assertEquals(true, Program.isPotentialFriend(new String[] { "history", "acting", "cards" },
        new String[] { "history", "acting", "cards" }));
  }

  @Test
  public void test08() {
    assertEquals(true, Program.isPotentialFriend(new String[] { "coding", "music", "netflix", "chess" },
        new String[] { "sports", "music", "chess" }));
  }
}