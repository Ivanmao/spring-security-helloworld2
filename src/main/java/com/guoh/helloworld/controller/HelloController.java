/*
 * Copyright (C) 2016 Wro4j.
 * All rights reserved.
 */
package com.guoh.helloworld.controller;

import org.springframework.security.core.context.SecurityContextHolder;
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
    
    // 打印授权信息
    System.out.println(SecurityContextHolder.getContext().getAuthentication().getAuthorities());
    
    return "hello";
  }
  
  
  @RequestMapping(value="/test2")
  public String helloPage2(){
    
    return "hello";
  }

}
