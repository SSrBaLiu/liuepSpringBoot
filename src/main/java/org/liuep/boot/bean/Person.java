package org.liuep.boot.bean;

public class Person {
    private String name;
    private Pet pet;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public Pet getPet() {
        return pet;
    }
}
