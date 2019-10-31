package com.arneam.numvowelreducer.domain;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VowelReducerTest {

  @Test
  void shouldReduceToVowels() {
    assertThat(VowelReducer.instance().reduceToVowels("Daniel"), is(equalTo("aie")));
  }

  @ParameterizedTest
  @CsvSource(value={"A, 1", "B, 2", "O, 6", "L, 3", "R, 9", "S, 1", "V, 4"})
  void shouldConvertCharToValue(char character, int value) {
    assertThat(VowelReducer.instance().convertToValue(character), is(equalTo(value)));
  }

  @ParameterizedTest
  @CsvSource(value={"Daniel, 6", "Maria, 2"})
  void shouldReduceToNumber(String name, int number) {
    assertThat(VowelReducer.instance().reduceToNumber(name), is(equalTo(number)));
  }

}
