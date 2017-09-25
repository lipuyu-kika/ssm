package backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import backend.mapper.UserMapper;
import backend.dao.Article;




@Controller
public class Test {
    @Autowired private UserMapper userMapper;
    @Autowired private ElasticsearchTemplate elasticsearchTemplate;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        System.out.println(userMapper.select());
        elasticsearchTemplate.createIndex(Article.class);
        return "true";
    }
}
