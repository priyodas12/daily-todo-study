package io.priyospace.controller;

import io.priyospace.model.TodoData;
import io.priyospace.util.Mappings;
import io.priyospace.util.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo-api")
public class TodoItemController {

    @ModelAttribute
    public TodoData todoData(){
        return new TodoData();
    }

    /*http://localhost:9080/daily-todo-study/todo-api/items*/
    @GetMapping(Mappings.ITEMS)
    public String items(){
        return ViewNames.ITEMS_LIST;
    }

}
