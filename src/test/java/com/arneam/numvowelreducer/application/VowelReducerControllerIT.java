package com.arneam.numvowelreducer.application;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VowelReducerControllerIT {

  @Autowired
  private VowelReducerController vowelReducerController;

  @Test
  void shouldInjectController() {
    assertThat(vowelReducerController, is(notNullValue()));
  }

}
