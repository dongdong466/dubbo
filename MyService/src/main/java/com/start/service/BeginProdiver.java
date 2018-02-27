package com.start.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class BeginProdiver {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        context.start();
        System.out.println("服务提供方开始服务");
        System.in.read();
    }
}
