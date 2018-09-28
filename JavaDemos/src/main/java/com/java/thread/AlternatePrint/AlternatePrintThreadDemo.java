package com.java.thread.AlternatePrint;

/**
 *  多线程交替答应
 */
public class AlternatePrintThreadDemo{

    public static void main(String[] args) throws InterruptedException {

        Object a = new Object();
        Object b = new Object();
        Object c = new Object();

        AlternatePrint pa = new AlternatePrint("A", c, b);
        AlternatePrint pb = new AlternatePrint("B", a, c);
        AlternatePrint pc = new AlternatePrint("C", b, a);

        pa.start();
        Thread.sleep(10);
        pb.start();
        Thread.sleep(10);
        pc.start();
        Thread.sleep(10);


    }
}

class AlternatePrint extends Thread{
    int count = 10;

    String name; // 线程名称
    Object prv; //当前线程的上一个线程
    Object next; //当前线程的下一个线程

    public AlternatePrint(String name, Object prv, Object next) {
        this.name = name;
        this.prv = prv;
        this.next = next;
    }

    @Override
    public void run() {
        while(count > 0) { // 多线程中不要用if
            synchronized (prv) { // 获取上一个线程的锁
                synchronized (next) {// 获取下一个线程的锁
                    System.out.println("线程" + name);
                    count--;
                    next.notifyAll(); //唤醒其它线程来竞争next的锁
                }

                try {
                    if (count == 0) {
                        prv.notifyAll();
                    }
                    else {
                        prv.wait();
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}