package com.sfedu.test;

import java.util.ArrayList;

/**
 * Created by user00 on 4/10/14.
 */
public class Domesticity {
    ArrayList<Animal> observers = new ArrayList<Animal>();

    public void attach(Animal observer) {
        observers.add(observer);
        System.out.println("attached: " + observer.getName());
    }

    public void detach(Animal observer) {
        observers.remove(observer);
        System.out.println("detached: " + observer.getName());
    }

    public void detach(int observer) {
        Animal a = null;
        try {
            a = observers.remove(observer);
            System.out.println("detached: " + a.getName()+" "+observers.size());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("detach: no animal with position " + observer);
        }

    }

    public void noise() {
        for (Observer observer : observers) {
            observer.notifyMe();
        }
    }

}
