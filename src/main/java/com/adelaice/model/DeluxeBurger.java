package com.adelaice.model;

public class DeluxeBurger extends Burger {
    private static final String NO_ADDITIONS = "Cannot add additional items to a deluxe burger!";

    public DeluxeBurger() {
        super("Deluxe", "White", "Beef", 6.89);
        super.addLettuce();
        super.addTomato();
        super.addBacon();
    }

    @Override
    public void addLettuce() {
        System.out.println(NO_ADDITIONS);
    }

    @Override
    public void addTomato() {
        System.out.println(NO_ADDITIONS);
    }

    @Override
    public void addBacon() {
        System.out.println(NO_ADDITIONS);
    }

    @Override
    public void addOnion() {
        System.out.println(NO_ADDITIONS);
    }
}
