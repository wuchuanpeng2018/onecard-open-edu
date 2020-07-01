package com.open.current.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class MutixThread {

    public static void main(String[] args) {
        ThreadMXBean mxBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = mxBean.dumpAllThreads(false,false);
        for (int i = 0; i <threadInfos.length ; i++) {
            System.out.println(threadInfos[i].getThreadId() + " thread_name " + threadInfos[i].getThreadName());
        }
    }

}
