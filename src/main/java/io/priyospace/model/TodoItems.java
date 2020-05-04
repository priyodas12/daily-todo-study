package io.priyospace.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(of="id") //for multiple field use array{"id","title"}
public class TodoItems {

    //fields
    private int id;
    private String title;
    private String details;
    private LocalDate dateLine;

    //constructor
    public TodoItems(String title, String details, LocalDate dateLine) {
        this.title = title;
        this.details = details;
        this.dateLine = dateLine;
    }

}
