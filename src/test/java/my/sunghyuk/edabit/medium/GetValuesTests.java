package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Map;
import java.util.HashMap;

public class GetValuesTests {

  @Test
  public void test1() {
    Map<String, String> map = new HashMap<String, String>();
    map.put("a", "1");
    map.put("b", "2");
    map.put("c", "3");
    assertEquals(new String[] { "1", "2", "3" }, Program.getValues(map));
  }

  @Test
  public void test2() {
    Map<String, String> map = new HashMap<String, String>();
    map.put("a", "Apple");
    map.put("b", "Microsoft");
    map.put("c", "Google");
    assertEquals(new String[] { "Apple", "Microsoft", "Google" }, Program.getValues(map));
  }

  @Test
  public void test3() {
    Map<String, String> map = new HashMap<String, String>();
    map.put("key1", "true");
    map.put("key2", "false");
    map.put("key3", "undefined");
    assertEquals(new String[] { "true", "false", "undefined" }, Program.getValues(map));
  }
}