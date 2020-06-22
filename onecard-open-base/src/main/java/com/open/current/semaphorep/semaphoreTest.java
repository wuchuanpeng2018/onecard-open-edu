package com.open.current.semaphorep;

import java.util.concurrent.Semaphore;

public class semaphoreTest {

    public static void main(String[] args) {

        Semaphore Sa = new Semaphore(1);
        Semaphore Sb = new Semaphore(1);
        Semaphore Sc = new Semaphore(1);

        Thread A = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Sa.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    Sa.release();
                }
            }
        },"A");
    }
}
