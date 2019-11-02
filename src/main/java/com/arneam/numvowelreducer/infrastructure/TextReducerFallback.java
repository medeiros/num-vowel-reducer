package com.arneam.numvowelreducer.infrastructure;

import org.springframework.stereotype.Component;

@Component
public class TextReducerFallback implements TextReducerClient {

  @Override
  public int reduceToNumber(final String name) {
    return 0;
  }

}
