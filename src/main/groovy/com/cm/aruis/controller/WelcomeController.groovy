package com.cm.aruis.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by liurui on 15/4/16.
 */
@Controller
public class WelcomeController {

    @Value('${application.message:Hello World}')
    private String message = "Hello World";

    @RequestMapping("/welcome")
    public String welcome(Map<String, Object> model) {
        println message + '=========='
        //model.put("time", new Date());
        //model.put("message", 'hello world');
        return "welcome";
    }

    @RequestMapping("/foo")
    public String foo(Map<String, Object> model) {
        throw new RuntimeException("Foo");
    }


}

