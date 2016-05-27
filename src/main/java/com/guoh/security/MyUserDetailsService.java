/*
 * Copyright (C) 2016 Wro4j.
 * All rights reserved.
 */
package com.guoh.security;


import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * TODO: DOCUMENT ME!
 * 
 * @author ivan.mgh
 */
public class MyUserDetailsService implements UserDetailsService {

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    
    // TODO,load user form database
    
    List<GrantedAuthority> authorities = new ArrayList<>();
    // 权限从缓存or数据库里获取
    SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority("ROLE_USER");
//    SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority("ROLE_ADMIN");
    authorities.add(simpleGrantedAuthority);
     
    User user = new User("user", "password", authorities);
    return user;
  }

}
