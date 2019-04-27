package com.starfall.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author StarFall
 * @project SpringBootTest
 * @package com.starfall.springboot.controller
 * @className ForwardController
 * @date 2019/4/26 23:01
 * @description todo
 */
@Controller
public class ForwardController {

    @RequestMapping("/main")
    public String main(){
        return "main";
    }
}
