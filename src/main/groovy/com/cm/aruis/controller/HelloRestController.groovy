package com.cm.aruis.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by liurui on 15/4/16.
 */
@RestController
class HelloRestController {

    @RequestMapping('/hello')
    String sayHello() {
        return 'dasdf'
    }
}
