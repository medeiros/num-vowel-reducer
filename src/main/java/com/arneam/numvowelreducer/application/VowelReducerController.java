package com.arneam.numvowelreducer.application;

import com.arneam.numvowelreducer.domain.VowelReducer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("vowel-reducer")
public class VowelReducerController {

  @GetMapping("/{name}")
  @ResponseStatus(HttpStatus.OK)
  public int reduceToNumber(@PathVariable String name) {
    return VowelReducer.instance().reduceToNumber(name);
  }

}
