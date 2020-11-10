package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class CmsSelectorTests {

  @Test
  public void test01() {
    assertArrayEquals(Program.cmsSelector(new String[] { "WordPress", "Joomla", "Drupal" }, "w"),
        new String[] { "WordPress" });
  }

  @Test
  public void test02() {
    assertArrayEquals(Program.cmsSelector(new String[] { "WordPress", "Joomla", "Drupal", "Magento" }, "ru"),
        new String[] { "Drupal" });
  }

  @Test
  public void test03() {
    assertArrayEquals(Program.cmsSelector(new String[] { "WordPress", "Joomla", "Drupal", "Magento" }, ""),
        new String[] { "Drupal", "Joomla", "Magento", "WordPress" });
  }
}
