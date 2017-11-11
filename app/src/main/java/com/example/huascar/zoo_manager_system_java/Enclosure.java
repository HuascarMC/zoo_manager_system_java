package com.example.huascar.zoo_manager_system_java;

import java.util.ArrayList;

/**
 * Created by huascar on 11/11/2017.
 */

public class Enclosure<T extends Animal> {

    ArrayList<T> enclosure;

    public Enclosure(ArrayList<T> enclosure) {
        this.enclosure = enclosure;
    }
}
