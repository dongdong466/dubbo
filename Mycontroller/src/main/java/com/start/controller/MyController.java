package com.start.controller;

import com.start.interfence.MyInterfence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @Autowired(required = false)
    private MyInterfence myInterfence;

    @RequestMapping("/test.do")
    public String getTest() {
        System.out.print("11111111111");
        String str = myInterfence.helloWorld();
        System.out.println(str);
        return "welcome";
    }

}
