package org.bm.feign.controller;

import org.bm.feign.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Autowired
    private IHelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        return helloService.hello();
    }


}
