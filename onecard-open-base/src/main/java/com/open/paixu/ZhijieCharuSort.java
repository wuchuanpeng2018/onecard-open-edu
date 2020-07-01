package com.open.paixu;

import java.util.Arrays;

public class ZhijieCharuSort {

    public static void main(String[] args) {
        Integer[] a = {1,2,3,1,2,4,5};
        Integer[] s1 = new ZhijieCharuSort().sort(a,a.length);
        Integer[] s2 = new ZhijieCharuSort().sort2(a,a.length);
        System.out.println("s = " + Arrays.toString(s1));
        System.out.println("s2 = " + Arrays.toString(s2));
    }

    private Integer[] sort(Integer[] args, int n) {
        int temp;
        //取第个数和之前已经排好序的数据列表对比 默认从小到大
        for (int i = 1; i < n; i++) {
            temp = args[i];
            for (int j = i; j >=0 ; j--) {
                if( j>0 && args[j-1]>temp ) {
                    args[j] = args[j-1];
                } else {
                    args[j] = temp;
                    break;
                }
            }
        }
        return args;
    }

    private Integer[] sort2(Integer[] args, int n) {
        int temp;
        //取第个数和之前已经排好序的数据列表对比 默认从小到大
        for (int i = 1; i < n; i++) {
            temp = args[i];
            int j = i-1;
            while(j>0 && args[j]>temp) {
                args[j+1]=args[j];
                j--;
            }
            args[j+1] = temp;
        }
        return args;
    }

}
