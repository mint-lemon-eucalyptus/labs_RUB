package com.sfedu.test;

/**
 * Created by user00 on 4/10/14.
 */
public class Animal implements Observer {
    private String name = "random animal";

    @Override
    public void notifyMe() {
        System.out.println("animal: " + name + " notifyMe()");
    }

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
