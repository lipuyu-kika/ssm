package backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import backend.mapper.UserMapper;



@Controller
public class Test {
    @Autowired private UserMapper userMapper;
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        System.out.println(userMapper.select());
        return "true";
    }
}
