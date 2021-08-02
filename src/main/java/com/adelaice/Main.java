package com.adelaice;

class Car {
    private String name;
    private int wheels;
    private int doors;
    private int cylinders;

    public Car(String name, int doors, int cylinders) {
        this.wheels = 4;
        this.name = name;
        this.doors = doors;
        this.cylinders = cylinders;
    }

    public String startEngine() {
        return "Starting engine of car";
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Convertible extends Car {
    public Convertible() {
        super("Convertible", 4, 4);
    }

    @Override
    public String startEngine() {
        return "Starting engine of Convertible...";
    }
}

class Sedan extends Car {
    public Sedan() {
        super("Sedan", 4, 4);
    }

    @Override
    public String startEngine() {
        return "Starting engine of Sedan...";
    }
}

class Truck extends Car {
    public Truck() {
        super("Truck", 2, 5);
    }

    @Override
    public String startEngine() {
        return "Starting engine of Truck...";
    }
}

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i + ": "
                    + car.getName() + "\n" +
                    "Plot: " + car.startEngine() + "\n");

        }
    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number: " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Convertible();
            case 2:
                return new Sedan();
            case 3:
                return new Truck();
            default:
                return null;
        }
    }
}
