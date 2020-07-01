package com.open.example.fuzhi;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class FuzhiExample {

    public static void main(String[] args) throws InterruptedException {
        FuzhiExample example = new FuzhiExample();
//        FuzhiVO vo = example.testFuzhi();
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        countDownLatch.countDown();
                        countDownLatch.await();
                        FuzhiVO vo = example.testFuzhi();
                        System.out.println(Thread.currentThread().getName() +"============="+ vo.getV1());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
//        for (int i = 0; i < 10; i++) {
//            countDownLatch.countDown();
//        }
//        countDownLatch.await();
        System.out.println("await-"+Thread.currentThread().getName());
    }

    public FuzhiVO testFuzhi() throws InterruptedException {
        FuzhiVO vo = new FuzhiVO();
        initV1(vo,"V1");
        initV2(vo,"V2");
        initV3(vo,"V3");
        System.out.println("testFuzhi");
        return vo;
    }

    public void initV1(FuzhiVO vo, String V1) throws InterruptedException {
        Thread.sleep(2000);
        vo.setV1(V1);
        System.out.println("initV1-sleep");
    }

    public void initV2(FuzhiVO vo, String V2) {
        vo.setV2(V2);
    }

    public void initV3(FuzhiVO vo, String V3) {
        vo.setV3(V3);
    }

}
