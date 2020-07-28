
package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WurstIsBetterTests {
  @Test
  public void test1() {
    assertEquals("Wurst fests are like Wurst fests", Program.wurstIsBetter("Sausage fests are like salami fests"));
  }

  @Test
  public void test2() {
    assertEquals("Add the Wurst and the reserved potatoes and stir through",
        Program.wurstIsBetter("Add the kielbasa and the reserved potatoes and stir through"));
  }

  @Test
  public void test3() {
    assertEquals(
        "Wurst sandwiches, Wurst and cheese, Wurst on crackers— I couldn't get enough of the salty, spicy Wurst",
        Program.wurstIsBetter(
            "Salami sandwiches, salami and cheese, salami on crackers— I couldn't get enough of the salty, spicy sausage"));
  }

  @Test
  public void test4() {
    assertEquals("sich die Wurst vom Brot nehmen lassen",
        Program.wurstIsBetter("sich die Wurst vom Brot nehmen lassen"));
  }

  @Test
  public void test5() {
    assertEquals(
        "Bratwurst and Rostbratwurst is a Wurst made from finely minced pork and beef and usually grilled and served with sweet German mustard and a piece of bread or hard roll. It can be sliced and made into Currywurst by slathering it in a catchup-curry sauce.",
        Program.wurstIsBetter(
            "Bratwurst and Rostbratwurst is a sausage made from finely minced pork and beef and usually grilled and served with sweet German mustard and a piece of bread or hard roll. It can be sliced and made into Currywurst by slathering it in a catchup-curry sauce."));
  }

  @Test
  public void test6() {
    assertEquals("Il n’arrête pas de faire l’Wurst", Program.wurstIsBetter("Il n’arrête pas de faire l’andouille"));
  }

  @Test
  public void test7() {
    assertEquals(
        "Wurst is a common way of preserving pork meat in several Southeast Asian countries, including Thailand, Laos, Cambodia and Vietnam",
        Program.wurstIsBetter(
            "Naem is a common way of preserving pork meat in several Southeast Asian countries, including Thailand, Laos, Cambodia and Vietnam"));
  }

  @Test
  public void test8() {
    assertEquals("The chipper group over at Orangatang recently dropped another wheel sensation; the Wurst", Program
        .wurstIsBetter("The chipper group over at Orangatang recently dropped another wheel sensation; the Moronga"));
  }
}