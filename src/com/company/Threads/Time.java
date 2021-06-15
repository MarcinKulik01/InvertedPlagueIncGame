package com.company.Threads;

import java.time.LocalDate;

public class Time extends Thread implements Runnable{

    private long time = 0;

    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException exc) {
                System.out.println("Wątek symulacji stopera zoostał przerwany.");
                return;
            }
            time+=1;
        }
    }

    synchronized long getTime() {
        return time;
    }
}

