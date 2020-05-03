package io.priyospace.controller;

import io.priyospace.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/api")
public class InitController {
    //fields
    private final DemoService demoService;

    //constructor
    @Autowired
    public InitController(DemoService demoService) {
        this.demoService = demoService;
    }

    //methods
    /*http://localhost:9080/daily-todo-study/api/hello*/
    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "Starting Spring MVC!";
    }

    /*http://localhost:9080/daily-todo-study/api/welcome*/
    @GetMapping("/welcome")
    public String welcome(Model model){
        model.addAttribute("helloMessage",demoService.getHelloMessage("priyo"));
        log.info("model {}",model);
        return "welcome";
    }
    //this will be called first before any other method.
    @ModelAttribute("welcomeMessage")
    public String welcomeMessage(){
        log.info("welcomeMessage() called...");
        return demoService.getWelcomeMessage();
    }
}
