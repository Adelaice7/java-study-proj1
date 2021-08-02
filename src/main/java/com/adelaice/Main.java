package com.adelaice;

import com.adelaice.model.Burger;
import com.adelaice.model.DeluxeBurger;
import com.adelaice.model.HealthyBurger;

public class Main {

    public static void main(String[] args) {

        Burger burger = new Burger("Basic", "White", "Beef", 4.59);

        burger.addTomato();
        burger.addLettuce();
        double price = burger.itemizeBurger();

        HealthyBurger healthyBurger = new HealthyBurger("Beyond Burger meat", 5.99);
        healthyBurger.addCheese();
        healthyBurger.addSauce();

        System.out.println(healthyBurger.itemizeBurger());

        System.out.println("----");

        DeluxeBurger db = new DeluxeBurger();
        System.out.println(db.itemizeBurger());
    }
}
