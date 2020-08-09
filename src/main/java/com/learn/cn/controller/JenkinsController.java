package com.learn.cn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者： jwp
 * 创建时间： 2020/8/9 21:27
 * 描述：JenkinsController
 */
@RestController
@RequestMapping("jenkins")
public class JenkinsController {

    @GetMapping("test")
    public String test(){
        return "success";
    }
}
