package com.tistory.irerin.helloboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 민경수
 * @description hello controller
 * @since 2023.03.28
**/
public class HelloController {

  public String hello(String name) {
    return "Hello " + name;
  }

}