package com.company.Threads;

import com.company.MainGame.GameView;

public class MainTread extends Thread implements Runnable{
    private Time time;
    private GameView gameView;

    public MainTread(GameView gameView,Time time) {
        this.gameView = gameView;
        this.time = time;
    }

    @Override
    synchronized public void run() {

        while (true) {
            setTime(time.getTime());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exc) {
                System.out.println("Wątek symulacji stopera zoostał przerwany.");
                return;
            }
        }
    }
    private void setTime(Long timeToSee) {
        String ans;
        if(timeToSee>3599){
            if(timeToSee/60>9){
                if(timeToSee%60>9)
                    ans = "0"+timeToSee/3600+":"+timeToSee/60+":"+timeToSee%60;
                else
                    ans = "0"+timeToSee/3600+":"+timeToSee/60+":0"+timeToSee%60;
            }
            else{
                if(timeToSee%60>9)
                    ans = "0"+timeToSee/3600+":0"+timeToSee/60+":"+timeToSee%60;
                else
                    ans = "0"+timeToSee/3600+":0"+timeToSee/60+":0"+timeToSee%60;
            }
        }
        else if(timeToSee>59){
            if(timeToSee/60>9){
                if(timeToSee%60>9)
                    ans = "00:"+timeToSee/60+":"+timeToSee%60;
                else
                    ans = "00:"+timeToSee/60+":0"+timeToSee%60;
            }
            else{
                if(timeToSee%60>9)
                    ans = "00:0"+timeToSee/60+":"+timeToSee%60;
                else
                    ans = "00:0"+timeToSee/60+":0"+timeToSee%60;
            }
        }
        else {
            if(timeToSee%60>9)
                ans = "00:00:"+timeToSee%60;
            else
                ans = "00:00:0"+timeToSee%60;
        }
        gameView.getTime().setText(ans);
    }

}
