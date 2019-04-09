package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by george on 09.04.19.
 */
@RestController
public class HelloConttoller {
    @RequestMapping("/hello")
    String showHello(){
        return "Hello, HEROKU!";
    }
}
