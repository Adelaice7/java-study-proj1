package com.adelaice.model;

public class Burger {
    private String name;
    private String breadType;
    private String meat;
    private double price;

    private Topping lettuce;
    private Topping tomato;
    private Topping bacon;
    private Topping onion;

    public Burger(String name, String breadType, String meat, double price) {
        this.name = name;
        this.breadType = breadType;
        this.meat = meat;
        this.price = price;
    }

    public void addLettuce() {
        this.lettuce = new Topping("Lettuce", 0.39);
    }

    public void addTomato() {
        this.tomato = new Topping("Tomato", 0.79);
    }

    public void addBacon() {
        this.bacon = new Topping("Bacon", 1.49);
    }

    public void addOnion() {
        this.onion = new Topping("Onion", 0.59);
    }

    public double itemizeBurger() {
        double burgerPrice = this.price;

        System.out.println(this.name + " burger on a " + this.breadType + " roll is $" + this.price);

        if (this.lettuce != null) {
            burgerPrice += this.lettuce.getPrice();
            System.out.println("Added " + this.lettuce.getName() + " for an extra $" + this.lettuce.getPrice());
        }
        if (this.tomato != null) {
            burgerPrice += this.tomato.getPrice();
            System.out.println("Added " + this.tomato.getName() + " for an extra $" + this.tomato.getPrice());
        }
        if (this.bacon != null) {
            burgerPrice += this.bacon.getPrice();
            System.out.println("Added " + this.bacon.getName() + " for an extra $" + this.bacon.getPrice());
        }
        if (this.onion != null) {
            burgerPrice += this.onion.getPrice();
            System.out.println("Added " + this.onion.getName() + " for an extra $" + this.onion.getPrice());
        }

        return burgerPrice;
    }

}
