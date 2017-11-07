package com.qianmi.uc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qianmi.uc.qstore.api.store.StoreQueryProvider;
import com.qianmi.uc.service.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 * <p>
 * <p>FileName: com.qianmi.uc.controller.DubboController</p>
 * <p>Date: 2017-08-07 10:34.</p>
 *
 * @author <a href="mailto:lilonglong@qianmi.com">of2639-李龙龙</a>
 */
@RestController
public class DubboController {

    @Autowired
    private DubboService dubboService;

    @RequestMapping("/hello1/{myName}")
    public  String hello1(@PathVariable String myName) throws Exception{
        String rtn = dubboService.hello();
        return myName + " hello word!";
    }

    @RequestMapping("/hello2/{myName}")
    public  String hello2(@PathVariable String myName) throws Exception{
        String rtn = dubboService.getUserAdminId();
        return myName + " hello word!";
    }

    @RequestMapping("/hello3/{adminid}/{storename}")
    public  String hello3(@PathVariable String adminid, @PathVariable String storename) throws Exception{
        String rtn = dubboService.setName(adminid, storename);
        return storename + " hello word!+112323";
    }


}
