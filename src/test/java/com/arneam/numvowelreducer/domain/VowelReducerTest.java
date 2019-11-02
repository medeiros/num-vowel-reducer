package com.arneam.numvowelreducer.domain;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class VowelReducerTest {

  @Test
  void shouldReduceToVowels() {
    assertThat(VowelReducer.instance().reduceToVowels("Daniel"), is(equalTo("aie")));
  }

}
