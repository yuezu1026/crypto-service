package com.rick.crypto.controller;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther:wangyaozu
 * @Date: 2024/6/1 - 06 - 01 - 19:29
 * @Description: com.rick.crypto.controller
 * @version:1.0
 */

@RestController
@Log
public class EccController {

    @RequestMapping(value="/ecc",method = RequestMethod.GET)
    public String eccService(){
        log.info("enter");
        System.out.println("eccServices");
        return "hello";
    }
}
