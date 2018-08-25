package com.qianmi.uc.controller;

import com.qianmi.uc.config.TestProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {


    @Autowired
    private TestProperties testProperties;

    @RequestMapping("/hello")
    public  String hello() throws Exception{
        System.out.println("zhixing");
        return testProperties.getUser() + " hello word!";
    }

//    @RequestMapping("/hello1/{myName}")
//    public  String hello1(@PathVariable String myName) throws Exception{
//        String rtn = dubboService.hello();
//        return myName + " hello word!";
//    }
//
//    @RequestMapping("/hello2/{myName}")
//    public  String hello2(@PathVariable String myName) throws Exception{
//        String rtn = dubboService.getUserAdminId();
//        return myName + " hello word!";
//    }
//
//    @RequestMapping("/hello3/{adminid}/{storename}")
//    public  String hello3(@PathVariable String adminid, @PathVariable String storename) throws Exception{
//        String rtn = dubboService.setName(adminid, storename);
//        return storename + " hello word!+1123223233";
//    }


}
