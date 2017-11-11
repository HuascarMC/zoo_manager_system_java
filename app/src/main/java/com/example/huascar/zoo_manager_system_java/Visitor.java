package com.example.huascar.zoo_manager_system_java;

/**
 * Created by huascar on 11/11/2017.
 */

public class Visitor {

    private int wallet;

    public Visitor(int wallet) {
        this.wallet = wallet;
    }

    public void buyTicket(Zoo zoo) {
        this.wallet -= zoo.getPrice();
    }

}
