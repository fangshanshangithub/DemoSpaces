package com.java.thread;


/**
 * 线程轮询生产者-消费者问题，生产者产生消息，消费者一直轮询消费消息.
 */
public class PollConsume {

    public static Integer count = 5;

    public static void main(String[] args) {
        while(true) {
            startConsumer(5);
        }
    }

    private static  void startConsumer(Integer length) {

        //判断当前是否能启动新的线程
        if(isExcute()) {
            new Thread(new Consumer()).start();
        }

    }

    public static synchronized void getCount() {
        PollConsume.count--;
    }
    public static synchronized void putCount() {
        PollConsume.count++;
    }
    private static synchronized boolean isExcute(){
        if(count < 5) {
            return true;
        }
        else {
            return false;
        }
    }
}

/**
 * 消费者消费消息.
 */
class Consumer implements Runnable{

 /*   private Integer name;

    public Consumer(Integer name) {
        this.name = name;
    }*/

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 消费消息!!");
        PollConsume.getCount();
        System.out.println(Thread.currentThread().getName() + " 消费消息!!当前count为" + PollConsume.count);

    }


}