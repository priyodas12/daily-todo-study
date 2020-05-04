package io.priyospace.model;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class TodoData {

    //fields
    private static int id=1;

    private final List<TodoItems> items=new ArrayList<TodoItems>();


    //constructor
    public TodoData() {
        //add some dummy data

    }

    //public methods

    //getItems
    public List<TodoItems> getItems(){
        return Collections.unmodifiableList(items);
    }

    //addItems
    public void addItem(@NonNull TodoItems todoItems){
        /*doItems.equals(null)){
           throw new NullPointerException("todo iteams required parameters");
       }*/
        todoItems.setId(id);
        items.add(todoItems);
        id++;
    }

    //remove items
    public void removeItems(int id){
        ListIterator<TodoItems> itemIterator=items.listIterator();

        while(itemIterator.hasNext()){
            TodoItems todoItems=itemIterator.next();
            if(todoItems.getId()==id){
                itemIterator.remove();
                break;
            }
        }
    }

    //get Items
    public TodoItems getItem(int id){
        for(TodoItems td:items){
            if(td.getId()==id){
                return td;
            }
        }
        return null;
    }

    //update Items
    public void updateItems(@NonNull TodoItems todoItems){
        ListIterator<TodoItems> itemIterator=items.listIterator();

        while(itemIterator.hasNext()){
            TodoItems tditm=itemIterator.next();
            if(todoItems.getId()==tditm.getId()){
                itemIterator.set(todoItems);
                break;
            }
        }
    }
}
