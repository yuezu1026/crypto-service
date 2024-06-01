package com.rick.crypto.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.java.Log;
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
@Tag(name="ecc")
public class EccController {

    @RequestMapping(value="/ecc",method = RequestMethod.GET)
    @Operation(summary = "ecc测试",description = "ecc testing")
    public String eccService(){
        log.info("enter");
        System.out.println("eccServices");
        return "hello";
    }

    @RequestMapping(value="/ecc2",method = RequestMethod.GET)
    @Operation(summary = "ecc-test2",description = "用户测试ecc椭圆曲线非对称加密技术")
    public String eccService2(){
        log.info("enter");
        System.out.println("eccServices");
        return "hello2";
    }
}
