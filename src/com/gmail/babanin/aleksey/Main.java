package com.gmail.babanin.aleksey;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rn = new Random();
        Port port = new Port(2);
        Ship[] ships = new Ship[3];
        
        for (int i = 0; i < ships.length; i++) {
            try {
                Thread.sleep(rn.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ships[i] = new Ship(Integer.toString(i), 10, port);
            Thread thread = new Thread(ships[i]);
            thread.start();
        }
    }

}
