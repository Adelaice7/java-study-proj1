package com.adelaice;

import com.adelaice.model.*;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//
//        player.fullName = "Joe";
////        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//
//        player.loseHealth(damage);
//        System.out.println(player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println(player.healthRemaining());

//        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Jack", "Sword", 50);
//        System.out.println("Initial health = " + enhancedPlayer.getHealth());
//        enhancedPlayer.loseHealth(40);

        Printer printer = new Printer(100, true);

        printer.fillUpToner(50);
        printer.printPage(7);
        printer.fillUpToner(100);

    }
}
