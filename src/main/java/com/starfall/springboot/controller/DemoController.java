package com.starfall.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author StarFall
 * @project SpringBootTest
 * @package com.starfall.springboot.controller
 * @className DemoController
 * @date 2019/4/25 22:55
 * @description DemoController
 */
@RequestMapping("/demo")
@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
