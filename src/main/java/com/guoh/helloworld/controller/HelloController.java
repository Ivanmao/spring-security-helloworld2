/*
 * Copyright (C) 2016 Wro4j.
 * All rights reserved.
 */
package com.guoh.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO: DOCUMENT ME!
 * 
 * @author ivan.mgh
 */

@RequestMapping(value="/world")
@Controller
public class HelloController {
  
  @RequestMapping(value="/test1")
  public String helloPage(){
    
    return "hello";
  }

}
