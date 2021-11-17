package com.xlx.controller;

import com.xlx.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author xianglongxiang
 * @title: IndexHandler
 * @projectName springboot-1
 * @date 2021/11/16 14:09
 */

@Controller
@RequestMapping("/student")
public class IndexHandler {

    @GetMapping("/index")
    public String index(Model model){
        System.out.println("刷新了一下");
        List<Student> list = new ArrayList<>();
        list.add(new Student(1L,"张三",22));
        list.add(new Student(2L,"李四",23));
        list.add(new Student(3L,"王五",24));
        model.addAttribute("list",list);
        return "index";
    }
    @GetMapping("/index2")
    public String index2(Map<String,String> map){
        map.put("name","若相惜");
        map.put("job","工程师");
        return "index";
    }
    @GetMapping("/if")
    public String index3(Map<String,Boolean> map){
        map.put("flag",true);
        return "index";
    }

}
