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

  public int reduceToNumber(final String name) {
    int num = reduceToVowels(name).toUpperCase().chars().map(c -> convertToValue((char) c))
        .reduce(0, Integer::sum);
    return num % 9 == 0 ? 9 : num % 9;
  }

  int convertToValue(final char character) {
    return "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(character) % 9 + 1;
  }

}
