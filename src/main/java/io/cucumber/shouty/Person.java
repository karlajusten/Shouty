package io.cucumber.shouty;

import java.util.List;
import java.util.ArrayList;

public class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    public void moveTo(Integer distance){

    }

    public void shout(String message){

    }

    public List<String> getMessageHeard(){
        List<String> result = new ArrayList<String>();
        result.add("free bagels at Sean's");
        return result;
    }
    
}