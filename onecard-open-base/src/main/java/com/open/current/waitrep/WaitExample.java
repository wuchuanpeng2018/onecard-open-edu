package com.open.current.waitrep;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class WaitExample {

    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
        o.wait();
        Thread.sleep(1);
        Condition d = new ReentrantLock().newCondition();
        d.await();
        LockSupport.park();

    }

}
