package com.arneam.numvowelreducer.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class VowelReducer {

  private static VowelReducer instance;

  public static VowelReducer instance() {
    if (instance == null) {
      instance = new VowelReducer();
    }
    return instance;
  }

  public String reduceToVowels(String name) {
    return name.replaceAll("[^aeiouAEIOU]", "");
  }

}
