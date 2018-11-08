package com.design.system.controller;

import com.design.system.entity.DemoTest;
import com.design.system.mapper.DemoTestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DemoTestController {

    public static int i = 0;

    @Autowired
    private DemoTestMapper demoTestMapper;


    @ResponseBody
    @RequestMapping("/demo")
    public Map<String, Object> demo() {
        Map<String, Object> map = new HashMap<>();
        DemoTest demoTest = new DemoTest();
        demoTest.setName("sssss" + i++);
        demoTest.setBirthday(new Date());
        demoTestMapper.insert(demoTest);

        map.put("name", demoTest.getName());
        map.put("birthday", demoTest.getBirthday());
        return map;

    }

}
