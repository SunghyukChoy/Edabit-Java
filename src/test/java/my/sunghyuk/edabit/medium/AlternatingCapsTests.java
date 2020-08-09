package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AlternatingCapsTests {

  @Test
  public void test1() {
    assertEquals("AlTeRnAtInG cApS", Program.alternatingCaps("alternating caps"));
  }

  @Test
  public void test2() {
    assertEquals("WhAt Is YoUr NaMe?", Program.alternatingCaps("What is your name?"));
  }

  @Test
  public void test3() {
    assertEquals("LoReM iPsUm DoLoR sIt AmEt CoNsEcTeTuR aDiPiSiCiNg ElIt.",
        Program.alternatingCaps("Lorem ipsum dolor sit amet consectetur adipisicing elit."));
  }

  @Test
  public void test4() {
    assertEquals("OmG tHiS wEbSiTe Is AwEsOmE!", Program.alternatingCaps("OMG this website is awesome!"));
  }

  @Test
  public void test5() {
    assertEquals("ThE qUiCk BrOwN fOx JuMpS oVeR tHe LaZy DoG",
        Program.alternatingCaps("The quick brown fox jumps over the lazy dog"));
  }

  @Test
  public void test6() {
    assertEquals(
        "ThE iNtEnT iS tO pRoViDe PlAyErS wItH a SeNsE oF pRiDe AnD aCcOmPlIsHmEnT fOr UnLoCkInG dIfFeReNt HeRoEs.",
        Program.alternatingCaps(
            "The intent is to provide players with a sense of pride and accomplishment for unlocking different heroes."));
  }
}
