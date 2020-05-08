package my.sunghyuk.edabit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ClearFogTests {
  @Test
  public void test1() {
    assertEquals("trees", Challenge.clearFog("fogfogfffoooofftreesggfoogfog"));
  }

	@Test
  public void test2() {
    assertEquals("sky", Challenge.clearFog("fooofffgggofoogfoskygfogfogfoooggg"));
  }

	@Test
  public void test3() {
    assertEquals("birdsandthebees", Challenge.clearFog("ffogfogoggofobirdsandthebeesfogfoggofgoffog"));
  }

	@Test
  public void test4() {
    assertEquals("plane", Challenge.clearFog("fogfoofgfogfgplanefogofgoffgo"));
  }

	@Test
  public void test5() {
    assertEquals("thesaurus", Challenge.clearFog("fogofogoofgfffogthesaurusfogfogfogfgofg"));
  }

	@Test
  public void test6() {
    assertEquals("sun", Challenge.clearFog("fogfgofofsunfogfgoogfogofgff"));
  }

	@Test
  public void test7() {
    assertEquals("It's a clear day!", Challenge.clearFog("city"));
  }
}

// made by @Joshua Señoron