package com.suni.samplespringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by raju on 23/5/16.
 */
@Controller
public class HomeController {
  @RequestMapping(value = "/")
  public String home(Model model) {
    model.addAttribute("user","Sunitha");
    return "index";
  }
}
