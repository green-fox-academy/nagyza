package com.greenfox.endpointtesting.controllers;

import com.greenfox.endpointtesting.services.Arrow;
import com.greenfox.endpointtesting.services.ErrorMessage;
import com.greenfox.endpointtesting.services.Guardian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class GuardianController {

  @Autowired
  ErrorMessage errorMessage;

  @Autowired
  Arrow arrow;

  @RequestMapping(value = "/groot", method = RequestMethod.GET)
  public Guardian grootResponse(@RequestParam(value = "message") String message) {
    Guardian guardian = new Guardian();
    guardian.setReceived(message);
    guardian.setTranslated("I am Groot!");
    return guardian;
  }

  @RequestMapping(value = "/yondu", method = RequestMethod.GET)
  public Arrow yonduResponse(@RequestParam(value = "distance") double distance, @RequestParam(value = "time") double time) {
    arrow.setDistance(distance);
    arrow.setTime(time);
    return arrow;
  }

  @ExceptionHandler(Exception.class)
  public ErrorMessage errorMessageSender(MissingServletRequestParameterException e) {
    String paramName = e.getParameterName();
    errorMessage.setError("I am Groot!");
    return errorMessage;
  }
}
