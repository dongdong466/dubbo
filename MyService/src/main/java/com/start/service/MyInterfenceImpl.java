package com.start.service;

import com.start.interfence.MyInterfence;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Repository
public class MyInterfenceImpl implements MyInterfence {

    public String helloWorld() {

        return "你好啊 世界！";
    }
}
