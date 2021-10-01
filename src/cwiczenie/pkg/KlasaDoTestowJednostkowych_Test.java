package cwiczenie.pkg;

import org.junit.Assert;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class KlasaDoTestowJednostkowych_Test {

    static KlasaDoTestowJednostkowych klasaDoTestowJednostkowych;

@Test
    void IsDzielenieOK() {
    //given
    float expectedResult= (float) 2.5;
    //when
    float result= klasaDoTestowJednostkowych.liczbaDzielenie(5,2);
    //then
    assertEquals(expectedResult,result);
    }

@Test
@Disabled //kod tej metody sie nie uruchomi jak pusci sie calosc
void isSumaOK() {
    //given
    int expectedResult=10;
    //when
    int result=klasaDoTestowJednostkowych.liczbySuma(2,8);
    //then
    assertEquals(expectedResult,result);
}

@Test void IsSumBiggerThanDzielenie() {
    //given
    //when
    float dzielenie=klasaDoTestowJednostkowych.liczbaDzielenie(100,2);
    int suma=klasaDoTestowJednostkowych.liczbySuma(10,2);
    boolean result=(suma>dzielenie);
    //then
    Assert.assertTrue(result);
}

@ParameterizedTest
@ValueSource(strings = {"a","b","c","d","e"}) //odpowiednik given
void czyJestd(String inputStr) {
    //when
    String result=KlasaDoTestowJednostkowych.ciagZnakow("dupa");
//then
    assertEquals(inputStr,result);

/*    assertFalse(result);
    assertThat(result).isFalse();*/


}


}