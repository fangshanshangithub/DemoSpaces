package com.java.thread.Sync;

import java.util.Random;

public class SyncSimple {

    public static void main(String[] args) {
        final Couplts clt = new Couplts();

        for (int i = 0; i < 1000; i++) {

            new Thread(){
                public void run() {
                    int r = new Random().nextInt(2);
                    if(r % 2 == 0) {
                        clt.first();
                    }else {
                        clt.second();
                    }
                }
            }.start();

        }

    }

}

class Couplts{

    public void first() {
        System.out.println("风");
        System.out.println("花");
        System.out.println("雪");
        System.out.println("月");
    }

    public void second() {
        System.out.println("魑-1");
        System.out.println("魅-2");
        System.out.println("魍-3");
        System.out.println("魉-4");
    }

}