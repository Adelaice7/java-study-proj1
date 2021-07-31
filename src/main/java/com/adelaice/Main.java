package com.adelaice;

public class Main {

    public static void main(String[] args) {
//        TestWhile.readMinMaxNums();

        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        System.out.println(".....");
//        dog.walk();
//        dog.run();

        Integer x = 5;
        Integer y = x;

        System.out.println(x);
        System.out.println(y);

        y += 5;

        System.out.println(x);
        System.out.println(y);
    }
}
