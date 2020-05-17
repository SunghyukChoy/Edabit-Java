package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ClearFogTests {
  @Test
  public void test1() {
    assertEquals("trees", EasyChallenge.clearFog("fogfogfffoooofftreesggfoogfog"));
  }

	@Test
  public void test2() {
    assertEquals("sky", EasyChallenge.clearFog("fooofffgggofoogfoskygfogfogfoooggg"));
  }

	@Test
  public void test3() {
    assertEquals("birdsandthebees", EasyChallenge.clearFog("ffogfogoggofobirdsandthebeesfogfoggofgoffog"));
  }

	@Test
  public void test4() {
    assertEquals("plane", EasyChallenge.clearFog("fogfoofgfogfgplanefogofgoffgo"));
  }

	@Test
  public void test5() {
    assertEquals("thesaurus", EasyChallenge.clearFog("fogofogoofgfffogthesaurusfogfogfogfgofg"));
  }

	@Test
  public void test6() {
    assertEquals("sun", EasyChallenge.clearFog("fogfgofofsunfogfgoogfogofgff"));
  }

	@Test
  public void test7() {
    assertEquals("It's a clear day!", EasyChallenge.clearFog("city"));
  }
}

// made by @Joshua Señoron