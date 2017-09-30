package backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import backend.mapper.UserMapper;
import backend.es.EsCommonService;

@Controller
public class Test {
    @Autowired private UserMapper userMapper;
    @Autowired private  EsCommonService esCommonService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(String id){
        System.out.println(userMapper.select());
        esCommonService.addDoc(id);
        return "true";
    }
}
