package com.qianmi.uc.controller;

import com.qianmi.uc.config.TestProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.net.URL;


@RestController
public class HelloController {




    @Autowired
    private TestProperties testProperties;

    @RequestMapping("/hello")
    public  String hello() throws Exception{
        System.out.println("zhixing");
        return testProperties.getUser() + " hello word!";
    }


    @RequestMapping("/testFile")
    public  void testFile() throws Exception{
        File file=new File("classpath:application.properties");
        System.out.println(file.exists());
        URL url = this.getClass().getClassLoader().getResource("ccc.txt");
        File file1 = new File(url.getFile());

    }

   @RequestMapping("/test1")
    public  String test1() throws Exception{

       return "";
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
