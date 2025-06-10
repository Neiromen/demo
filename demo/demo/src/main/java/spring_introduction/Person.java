package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("personBean")
@Scope("prototype")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
   @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;
    public Person(){
        System.out.println("Peson bean is created");
    }
    public Person(Pet pet) {
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
    public Pet getPet(){
        return pet;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    @Autowired
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello my pet");
        pet.say();
    }

}
