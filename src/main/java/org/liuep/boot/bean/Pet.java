package org.liuep.boot.bean;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Pet {
    private String name = "";
    private Integer LV ;

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
