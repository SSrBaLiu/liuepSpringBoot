package org.liuep.boot.bean;

public class Pet {
    private String name = "";

    public Pet(){ }

    public Pet(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Pet name = "
                + this.name
                + "";
    }
}
