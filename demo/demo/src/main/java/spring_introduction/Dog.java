package spring_introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("dogBean")
@Scope("singleton")
public class Dog implements Pet{
    Dog(){
        System.out.println("Dog bean is created");
    }
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//    @PostConstruct
//    public void init(){
//        System.out.println("Class Dog:init method");
//    }
//    @PreDestroy
//    public void destroy(){
//        System.out.println("Class Dog:destroy method");
//    }
//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }
}
