package com.renrenche.testboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping("/value")
    public String test(){
        System.out.println("test");
        //返回字符串hello 特殊他
        //线上新增test 1111111111
        return "Hello";
    }
}
