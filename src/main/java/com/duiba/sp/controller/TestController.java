package com.duiba.sp.controller;


import com.duiba.sp.entity.AppEntity;
import com.duiba.sp.service.AppService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private AppService appService;
    @ApiOperation(value = "第一个接口", httpMethod = "GET")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public List<AppEntity> hello(){
        return appService.getAllApps();
    }
}
