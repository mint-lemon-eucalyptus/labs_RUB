package com.sfedu.test;

/**
 * Created by user00 on 4/10/14.
 */
public class Cat extends Animal {
    private String name="random cat";

    @Override
    public void notifyMe() {
        System.out.println("CAT: "+name);

    }

    public Cat(String name) {
        this.name = name;
    }
}
