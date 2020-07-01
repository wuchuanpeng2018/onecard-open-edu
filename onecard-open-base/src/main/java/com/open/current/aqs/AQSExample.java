package com.open.current.aqs;

import java.util.concurrent.locks.ReentrantLock;

public class AQSExample {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        ReentrantLock lockV1 = new ReentrantLock(true);
        lockV1.lock();
    }

}
