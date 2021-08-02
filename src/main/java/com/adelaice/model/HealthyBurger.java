package com.adelaice.model;

public class HealthyBurger extends Burger {
    private Topping cheese;
    private Topping sauce;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "Brown Rye", meat, price);
    }

    public void addCheese() {
        this.cheese = new Topping("Cheese", 1.79);
    }

    public void addSauce() {
        this.sauce = new Topping("Mayonnaise", 0.29);
    }

    @Override
    public double itemizeBurger() {
        double price = super.itemizeBurger();

        if (this.cheese != null) {
            price += this.cheese.getPrice();
            System.out.println("Added " + this.cheese.getName() + " for an extra $" + this.cheese.getPrice());
        }

        if (this.sauce != null) {
            price += this.sauce.getPrice();
            System.out.println("Added " + this.sauce.getName() + " for an extra $" + this.sauce.getPrice());
        }

        return price;
    }
}
