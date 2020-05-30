package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GrabCityTests {
  @Test
  public void test1() {
    assertEquals("Munich", Challenge.grabCity("[Last Day!] Beer Festival [Munich]"));
  }
	
	@Test
  public void test2() {
    assertEquals("Portland", Challenge.grabCity("Cheese Factory Tour [Portland]"));
  }
	
	@Test
  public void test3() {
    assertEquals("Prince Edward Island", Challenge.grabCity("[Duration: 7 hours] Tour of the Maritimes [Prince Edward Island]"));
  }
	
	@Test
  public void test4() {
    assertEquals("Venice", Challenge.grabCity("[5 Stars] Traditional Gondola Experience [Venice]"));
  }
	
	@Test
  public void test5() {
    assertEquals("Machu Picchu", Challenge.grabCity("[Last Minute Deal][$1039] Machu Picchu 3 Day Trip [Machu Picchu]"));
  }
	
	@Test
  public void test6() {
    assertEquals("Kyoto", Challenge.grabCity("[50% Off!][Group Tours Included] 5-Day Trip to Onsen [Kyoto]"));
  }
}