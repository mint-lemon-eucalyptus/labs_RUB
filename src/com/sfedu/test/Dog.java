package com.sfedu.test;

/**
 * Created by user00 on 4/10/14.
 */
public class Dog extends Animal {
    private String name="random dog";

    @Override
    public void notifyMe() {
        System.out.println("Dog: "+name);
    }
    public Dog(String name) {
        this.name = name;
    }
}