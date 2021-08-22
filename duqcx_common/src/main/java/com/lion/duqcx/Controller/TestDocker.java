package com.lion.duqcx.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/duqc")
public class TestDocker {

    @RequestMapping(path = "/test",method = RequestMethod.GET)
    public String testDocker() {
        ArrayList<String> list = new ArrayList<>();
        list.add("dqc");
        list.add("dqc");
        list.add("dqc");
        return list.toString();
    }
}
