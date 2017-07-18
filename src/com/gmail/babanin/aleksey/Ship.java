package com.gmail.babanin.aleksey;

public class Ship implements Runnable {
    private Port port;
    String shipName;
    int quantity;

    public Ship(String shipName, int quantity, Port port) {
        super();
        this.shipName = shipName;
        this.quantity = quantity;
        this.port = port;
    }

    @Override
    public void run() {
        port.unloading(shipName, quantity);
    }
}
