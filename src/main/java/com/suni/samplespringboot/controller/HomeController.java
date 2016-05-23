package com.suni.samplespringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by raju on 23/5/16.
 */
@Controller
public class HomeController {
  @RequestMapping(value = "/")
  public String home() {
    return "index";
  }
}
