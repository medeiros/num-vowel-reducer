package com.arneam.numvowelreducer.application;

import com.arneam.numvowelreducer.domain.VowelReducer;
import com.arneam.numvowelreducer.infrastructure.TextReducerClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("reduce")
@Slf4j
public class VowelReducerController {

  @Autowired
  private TextReducerClient textReducerClient;

  @GetMapping("/{name}")
  @ResponseStatus(HttpStatus.OK)
  public int reduceToNumber(@PathVariable String name) {
    log.info("calling 'VowelReducerController#reduceToNumber' with parameter: " + name);
    return textReducerClient.reduceToNumber(VowelReducer.instance().reduceToVowels(name));
  }

}
