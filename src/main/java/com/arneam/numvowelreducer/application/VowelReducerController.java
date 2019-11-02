package com.arneam.numvowelreducer.application;

import com.arneam.numvowelreducer.domain.VowelReducer;
import com.arneam.numvowelreducer.infrastructure.TextReducerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("vowel-reducer")
public class VowelReducerController {

  @Autowired
  private TextReducerClient textReducerClient;

  @GetMapping("/{name}")
  @ResponseStatus(HttpStatus.OK)
  public int reduceToNumber(@PathVariable String name) {
    return textReducerClient.reduceToNumber(VowelReducer.instance().reduceToVowels(name));
  }

}
