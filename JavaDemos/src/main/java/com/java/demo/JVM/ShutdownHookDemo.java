package com.java.demo.JVM;

/**
 * JVM 关闭时触发一系列操作.
 * 主要是添加关闭钩子
 */
public class ShutdownHookDemo {

    public static void main(String[] args) {
        while (true) {

        }
    }

}


class ClearThread extends Thread{
    private Integer length;

    public ClearThread(Integer length) {
        this.length = length;
    }

    public void run() {
        for (int i = 0; i< length; i++) {
            System.out.println("###--" + i);
        }
    }

}
