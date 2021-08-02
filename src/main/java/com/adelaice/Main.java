package com.adelaice;

import com.adelaice.model.*;

public class Main {

    public static void main(String[] args) {
//        TestWhile.readMinMaxNums();

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("27inch Beast", "Acer", 27,
                new Resolution(1024, 768));

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6,
                "v2.44");

        PC pc = new PC(theCase, monitor, motherboard);

        pc.powerUp();
        
    }
}
