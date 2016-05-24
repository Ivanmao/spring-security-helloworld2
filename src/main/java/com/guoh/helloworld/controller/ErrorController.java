/*
 * Copyright (C) 2016 Wro4j. All rights reserved.
 */
package com.guoh.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO: DOCUMENT ME!
 * 
 * @author ivan.mgh
 */
@RequestMapping(value = "/")
@Controller
public class ErrorController {
  @RequestMapping(value = "403")
  public String accessDeniedHandler() {
    return "403";
  }


}
