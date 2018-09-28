package com.java.thread;

public class RunableTest {
    public static Integer count = 0;

    public static void main(String[] args) {
        /*new Thread(new Thread2("A")).start();
        new Thread(new Thread2("B")).start();*/

        for(int i = 0;i < 10; i++) {
            new Thread(new RunableThread(new RunableTest())).start();
        }

        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("RunableTest.main" + count);

    }

    public static void add(Integer i) {
        count += i;
    }

    public Integer getCount() {
        return count;
    }
}

class Thread2 implements  Runnable {

    private String name;

    public Thread2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行  :  " + i);
            try {
                Thread.sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class RunableThread implements Runnable {

    private RunableTest runTest;

    public RunableThread(RunableTest run) {
        this.runTest = run;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Running!!!" + runTest.getCount());
        runTest.add(1);
        System.out.println(Thread.currentThread().getName() + "Running!!!" + runTest.getCount());
    }
}