package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MagicianTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_magician.xml");
        Performer magician = (Performer) ctx.getBean("harry");
        magician.perform();
    }
    }
