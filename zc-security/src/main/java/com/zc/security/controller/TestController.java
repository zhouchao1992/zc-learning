package com.zc.security.controller;

import com.zc.common.result.Result;
import com.zc.common.result.ResultUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test/")
public class TestController {

    @GetMapping("result")
    public Result testResult(){
        Map<String,Object> map = new HashMap<>();
        map.put("1","张三");
        map.put("2","王五");
        map.put("3","李四");
        map.put("4","赵四");
        return ResultUtil.success(map);
    }
}
