package com.greenfox.endpointtesting.controllers;

import com.greenfox.endpointtesting.services.Arrow;
import com.greenfox.endpointtesting.services.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class ArrowController {

  @Autowired
  ErrorMessage errorMessage;

  @Autowired
  Arrow arrow;

  @RequestMapping(value = "/yondu", method = RequestMethod.GET)
  public Arrow yonduResponse(@RequestParam(value = "distance") double distance, @RequestParam(value = "time") double time) {
    arrow.setDistance(distance);
    arrow.setTime(time);
    return arrow;
  }

  @ExceptionHandler(Exception.class)
  public ErrorMessage errorMessageSender(MissingServletRequestParameterException e) {
    String paramName = e.getParameterName();
    errorMessage.setError("Hello! There where no parameters!");
    return errorMessage;
  }
}
