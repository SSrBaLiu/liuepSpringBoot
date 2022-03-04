package org.liuep.boot.controller;

import org.liuep.boot.bean.Player;
import org.liuep.boot.bean.TestBug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
//@Controller

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String handle01(){
        return "hello,springboot!";
    }

    @Autowired
    Player player;

    @RequestMapping("/player")
    public Player player(){
        return player;
    }

    @Autowired
    TestBug testBug;

    @RequestMapping("/bug")
    public TestBug testBug(){ return testBug; }
}

