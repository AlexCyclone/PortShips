package com.gmail.babanin.aleksey;

import java.util.concurrent.Semaphore;

public class Port {
    private Semaphore semaphore;

    public Port(int docks) {
        super();
        semaphore = new Semaphore(docks, true);
    }

    public void unloading(String ship, int quantity) {
        showMessage(ship, "arrived");
        try {
            semaphore.acquire();
            
            showMessage(ship, "started unloading");
            for (int i = 0; i < quantity; i += 1) {
                Thread.sleep(500);
                System.out.print("[" + ship + "-" + i + "]");
            }
            
            showMessage(ship, "finished uploading");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
        semaphore.release();
    }

    private void showMessage(String ship, String message) {
        System.out.println();
        System.out.println("Ship " + ship + " " + message);
    }

}
