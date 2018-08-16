package pl.MartaHa.Files.Serializable;

import java.io.*;

public class Human implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private transient Integer age;
    private static int legs = 2;


    public Human(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static int getLegs() {
        return legs;
    }

    public static void setLegs(int legs) {
        Human.legs = legs;
    }
}

