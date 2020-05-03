package io.priyospace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class InitController {
    /*http://localhost:9080/daily-todo-study/api/hello*/
    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "Starting Spring MVC!";
    }
    /*http://localhost:9080/daily-todo-study/api/welcome*/
    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
}
