package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    public String toString(){
        return "Я собака,ты собака.Я собака,ты собака.Я собака,ты собака.Я собака,ты собака.Я собака,ты собака.";
    }
}
